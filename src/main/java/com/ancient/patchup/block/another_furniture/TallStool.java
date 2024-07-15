package com.ancient.patchup.block.another_furniture;

import com.starfish_studios.another_furniture.block.TallStoolBlock;
import com.starfish_studios.another_furniture.registry.AFBlocks;
import com.starfish_studios.another_furniture.registry.AFRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class TallStool {
    public static final Supplier<Block> MAROON_TALL_STOOL = registerBlock("maroon_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> ROSE_TALL_STOOL = registerBlock("rose_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> CORAL_TALL_STOOL = registerBlock("coral_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> GINGER_TALL_STOOL = registerBlock("ginger_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> TAN_TALL_STOOL = registerBlock("tan_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> BEIGE_TALL_STOOL = registerBlock("beige_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> AMBER_TALL_STOOL = registerBlock("amber_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> OLIVE_TALL_STOOL = registerBlock("olive_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> FOREST_TALL_STOOL = registerBlock("forest_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> VERDANT_TALL_STOOL = registerBlock("verdant_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> TEAL_TALL_STOOL = registerBlock("teal_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> MINT_TALL_STOOL = registerBlock("mint_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> AQUA_TALL_STOOL = registerBlock("aqua_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> SLATE_TALL_STOOL = registerBlock("slate_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> NAVY_TALL_STOOL = registerBlock("navy_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> INDIGO_TALL_STOOL = registerBlock("indigo_tall_stool", () -> new TallStoolBlock(AFBlocks.Properties.weak_wood));

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> supplier = AFRegistry.registerBlock(name, block);
        AFRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Settings()), "tab");
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockHidden(String name, Supplier<T> block) {
        Supplier<T> supplier = AFRegistry.registerBlock(name, block);
        AFRegistry.registerItem(name, () -> new BlockItem(supplier.get(), new Item.Settings()), null);
        return supplier;
    }

    public static <T extends Block> Supplier<T> registerBlockOnly(String name, Supplier<T> block) {
        return AFRegistry.registerBlock(name, block);
    }

    public static void registerFlammables() {
        AFRegistry.setFlammable(MAROON_TALL_STOOL, 5, 20);
        AFRegistry.setFlammable(ROSE_TALL_STOOL, 5, 20);
    }

    public static void init() {}
}
