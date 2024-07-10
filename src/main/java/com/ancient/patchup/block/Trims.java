package com.ancient.patchup.block;

import com.ancient.patchup.PatchUp;
import com.ninni.dye_depot.registry.DDBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Trims {
    /* Built */
    public static final Block MAROON_TERRACOTTA_TRIM = registerBlock("maroon_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.MAROON_TERRACOTTA)));
    public static final Block ROSE_TERRACOTTA_TRIM = registerBlock("rose_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.ROSE_TERRACOTTA)));
    public static final Block CORAL_TERRACOTTA_TRIM = registerBlock("coral_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.CORAL_TERRACOTTA)));
    public static final Block GINGER_TERRACOTTA_TRIM = registerBlock("ginger_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.GINGER_TERRACOTTA)));
    public static final Block TAN_TERRACOTTA_TRIM = registerBlock("tan_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.TAN_TERRACOTTA)));
    public static final Block BEIGE_TERRACOTTA_TRIM = registerBlock("beige_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.BEIGE_TERRACOTTA)));
    public static final Block AMBER_TERRACOTTA_TRIM = registerBlock("amber_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.AMBER_TERRACOTTA)));
    public static final Block OLIVE_TERRACOTTA_TRIM = registerBlock("olive_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.OLIVE_TERRACOTTA)));
    public static final Block FOREST_TERRACOTTA_TRIM = registerBlock("forest_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.FOREST_TERRACOTTA)));
    public static final Block VERDANT_TERRACOTTA_TRIM = registerBlock("verdant_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.VERDANT_TERRACOTTA)));
    public static final Block TEAL_TERRACOTTA_TRIM = registerBlock("teal_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.TEAL_TERRACOTTA)));
    public static final Block MINT_TERRACOTTA_TRIM = registerBlock("mint_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.MINT_TERRACOTTA)));
    public static final Block AQUA_TERRACOTTA_TRIM = registerBlock("aqua_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.AQUA_TERRACOTTA)));
    public static final Block SLATE_TERRACOTTA_TRIM = registerBlock("slate_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.SLATE_TERRACOTTA)));
    public static final Block NAVY_TERRACOTTA_TRIM = registerBlock("navy_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.NAVY_TERRACOTTA)));
    public static final Block INDIGO_TERRACOTTA_TRIM = registerBlock("indigo_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(DDBlocks.INDIGO_TERRACOTTA)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PatchUp.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PatchUp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBLocks() {
        PatchUp.LOGGER.info("Registering Slate for " + PatchUp.MOD_ID);
    }
}
