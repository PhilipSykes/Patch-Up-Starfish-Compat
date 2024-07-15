package com.ancient.patchup.block.heart_and_home;

import com.starfish_studios.hearth_and_home.registry.HNHRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class Stained_Barren_Glass {

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
