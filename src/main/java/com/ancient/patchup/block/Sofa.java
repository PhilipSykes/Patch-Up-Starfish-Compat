package com.ancient.patchup.block;

import com.starfish_studios.another_furniture.block.SofaBlock;
import com.starfish_studios.another_furniture.registry.AFBlocks;
import com.starfish_studios.another_furniture.registry.AFRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class Sofa {
    public static final Supplier<Block> MAROON_SOFA = registerBlock("maroon_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> ROSE_SOFA = registerBlock("rose_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> CORAL_SOFA = registerBlock("coral_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> GINGER_SOFA = registerBlock("ginger_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> TAN_SOFA = registerBlock("tan_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> BEIGE_SOFA = registerBlock("beige_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> AMBER_SOFA = registerBlock("amber_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> OLIVE_SOFA = registerBlock("olive_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> FOREST_SOFA = registerBlock("forest_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> VERDANT_SOFA = registerBlock("verdant_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> TEAL_SOFA = registerBlock("teal_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> MINT_SOFA = registerBlock("mint_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> AQUA_SOFA = registerBlock("aqua_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> SLATE_SOFA = registerBlock("slate_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> NAVY_SOFA = registerBlock("navy_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));
    public static final Supplier<Block> INDIGO_SOFA = registerBlock("indigo_sofa", () -> new SofaBlock(AFBlocks.Properties.weak_wood));

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

        AFRegistry.setFlammable(MAROON_SOFA, 5, 20);
        AFRegistry.setFlammable(ROSE_SOFA, 5, 20);
    }

    public static void init() {}
}
