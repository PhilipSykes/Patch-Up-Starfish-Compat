package com.ancient.patchup.datagen;

import com.ancient.patchup.block.Trims;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /* Built */
        blockStateModelGenerator.registerSimpleCubeAll(Trims.MAROON_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.ROSE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.CORAL_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.GINGER_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.TAN_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.BEIGE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.AMBER_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.OLIVE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.FOREST_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.VERDANT_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.TEAL_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.MINT_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.AQUA_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.SLATE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.NAVY_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(Trims.INDIGO_TERRACOTTA_TRIM);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
