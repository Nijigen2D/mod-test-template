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
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build())));
    public static final Item COOKED_CUM = registerItem("cooked_cum",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(4f).build())));
    public static final  Item GOD_CUM = registerItem("god_cum",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(18).saturationModifier(18f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
                            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F)
                            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
                            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F)
                            .alwaysEdible().build())));
    public static final Item CUMSWORD = registerItem("cumsword",
            new SwordItem(ModToolMaterial.CUMMATERIAL, 19, -2.4f, new FabricItemSettings().maxCount(64)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModTest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ModTest.LOGGER.debug("Registering Mod Items for " + ModTest.MOD_ID);

    }
}
