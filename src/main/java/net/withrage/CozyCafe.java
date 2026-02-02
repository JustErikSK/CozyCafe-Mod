package net.withrage;

import net.fabricmc.api.ModInitializer;
import net.withrage.item.ModItemGroupsCafe;
import net.withrage.item.ModItemsCafe;
import net.withrage.recipe.ModRecipesCafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CozyCafe implements ModInitializer {
	public static final String MOD_ID = "cozycafe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Cozy Café!");
		ModItemsCafe.registerModItems();
		ModItemGroupsCafe.registerItemGroups();
		ModRecipesCafe.registerModRecipes();
	}
}