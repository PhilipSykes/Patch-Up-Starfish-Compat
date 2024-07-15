package com.ancient.patchup.block.heart_and_home.custom;

import com.ninni.dye_depot.registry.DDDyes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;

public class StainedGlassPaneBlock extends PaneBlock implements Stainable {
    private final DDDyes color;

    public StainedGlassPaneBlock(DDDyes color, AbstractBlock.Settings settings) {
        super(settings);
        this.color = color;
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(NORTH, false)).with(EAST, false)).with(SOUTH, false)).with(WEST, false)).with(WATERLOGGED, false));
    }

    public DDDyes getDye() {
        return this.color;
    }
}

