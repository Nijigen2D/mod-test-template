package nijigen.swordtest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;

public class ModItemGroup {
    public static ItemGroup CUM;
    public static void registerItemGroup() {
        CUM = FabricItemGroup.builder(new Identifier(ModTest.MOD_ID, "cum"))
                .displayName(Text.literal("Cum Item Group"))
                .icon(() -> new ItemStack(ModItems.RAW_CUM)).build();
    }
}
