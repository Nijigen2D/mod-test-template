package nijigen.swordtest.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import nijigen.swordtest.util.CumData;
import nijigen.swordtest.util.IEntityDataSaver;

import java.util.Random;


public class PlayerTickHandler implements ServerTickEvents.StartTick{
    @Override
    public void onStartTick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            IEntityDataSaver dataPlayer = ((IEntityDataSaver) player);
            if(dataPlayer.getPersistentData().getInt("cum") < 10) {
                if (new Random().nextFloat() <= 0.005f) {
                    CumData.addCum(dataPlayer, 1);
                    //player.sendMessage(Text.literal("Added Cum"));
                }
            }
        }
    }
}
