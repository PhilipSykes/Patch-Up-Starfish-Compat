package com.ancient.patchup.block.heart_and_home;

import com.starfish_studios.hearth_and_home.registry.HNHRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

import java.util.function.Supplier;

public class Paper_Lantern {

    public static final Supplier<Block> MAROON_PAPER_LANTERN = registerBlock("maroon_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.RED_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> ROSE_PAPER_LANTERN = registerBlock("rose_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.RED_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> CORAL_PAPER_LANTERN = registerBlock("coral_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> GINGER_PAPER_LANTERN = registerBlock("ginger_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> TAN_PAPER_LANTERN = registerBlock("tan_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> BEIGE_PAPER_LANTERN = registerBlock("beige_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> AMBER_PAPER_LANTERN = registerBlock("amber_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.LIME_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> OLIVE_PAPER_LANTERN = registerBlock("olive_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.LIME_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> FOREST_PAPER_LANTERN = registerBlock("forest_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> VERDANT_PAPER_LANTERN = registerBlock("verdant_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> TEAL_PAPER_LANTERN = registerBlock("teal_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> MINT_PAPER_LANTERN = registerBlock("mint_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> AQUA_PAPER_LANTERN = registerBlock("aqua_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> SLATE_PAPER_LANTERN = registerBlock("slate_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> NAVY_PAPER_LANTERN = registerBlock("navy_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));
    public static final Supplier<Block> INDIGO_PAPER_LANTERN = registerBlock("indigo_paper_lantern", () -> new Block
            (AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).strength(0.3F).luminance((state) -> 15).sounds(BlockSoundGroup.WOOL)));

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
