package ancient.patchup.datagen;

import ancient.patchup.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAROON_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORAL_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GINGER_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TAN_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEIGE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMBER_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OLIVE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FOREST_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERDANT_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEAL_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MINT_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUA_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLATE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NAVY_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INDIGO_TERRACOTTA_TRIM);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
