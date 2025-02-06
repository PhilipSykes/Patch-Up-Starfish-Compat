package com.ancient.patchup.datagen;

import com.ancient.patchup.block.heart_and_home.*;
import com.ancient.patchup.block.heart_and_home.Shingles;
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
        /* Paper Lantern */
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.MAROON_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.ROSE_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.CORAL_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.GINGER_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.TAN_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.BEIGE_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.AMBER_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.OLIVE_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.FOREST_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.VERDANT_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.TEAL_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.MINT_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.AQUA_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.SLATE_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.NAVY_PAPER_LANTERN);
        blockStateModelGenerator.registerSimpleCubeAll(Paper_Lantern.INDIGO_PAPER_LANTERN);

        BlockStateModelGenerator.BlockTexturePool MaroonShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.MAROON_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool RoseShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.ROSE_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool CoralShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.CORAL_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool GingerShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.GINGER_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool TanShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.TAN_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool BeigeShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.BEIGE_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool AmberShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.AMBER_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool OliveShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.OLIVE_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool ForestShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.FOREST_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool VerdantShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.VERDANT_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool TealShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.TEAL_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool MintShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.MINT_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool AquaShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.AQUA_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool SlateShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.SLATE_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool NavyShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.NAVY_SHINGLES);
        BlockStateModelGenerator.BlockTexturePool IndigoShinglesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Shingles.INDIGO_SHINGLES);

        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.MAROON_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.MAROON_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.ROSE_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.ROSE_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.CORAL_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.CORAL_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.GINGER_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.GINGER_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.TAN_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.TAN_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.BEIGE_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.BEIGE_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.AMBER_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.AMBER_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.OLIVE_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.OLIVE_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.FOREST_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.FOREST_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.VERDANT_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.VERDANT_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.TEAL_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.TEAL_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.MINT_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.MINT_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.AQUA_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.AQUA_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.SLATE_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.SLATE_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.NAVY_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.NAVY_STAINED_BARRED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(Stained_Barred_Glass.INDIGO_STAINED_BARRED_GLASS, Stained_Barred_Glass_Pane.INDIGO_STAINED_BARRED_GLASS_PANE);

        BlockStateModelGenerator.BlockTexturePool MaroonTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.MAROON_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool RoseTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.ROSE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool CoralTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.CORAL_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool GingerTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.GINGER_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool TanTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.TAN_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool BeigeTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.BEIGE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool AmberTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.AMBER_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool OliveTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.OLIVE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool ForestTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.FOREST_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool VerdantTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.VERDANT_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool TealTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.TEAL_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool MintTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.MINT_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool AquaTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.AQUA_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool SlateTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.SLATE_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool NavyTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.NAVY_TERRACOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool IndigoTerracottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Terracotta_Bricks.INDIGO_TERRACOTTA_BRICKS);

        BlockStateModelGenerator.BlockTexturePool MaroonTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.MAROON_TILES);
        BlockStateModelGenerator.BlockTexturePool RoseTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.ROSE_TILES);
        BlockStateModelGenerator.BlockTexturePool CoralTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.CORAL_TILES);
        BlockStateModelGenerator.BlockTexturePool GingerTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.GINGER_TILES);
        BlockStateModelGenerator.BlockTexturePool TanTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.TAN_TILES);
        BlockStateModelGenerator.BlockTexturePool BeigeTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.BEIGE_TILES);
        BlockStateModelGenerator.BlockTexturePool AmberTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.AMBER_TILES);
        BlockStateModelGenerator.BlockTexturePool OliveTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.OLIVE_TILES);
        BlockStateModelGenerator.BlockTexturePool ForestTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.FOREST_TILES);
        BlockStateModelGenerator.BlockTexturePool VerdantTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.VERDANT_TILES);
        BlockStateModelGenerator.BlockTexturePool TealTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.TEAL_TILES);
        BlockStateModelGenerator.BlockTexturePool MintTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.MINT_TILES);
        BlockStateModelGenerator.BlockTexturePool AquaTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.AQUA_TILES);
        BlockStateModelGenerator.BlockTexturePool SlateTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.SLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool NavyTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.NAVY_TILES);
        BlockStateModelGenerator.BlockTexturePool IndigoTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Tiles.INDIGO_TILES);

        MaroonShinglesPool.stairs(Shingles.MAROON_SHINGLE_STAIRS);
        MaroonShinglesPool.slab(Shingles.MAROON_SHINGLE_SLAB);

        MaroonTerracottaBricksPool.stairs(Terracotta_Bricks.MAROON_TERRACOTTA_BRICK_STAIRS);
        MaroonTerracottaBricksPool.slab(Terracotta_Bricks.MAROON_TERRACOTTA_BRICK_SLAB);

        MaroonTilesPool.slab(Tiles.MAROON_TILE_SLAB);

        RoseShinglesPool.stairs(Shingles.ROSE_SHINGLE_STAIRS);
        RoseShinglesPool.slab(Shingles.ROSE_SHINGLE_SLAB);

        RoseTerracottaBricksPool.stairs(Terracotta_Bricks.ROSE_TERRACOTTA_BRICK_STAIRS);
        RoseTerracottaBricksPool.slab(Terracotta_Bricks.ROSE_TERRACOTTA_BRICK_SLAB);

        RoseTilesPool.slab(Tiles.ROSE_TILE_SLAB);

        CoralShinglesPool.stairs(Shingles.CORAL_SHINGLE_STAIRS);
        CoralShinglesPool.slab(Shingles.CORAL_SHINGLE_SLAB);

        CoralTerracottaBricksPool.stairs(Terracotta_Bricks.CORAL_TERRACOTTA_BRICK_STAIRS);
        CoralTerracottaBricksPool.slab(Terracotta_Bricks.CORAL_TERRACOTTA_BRICK_SLAB);

        CoralTilesPool.slab(Tiles.CORAL_TILE_SLAB);

        GingerShinglesPool.stairs(Shingles.GINGER_SHINGLE_STAIRS);
        GingerShinglesPool.slab(Shingles.GINGER_SHINGLE_SLAB);

        GingerTerracottaBricksPool.stairs(Terracotta_Bricks.GINGER_TERRACOTTA_BRICK_STAIRS);
        GingerTerracottaBricksPool.slab(Terracotta_Bricks.GINGER_TERRACOTTA_BRICK_SLAB);

        GingerTilesPool.slab(Tiles.GINGER_TILE_SLAB);

        TanShinglesPool.stairs(Shingles.TAN_SHINGLE_STAIRS);
        TanShinglesPool.slab(Shingles.TAN_SHINGLE_SLAB);

        TanTerracottaBricksPool.stairs(Terracotta_Bricks.TAN_TERRACOTTA_BRICK_STAIRS);
        TanTerracottaBricksPool.slab(Terracotta_Bricks.TAN_TERRACOTTA_BRICK_SLAB);

        TanTilesPool.slab(Tiles.TAN_TILE_SLAB);

        BeigeShinglesPool.stairs(Shingles.BEIGE_SHINGLE_STAIRS);
        BeigeShinglesPool.slab(Shingles.BEIGE_SHINGLE_SLAB);

        BeigeTerracottaBricksPool.stairs(Terracotta_Bricks.BEIGE_TERRACOTTA_BRICK_STAIRS);
        BeigeTerracottaBricksPool.slab(Terracotta_Bricks.BEIGE_TERRACOTTA_BRICK_SLAB);

        BeigeTilesPool.slab(Tiles.BEIGE_TILE_SLAB);

        AmberShinglesPool.stairs(Shingles.AMBER_SHINGLE_STAIRS);
        AmberShinglesPool.slab(Shingles.AMBER_SHINGLE_SLAB);

        AmberTerracottaBricksPool.stairs(Terracotta_Bricks.AMBER_TERRACOTTA_BRICK_STAIRS);
        AmberTerracottaBricksPool.slab(Terracotta_Bricks.AMBER_TERRACOTTA_BRICK_SLAB);

        AmberTilesPool.slab(Tiles.AMBER_TILE_SLAB);

        OliveShinglesPool.stairs(Shingles.OLIVE_SHINGLE_STAIRS);
        OliveShinglesPool.slab(Shingles.OLIVE_SHINGLE_SLAB);

        OliveTerracottaBricksPool.stairs(Terracotta_Bricks.OLIVE_TERRACOTTA_BRICK_STAIRS);
        OliveTerracottaBricksPool.slab(Terracotta_Bricks.OLIVE_TERRACOTTA_BRICK_SLAB);

        OliveTilesPool.slab(Tiles.OLIVE_TILE_SLAB);

        ForestShinglesPool.stairs(Shingles.FOREST_SHINGLE_STAIRS);
        ForestShinglesPool.slab(Shingles.FOREST_SHINGLE_SLAB);

        ForestTerracottaBricksPool.stairs(Terracotta_Bricks.FOREST_TERRACOTTA_BRICK_STAIRS);
        ForestTerracottaBricksPool.slab(Terracotta_Bricks.FOREST_TERRACOTTA_BRICK_SLAB);

        ForestTilesPool.slab(Tiles.FOREST_TILE_SLAB);

        VerdantShinglesPool.stairs(Shingles.VERDANT_SHINGLE_STAIRS);
        VerdantShinglesPool.slab(Shingles.VERDANT_SHINGLE_SLAB);

        VerdantTerracottaBricksPool.stairs(Terracotta_Bricks.VERDANT_TERRACOTTA_BRICK_STAIRS);
        VerdantTerracottaBricksPool.slab(Terracotta_Bricks.VERDANT_TERRACOTTA_BRICK_SLAB);

        VerdantTilesPool.slab(Tiles.VERDANT_TILE_SLAB);

        TealShinglesPool.stairs(Shingles.TEAL_SHINGLE_STAIRS);
        TealShinglesPool.slab(Shingles.TEAL_SHINGLE_SLAB);

        TealTerracottaBricksPool.stairs(Terracotta_Bricks.TEAL_TERRACOTTA_BRICK_STAIRS);
        TealTerracottaBricksPool.slab(Terracotta_Bricks.TEAL_TERRACOTTA_BRICK_SLAB);

        TealTilesPool.slab(Tiles.TEAL_TILE_SLAB);

        MintShinglesPool.stairs(Shingles.MINT_SHINGLE_STAIRS);
        MintShinglesPool.slab(Shingles.MINT_SHINGLE_SLAB);

        MintTerracottaBricksPool.stairs(Terracotta_Bricks.MINT_TERRACOTTA_BRICK_STAIRS);
        MintTerracottaBricksPool.slab(Terracotta_Bricks.MINT_TERRACOTTA_BRICK_SLAB);

        MintTilesPool.slab(Tiles.MINT_TILE_SLAB);

        AquaShinglesPool.stairs(Shingles.AQUA_SHINGLE_STAIRS);
        AquaShinglesPool.slab(Shingles.AQUA_SHINGLE_SLAB);

        AquaTerracottaBricksPool.stairs(Terracotta_Bricks.AQUA_TERRACOTTA_BRICK_STAIRS);
        AquaTerracottaBricksPool.slab(Terracotta_Bricks.AQUA_TERRACOTTA_BRICK_SLAB);

        AquaTilesPool.slab(Tiles.AQUA_TILE_SLAB);

        SlateShinglesPool.stairs(Shingles.SLATE_SHINGLE_STAIRS);
        SlateShinglesPool.slab(Shingles.SLATE_SHINGLE_SLAB);

        SlateTerracottaBricksPool.stairs(Terracotta_Bricks.SLATE_TERRACOTTA_BRICK_STAIRS);
        SlateTerracottaBricksPool.slab(Terracotta_Bricks.SLATE_TERRACOTTA_BRICK_SLAB);

        SlateTilesPool.slab(Tiles.SLATE_TILE_SLAB);

        NavyShinglesPool.stairs(Shingles.NAVY_SHINGLE_STAIRS);
        NavyShinglesPool.slab(Shingles.NAVY_SHINGLE_SLAB);

        NavyTerracottaBricksPool.stairs(Terracotta_Bricks.NAVY_TERRACOTTA_BRICK_STAIRS);
        NavyTerracottaBricksPool.slab(Terracotta_Bricks.NAVY_TERRACOTTA_BRICK_SLAB);

        NavyTilesPool.slab(Tiles.NAVY_TILE_SLAB);

        IndigoShinglesPool.stairs(Shingles.INDIGO_SHINGLE_STAIRS);
        IndigoShinglesPool.slab(Shingles.INDIGO_SHINGLE_SLAB);

        IndigoTerracottaBricksPool.stairs(Terracotta_Bricks.INDIGO_TERRACOTTA_BRICK_STAIRS);
        IndigoTerracottaBricksPool.slab(Terracotta_Bricks.INDIGO_TERRACOTTA_BRICK_SLAB);

        IndigoTilesPool.slab(Tiles.INDIGO_TILE_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
