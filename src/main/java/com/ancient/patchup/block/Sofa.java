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
