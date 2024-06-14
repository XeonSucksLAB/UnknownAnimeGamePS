package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.GetPlayerTokenRspOuterClass.GetPlayerTokenRsp;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.utils.Crypto;

public class PacketGetPlayerTokenRsp extends BasePacket {

    public PacketGetPlayerTokenRsp(GameSession session, int keyId) {
        super(PacketOpcodes.GetPlayerTokenRsp, true);

        this.setUseDispatchKey(true);

        GetPlayerTokenRsp p =
                GetPlayerTokenRsp.newBuilder()
                        .setUid(session.getPlayer().getUid())
                        .setToken(session.getAccount().getToken())
                        .setAccountType(1)
                        .setIsProficientPlayer(
                                session.getPlayer().getAvatars().getAvatarCount() > 0) // Not sure where this goes
                        .setPlatformType(3)
                        .setChannelId(1)
                        .setCountryCode("US")
                        .setRegPlatform(3)
                        .setKeyId(keyId)
                        .setTag(5)
                        .setServerRandKey(
                                "CfO2d7eEYha5bJRXdCfoiemPNAtXDpyNTQ3ObeTt5a7SSHz6GAEO1WPiTQ7fR6OG8LqhVN3ZTxH9Bnkc09BnCxud+kn0+PiGv1PTOuWK0LkQQ1xmg89zA9IHS+OJd1yKT2BBmJf4sN61gi+WtT7aFwRlzku3kGCk6p2wiPo2enE7UwCFi/GiD4vq/m3hNZiKBjitAvheaqbSLjMpBax+c8HXoY5G09ap1PjEnUQPIK0xZRRQKpnrWcCyP4j8N3WwYYQGDW+OYOJjBvJdv+D6XSdEi+4IsZASYVpu9V8UZ570Cakbc+IjUm0UZJXghcR7izIjKtoNHf2Fmc26DEp1Jw==")
                        .setSign(
                                "mMx/Klovbzq1QxQvVgm30nYhj0jDOykyo9aparyWRNz3ACxV/2gIdLpyM/SMerWMTcx26NapQ9HsKK7BRK7Yx+nMR0O83BkBlxfl+NEarYr6kj9lBKAxZYXTXFRYA4sRynvwa/MOPmGwYMNl6aVvMohhvrsTopsRvIuGFtnCVL2wBfbxcNnbVfP5k+DxPuQnxa/vi+ju8TogW2R+r0p9zQ5NJe1oaYe4xYbyhefFVv11FA/JQHwMHLEyrEdPqTzdN75CUmE09yLuAoeJzoJ1vwwjwfcH9dMDPxsewNJBGiylVHYf56kF4HypNkYNjtxbghgLBaHg0ZoeYHTOJ7YUTQ==")
                        .build();

        this.setData(p.toByteArray());
    }

    public PacketGetPlayerTokenRsp(GameSession session, int retcode, String msg, int blackEndTime) {
        super(PacketOpcodes.GetPlayerTokenRsp, true);

        this.setUseDispatchKey(true);

        GetPlayerTokenRsp p =
                GetPlayerTokenRsp.newBuilder()
                        .setUid(session.getPlayer().getUid())
                        .setIsProficientPlayer(session.getPlayer().getAvatars().getAvatarCount() > 0)
                        .setRetcode(retcode)
                        .setMsg(msg)
                        .setBlackUidEndTime(blackEndTime)
                        .setRegPlatform(3)
                        .setCountryCode("US")
                        .setTag(5)
                        .build();

        this.setData(p.toByteArray());
    }

    public PacketGetPlayerTokenRsp(
            GameSession session, String encryptedSeed, String encryptedSeedSign, int keyId) {
        super(PacketOpcodes.GetPlayerTokenRsp, true);

        this.setUseDispatchKey(true);

        GetPlayerTokenRsp p =
                GetPlayerTokenRsp.newBuilder()
                        .setUid(session.getPlayer().getUid())
                        .setToken(session.getAccount().getToken())
                        .setAccountType(1)
                        .setIsProficientPlayer(
                                session.getPlayer().getAvatars().getAvatarCount() > 0) // Not sure where this goes
                        .setSecretKeySeed(session.getEncryptSeed())
                        .setSecurityCmdBuffer(ByteString.copyFrom(Crypto.ENCRYPT_SEED_BUFFER))
                        .setKeyId(keyId)
                        .setPlatformType(3)
                        .setChannelId(1)
                        .setCountryCode("US")
                        .setClientVersionRandomKey("c25-314dd05b0b5f")
                        .setRegPlatform(3)
                        .setClientIpStr(session.getAddress().getAddress().getHostAddress())
                        .setServerRandKey(encryptedSeed)
                        .setSign(encryptedSeedSign)
                        .build();

        this.setData(p.toByteArray());
    }
}
