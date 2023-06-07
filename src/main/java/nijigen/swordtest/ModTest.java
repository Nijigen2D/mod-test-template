package nijigen.swordtest;

import net.fabricmc.api.ModInitializer;

import nijigen.swordtest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTest implements ModInitializer {
	public static final String MOD_ID = "modtest";
    public static final Logger LOGGER = LoggerFactory.getLogger("modtest");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		// test
		ModItems.registerModItems();

		LOGGER.info("Deez Nutz");
	}
}