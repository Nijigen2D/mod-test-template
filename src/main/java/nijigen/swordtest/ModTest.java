package nijigen.swordtest;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import nijigen.swordtest.block.ModBlocks;
import nijigen.swordtest.item.ModItemGroup;
import nijigen.swordtest.item.ModItems;
import nijigen.swordtest.networking.ModMessages;
import nijigen.swordtest.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTest implements ModInitializer {
	public static final String MOD_ID = "modtest";
    public static final Logger LOGGER = LoggerFactory.getLogger("modtest");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerModSounds();

		ModMessages.registerC2SPackets();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RAW_CUM_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RAW_CUM_TRAPDOOR, RenderLayer.getCutout());

		LOGGER.info("Deez Nutz");
	}
}