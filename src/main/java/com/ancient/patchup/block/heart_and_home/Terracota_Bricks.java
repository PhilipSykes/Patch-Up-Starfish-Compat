package com.ancient.patchup.block.heart_and_home;

import com.ninni.dye_depot.registry.DDBlocks;
import com.starfish_studios.hearth_and_home.registry.HNHRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class Terracota_Bricks {

    public static final Supplier<Block> MAROON_TERRACOTTA_BRICKS = registerBlock("maroon_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Supplier<Block> MAROON_TERRACOTTA_BRICK_STAIRS = registerBlock("maroon_terracotta_brick_stairs", () -> new StairsBlock(MAROON_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));
    public static final Supplier<Block> MAROON_TERRACOTTA_BRICK_SLAB = registerBlock("maroon_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.MAROON_TERRACOTTA)));

    public static final Supplier<Block> ROSE_TERRACOTTA_BRICKS = registerBlock("rose_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Supplier<Block> ROSE_TERRACOTTA_BRICK_STAIRS = registerBlock("rose_terracotta_brick_stairs", () -> new StairsBlock(ROSE_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));
    public static final Supplier<Block> ROSE_TERRACOTTA_BRICK_SLAB = registerBlock("rose_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.ROSE_TERRACOTTA)));

    public static final Supplier<Block> CORAL_TERRACOTTA_BRICKS = registerBlock("coral_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Supplier<Block> CORAL_TERRACOTTA_BRICK_STAIRS = registerBlock("coral_terracotta_brick_stairs", () -> new StairsBlock(CORAL_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));
    public static final Supplier<Block> CORAL_TERRACOTTA_BRICK_SLAB = registerBlock("coral_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.CORAL_TERRACOTTA)));

    public static final Supplier<Block> GINGER_TERRACOTTA_BRICKS = registerBlock("ginger_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Supplier<Block> GINGER_TERRACOTTA_BRICK_STAIRS = registerBlock("ginger_terracotta_brick_stairs", () -> new StairsBlock(GINGER_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));
    public static final Supplier<Block> GINGER_TERRACOTTA_BRICK_SLAB = registerBlock("ginger_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.GINGER_TERRACOTTA)));

    public static final Supplier<Block> TAN_TERRACOTTA_BRICKS = registerBlock("tan_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Supplier<Block> TAN_TERRACOTTA_BRICK_STAIRS = registerBlock("tan_terracotta_brick_stairs", () -> new StairsBlock(TAN_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));
    public static final Supplier<Block> TAN_TERRACOTTA_BRICK_SLAB = registerBlock("tan_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.TAN_TERRACOTTA)));

    public static final Supplier<Block> BEIGE_TERRACOTTA_BRICKS = registerBlock("beige_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Supplier<Block> BEIGE_TERRACOTTA_BRICK_STAIRS = registerBlock("beige_terracotta_brick_stairs", () -> new StairsBlock(BEIGE_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Supplier<Block> BEIGE_TERRACOTTA_BRICK_SLAB = registerBlock("beige_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.BEIGE_TERRACOTTA)));

    public static final Supplier<Block> AMBER_TERRACOTTA_BRICKS = registerBlock("amber_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Supplier<Block> AMBER_TERRACOTTA_BRICK_STAIRS = registerBlock("amber_terracotta_brick_stairs", () -> new StairsBlock(AMBER_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));
    public static final Supplier<Block> AMBER_TERRACOTTA_BRICK_SLAB = registerBlock("amber_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.AMBER_TERRACOTTA)));

    public static final Supplier<Block> OLIVE_TERRACOTTA_BRICKS = registerBlock("olive_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Supplier<Block> OLIVE_TERRACOTTA_BRICK_STAIRS = registerBlock("olive_terracotta_brick_stairs", () -> new StairsBlock(OLIVE_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Supplier<Block> OLIVE_TERRACOTTA_BRICK_SLAB = registerBlock("olive_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.OLIVE_TERRACOTTA)));

    public static final Supplier<Block> FOREST_TERRACOTTA_BRICKS = registerBlock("forest_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Supplier<Block> FOREST_TERRACOTTA_BRICK_STAIRS = registerBlock("forest_terracotta_brick_stairs", () -> new StairsBlock(FOREST_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));
    public static final Supplier<Block> FOREST_TERRACOTTA_BRICK_SLAB = registerBlock("forest_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.FOREST_TERRACOTTA)));

    public static final Supplier<Block> VERDANT_TERRACOTTA_BRICKS = registerBlock("verdant_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Supplier<Block> VERDANT_TERRACOTTA_BRICK_STAIRS = registerBlock("verdant_terracotta_brick_stairs", () -> new StairsBlock(VERDANT_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Supplier<Block> VERDANT_TERRACOTTA_BRICK_SLAB = registerBlock("verdant_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.VERDANT_TERRACOTTA)));

    public static final Supplier<Block> TEAL_TERRACOTTA_BRICKS = registerBlock("teal_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Supplier<Block> TEAL_TERRACOTTA_BRICK_STAIRS = registerBlock("teal_terracotta_brick_stairs", () -> new StairsBlock(TEAL_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));
    public static final Supplier<Block> TEAL_TERRACOTTA_BRICK_SLAB = registerBlock("teal_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.TEAL_TERRACOTTA)));

    public static final Supplier<Block> MINT_TERRACOTTA_BRICKS = registerBlock("mint_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Supplier<Block> MINT_TERRACOTTA_BRICK_STAIRS = registerBlock("mint_terracotta_brick_stairs", () -> new StairsBlock(MINT_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));
    public static final Supplier<Block> MINT_TERRACOTTA_BRICK_SLAB = registerBlock("mint_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.MINT_TERRACOTTA)));

    public static final Supplier<Block> AQUA_TERRACOTTA_BRICKS = registerBlock("aqua_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Supplier<Block> AQUA_TERRACOTTA_BRICK_STAIRS = registerBlock("aqua_terracotta_brick_stairs", () -> new StairsBlock(AQUA_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));
    public static final Supplier<Block> AQUA_TERRACOTTA_BRICK_SLAB = registerBlock("aqua_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.AQUA_TERRACOTTA)));

    public static final Supplier<Block> SLATE_TERRACOTTA_BRICKS = registerBlock("slate_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Supplier<Block> SLATE_TERRACOTTA_BRICK_STAIRS = registerBlock("slate_terracotta_brick_stairs", () -> new StairsBlock(SLATE_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));
    public static final Supplier<Block> SLATE_TERRACOTTA_BRICK_SLAB = registerBlock("slate_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.SLATE_TERRACOTTA)));

    public static final Supplier<Block> NAVY_TERRACOTTA_BRICKS = registerBlock("navy_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Supplier<Block> NAVY_TERRACOTTA_BRICK_STAIRS = registerBlock("navy_terracotta_brick_stairs", () -> new StairsBlock(NAVY_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));
    public static final Supplier<Block> NAVY_TERRACOTTA_BRICK_SLAB = registerBlock("navy_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.NAVY_TERRACOTTA)));

    public static final Supplier<Block> INDIGO_TERRACOTTA_BRICKS = registerBlock("indigo_terracotta_bricks", () -> new Block(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));
    public static final Supplier<Block> INDIGO_TERRACOTTA_BRICK_STAIRS = registerBlock("indigo_terracotta_brick_stairs", () -> new StairsBlock(INDIGO_TERRACOTTA_BRICKS.get().getDefaultState(), AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));
    public static final Supplier<Block> INDIGO_TERRACOTTA_BRICK_SLAB = registerBlock("indigo_terracotta_brick_slab", () -> new SlabBlock(AbstractBlock.Settings.copy(DDBlocks.INDIGO_TERRACOTTA)));

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> supplier = HNHRegistry.registerBlock(name, block);
        HNHRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Settings()), "tab");
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockHidden(String name, Supplier<T> block) {
        Supplier<T> supplier = HNHRegistry.registerBlock(name, block);
        HNHRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Settings()), null);
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return HNHRegistry.registerBlock(name, block);
    }
}
