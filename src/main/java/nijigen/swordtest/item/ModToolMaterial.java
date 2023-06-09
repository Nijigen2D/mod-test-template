package nijigen.swordtest.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import nijigen.swordtest.block.ModBlocks;

public class ModToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 20.0F;
    }
    @Override
    public float getAttackDamage() {
        return 0.0F;
    }
    @Override
    public int getMiningLevel() {
        return 5;
    }
    @Override
    public int getEnchantability() {
        return 30;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModBlocks.RAW_CUM_BLOCK);
    }
    public static final ModToolMaterial CUMMATERIAL = new ModToolMaterial();
}
