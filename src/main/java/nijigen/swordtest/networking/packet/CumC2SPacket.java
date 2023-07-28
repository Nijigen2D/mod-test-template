package nijigen.swordtest.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import nijigen.swordtest.item.ModItems;
import nijigen.swordtest.sound.ModSounds;
import nijigen.swordtest.util.CumData;
import nijigen.swordtest.util.IEntityDataSaver;

public class CumC2SPacket {
    private static final String MESSAGE_COOMING = "message.modtest.coomed";
    private static final String MESSAGE_NO_COOM = "message.modtest.coomednot";
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        ServerWorld world = player.getServerWorld();
        if(((IEntityDataSaver) player).getPersistentData().getInt("cum") > 4) {
            //Play coom sound
            world.playSound(null, player.getBlockPos(), ModSounds.COOM_SOUND, SoundCategory.PLAYERS, 1f, 1f);
            //Notify player
            player.sendMessage(Text.translatable(MESSAGE_COOMING)
                    .fillStyle(Style.EMPTY.withColor(Formatting.DARK_GRAY)), false);
            //Remove cum
            CumData.removeCum(((IEntityDataSaver) player),5);
            //Give raw cum
            player.giveItemStack(ModItems.RAW_CUM.getDefaultStack());
            player.giveItemStack(ModItems.RAW_CUM.getDefaultStack());
            player.giveItemStack(ModItems.RAW_CUM.getDefaultStack());
            player.giveItemStack(ModItems.RAW_CUM.getDefaultStack());
            player.giveItemStack(ModItems.RAW_CUM.getDefaultStack());
            //Cum levels
            //player.sendMessage(Text.literal("Cum: " + ((IEntityDataSaver) player).getPersistentData().getInt("cum"))
            //        .fillStyle(Style.EMPTY.withColor(Formatting.AQUA)), false);

        } else {
            //Notify player
            player.sendMessage(Text.translatable(MESSAGE_NO_COOM)
                    .fillStyle(Style.EMPTY.withColor(Formatting.DARK_RED).withBold(true)), false);
            //Cum levels
            //player.sendMessage(Text.literal("Cum: " + ((IEntityDataSaver) player).getPersistentData().getInt("cum"))
            //        .fillStyle(Style.EMPTY.withColor(Formatting.AQUA)), false);
        }
    }
}
