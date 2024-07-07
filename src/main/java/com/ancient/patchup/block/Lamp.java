package com.ancient.patchup.block;

import com.ninni.dye_depot.registry.DDDyes;
import com.starfish_studios.another_furniture.block.LampBlock;
import com.starfish_studios.another_furniture.block.LampConnectorBlock;
import com.starfish_studios.another_furniture.registry.AFBlocks;
import com.starfish_studios.another_furniture.registry.AFRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;

import java.util.function.Supplier;


public class Lamp {

    public static final Supplier<Block> MAROON_LAMP = registerBlock("maroon_lamp", () -> new LampBlock(DyeColor.RED, AFBlocks.Properties.lamp));
    public static final Supplier<Block> ROSE_LAMP = registerBlock("rose_lamp", () -> new LampBlock(DyeColor.PINK, AFBlocks.Properties.lamp));

    public static final Supplier<Block> MAROON_LAMP_CONNECTOR = registerBlockOnly("maroon_lamp_connector",
            () -> new LampConnectorBlock(DyeColor.RED, AFBlocks.Properties.wood));
    public static final Supplier<Block> ROSE_LAMP_CONNECTOR = registerBlockOnly("rose_lamp_connector",
            () -> new LampConnectorBlock(DyeColor.PINK, AFBlocks.Properties.wood));

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
        AFRegistry.setFlammable(MAROON_LAMP, 5, 20);
        AFRegistry.setFlammable(ROSE_LAMP, 5, 20);

        AFRegistry.setFlammable(MAROON_LAMP_CONNECTOR, 5, 20);
        AFRegistry.setFlammable(ROSE_LAMP_CONNECTOR, 5, 20);
    }
    public static void init() {}
}