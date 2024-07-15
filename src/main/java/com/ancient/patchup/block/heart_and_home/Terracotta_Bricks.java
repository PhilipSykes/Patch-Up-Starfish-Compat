package com.ancient.patchup.block.heart_and_home;

import com.ancient.patchup.PatchUp;
import com.ninni.dye_depot.registry.DDBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Terracotta_Bricks {

    public static final Block MAROON_TERRACOTTA_BRICKS = registerBlock("maroon_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Block MAROON_TERRACOTTA_BRICK_STAIRS = registerBlock("maroon_terracotta_brick_stairs",  new StairsBlock(MAROON_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Block MAROON_TERRACOTTA_BRICK_SLAB = registerBlock("maroon_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));

    public static final Block ROSE_TERRACOTTA_BRICKS = registerBlock("rose_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Block ROSE_TERRACOTTA_BRICK_STAIRS = registerBlock("rose_terracotta_brick_stairs",  new StairsBlock(ROSE_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Block ROSE_TERRACOTTA_BRICK_SLAB = registerBlock("rose_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));

    public static final Block CORAL_TERRACOTTA_BRICKS = registerBlock("coral_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Block CORAL_TERRACOTTA_BRICK_STAIRS = registerBlock("coral_terracotta_brick_stairs",  new StairsBlock(CORAL_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Block CORAL_TERRACOTTA_BRICK_SLAB = registerBlock("coral_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));

    public static final Block GINGER_TERRACOTTA_BRICKS = registerBlock("ginger_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Block GINGER_TERRACOTTA_BRICK_STAIRS = registerBlock("ginger_terracotta_brick_stairs",  new StairsBlock(GINGER_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Block GINGER_TERRACOTTA_BRICK_SLAB = registerBlock("ginger_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));

    public static final Block TAN_TERRACOTTA_BRICKS = registerBlock("tan_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Block TAN_TERRACOTTA_BRICK_STAIRS = registerBlock("tan_terracotta_brick_stairs",  new StairsBlock(TAN_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Block TAN_TERRACOTTA_BRICK_SLAB = registerBlock("tan_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));

    public static final Block BEIGE_TERRACOTTA_BRICKS = registerBlock("beige_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Block BEIGE_TERRACOTTA_BRICK_STAIRS = registerBlock("beige_terracotta_brick_stairs",  new StairsBlock(BEIGE_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Block BEIGE_TERRACOTTA_BRICK_SLAB = registerBlock("beige_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));

    public static final Block AMBER_TERRACOTTA_BRICKS = registerBlock("amber_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Block AMBER_TERRACOTTA_BRICK_STAIRS = registerBlock("amber_terracotta_brick_stairs",  new StairsBlock(AMBER_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Block AMBER_TERRACOTTA_BRICK_SLAB = registerBlock("amber_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));

    public static final Block OLIVE_TERRACOTTA_BRICKS = registerBlock("olive_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Block OLIVE_TERRACOTTA_BRICK_STAIRS = registerBlock("olive_terracotta_brick_stairs",  new StairsBlock(OLIVE_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Block OLIVE_TERRACOTTA_BRICK_SLAB = registerBlock("olive_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));

    public static final Block FOREST_TERRACOTTA_BRICKS = registerBlock("forest_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Block FOREST_TERRACOTTA_BRICK_STAIRS = registerBlock("forest_terracotta_brick_stairs",  new StairsBlock(FOREST_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Block FOREST_TERRACOTTA_BRICK_SLAB = registerBlock("forest_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));

    public static final Block VERDANT_TERRACOTTA_BRICKS = registerBlock("verdant_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Block VERDANT_TERRACOTTA_BRICK_STAIRS = registerBlock("verdant_terracotta_brick_stairs",  new StairsBlock(VERDANT_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Block VERDANT_TERRACOTTA_BRICK_SLAB = registerBlock("verdant_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));

    public static final Block TEAL_TERRACOTTA_BRICKS = registerBlock("teal_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Block TEAL_TERRACOTTA_BRICK_STAIRS = registerBlock("teal_terracotta_brick_stairs",  new StairsBlock(TEAL_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Block TEAL_TERRACOTTA_BRICK_SLAB = registerBlock("teal_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));

    public static final Block MINT_TERRACOTTA_BRICKS = registerBlock("mint_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Block MINT_TERRACOTTA_BRICK_STAIRS = registerBlock("mint_terracotta_brick_stairs",  new StairsBlock(MINT_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Block MINT_TERRACOTTA_BRICK_SLAB = registerBlock("mint_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));

    public static final Block AQUA_TERRACOTTA_BRICKS = registerBlock("aqua_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Block AQUA_TERRACOTTA_BRICK_STAIRS = registerBlock("aqua_terracotta_brick_stairs",  new StairsBlock(AQUA_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Block AQUA_TERRACOTTA_BRICK_SLAB = registerBlock("aqua_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));

    public static final Block SLATE_TERRACOTTA_BRICKS = registerBlock("slate_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Block SLATE_TERRACOTTA_BRICK_STAIRS = registerBlock("slate_terracotta_brick_stairs",  new StairsBlock(SLATE_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Block SLATE_TERRACOTTA_BRICK_SLAB = registerBlock("slate_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));

    public static final Block NAVY_TERRACOTTA_BRICKS = registerBlock("navy_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Block NAVY_TERRACOTTA_BRICK_STAIRS = registerBlock("navy_terracotta_brick_stairs",  new StairsBlock(NAVY_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Block NAVY_TERRACOTTA_BRICK_SLAB = registerBlock("navy_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));

    public static final Block INDIGO_TERRACOTTA_BRICKS = registerBlock("indigo_terracotta_bricks",  new Block(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));
    public static final Block INDIGO_TERRACOTTA_BRICK_STAIRS = registerBlock("indigo_terracotta_brick_stairs",  new StairsBlock(INDIGO_TERRACOTTA_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));
    public static final Block INDIGO_TERRACOTTA_BRICK_SLAB = registerBlock("indigo_terracotta_brick_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PatchUp.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PatchUp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void init() {
        PatchUp.LOGGER.info("Terracotta Bricks " + PatchUp.MOD_ID);
    }
}
