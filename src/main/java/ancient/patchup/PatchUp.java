package ancient.patchup;

import ancient.patchup.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatchUp implements ModInitializer {
	public static final String MOD_ID = "PatchUp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//ModItemGroups.registerItemGroups();

		//ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}