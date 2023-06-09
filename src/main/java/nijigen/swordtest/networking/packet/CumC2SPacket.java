package nijigen.swordtest.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import nijigen.swordtest.item.ModItems;
import nijigen.swordtest.sound.ModSounds;

public class CumC2SPacket {
    public static void recieve(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        //yes
        player.giveItemStack(ModItems.RAW_CUM.getDefaultStack());
        player.playSound(ModSounds.COOM_SOUND, SoundCategory.PLAYERS,1f,1f);
    }
}
