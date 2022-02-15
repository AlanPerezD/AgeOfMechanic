package net.fabricmc.ageofmechanic;

import net.fabricmc.ageofmechanic.block.ModBlocks;
import net.fabricmc.ageofmechanic.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgeOfMechanic implements ModInitializer {


    public static final String MOD_ID = "ageofmechanic";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlock();
		ModItems.registerModItems();
	}
}
