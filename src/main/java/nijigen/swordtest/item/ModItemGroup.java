package nijigen.swordtest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;
import nijigen.swordtest.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup CUM = Registry.register(Registries.ITEM_GROUP, new Identifier(ModTest.MOD_ID, "xum"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cum"))
                    .icon(() -> new ItemStack(ModItems.RAW_CUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_CUM);
                        entries.add(ModItems.COOKED_CUM);
                        entries.add(ModItems.GOD_CUM);
                        entries.add(ModItems.CUMSWORD);

                        entries.add(ModBlocks.RAW_CUM_BLOCK);
                        entries.add(ModBlocks.RAW_CUM_DOOR);
                        entries.add(ModBlocks.RAW_CUM_SLAB);
                        entries.add(ModBlocks.RAW_CUM_STAIRS);
                        entries.add(ModBlocks.RAW_CUM_TRAPDOOR);
                    }).build());
    public static void registerItemGroup() {

    }
}
