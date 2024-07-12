package com.ancient.patchup.block;

import com.starfish_studios.another_furniture.block.CurtainBlock;
import com.starfish_studios.another_furniture.registry.AFBlocks;
import com.starfish_studios.another_furniture.registry.AFRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;


import java.util.function.Supplier;

public class Curtain {

    public static final Supplier<Block> MAROON_CURTAIN = registerBlock("maroon_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> ROSE_CURTAIN = registerBlock("rose_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> CORAL_CURTAIN = registerBlock("coral_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> GINGER_CURTAIN = registerBlock("ginger_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> TAN_CURTAIN = registerBlock("tan_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> BEIGE_CURTAIN = registerBlock("beige_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> AMBER_CURTAIN = registerBlock("amber_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> OLIVE_CURTAIN = registerBlock("olive_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> FOREST_CURTAIN = registerBlock("forest_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> VERDANT_CURTAIN = registerBlock("verdant_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> TEAL_CURTAIN = registerBlock("teal_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> MINT_CURTAIN = registerBlock("mint_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> AQUA_CURTAIN = registerBlock("aqua_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> SLATE_CURTAIN = registerBlock("slate_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> NAVY_CURTAIN = registerBlock("navy_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));
    public static final Supplier<Block> INDIGO_CURTAIN = registerBlock("indigo_curtain", () -> new CurtainBlock(AFBlocks.Properties.curtain));

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
    AFRegistry.setFlammable(MAROON_CURTAIN, 5, 20);
    AFRegistry.setFlammable(ROSE_CURTAIN, 5, 20);

}
    public static void init() {}
}