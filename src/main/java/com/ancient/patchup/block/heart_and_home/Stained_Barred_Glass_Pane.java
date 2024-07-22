package com.ancient.patchup.block.heart_and_home;

import com.ancient.patchup.PatchUp;
import com.ancient.patchup.block.heart_and_home.custom.StainedGlassPaneBlock;
import com.ninni.dye_depot.registry.DDBlocks;
import com.ninni.dye_depot.registry.DDDyes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Stained_Barred_Glass_Pane {

    public static final Block MAROON_STAINED_BARRED_GLASS_PANE = registerBlock("maroon_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.MAROON, AbstractBlock.Settings.copy(DDBlocks.MAROON_STAINED_GLASS_PANE)));
    public static final Block ROSE_STAINED_BARRED_GLASS_PANE = registerBlock("rose_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.ROSE, AbstractBlock.Settings.copy(DDBlocks.ROSE_STAINED_GLASS_PANE)));
    public static final Block CORAL_STAINED_BARRED_GLASS_PANE = registerBlock("coral_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.CORAL, AbstractBlock.Settings.copy(DDBlocks.CORAL_STAINED_GLASS_PANE)));
    public static final Block GINGER_STAINED_BARRED_GLASS_PANE = registerBlock("ginger_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.GINGER, AbstractBlock.Settings.copy(DDBlocks.GINGER_STAINED_GLASS_PANE)));
    public static final Block TAN_STAINED_BARRED_GLASS_PANE = registerBlock("tan_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.TAN, AbstractBlock.Settings.copy(DDBlocks.TAN_STAINED_GLASS_PANE)));
    public static final Block BEIGE_STAINED_BARRED_GLASS_PANE = registerBlock("beige_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.BEIGE, AbstractBlock.Settings.copy(DDBlocks.BEIGE_STAINED_GLASS_PANE)));
    public static final Block AMBER_STAINED_BARRED_GLASS_PANE = registerBlock("amber_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.AMBER, AbstractBlock.Settings.copy(DDBlocks.AMBER_STAINED_GLASS_PANE)));
    public static final Block OLIVE_STAINED_BARRED_GLASS_PANE = registerBlock("olive_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.OLIVE, AbstractBlock.Settings.copy(DDBlocks.OLIVE_STAINED_GLASS_PANE)));
    public static final Block FOREST_STAINED_BARRED_GLASS_PANE = registerBlock("forest_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.FOREST, AbstractBlock.Settings.copy(DDBlocks.FOREST_STAINED_GLASS_PANE)));
    public static final Block VERDANT_STAINED_BARRED_GLASS_PANE = registerBlock("verdant_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.VERDANT, AbstractBlock.Settings.copy(DDBlocks.VERDANT_STAINED_GLASS_PANE)));
    public static final Block TEAL_STAINED_BARRED_GLASS_PANE = registerBlock("teal_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.TEAL, AbstractBlock.Settings.copy(DDBlocks.TEAL_STAINED_GLASS_PANE)));
    public static final Block MINT_STAINED_BARRED_GLASS_PANE = registerBlock("mint_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.MINT, AbstractBlock.Settings.copy(DDBlocks.MINT_STAINED_GLASS_PANE)));
    public static final Block AQUA_STAINED_BARRED_GLASS_PANE = registerBlock("aqua_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.AQUA, AbstractBlock.Settings.copy(DDBlocks.AQUA_STAINED_GLASS_PANE)));
    public static final Block SLATE_STAINED_BARRED_GLASS_PANE = registerBlock("slate_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.SLATE, AbstractBlock.Settings.copy(DDBlocks.SLATE_STAINED_GLASS_PANE)));
    public static final Block NAVY_STAINED_BARRED_GLASS_PANE = registerBlock("navy_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.NAVY, AbstractBlock.Settings.copy(DDBlocks.NAVY_STAINED_GLASS_PANE)));
    public static final Block INDIGO_STAINED_BARRED_GLASS_PANE = registerBlock("indigo_stained_barred_glass_pane", new StainedGlassPaneBlock(DDDyes.INDIGO, AbstractBlock.Settings.copy(DDBlocks.INDIGO_STAINED_GLASS_PANE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PatchUp.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PatchUp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void init() {
        PatchUp.LOGGER.info("Stained Barred Glass Pane " + PatchUp.MOD_ID);
    }
}
