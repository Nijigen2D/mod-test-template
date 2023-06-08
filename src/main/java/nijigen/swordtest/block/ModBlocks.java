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
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import nijigen.swordtest.ModTest;
import nijigen.swordtest.item.ModItemGroup;

public class ModBlocks {
    public static final Block RAW_CUM_BLOCK = registerBlock("raw_cum_block",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1.0f)), ModItemGroup.CUM);
    public static final Block RAW_CUM_STAIRS = registerBlock("raw_cum_stairs",
            new StairsBlock(ModBlocks.RAW_CUM_BLOCK.getDefaultState(),FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1.0f)), ModItemGroup.CUM);
    public static final Block RAW_CUM_SLAB = registerBlock("raw_cum_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1.0f)), ModItemGroup.CUM);
    public static final Block RAW_CUM_DOOR = registerBlock("raw_cum_door",
            new DoorBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1.0f).nonOpaque(),
                    SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.CUM);
    public static final Block RAW_CUM_TRAPDOOR = registerBlock("raw_cum_door",
            new TrapdoorBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1.0f).nonOpaque(),
                    SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.CUM);
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ModTest.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ModTest.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        ModTest.LOGGER.info("Registering ModBlocks for " + ModTest.MOD_ID);
    }
}
