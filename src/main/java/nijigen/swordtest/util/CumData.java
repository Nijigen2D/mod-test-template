package nijigen.swordtest.util;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import nijigen.swordtest.networking.ModMessages;

public class CumData {
    public static int addCum(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int cum = nbt.getInt("cum");
        if(cum + amount >= 10) {
            cum = 10;
        } else {
            cum += amount;
        }

        nbt.putInt("cum", cum);
        syncCum(cum, (ServerPlayerEntity) player);
        return cum;
    }
    public static int removeCum(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int cum = nbt.getInt("cum");
        if(cum - amount < 0) {
            cum = 0;
        } else {
            cum -= amount;
        }

        nbt.putInt("cum", cum);
        syncCum(cum, (ServerPlayerEntity) player);
        return cum;
    }

    public static void syncCum(int cum, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(cum);
        ServerPlayNetworking.send(player, ModMessages.CUM_SYNC_ID, buffer);
    }


}
