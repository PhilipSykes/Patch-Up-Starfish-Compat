package com.ancient.patchup.block;


import com.starfish_studios.another_furniture.block.StoolBlock;
import com.starfish_studios.another_furniture.registry.AFBlocks;
import com.starfish_studios.another_furniture.registry.AFRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class Stool {
    public static final Supplier<Block> MAROON_STOOL = registerBlock("maroon_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> ROSE_STOOL = registerBlock("rose_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> CORAL_STOOL = registerBlock("coral_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> GINGER_STOOL = registerBlock("ginger_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> TAN_STOOL = registerBlock("tan_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> BEIGE_STOOL = registerBlock("beige_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> AMBER_STOOL = registerBlock("amber_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> OLIVE_STOOL = registerBlock("olive_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> FOREST_STOOL = registerBlock("forest_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> VERDANT_STOOL = registerBlock("verdant_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> TEAL_STOOL = registerBlock("teal_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> MINT_STOOL = registerBlock("mint_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> AQUA_STOOL = registerBlock("aqua_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> SLATE_STOOL = registerBlock("slate_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> NAVY_STOOL = registerBlock("navy_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> INDIGO_STOOL = registerBlock("indigo_stool", () -> new StoolBlock(AFBlocks.Properties.weak_wood));

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

    public static void registerFlammable() {
        AFRegistry.setFlammable(MAROON_STOOL, 5, 20);
        AFRegistry.setFlammable(ROSE_STOOL, 5, 20);
        //AFRegistry.setFlammable(CORAL_STOOL, 5, 20);
        //AFRegistry.setFlammable(GINGER_STOOL, 5, 20);
        //AFRegistry.setFlammable(TAN_STOOL, 5, 20);
        //AFRegistry.setFlammable(BEIGE_STOOL, 5, 20);
        //AFRegistry.setFlammable(AMBER_STOOL, 5, 20);
        //AFRegistry.setFlammable(OLIVE_STOOL, 5, 20);
        //AFRegistry.setFlammable(FOREST_STOOL, 5, 20);
        //AFRegistry.setFlammable(VERDANT_STOOL, 5, 20);
        //AFRegistry.setFlammable(TEAL_STOOL, 5, 20);
        //AFRegistry.setFlammable(MINT_STOOL, 5, 20);
        //AFRegistry.setFlammable(AQUA_STOOL, 5, 20);
        //AFRegistry.setFlammable(SLATE_STOOL, 5, 20);
        //AFRegistry.setFlammable(NAVY_STOOL, 5, 20);
        //AFRegistry.setFlammable(INDIGO_STOOL, 5, 20);

    }

    public static void init() {}
}
