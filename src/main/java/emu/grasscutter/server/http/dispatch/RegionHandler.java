package emu.grasscutter.server.http.dispatch;

import static emu.grasscutter.config.Configuration.*;

import com.google.gson.*;
import com.google.protobuf.ByteString;
import emu.grasscutter.*;
import emu.grasscutter.Grasscutter.ServerRunMode;
import emu.grasscutter.net.proto.QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp;
import emu.grasscutter.net.proto.QueryRegionListHttpRspOuterClass.QueryRegionListHttpRsp;
import emu.grasscutter.net.proto.RegionInfoOuterClass.RegionInfo;
import emu.grasscutter.net.proto.RegionSimpleInfoOuterClass.RegionSimpleInfo;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import emu.grasscutter.net.proto.StopServerInfoOuterClass.StopServerInfo;
import emu.grasscutter.server.event.dispatch.*;
import emu.grasscutter.server.http.Router;
import emu.grasscutter.server.http.objects.QueryCurRegionRspJson;
import emu.grasscutter.utils.*;
import io.javalin.Javalin;
import io.javalin.http.Context;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.slf4j.Logger;

/** Handles requests related to region queries. */
public final class RegionHandler implements Router {
    private static final Map<String, RegionData> regions = new ConcurrentHashMap<>();
    private static String regionListResponse;
    private static String regionListResponseCN;

    public RegionHandler() {
        try { // Read and initialize region data.
            this.initialize();
        } catch (Exception exception) {
            Grasscutter.getLogger().error("Failed to initialize region data.", exception);
        }
    }

    /** Configures region data according to configuration. */
    private void initialize() {
        var dispatchDomain =
                "http"
                        + (HTTP_ENCRYPTION.useInRouting ? "s" : "")
                        + "://"
                        + lr(HTTP_INFO.accessAddress, HTTP_INFO.bindAddress)
                        + ":"
                        + lr(HTTP_INFO.accessPort, HTTP_INFO.bindPort);

        // Create regions.
        var servers = new ArrayList<RegionSimpleInfo>();
        var usedNames = new ArrayList<String>(); // List to check for potential naming conflicts.

        var configuredRegions = new ArrayList<>(DISPATCH_INFO.regions);
        if (Grasscutter.getRunMode() != ServerRunMode.HYBRID && configuredRegions.size() == 0) {
            Grasscutter.getLogger()
                    .error(
                            "[Dispatch] There are no game servers available. Exiting due to unplayable state.");
            System.exit(1);
        } else if (configuredRegions.size() == 0)
            configuredRegions.add(
                    new Region(
                            "os_usa",
                            DISPATCH_INFO.defaultName,
                            lr(GAME_INFO.accessAddress, GAME_INFO.bindAddress),
                            lr(GAME_INFO.accessPort, GAME_INFO.bindPort)));

        configuredRegions.forEach(
                region -> {
                    if (usedNames.contains(region.Name)) {
                        Grasscutter.getLogger().error("Region name already in use.");
                        return;
                    }

                    // Create a region identifier.
                    var identifier =
                            RegionSimpleInfo.newBuilder()
                                    .setName(region.Name)
                                    .setTitle(region.Title)
                                    .setType("DEV_PUBLIC")
                                    .setDispatchUrl(dispatchDomain + "/query_cur_region/" + region.Name)
                                    .build();
                    usedNames.add(region.Name);
                    servers.add(identifier);

                    // Create a region info object.
                    var regionInfo =
                            RegionInfo.newBuilder()
                                    .setGateserverIp(region.Ip)
                                    .setGateserverPort(region.Port)
                                    .build();
                    // Create an updated region query.
                    var updatedQuery =
                            QueryCurrRegionHttpRsp.newBuilder()
                                    .setRegionInfo(regionInfo)
                                    .setClientSecretKey(ByteString.copyFrom(Crypto.DISPATCH_SEED))
                                    .build();
                    regions.put(
                            region.Name,
                            new RegionData(
                                    updatedQuery, Utils.base64Encode(updatedQuery.toByteString().toByteArray())));
                });

        // Determine config settings.
        var hiddenIcons = new JsonArray();
        hiddenIcons.add(40);
        var codeSwitch = new JsonArray();
        codeSwitch.add(3628);

        // Create a config object.
        var customConfig = new JsonObject();
        customConfig.addProperty("sdkenv", "2");
        customConfig.addProperty("checkdevice", "false");
        customConfig.addProperty("loadPatch", "false");
        customConfig.addProperty("showexception", String.valueOf(GameConstants.DEBUG));
        customConfig.addProperty("regionConfig", "pm|fk|add");
        customConfig.addProperty("downloadMode", "0");
        customConfig.add("codeSwitch", codeSwitch);
        customConfig.add("coverSwitch", hiddenIcons);

        // XOR the config with the key.
        var encodedConfig = JsonUtils.encode(customConfig).getBytes();
        Crypto.xor(encodedConfig, Crypto.DISPATCH_KEY);

        // Create an updated region list.
        var updatedRegionList =
                QueryRegionListHttpRsp.newBuilder()
                        .addAllRegionList(servers)
                        .setClientSecretKey(ByteString.copyFrom(Crypto.DISPATCH_SEED))
                        .setClientCustomConfigEncrypted(ByteString.copyFrom(encodedConfig))
                        .setEnableLoginPc(true)
                        .build();

        // Set the region list response.
        regionListResponse = Utils.base64Encode(updatedRegionList.toByteString().toByteArray());

        // CN
        // Modify the existing config option.
        customConfig.addProperty("sdkenv", "0");
        // XOR the config with the key.
        encodedConfig = JsonUtils.encode(customConfig).getBytes();
        Crypto.xor(encodedConfig, Crypto.DISPATCH_KEY);

        // Create an updated region list.
        var updatedRegionListCN =
                QueryRegionListHttpRsp.newBuilder()
                        .addAllRegionList(servers)
                        .setClientSecretKey(ByteString.copyFrom(Crypto.DISPATCH_SEED))
                        .setClientCustomConfigEncrypted(ByteString.copyFrom(encodedConfig))
                        .setEnableLoginPc(true)
                        .build();

        // Set the region list response.
        regionListResponseCN = Utils.base64Encode(updatedRegionListCN.toByteString().toByteArray());
    }

    @Override
    public void applyRoutes(Javalin javalin) {
        javalin.get("/query_region_list", RegionHandler::queryRegionList);
        javalin.get("/query_cur_region/{region}", RegionHandler::queryCurrentRegion);
        javalin.get("/query_server_address", RegionHandler::queryServerAddress);
    }

    /**
     * Handle query region list request.
     *
     * @param ctx The context object for handling the request.
     * @route /query_region_list
     */
    private static void queryRegionList(Context ctx) {
        // Get logger and query parameters.
        Logger logger = Grasscutter.getLogger();
        if (ctx.queryParamMap().containsKey("version") && ctx.queryParamMap().containsKey("platform")) {
            String versionName = ctx.queryParam("version");
            String versionCode = versionName.substring(0, 8);
            String platformName = ctx.queryParam("platform");

            // Determine the region list to use based on the version and platform.
            if ("CNRELiOS".equals(versionCode)
                    || "CNRELWin".equals(versionCode)
                    || "CNRELAnd".equals(versionCode)) {
                // Use the CN region list.
                QueryAllRegionsEvent event = new QueryAllRegionsEvent(regionListResponseCN);
                event.call();

                // Respond with the event result.
                ctx.result(event.getRegionList());
            } else if ("OSRELiOS".equals(versionCode)
                    || "OSRELWin".equals(versionCode)
                    || "OSRELAnd".equals(versionCode)) {
                // Use the OS region list.
                QueryAllRegionsEvent event = new QueryAllRegionsEvent(regionListResponse);
                event.call();

                // Respond with the event result.
                ctx.result(event.getRegionList());
            } else {
                /*
                 * String regionListResponse = "CP///////////wE=";
                 * QueryAllRegionsEvent event = new QueryAllRegionsEvent(regionListResponse);
                 * event.call();
                 * ctx.result(event.getRegionList());
                 * return;
                 */
                // Use the default region list.
                QueryAllRegionsEvent event = new QueryAllRegionsEvent(regionListResponse);
                event.call();

                // Respond with the event result.
                ctx.result(event.getRegionList());
            }
        } else {
            // Use the default region list.
            QueryAllRegionsEvent event = new QueryAllRegionsEvent(regionListResponse);
            event.call();

            // Respond with the event result.
            ctx.result(event.getRegionList());
        }
        // Log the request to the console.
        Grasscutter.getLogger()
                .info(String.format("[Dispatch] Client %s request: query_region_list", Utils.address(ctx)));
    }

    /**
     * @route /query_cur_region/{region}
     */
    private static void queryCurrentRegion(Context ctx) {
        String versionName = ctx.queryParam("version");

        if (!Grasscutter.getConfig().server.game.useXorEncryption) {
            if (versionName != null) {
                if (versionName.contains("OSRELWin4.7.0")) {
                    ctx.result(
                            "{\"content\":\"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\",\"sign\":\"iy/KnsR7pbCrHbeOjgfwTb/btFHPql94/B15p2lK2hQ/o7+NzxrzaqPUK8td7hnUbWHkHnYWbP8eBLXClNNH8JsV2yqfslM1M+8W1cyQu+ud2X0KXbic4+gxJQlBjm3dYvaHPrKXKOopu3zFjiGMChZRDp24ilO0krtOLxq5495iLzR/oJsdcCu1/xQv0UYTfHO4Jvfo9tG87sHaeDr2E73JAe0g5TNxi1FKe1NZGm7qw8VVhLfR//Z8YfD1K9NxW6QJCskMhiQJHdKf4jYwA98G0EBChLN6bVgIDepDL6m/5tV9RnEg9Si/bzQO217lwoubxn1R6yZ2VeXEQ4UjmA==\"}");
                } else {
                    ctx.result(
                            "{\"content\":\"CwpC8q8wBdR4rSauLQeF+PKeX+dwTUQt7hNupyqVBH19SdnOzx2WSDYAyC+XlrSZr0PluJ4waFCz9Y2YRl1HBzB0iCPhQ+/BtPGjJ22bU0CvmPXGxtocxd5p8SP59cnZSoEVtFYXeUk2EtVYVQdLXFtpPLSpCZdJzvYpGyN4wwOmLw4kqnCqCWKE8FB9dzevENgjFDSHBPpLexhgfiwDuQ408NUxD4E/Tz7966FCXUQ1zecorWhddSwTN4VCKpNvvRMCUAXbxlJXRK47B4FMLReexnHPSG6nf0tSYWqbMzQM6g+bsRq49tkS3tBvjZtssqHSyb2MK4MyHwMKf3xe5w==\",\"sign\":\"JPKMihNeHvXqm0NIGaz1TqmGZRH9sfaYQjflK9DiN3QhRNXWQ+Kh+uXmn/H/PnMQjtcFwpevmziUX7ajeZ2VH9MFM8Rqb7hjIHNIMecov9vSIBnxNTYbR9XDaG4gNDzkF7LCwvR3BKxz+llADosHKM3aakTJdZJJuVB2LNyuinBFNMcMV/95EmHP1PBG1boFjHeJd/SebB4MEkQlivZUuaQrBrteomouAtQYzy3Vp+aWIFxtdcACKYRm9QIIBZSD2SM8vTJXAE7MWyJPGHmGrzaCuPhqdhP0I5ACVgjQ6kyCAoyM27YudDmOAlqHxdAzmN25eimK1ltSf3GHzjuT6w==\"}");
                }
            } else {
                ctx.result(
                        "{\"content\":\"CwpC8q8wBdR4rSauLQeF+PKeX+dwTUQt7hNupyqVBH19SdnOzx2WSDYAyC+XlrSZr0PluJ4waFCz9Y2YRl1HBzB0iCPhQ+/BtPGjJ22bU0CvmPXGxtocxd5p8SP59cnZSoEVtFYXeUk2EtVYVQdLXFtpPLSpCZdJzvYpGyN4wwOmLw4kqnCqCWKE8FB9dzevENgjFDSHBPpLexhgfiwDuQ408NUxD4E/Tz7966FCXUQ1zecorWhddSwTN4VCKpNvvRMCUAXbxlJXRK47B4FMLReexnHPSG6nf0tSYWqbMzQM6g+bsRq49tkS3tBvjZtssqHSyb2MK4MyHwMKf3xe5w==\",\"sign\":\"JPKMihNeHvXqm0NIGaz1TqmGZRH9sfaYQjflK9DiN3QhRNXWQ+Kh+uXmn/H/PnMQjtcFwpevmziUX7ajeZ2VH9MFM8Rqb7hjIHNIMecov9vSIBnxNTYbR9XDaG4gNDzkF7LCwvR3BKxz+llADosHKM3aakTJdZJJuVB2LNyuinBFNMcMV/95EmHP1PBG1boFjHeJd/SebB4MEkQlivZUuaQrBrteomouAtQYzy3Vp+aWIFxtdcACKYRm9QIIBZSD2SM8vTJXAE7MWyJPGHmGrzaCuPhqdhP0I5ACVgjQ6kyCAoyM27YudDmOAlqHxdAzmN25eimK1ltSf3GHzjuT6w==\"}");
            }
        } else {
            // Get region to query.
            String regionName = ctx.pathParam("region");
            var region = regions.get(regionName);

            // Get region data.
            String regionData = "CAESGE5vdCBGb3VuZCB2ZXJzaW9uIGNvbmZpZw==";
            if (!ctx.queryParamMap().values().isEmpty()) {
                if (region != null) regionData = region.getBase64();
            }

            var clientVersion = versionName.replaceAll(Pattern.compile("[a-zA-Z]").pattern(), "");
            var versionCode = clientVersion.split("\\.");
            var versionMajor = Integer.parseInt(versionCode[0]);
            var versionMinor = Integer.parseInt(versionCode[1]);
            var versionFix = Integer.parseInt(versionCode[2]);

            if (versionMajor >= 3
                    || (versionMajor == 2 && versionMinor == 7 && versionFix >= 50)
                    || (versionMajor == 2 && versionMinor == 8)) {
                try {
                    QueryCurrentRegionEvent event = new QueryCurrentRegionEvent(regionData);
                    event.call();

                    String key_id = ctx.queryParam("key_id");

                    if (versionMajor != GameConstants.VERSION_PARTS[0]
                            || versionMinor != GameConstants.VERSION_PARTS[1]
                    // The 'fix' or 'patch' version is not checked because it is only used
                    // when miHoYo is desperate and fucks up big time.
                    ) { // Reject clients when there is a version mismatch

                        boolean updateClient = GameConstants.VERSION.compareTo(clientVersion) > 0;

                        QueryCurrRegionHttpRsp rsp =
                                QueryCurrRegionHttpRsp.newBuilder()
                                        .setRetcode(Retcode.RET_STOP_SERVER_VALUE)
                                        .setMsg("Connection Failed!")
                                        .setRegionInfo(RegionInfo.newBuilder())
                                        .setStopServer(
                                                StopServerInfo.newBuilder()
                                                        .setUrl("https://discord.gg/T5vZU6UyeG")
                                                        .setStopBeginTime((int) Instant.now().getEpochSecond())
                                                        .setStopEndTime((int) Instant.now().getEpochSecond() + 1)
                                                        .setContentMsg(
                                                                updateClient
                                                                        ? "\nVersion mismatch outdated client! \n\nServer version: %s\nClient version: %s"
                                                                                .formatted(GameConstants.VERSION, clientVersion)
                                                                        : "\nVersion mismatch outdated server! \n\nServer version: %s\nClient version: %s"
                                                                                .formatted(GameConstants.VERSION, clientVersion))
                                                        .build())
                                        .buildPartial();

                        Grasscutter.getLogger()
                                .debug(
                                        String.format(
                                                "Connection denied for %s due to %s.",
                                                Utils.address(ctx),
                                                updateClient ? "outdated client!" : "outdated server!"));

                        ctx.json(Crypto.encryptAndSignRegionData(rsp.toByteArray(), key_id));
                        return;
                    }

                    if (ctx.queryParam("dispatchSeed") == null) {
                        // More love for UA Patch players
                        var rsp = new QueryCurRegionRspJson();

                        rsp.content = event.getRegionInfo();
                        rsp.sign = "TW9yZSBsb3ZlIGZvciBVQSBQYXRjaCBwbGF5ZXJz";

                        ctx.json(rsp);
                        return;
                    }

                    var regionInfo = Utils.base64Decode(event.getRegionInfo());

                    ctx.json(Crypto.encryptAndSignRegionData(regionInfo, key_id));
                } catch (Exception e) {
                    Grasscutter.getLogger().error("An error occurred while handling query_cur_region.", e);
                }
            } else {
                // Invoke event.
                QueryCurrentRegionEvent event = new QueryCurrentRegionEvent(regionData);
                event.call();
                // Respond with event result.
                ctx.result(event.getRegionInfo());
            }
            // Log to console.
            Grasscutter.getLogger()
                    .info(
                            String.format(
                                    "Client %s request: query_cur_region/%s", Utils.address(ctx), regionName));
        }
    }

    public static void queryServerAddress(Context ctx) {
        var addr = Grasscutter.getConfig().server.game.accessAddress;
        var port =
                Grasscutter.getConfig().server.game.accessPort == 0
                        ? Grasscutter.getConfig().server.game.bindPort
                        : Grasscutter.getConfig().server.game.accessPort;
        ctx.result(addr + ":" + port);
    }

    /** Region data container. */
    public static class RegionData {
        private final QueryCurrRegionHttpRsp regionQuery;
        private final String base64;

        public RegionData(QueryCurrRegionHttpRsp prq, String b64) {
            this.regionQuery = prq;
            this.base64 = b64;
        }

        public QueryCurrRegionHttpRsp getRegionQuery() {
            return this.regionQuery;
        }

        public String getBase64() {
            return this.base64;
        }
    }

    /**
     * Gets the current region query.
     *
     * @return A {@link QueryCurrRegionHttpRsp} object.
     */
    public static QueryCurrRegionHttpRsp getCurrentRegion() {
        return Grasscutter.getRunMode() == ServerRunMode.HYBRID
                ? regions.get("os_usa").getRegionQuery()
                : null;
    }
}
