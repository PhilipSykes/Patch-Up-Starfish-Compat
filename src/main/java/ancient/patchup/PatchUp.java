package ancient.patchup;

import ancient.patchup.block.ModBlocks;
import ancient.patchup.block.Stool;
import ancient.patchup.block.TallStool;
import ancient.patchup.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatchUp implements ModInitializer {
	public static final String MOD_ID = "patchup";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBLocks();
		Stool.init();
		TallStool.init();
	}
}