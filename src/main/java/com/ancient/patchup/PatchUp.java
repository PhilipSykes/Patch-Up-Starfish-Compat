package com.ancient.patchup;

import com.ancient.patchup.block.*;
import com.ancient.patchup.block.another_furniture.*;
import com.ancient.patchup.block.heart_and_home.*;
import com.ancient.patchup.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatchUp implements ModInitializer {
	public static final String MOD_ID = "patchup";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		//ItemGroupSorting.registerGroupSorting();

		if (Compats.ANOTHER_FURNITURE.isLoaded()) {
			Stool.init();
			Stool.registerFlammable();
			TallStool.init();
			TallStool.registerFlammables();
			Sofa.init();
			Sofa.registerFlammables();
			Lamp.init();
			Lamp.registerFlammables();
			Curtain.init();
			Curtain.registerFlammables();
		}

		if (Compats.HEARTH_AND_HOME.isLoaded()) {
			Paper_Lantern.init();
			Shingles.init();
			Terracotta_Bricks.init();
			Tiles.init();
			Stained_Barred_Glass.init();
		}

		if (Compats.BUILT.isLoaded()) {
			Trims.registerModBLocks();
		}

	}
}