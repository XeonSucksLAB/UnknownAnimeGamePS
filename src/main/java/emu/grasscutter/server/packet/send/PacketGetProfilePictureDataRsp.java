package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.GetProfilePictureDataRspOuterClass.GetProfilePictureDataRsp;

public class PacketGetProfilePictureDataRsp extends BasePacket {

    public PacketGetProfilePictureDataRsp(Player player) {
        super(PacketOpcodes.GetProfilePictureDataRsp);

        var proto = GetProfilePictureDataRsp.newBuilder();

        this.setData(proto);
    }
}
