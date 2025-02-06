package com.ancient.patchup.block.heart_and_home;

import com.ancient.patchup.PatchUp;
import com.ninni.dye_depot.registry.DDBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Stained_Barred_Glass {

    public static final Block MAROON_STAINED_BARRED_GLASS = registerBlock("maroon_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.MAROON_STAINED_GLASS)));
    public static final Block ROSE_STAINED_BARRED_GLASS = registerBlock("rose_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.ROSE_STAINED_GLASS)));
    public static final Block CORAL_STAINED_BARRED_GLASS = registerBlock("coral_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.CORAL_STAINED_GLASS)));
    public static final Block GINGER_STAINED_BARRED_GLASS = registerBlock("ginger_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.GINGER_STAINED_GLASS)));
    public static final Block TAN_STAINED_BARRED_GLASS = registerBlock("tan_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.TAN_STAINED_GLASS)));
    public static final Block BEIGE_STAINED_BARRED_GLASS = registerBlock("beige_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.BEIGE_STAINED_GLASS)));
    public static final Block AMBER_STAINED_BARRED_GLASS = registerBlock("amber_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.AMBER_STAINED_GLASS)));
    public static final Block OLIVE_STAINED_BARRED_GLASS = registerBlock("olive_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.OLIVE_STAINED_GLASS)));
    public static final Block FOREST_STAINED_BARRED_GLASS = registerBlock("forest_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.FOREST_STAINED_GLASS)));
    public static final Block VERDANT_STAINED_BARRED_GLASS = registerBlock("verdant_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.VERDANT_STAINED_GLASS)));
    public static final Block TEAL_STAINED_BARRED_GLASS = registerBlock("teal_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.TEAL_STAINED_GLASS)));
    public static final Block MINT_STAINED_BARRED_GLASS = registerBlock("mint_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.MINT_STAINED_GLASS)));
    public static final Block AQUA_STAINED_BARRED_GLASS = registerBlock("aqua_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.AQUA_STAINED_GLASS)));
    public static final Block SLATE_STAINED_BARRED_GLASS = registerBlock("slate_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.SLATE_STAINED_GLASS)));
    public static final Block NAVY_STAINED_BARRED_GLASS = registerBlock("navy_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.NAVY_STAINED_GLASS)));
    public static final Block INDIGO_STAINED_BARRED_GLASS = registerBlock("indigo_stained_barred_glass", new GlassBlock(AbstractBlock.Settings.copy(DDBlocks.INDIGO_STAINED_GLASS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PatchUp.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PatchUp.MOD_ID, name),
               new BlockItem(block, new FabricItemSettings()));
    }
    public static void init() {
        PatchUp.LOGGER.info("Paper Lanters " + PatchUp.MOD_ID);
    }
}
