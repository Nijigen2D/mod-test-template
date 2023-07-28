package nijigen.swordtest.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;
import nijigen.swordtest.item.ModItemGroup;

public class ModBlocks {
    public static final Block RAW_CUM_BLOCK = registerBlock("raw_cum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f)));
    public static final Block RAW_CUM_STAIRS = registerBlock("raw_cum_stairs",
            new StairsBlock(ModBlocks.RAW_CUM_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f)));
    public static final Block RAW_CUM_SLAB = registerBlock("raw_cum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f)));
    public static final Block RAW_CUM_DOOR = registerBlock("raw_cum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f).nonOpaque(), BlockSetType.OAK));
    public static final Block RAW_CUM_TRAPDOOR = registerBlock("raw_cum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f).nonOpaque(), BlockSetType.OAK));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ModTest.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ModTest.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
    public static void registerModBlocks() {
        ModTest.LOGGER.info("Registering ModBlocks for " + ModTest.MOD_ID);
    }
}
