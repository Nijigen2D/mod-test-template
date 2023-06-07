package nijigen.swordtest;

import net.fabricmc.api.ModInitializer;

import nijigen.swordtest.item.ModItemGroup;
import nijigen.swordtest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTest implements ModInitializer {
	public static final String MOD_ID = "modtest";
    public static final Logger LOGGER = LoggerFactory.getLogger("modtest");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();

		LOGGER.info("Deez Nutz");
	}
}