package com.ancient.patchup.reg;

import com.ancient.patchup.PatchUp;
import com.ancient.patchup.block.Trims;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.truly.built.block.ModBlocks;

public class ItemGroupSorting {
    public static void registerGroupSorting() {
        PatchUp.LOGGER.info("Registering Item Groups for " + PatchUp.MOD_ID);
    }
    static {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {

            entries.addBefore(Blocks.WHITE_CONCRETE,
                    ModBlocks.TERRACOTTA_TRIM,
                    ModBlocks.WHITE_TERRACOTTA_TRIM,
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM,
                    ModBlocks.GRAY_TERRACOTTA_TRIM,
                    ModBlocks.BLACK_TERRACOTTA_TRIM,
                    ModBlocks.BROWN_TERRACOTTA_TRIM,
                    Trims.MAROON_TERRACOTTA_TRIM,
                    Trims.ROSE_TERRACOTTA_TRIM,
                    ModBlocks.RED_TERRACOTTA_TRIM,
                    Trims.CORAL_TERRACOTTA_TRIM,
                    Trims.GINGER_TERRACOTTA_TRIM,
                    ModBlocks.ORANGE_TERRACOTTA_TRIM,
                    Trims.TAN_TERRACOTTA_TRIM,
                    Trims.BEIGE_TERRACOTTA_TRIM,
                    ModBlocks.YELLOW_TERRACOTTA_TRIM,
                    Trims.AMBER_TERRACOTTA_TRIM,
                    Trims.OLIVE_TERRACOTTA_TRIM,
                    ModBlocks.LIME_TERRACOTTA_TRIM,
                    Trims.FOREST_TERRACOTTA_TRIM,
                    ModBlocks.GREEN_TERRACOTTA_TRIM,
                    Trims.VERDANT_TERRACOTTA_TRIM,
                    Trims.TEAL_TERRACOTTA_TRIM,
                    ModBlocks.CYAN_TERRACOTTA_TRIM,
                    Trims.MINT_TERRACOTTA_TRIM,
                    Trims.AQUA_TERRACOTTA_TRIM,
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM,
                    ModBlocks.BLUE_TERRACOTTA_TRIM,
                    Trims.SLATE_TERRACOTTA_TRIM,
                    Trims.NAVY_TERRACOTTA_TRIM,
                    Trims.INDIGO_TERRACOTTA_TRIM,
                    ModBlocks.PURPLE_TERRACOTTA_TRIM,
                    ModBlocks.MAGENTA_TERRACOTTA_TRIM,
                    ModBlocks.PINK_TERRACOTTA_TRIM
            );


            // ComfortsRegistry.ITEMS.getEntries().forEach(items -> {
            //  switch (items.get().getTranslationKey()) {
            //     case "block.comforts.hammock_red": entries.addAfter(items.get(), ); break;
            // }

        });
    }//);
}
//}


