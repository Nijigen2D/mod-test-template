package nijigen.swordtest.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;
import nijigen.swordtest.networking.packet.CumC2SPacket;
import nijigen.swordtest.networking.packet.ExampleC2SPacket;

public class ModMessages {
    public static final Identifier CUMMING_ID = new Identifier(ModTest.MOD_ID, "cumming");
    public static final Identifier EXAMPLE_ID = new Identifier(ModTest.MOD_ID, "example");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::recieve);
        ServerPlayNetworking.registerGlobalReceiver(CUMMING_ID, CumC2SPacket::recieve);
    }
    public static void registerS2CPackets() {

    }
}
