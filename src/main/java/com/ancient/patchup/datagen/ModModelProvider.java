package com.ancient.patchup.datagen;

import com.ancient.patchup.block.Trims;
import com.ancient.patchup.block.heart_and_home.Shingles;
import com.ancient.patchup.block.heart_and_home.Terracota_Bricks;
import com.ancient.patchup.block.heart_and_home.Tiles;
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

        BlockStateModelGenerator.BlockTexturePool MaroonShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.MAROON_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool RoseShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.ROSE_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool CoralShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.CORAL_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool GingerShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.GINGER_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool TanShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.TAN_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool BeigeShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.BEIGE_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool AmberShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.AMBER_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool OliveShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.OLIVE_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool ForestShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.FOREST_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool VerdantShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.VERDANT_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool TealShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.TEAL_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool MintShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.MINT_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool AquaShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.AQUA_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool SlateShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.SLATE_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool NavyShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.NAVY_SHINGLES.get());
        BlockStateModelGenerator.BlockTexturePool IndigoShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.INDIGO_SHINGLES.get());

        BlockStateModelGenerator.BlockTexturePool MaroonTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.MAROON_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool RoseTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.ROSE_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool CoralTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.CORAL_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool GingerTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.GINGER_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool TanTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.TAN_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool BeigeTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.BEIGE_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool AmberTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.AMBER_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool OliveTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.OLIVE_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool ForestTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.FOREST_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool VerdantTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.VERDANT_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool TealTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.TEAL_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool MintTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.MINT_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool AquaTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.AQUA_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool SlateTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.SLATE_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool NavyTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.NAVY_TERRACOTTA_BRICKS.get());
        BlockStateModelGenerator.BlockTexturePool IndigoTerracotaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracota_Bricks.INDIGO_TERRACOTTA_BRICKS.get());

        BlockStateModelGenerator.BlockTexturePool MaroonTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.MAROON_TILES.get());
        BlockStateModelGenerator.BlockTexturePool RoseTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.ROSE_TILES.get());
        BlockStateModelGenerator.BlockTexturePool CoralTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.CORAL_TILES.get());
        BlockStateModelGenerator.BlockTexturePool GingerTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.GINGER_TILES.get());
        BlockStateModelGenerator.BlockTexturePool TanTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.TAN_TILES.get());
        BlockStateModelGenerator.BlockTexturePool BeigeTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.BEIGE_TILES.get());
        BlockStateModelGenerator.BlockTexturePool AmberTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.AMBER_TILES.get());
        BlockStateModelGenerator.BlockTexturePool OliveTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.OLIVE_TILES.get());
        BlockStateModelGenerator.BlockTexturePool ForestTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.FOREST_TILES.get());
        BlockStateModelGenerator.BlockTexturePool VerdantTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.VERDANT_TILES.get());
        BlockStateModelGenerator.BlockTexturePool TealTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.TEAL_TILES.get());
        BlockStateModelGenerator.BlockTexturePool MintTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.MINT_TILES.get());
        BlockStateModelGenerator.BlockTexturePool AquaTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.AQUA_TILES.get());
        BlockStateModelGenerator.BlockTexturePool SlateTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.SLATE_TILES.get());
        BlockStateModelGenerator.BlockTexturePool NavyTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.NAVY_TILES.get());
        BlockStateModelGenerator.BlockTexturePool IndigoTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.INDIGO_TILES.get());

        MaroonShinglesPool.stairs(Shingles.MAROON_SHINGLE_STAIRS.get());
        MaroonShinglesPool.slab(Shingles.MAROON_SHINGLE_SLAB.get());

        MaroonTerracotaBricksPool.stairs(Terracota_Bricks.MAROON_TERRACOTTA_BRICK_STAIRS.get());
        MaroonTerracotaBricksPool.slab(Terracota_Bricks.MAROON_TERRACOTTA_BRICK_SLAB.get());

        MaroonTilesPool.slab(Tiles.MAROON_TILE_SLAB.get());

        RoseShinglesPool.stairs(Shingles.ROSE_SHINGLE_STAIRS.get());
        RoseShinglesPool.slab(Shingles.ROSE_SHINGLE_SLAB.get());

        RoseTerracotaBricksPool.stairs(Terracota_Bricks.ROSE_TERRACOTTA_BRICK_STAIRS.get());
        RoseTerracotaBricksPool.slab(Terracota_Bricks.ROSE_TERRACOTTA_BRICK_SLAB.get());

        RoseTilesPool.slab(Tiles.ROSE_TILE_SLAB.get());

        CoralShinglesPool.stairs(Shingles.CORAL_SHINGLE_STAIRS.get());
        CoralShinglesPool.slab(Shingles.CORAL_SHINGLE_SLAB.get());

        CoralTerracotaBricksPool.stairs(Terracota_Bricks.CORAL_TERRACOTTA_BRICK_STAIRS.get());
        CoralTerracotaBricksPool.slab(Terracota_Bricks.CORAL_TERRACOTTA_BRICK_SLAB.get());

        CoralTilesPool.slab(Tiles.CORAL_TILE_SLAB.get());

        GingerShinglesPool.stairs(Shingles.GINGER_SHINGLE_STAIRS.get());
        GingerShinglesPool.slab(Shingles.GINGER_SHINGLE_SLAB.get());

        GingerTerracotaBricksPool.stairs(Terracota_Bricks.GINGER_TERRACOTTA_BRICK_STAIRS.get());
        GingerTerracotaBricksPool.slab(Terracota_Bricks.GINGER_TERRACOTTA_BRICK_SLAB.get());

        GingerTilesPool.slab(Tiles.GINGER_TILE_SLAB.get());

        TanShinglesPool.stairs(Shingles.TAN_SHINGLE_STAIRS.get());
        TanShinglesPool.slab(Shingles.TAN_SHINGLE_SLAB.get());

        TanTerracotaBricksPool.stairs(Terracota_Bricks.TAN_TERRACOTTA_BRICK_STAIRS.get());
        TanTerracotaBricksPool.slab(Terracota_Bricks.TAN_TERRACOTTA_BRICK_SLAB.get());

        TanTilesPool.slab(Tiles.TAN_TILE_SLAB.get());

        BeigeShinglesPool.stairs(Shingles.BEIGE_SHINGLE_STAIRS.get());
        BeigeShinglesPool.slab(Shingles.BEIGE_SHINGLE_SLAB.get());

        BeigeTerracotaBricksPool.stairs(Terracota_Bricks.BEIGE_TERRACOTTA_BRICK_STAIRS.get());
        BeigeTerracotaBricksPool.slab(Terracota_Bricks.BEIGE_TERRACOTTA_BRICK_SLAB.get());

        BeigeTilesPool.slab(Tiles.BEIGE_TILE_SLAB.get());

        AmberShinglesPool.stairs(Shingles.AMBER_SHINGLE_STAIRS.get());
        AmberShinglesPool.slab(Shingles.AMBER_SHINGLE_SLAB.get());

        AmberTerracotaBricksPool.stairs(Terracota_Bricks.AMBER_TERRACOTTA_BRICK_STAIRS.get());
        AmberTerracotaBricksPool.slab(Terracota_Bricks.AMBER_TERRACOTTA_BRICK_SLAB.get());

        AmberTilesPool.slab(Tiles.AMBER_TILE_SLAB.get());

        OliveShinglesPool.stairs(Shingles.OLIVE_SHINGLE_STAIRS.get());
        OliveShinglesPool.slab(Shingles.OLIVE_SHINGLE_SLAB.get());

        OliveTerracotaBricksPool.stairs(Terracota_Bricks.OLIVE_TERRACOTTA_BRICK_STAIRS.get());
        OliveTerracotaBricksPool.slab(Terracota_Bricks.OLIVE_TERRACOTTA_BRICK_SLAB.get());

        OliveTilesPool.slab(Tiles.OLIVE_TILE_SLAB.get());

        ForestShinglesPool.stairs(Shingles.FOREST_SHINGLE_STAIRS.get());
        ForestShinglesPool.slab(Shingles.FOREST_SHINGLE_SLAB.get());

        ForestTerracotaBricksPool.stairs(Terracota_Bricks.FOREST_TERRACOTTA_BRICK_STAIRS.get());
        ForestTerracotaBricksPool.slab(Terracota_Bricks.FOREST_TERRACOTTA_BRICK_SLAB.get());

        ForestTilesPool.slab(Tiles.FOREST_TILE_SLAB.get());

        VerdantShinglesPool.stairs(Shingles.VERDANT_SHINGLE_STAIRS.get());
        VerdantShinglesPool.slab(Shingles.VERDANT_SHINGLE_SLAB.get());

        VerdantTerracotaBricksPool.stairs(Terracota_Bricks.VERDANT_TERRACOTTA_BRICK_STAIRS.get());
        VerdantTerracotaBricksPool.slab(Terracota_Bricks.VERDANT_TERRACOTTA_BRICK_SLAB.get());

        VerdantTilesPool.slab(Tiles.VERDANT_TILE_SLAB.get());

        TealShinglesPool.stairs(Shingles.TEAL_SHINGLE_STAIRS.get());
        TealShinglesPool.slab(Shingles.TEAL_SHINGLE_SLAB.get());

        TealTerracotaBricksPool.stairs(Terracota_Bricks.TEAL_TERRACOTTA_BRICK_STAIRS.get());
        TealTerracotaBricksPool.slab(Terracota_Bricks.TEAL_TERRACOTTA_BRICK_SLAB.get());

        TealTilesPool.slab(Tiles.TEAL_TILE_SLAB.get());

        MintShinglesPool.stairs(Shingles.MINT_SHINGLE_STAIRS.get());
        MintShinglesPool.slab(Shingles.MINT_SHINGLE_SLAB.get());

        MintTerracotaBricksPool.stairs(Terracota_Bricks.MINT_TERRACOTTA_BRICK_STAIRS.get());
        MintTerracotaBricksPool.slab(Terracota_Bricks.MINT_TERRACOTTA_BRICK_SLAB.get());

        MintTilesPool.slab(Tiles.MINT_TILE_SLAB.get());

        AquaShinglesPool.stairs(Shingles.AQUA_SHINGLE_STAIRS.get());
        AquaShinglesPool.slab(Shingles.AQUA_SHINGLE_SLAB.get());

        AquaTerracotaBricksPool.stairs(Terracota_Bricks.AQUA_TERRACOTTA_BRICK_STAIRS.get());
        AquaTerracotaBricksPool.slab(Terracota_Bricks.AQUA_TERRACOTTA_BRICK_SLAB.get());

        AquaTilesPool.slab(Tiles.AQUA_TILE_SLAB.get());

        SlateShinglesPool.stairs(Shingles.SLATE_SHINGLE_STAIRS.get());
        SlateShinglesPool.slab(Shingles.SLATE_SHINGLE_SLAB.get());

        SlateTerracotaBricksPool.stairs(Terracota_Bricks.SLATE_TERRACOTTA_BRICK_STAIRS.get());
        SlateTerracotaBricksPool.slab(Terracota_Bricks.SLATE_TERRACOTTA_BRICK_SLAB.get());

        SlateTilesPool.slab(Tiles.SLATE_TILE_SLAB.get());

        NavyShinglesPool.stairs(Shingles.NAVY_SHINGLE_STAIRS.get());
        NavyShinglesPool.slab(Shingles.NAVY_SHINGLE_SLAB.get());

        NavyTerracotaBricksPool.stairs(Terracota_Bricks.NAVY_TERRACOTTA_BRICK_STAIRS.get());
        NavyTerracotaBricksPool.slab(Terracota_Bricks.NAVY_TERRACOTTA_BRICK_SLAB.get());

        NavyTilesPool.slab(Tiles.NAVY_TILE_SLAB.get());

        IndigoShinglesPool.stairs(Shingles.INDIGO_SHINGLE_STAIRS.get());
        IndigoShinglesPool.slab(Shingles.INDIGO_SHINGLE_SLAB.get());

        IndigoTerracotaBricksPool.stairs(Terracota_Bricks.INDIGO_TERRACOTTA_BRICK_STAIRS.get());
        IndigoTerracotaBricksPool.slab(Terracota_Bricks.INDIGO_TERRACOTTA_BRICK_SLAB.get());

        IndigoTilesPool.slab(Tiles.INDIGO_TILE_SLAB.get());

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
