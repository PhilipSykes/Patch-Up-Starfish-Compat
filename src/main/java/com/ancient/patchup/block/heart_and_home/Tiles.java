package com.ancient.patchup.block.heart_and_home;

import com.ancient.patchup.PatchUp;
import com.ninni.dye_depot.registry.DDBlocks;
import com.starfish_studios.hearth_and_home.block.HorizontalFacingBlock;
import com.starfish_studios.hearth_and_home.block.RotatingSlabBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Tiles {

    public static final Block MAROON_TILES = registerBlock("maroon_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Block MAROON_TILE_SLAB = registerBlock("maroon_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Block ROSE_TILES = registerBlock("rose_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Block ROSE_TILE_SLAB = registerBlock("rose_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Block CORAL_TILES = registerBlock("coral_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Block CORAL_TILE_SLAB = registerBlock("coral_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Block GINGER_TILES = registerBlock("ginger_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Block GINGER_TILE_SLAB = registerBlock("ginger_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Block TAN_TILES = registerBlock("tan_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Block TAN_TILE_SLAB = registerBlock("tan_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Block BEIGE_TILES = registerBlock("beige_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Block BEIGE_TILE_SLAB = registerBlock("beige_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Block AMBER_TILES = registerBlock("amber_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Block AMBER_TILE_SLAB = registerBlock("amber_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Block OLIVE_TILES = registerBlock("olive_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Block OLIVE_TILE_SLAB = registerBlock("olive_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Block FOREST_TILES = registerBlock("forest_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Block FOREST_TILE_SLAB = registerBlock("forest_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Block VERDANT_TILES = registerBlock("verdant_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Block VERDANT_TILE_SLAB = registerBlock("verdant_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Block TEAL_TILES = registerBlock("teal_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Block TEAL_TILE_SLAB = registerBlock("teal_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Block MINT_TILES = registerBlock("mint_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Block MINT_TILE_SLAB = registerBlock("mint_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Block AQUA_TILES = registerBlock("aqua_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Block AQUA_TILE_SLAB = registerBlock("aqua_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Block SLATE_TILES = registerBlock("slate_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Block SLATE_TILE_SLAB = registerBlock("slate_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Block NAVY_TILES = registerBlock("navy_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Block NAVY_TILE_SLAB = registerBlock("navy_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Block INDIGO_TILES = registerBlock("indigo_tiles",  new HorizontalFacingBlock(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));
    public static final Block INDIGO_TILE_SLAB = registerBlock("indigo_tile_slab",  new RotatingSlabBlock(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PatchUp.MOD_ID, name), block);
    }

    private static Block registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(PatchUp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static void init() {
        PatchUp.LOGGER.info("Tiles " + PatchUp.MOD_ID);
    }
}
