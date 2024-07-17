package com.ancient.patchup.block.heart_and_home;

import com.ancient.patchup.PatchUp;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Paper_Lantern {

    public static final Block MAROON_PAPER_LANTERN = registerBlock("maroon_paper_lantern", new Block
            (AbstractBlock.Settings.copy(Blocks.RED_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block ROSE_PAPER_LANTERN = registerBlock("rose_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.RED_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block CORAL_PAPER_LANTERN = registerBlock("coral_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block GINGER_PAPER_LANTERN = registerBlock("ginger_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block TAN_PAPER_LANTERN = registerBlock("tan_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block BEIGE_PAPER_LANTERN = registerBlock("beige_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block AMBER_PAPER_LANTERN = registerBlock("amber_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.LIME_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block OLIVE_PAPER_LANTERN = registerBlock("olive_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.LIME_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block FOREST_PAPER_LANTERN = registerBlock("forest_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block VERDANT_PAPER_LANTERN = registerBlock("verdant_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block TEAL_PAPER_LANTERN = registerBlock("teal_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block MINT_PAPER_LANTERN = registerBlock("mint_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block AQUA_PAPER_LANTERN = registerBlock("aqua_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block SLATE_PAPER_LANTERN = registerBlock("slate_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block NAVY_PAPER_LANTERN = registerBlock("navy_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Block INDIGO_PAPER_LANTERN = registerBlock("indigo_paper_lantern",  new Block
            (AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PatchUp.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PatchUp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void init() {
        PatchUp.LOGGER.info("Paper Lanters " + PatchUp.MOD_ID);
    }
}
