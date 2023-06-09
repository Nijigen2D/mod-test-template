package nijigen.swordtest.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;
import nijigen.swordtest.networking.packet.CumC2SPacket;
import nijigen.swordtest.networking.packet.CumSyncDataS2CPacket;
import nijigen.swordtest.networking.packet.ExampleC2SPacket;

public class ModMessages {
    public static final Identifier CUMMING_ID = new Identifier(ModTest.MOD_ID, "cumming");
    public static final Identifier CUM_SYNC_ID = new Identifier(ModTest.MOD_ID, "cum_sync");
    public static final Identifier EXAMPLE_ID = new Identifier(ModTest.MOD_ID, "example");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(CUMMING_ID, CumC2SPacket::receive);
    }
    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(CUM_SYNC_ID, CumSyncDataS2CPacket::receive);
    }
}
