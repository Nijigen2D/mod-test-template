package nijigen.swordtest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import nijigen.swordtest.ModTest;

public class ModItems {
    public static final Item RAW_CUM = registerItem("raw_cum",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).alwaysEdible().build())));
    public static final Item CUM = registerItem("cum",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(10f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 10), 1.0F)
                            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 10), 1.0F)
                            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 10), 1.0F)
                            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 10), 1.0F)
                            .alwaysEdible().build())));
    public static final Item CUMSWORD = registerItem("cumsword",
            new SwordItem(ModToolMaterial.CUMMATERIAL, 100000, 20.0f, new FabricItemSettings().maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModTest.MOD_ID, name), item);
    }
    public static void addItemsToItemGroups() {

        addToItemGroup(ModItemGroup.CUM, RAW_CUM);
        addToItemGroup(ModItemGroup.CUM, CUM);
        addToItemGroup(ModItemGroup.CUM, CUMSWORD);
    }
    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        ModTest.LOGGER.debug("Registering Mod Items for " + ModTest.MOD_ID);

        addItemsToItemGroups();
    }
}
