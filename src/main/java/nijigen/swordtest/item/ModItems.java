package nijigen.swordtest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import nijigen.swordtest.ModTest;

public class ModItems {
    public static final Item RAW_CUM = registerItem("raw_cum",
            new Item(new FabricItemSettings()));
    public static final Item CUM = registerItem("cum",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModTest.MOD_ID, name), item);
    }
    public static void addItemsToItemGroups() {

        addToItemGroup(ModItemGroup.CUM, RAW_CUM);
        addToItemGroup(ModItemGroup.CUM, CUM);
    }
    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        ModTest.LOGGER.debug("Registering Mod Items for " + ModTest.MOD_ID);

        addItemsToItemGroups();
    }
}
