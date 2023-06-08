package nijigen.swordtest.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 10000;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 20.0F;
    }
    @Override
    public float getAttackDamage() {
        return 3.0F;
    }
    @Override
    public int getMiningLevel() {
        return 5;
    }
    @Override
    public int getEnchantability() {
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RAW_CUM);
    }
    public static final ModToolMaterial CUMMATERIAL = new ModToolMaterial();
}
