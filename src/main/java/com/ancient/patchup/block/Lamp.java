package com.ancient.patchup.block;


import com.ancient.patchup.block.custom.LampBlock;
import com.ancient.patchup.block.custom.LampConnectorBlock;
import com.ninni.dye_depot.registry.DDDyes;
import com.starfish_studios.another_furniture.registry.AFBlocks;
import com.starfish_studios.another_furniture.registry.AFRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;


public class Lamp {

    public static final Supplier<Block> MAROON_LAMP = registerBlock("maroon_lamp", () -> new LampBlock(DDDyes.MAROON, AFBlocks.Properties.lamp));
    public static final Supplier<Block> ROSE_LAMP = registerBlock("rose_lamp", () -> new LampBlock(DDDyes.ROSE, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> CORAL_LAMP = registerBlock("coral_lamp", () -> new LampBlock(DDDyes.CORAL, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> GINGER_LAMP = registerBlock("ginger_lamp", () -> new LampBlock(DDDyes.GINGER, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> TAN_LAMP = registerBlock("tan_lamp", () -> new LampBlock(DDDyes.TAN, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> BEIGE_LAMP = registerBlock("beige_lamp", () -> new LampBlock(DDDyes.BEIGE, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> AMBER_LAMP = registerBlock("amber_lamp", () -> new LampBlock(DDDyes.AMBER, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> OLIVE_LAMP = registerBlock("olive_lamp", () -> new LampBlock(DDDyes.OLIVE, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> FOREST_LAMP = registerBlock("forest_lamp", () -> new LampBlock(DDDyes.FOREST, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> VERDANT_LAMP = registerBlock("verdant_lamp", () -> new LampBlock(DDDyes.VERDANT, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> TEAL_LAMP = registerBlock("teal_lamp", () -> new LampBlock(DDDyes.TEAL, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> MINT_LAMP = registerBlock("mint_lamp", () -> new LampBlock(DDDyes.MINT, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> AQUA_LAMP = registerBlock("aqua_lamp", () -> new LampBlock(DDDyes.AQUA, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> SLATE_LAMP = registerBlock("slate_lamp", () -> new LampBlock(DDDyes.SLATE, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> NAVY_LAMP = registerBlock("navy_lamp", () -> new LampBlock(DDDyes.NAVY, AFBlocks.Properties.lamp));
    //public static final Supplier<Block> INDIGO_LAMP = registerBlock("indigo_lamp", () -> new LampBlock(DDDyes.INDIGO, AFBlocks.Properties.lamp));

    public static final Supplier<Block> MAROON_LAMP_CONNECTOR = registerBlockOnly("maroon_lamp_connector",
            () -> new LampConnectorBlock(DDDyes.MAROON, AFBlocks.Properties.wood));
    public static final Supplier<Block> ROSE_LAMP_CONNECTOR = registerBlockOnly("rose_lamp_connector",
            () -> new LampConnectorBlock(DDDyes.ROSE, AFBlocks.Properties.wood));
    //public static final Supplier<Block> CORAL_LAMP_CONNECTOR = registerBlockOnly("coral_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.CORAL, AFBlocks.Properties.wood));
    //public static final Supplier<Block> GINGER_LAMP_CONNECTOR = registerBlockOnly("ginger_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.GINGER, AFBlocks.Properties.wood));
    //public static final Supplier<Block> TAN_LAMP_CONNECTOR = registerBlockOnly("tan_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.TAN, AFBlocks.Properties.wood));
    //public static final Supplier<Block> BEIGE_LAMP_CONNECTOR = registerBlockOnly("beige_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.BEIGE, AFBlocks.Properties.wood));
    //public static final Supplier<Block> AMBER_LAMP_CONNECTOR = registerBlockOnly("amber_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.AMBER, AFBlocks.Properties.wood));
    //public static final Supplier<Block> OLIVE_LAMP_CONNECTOR = registerBlockOnly("olive_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.OLIVE, AFBlocks.Properties.wood));
    //public static final Supplier<Block> FOREST_LAMP_CONNECTOR = registerBlockOnly("forest_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.FOREST, AFBlocks.Properties.wood));
    //public static final Supplier<Block> VERDANT_LAMP_CONNECTOR = registerBlockOnly("verdant_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.VERDANT, AFBlocks.Properties.wood));
    //public static final Supplier<Block> TEAL_LAMP_CONNECTOR = registerBlockOnly("teal_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.TEAL, AFBlocks.Properties.wood));
    //public static final Supplier<Block> MINT_LAMP_CONNECTOR = registerBlockOnly("mint_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.MINT, AFBlocks.Properties.wood));
    //public static final Supplier<Block> AQUA_LAMP_CONNECTOR = registerBlockOnly("aqua_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.AQUA, AFBlocks.Properties.wood));
    //public static final Supplier<Block> SLATE_LAMP_CONNECTOR = registerBlockOnly("slate_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.SLATE, AFBlocks.Properties.wood));
    //public static final Supplier<Block> NAVY_LAMP_CONNECTOR = registerBlockOnly("navy_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.NAVY, AFBlocks.Properties.wood));
    //public static final Supplier<Block> INDIGO_LAMP_CONNECTOR = registerBlockOnly("indigo_lamp_connector",
            //() -> new LampConnectorBlock(DDDyes.INDIGO, AFBlocks.Properties.wood));

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
