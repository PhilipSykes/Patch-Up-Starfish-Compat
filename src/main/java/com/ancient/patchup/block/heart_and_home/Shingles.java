package com.ancient.patchup.block.heart_and_home;

import com.ancient.patchup.PatchUp;
import com.ninni.dye_depot.registry.DDBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Shingles {

    public static final Block MAROON_SHINGLES = registerBlock("maroon_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Block MAROON_SHINGLE_STAIRS = registerBlock("maroon_shingle_stairs",  new StairsBlock(MAROON_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Block MAROON_SHINGLE_SLAB = registerBlock("maroon_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));

    public static final Block ROSE_SHINGLES = registerBlock("rose_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Block ROSE_SHINGLE_STAIRS = registerBlock("rose_shingle_stairs",  new StairsBlock(ROSE_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Block ROSE_SHINGLE_SLAB = registerBlock("rose_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));

    public static final Block CORAL_SHINGLES = registerBlock("coral_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Block CORAL_SHINGLE_STAIRS = registerBlock("coral_shingle_stairs",  new StairsBlock(CORAL_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Block CORAL_SHINGLE_SLAB = registerBlock("coral_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));

    public static final Block GINGER_SHINGLES = registerBlock("ginger_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Block GINGER_SHINGLE_STAIRS = registerBlock("ginger_shingle_stairs",  new StairsBlock(GINGER_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Block GINGER_SHINGLE_SLAB = registerBlock("ginger_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));

    public static final Block TAN_SHINGLES = registerBlock("tan_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Block TAN_SHINGLE_STAIRS = registerBlock("tan_shingle_stairs",  new StairsBlock(TAN_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Block TAN_SHINGLE_SLAB = registerBlock("tan_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));

    public static final Block BEIGE_SHINGLES = registerBlock("beige_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Block BEIGE_SHINGLE_STAIRS = registerBlock("beige_shingle_stairs",  new StairsBlock(BEIGE_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Block BEIGE_SHINGLE_SLAB = registerBlock("beige_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));

    public static final Block AMBER_SHINGLES = registerBlock("amber_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Block AMBER_SHINGLE_STAIRS = registerBlock("amber_shingle_stairs",  new StairsBlock(AMBER_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Block AMBER_SHINGLE_SLAB = registerBlock("amber_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));

    public static final Block OLIVE_SHINGLES = registerBlock("olive_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Block OLIVE_SHINGLE_STAIRS = registerBlock("olive_shingle_stairs",  new StairsBlock(OLIVE_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Block OLIVE_SHINGLE_SLAB = registerBlock("olive_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));

    public static final Block FOREST_SHINGLES = registerBlock("forest_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Block FOREST_SHINGLE_STAIRS = registerBlock("forest_shingle_stairs",  new StairsBlock(FOREST_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Block FOREST_SHINGLE_SLAB = registerBlock("forest_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));

    public static final Block VERDANT_SHINGLES = registerBlock("verdant_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Block VERDANT_SHINGLE_STAIRS = registerBlock("verdant_shingle_stairs",  new StairsBlock(VERDANT_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Block VERDANT_SHINGLE_SLAB = registerBlock("verdant_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));

    public static final Block TEAL_SHINGLES = registerBlock("teal_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Block TEAL_SHINGLE_STAIRS = registerBlock("teal_shingle_stairs",  new StairsBlock(TEAL_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Block TEAL_SHINGLE_SLAB = registerBlock("teal_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));

    public static final Block MINT_SHINGLES = registerBlock("mint_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Block MINT_SHINGLE_STAIRS = registerBlock("mint_shingle_stairs",  new StairsBlock(MINT_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Block MINT_SHINGLE_SLAB = registerBlock("mint_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));

    public static final Block AQUA_SHINGLES = registerBlock("aqua_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Block AQUA_SHINGLE_STAIRS = registerBlock("aqua_shingle_stairs",  new StairsBlock(AQUA_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Block AQUA_SHINGLE_SLAB = registerBlock("aqua_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));

    public static final Block SLATE_SHINGLES = registerBlock("slate_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Block SLATE_SHINGLE_STAIRS = registerBlock("slate_shingle_stairs",  new StairsBlock(SLATE_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Block SLATE_SHINGLE_SLAB = registerBlock("slate_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));

    public static final Block NAVY_SHINGLES = registerBlock("navy_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Block NAVY_SHINGLE_STAIRS = registerBlock("navy_shingle_stairs",  new StairsBlock(NAVY_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Block NAVY_SHINGLE_SLAB = registerBlock("navy_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));

    public static final Block INDIGO_SHINGLES = registerBlock("indigo_shingles",  new Block(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));
    public static final Block INDIGO_SHINGLE_STAIRS = registerBlock("indigo_shingle_stairs",  new StairsBlock(INDIGO_SHINGLES.getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));
    public static final Block INDIGO_SHINGLE_SLAB = registerBlock("indigo_shingle_slab",  new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));

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
