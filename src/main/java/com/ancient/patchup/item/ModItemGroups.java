package com.ancient.patchup.item;

import com.ancient.patchup.Compats;
import com.ancient.patchup.PatchUp;
import com.ancient.patchup.block.*;
import com.ancient.patchup.block.another_furniture.*;
import com.ancient.patchup.block.heart_and_home.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PATCH_UP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PatchUp.MOD_ID, "patchup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.patchup_group"))
                    .icon(() -> new ItemStack(
                            Compats.BUILT.isLoaded() ? Trims.NAVY_TERRACOTTA_TRIM :
                            Compats.ANOTHER_FURNITURE.isLoaded() ? Sofa.FOREST_SOFA.get() :
                            Compats.HEARTH_AND_HOME.isLoaded() ? Terracotta_Bricks.MINT_TERRACOTTA_BRICKS :
                            Items.STICK)).entries((displayContext, entries) -> {

                        if (Compats.BUILT.isLoaded()) {

                            /* Trims */
                            entries.add(Trims.MAROON_TERRACOTTA_TRIM);
                            entries.add(Trims.ROSE_TERRACOTTA_TRIM);
                            entries.add(Trims.CORAL_TERRACOTTA_TRIM);
                            entries.add(Trims.GINGER_TERRACOTTA_TRIM);
                            entries.add(Trims.TAN_TERRACOTTA_TRIM);
                            entries.add(Trims.BEIGE_TERRACOTTA_TRIM);
                            entries.add(Trims.AMBER_TERRACOTTA_TRIM);
                            entries.add(Trims.OLIVE_TERRACOTTA_TRIM);
                            entries.add(Trims.FOREST_TERRACOTTA_TRIM);
                            entries.add(Trims.VERDANT_TERRACOTTA_TRIM);
                            entries.add(Trims.TEAL_TERRACOTTA_TRIM);
                            entries.add(Trims.MINT_TERRACOTTA_TRIM);
                            entries.add(Trims.AQUA_TERRACOTTA_TRIM);
                            entries.add(Trims.SLATE_TERRACOTTA_TRIM);
                            entries.add(Trims.NAVY_TERRACOTTA_TRIM);
                            entries.add(Trims.INDIGO_TERRACOTTA_TRIM);

                        }
                        if (Compats.ANOTHER_FURNITURE.isLoaded()) {
                            /* Stools */
                            entries.add(Stool.MAROON_STOOL.get());
                            entries.add(Stool.ROSE_STOOL.get());
                            entries.add(Stool.CORAL_STOOL.get());
                            entries.add(Stool.GINGER_STOOL.get());
                            entries.add(Stool.TAN_STOOL.get());
                            entries.add(Stool.BEIGE_STOOL.get());
                            entries.add(Stool.AMBER_STOOL.get());
                            entries.add(Stool.OLIVE_STOOL.get());
                            entries.add(Stool.FOREST_STOOL.get());
                            entries.add(Stool.VERDANT_STOOL.get());
                            entries.add(Stool.TEAL_STOOL.get());
                            entries.add(Stool.MINT_STOOL.get());
                            entries.add(Stool.AQUA_STOOL.get());
                            entries.add(Stool.SLATE_STOOL.get());
                            entries.add(Stool.NAVY_STOOL.get());
                            entries.add(Stool.INDIGO_STOOL.get());
                            /* Tall Stools */
                            entries.add(TallStool.MAROON_TALL_STOOL.get());
                            entries.add(TallStool.ROSE_TALL_STOOL.get());
                            entries.add(TallStool.CORAL_TALL_STOOL.get());
                            entries.add(TallStool.GINGER_TALL_STOOL.get());
                            entries.add(TallStool.TAN_TALL_STOOL.get());
                            entries.add(TallStool.BEIGE_TALL_STOOL.get());
                            entries.add(TallStool.AMBER_TALL_STOOL.get());
                            entries.add(TallStool.OLIVE_TALL_STOOL.get());
                            entries.add(TallStool.FOREST_TALL_STOOL.get());
                            entries.add(TallStool.VERDANT_TALL_STOOL.get());
                            entries.add(TallStool.TEAL_TALL_STOOL.get());
                            entries.add(TallStool.MINT_TALL_STOOL.get());
                            entries.add(TallStool.AQUA_TALL_STOOL.get());
                            entries.add(TallStool.SLATE_TALL_STOOL.get());
                            entries.add(TallStool.NAVY_TALL_STOOL.get());
                            entries.add(TallStool.INDIGO_TALL_STOOL.get());
                            /* Sofas */
                            entries.add(Sofa.MAROON_SOFA.get());
                            entries.add(Sofa.ROSE_SOFA.get());
                            entries.add(Sofa.CORAL_SOFA.get());
                            entries.add(Sofa.GINGER_SOFA.get());
                            entries.add(Sofa.TAN_SOFA.get());
                            entries.add(Sofa.BEIGE_SOFA.get());
                            entries.add(Sofa.AMBER_SOFA.get());
                            entries.add(Sofa.OLIVE_SOFA.get());
                            entries.add(Sofa.FOREST_SOFA.get());
                            entries.add(Sofa.VERDANT_SOFA.get());
                            entries.add(Sofa.TEAL_SOFA.get());
                            entries.add(Sofa.MINT_SOFA.get());
                            entries.add(Sofa.AQUA_SOFA.get());
                            entries.add(Sofa.SLATE_SOFA.get());
                            entries.add(Sofa.NAVY_SOFA.get());
                            entries.add(Sofa.INDIGO_SOFA.get());
                            /* Lamp */
                            entries.add(Lamp.MAROON_LAMP.get());
                            entries.add(Lamp.ROSE_LAMP.get());
                            entries.add(Lamp.CORAL_LAMP.get());
                            entries.add(Lamp.GINGER_LAMP.get());
                            entries.add(Lamp.TAN_LAMP.get());
                            entries.add(Lamp.BEIGE_LAMP.get());
                            entries.add(Lamp.AMBER_LAMP.get());
                            entries.add(Lamp.OLIVE_LAMP.get());
                            entries.add(Lamp.FOREST_LAMP.get());
                            entries.add(Lamp.VERDANT_LAMP.get());
                            entries.add(Lamp.TEAL_LAMP.get());
                            entries.add(Lamp.MINT_LAMP.get());
                            entries.add(Lamp.AQUA_LAMP.get());
                            entries.add(Lamp.SLATE_LAMP.get());
                            entries.add(Lamp.NAVY_LAMP.get());
                            entries.add(Lamp.INDIGO_LAMP.get());
                            /* Curtains */
                            entries.add(Curtain.MAROON_CURTAIN.get());
                            entries.add(Curtain.ROSE_CURTAIN.get());
                            entries.add(Curtain.CORAL_CURTAIN.get());
                            entries.add(Curtain.GINGER_CURTAIN.get());
                            entries.add(Curtain.TAN_CURTAIN.get());
                            entries.add(Curtain.BEIGE_CURTAIN.get());
                            entries.add(Curtain.AMBER_CURTAIN.get());
                            entries.add(Curtain.OLIVE_CURTAIN.get());
                            entries.add(Curtain.FOREST_CURTAIN.get());
                            entries.add(Curtain.VERDANT_CURTAIN.get());
                            entries.add(Curtain.TEAL_CURTAIN.get());
                            entries.add(Curtain.MINT_CURTAIN.get());
                            entries.add(Curtain.AQUA_CURTAIN.get());
                            entries.add(Curtain.SLATE_CURTAIN.get());
                            entries.add(Curtain.NAVY_CURTAIN.get());
                            entries.add(Curtain.INDIGO_CURTAIN.get());
                        }

                        if (Compats.HEARTH_AND_HOME.isLoaded()) {
                            /* Paper Lanterns */
                            entries.add(Paper_Lantern.MAROON_PAPER_LANTERN);
                            entries.add(Paper_Lantern.ROSE_PAPER_LANTERN);
                            entries.add(Paper_Lantern.CORAL_PAPER_LANTERN);
                            entries.add(Paper_Lantern.GINGER_PAPER_LANTERN);
                            entries.add(Paper_Lantern.TAN_PAPER_LANTERN);
                            entries.add(Paper_Lantern.BEIGE_PAPER_LANTERN);
                            entries.add(Paper_Lantern.AMBER_PAPER_LANTERN);
                            entries.add(Paper_Lantern.OLIVE_PAPER_LANTERN);
                            entries.add(Paper_Lantern.FOREST_PAPER_LANTERN);
                            entries.add(Paper_Lantern.VERDANT_PAPER_LANTERN);
                            entries.add(Paper_Lantern.TEAL_PAPER_LANTERN);
                            entries.add(Paper_Lantern.MINT_PAPER_LANTERN);
                            entries.add(Paper_Lantern.AQUA_PAPER_LANTERN);
                            entries.add(Paper_Lantern.SLATE_PAPER_LANTERN);
                            entries.add(Paper_Lantern.NAVY_PAPER_LANTERN);
                            entries.add(Paper_Lantern.INDIGO_PAPER_LANTERN);
                            /* Shingles */
                            entries.add(Shingles.MAROON_SHINGLES);
                            entries.add(Shingles.MAROON_SHINGLE_STAIRS);
                            entries.add(Shingles.MAROON_SHINGLE_SLAB);
                            entries.add(Shingles.ROSE_SHINGLES);
                            entries.add(Shingles.ROSE_SHINGLE_STAIRS);
                            entries.add(Shingles.ROSE_SHINGLE_SLAB);
                            entries.add(Shingles.CORAL_SHINGLES);
                            entries.add(Shingles.CORAL_SHINGLE_STAIRS);
                            entries.add(Shingles.CORAL_SHINGLE_SLAB);
                            entries.add(Shingles.GINGER_SHINGLES);
                            entries.add(Shingles.GINGER_SHINGLE_STAIRS);
                            entries.add(Shingles.GINGER_SHINGLE_SLAB);
                            entries.add(Shingles.TAN_SHINGLES);
                            entries.add(Shingles.TAN_SHINGLE_STAIRS);
                            entries.add(Shingles.TAN_SHINGLE_SLAB);
                            entries.add(Shingles.BEIGE_SHINGLES);
                            entries.add(Shingles.BEIGE_SHINGLE_STAIRS);
                            entries.add(Shingles.BEIGE_SHINGLE_SLAB);
                            entries.add(Shingles.AMBER_SHINGLES);
                            entries.add(Shingles.AMBER_SHINGLE_STAIRS);
                            entries.add(Shingles.AMBER_SHINGLE_SLAB);
                            entries.add(Shingles.OLIVE_SHINGLES);
                            entries.add(Shingles.OLIVE_SHINGLE_STAIRS);
                            entries.add(Shingles.OLIVE_SHINGLE_SLAB);
                            entries.add(Shingles.FOREST_SHINGLES);
                            entries.add(Shingles.FOREST_SHINGLE_STAIRS);
                            entries.add(Shingles.FOREST_SHINGLE_SLAB);
                            entries.add(Shingles.VERDANT_SHINGLES);
                            entries.add(Shingles.VERDANT_SHINGLE_STAIRS);
                            entries.add(Shingles.VERDANT_SHINGLE_SLAB);
                            entries.add(Shingles.TEAL_SHINGLES);
                            entries.add(Shingles.TEAL_SHINGLE_STAIRS);
                            entries.add(Shingles.TEAL_SHINGLE_SLAB);
                            entries.add(Shingles.MINT_SHINGLES);
                            entries.add(Shingles.MINT_SHINGLE_STAIRS);
                            entries.add(Shingles.MINT_SHINGLE_SLAB);
                            entries.add(Shingles.AQUA_SHINGLES);
                            entries.add(Shingles.AQUA_SHINGLE_STAIRS);
                            entries.add(Shingles.AQUA_SHINGLE_SLAB);
                            entries.add(Shingles.SLATE_SHINGLES);
                            entries.add(Shingles.SLATE_SHINGLE_STAIRS);
                            entries.add(Shingles.SLATE_SHINGLE_SLAB);
                            entries.add(Shingles.NAVY_SHINGLES);
                            entries.add(Shingles.NAVY_SHINGLE_STAIRS);
                            entries.add(Shingles.NAVY_SHINGLE_SLAB);
                            entries.add(Shingles.INDIGO_SHINGLES);
                            entries.add(Shingles.INDIGO_SHINGLE_STAIRS);
                            entries.add(Shingles.INDIGO_SHINGLE_SLAB);
                            /* Stained Barred Glass*/
                            entries.add(Stained_Barred_Glass.MAROON_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.ROSE_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.CORAL_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.GINGER_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.TAN_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.BEIGE_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.AMBER_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.OLIVE_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.FOREST_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.VERDANT_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.TEAL_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.MINT_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.AQUA_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.SLATE_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.NAVY_STAINED_BARRED_GLASS);
                            entries.add(Stained_Barred_Glass.INDIGO_STAINED_BARRED_GLASS);
                            /* Stained Barred Glass Pane */
                            entries.add(Stained_Barred_Glass_Pane.MAROON_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.ROSE_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.CORAL_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.GINGER_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.TAN_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.BEIGE_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.AMBER_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.OLIVE_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.FOREST_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.VERDANT_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.TEAL_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.MINT_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.AQUA_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.SLATE_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.NAVY_STAINED_BARRED_GLASS_PANE);
                            entries.add(Stained_Barred_Glass_Pane.INDIGO_STAINED_BARRED_GLASS_PANE);
                            /* Terracotta Bricks */
                            entries.add(Terracotta_Bricks.MAROON_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.MAROON_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.MAROON_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.ROSE_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.ROSE_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.ROSE_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.CORAL_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.CORAL_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.CORAL_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.GINGER_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.GINGER_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.GINGER_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.TAN_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.TAN_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.TAN_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.BEIGE_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.BEIGE_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.BEIGE_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.AMBER_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.AMBER_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.AMBER_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.OLIVE_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.OLIVE_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.OLIVE_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.FOREST_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.FOREST_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.FOREST_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.VERDANT_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.VERDANT_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.VERDANT_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.TEAL_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.TEAL_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.TEAL_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.MINT_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.MINT_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.MINT_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.AQUA_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.AQUA_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.AQUA_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.SLATE_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.SLATE_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.SLATE_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.NAVY_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.NAVY_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.NAVY_TERRACOTTA_BRICK_SLAB);
                            entries.add(Terracotta_Bricks.INDIGO_TERRACOTTA_BRICKS);
                            entries.add(Terracotta_Bricks.INDIGO_TERRACOTTA_BRICK_STAIRS);
                            entries.add(Terracotta_Bricks.INDIGO_TERRACOTTA_BRICK_SLAB);
                            /* Tiles */
                            entries.add(Tiles.MAROON_TILES);
                            entries.add(Tiles.MAROON_TILE_SLAB);
                            entries.add(Tiles.ROSE_TILES);
                            entries.add(Tiles.ROSE_TILE_SLAB);
                            entries.add(Tiles.CORAL_TILES);
                            entries.add(Tiles.CORAL_TILE_SLAB);
                            entries.add(Tiles.GINGER_TILES);
                            entries.add(Tiles.GINGER_TILE_SLAB);
                            entries.add(Tiles.TAN_TILES);
                            entries.add(Tiles.TAN_TILE_SLAB);
                            entries.add(Tiles.BEIGE_TILES);
                            entries.add(Tiles.BEIGE_TILE_SLAB);
                            entries.add(Tiles.AMBER_TILES);
                            entries.add(Tiles.AMBER_TILE_SLAB);
                            entries.add(Tiles.OLIVE_TILES);
                            entries.add(Tiles.OLIVE_TILE_SLAB);
                            entries.add(Tiles.FOREST_TILES);
                            entries.add(Tiles.FOREST_TILE_SLAB);
                            entries.add(Tiles.VERDANT_TILES);
                            entries.add(Tiles.VERDANT_TILE_SLAB);
                            entries.add(Tiles.TEAL_TILES);
                            entries.add(Tiles.TEAL_TILE_SLAB);
                            entries.add(Tiles.MINT_TILES);
                            entries.add(Tiles.MINT_TILE_SLAB);
                            entries.add(Tiles.AQUA_TILES);
                            entries.add(Tiles.AQUA_TILE_SLAB);
                            entries.add(Tiles.SLATE_TILES);
                            entries.add(Tiles.SLATE_TILE_SLAB);
                            entries.add(Tiles.NAVY_TILES);
                            entries.add(Tiles.NAVY_TILE_SLAB);
                            entries.add(Tiles.INDIGO_TILES);
                            entries.add(Tiles.INDIGO_TILE_SLAB);
                        }




                    }).build());


    public static void registerItemGroups() {
        PatchUp.LOGGER.info("Registering Item Groups for " + PatchUp.MOD_ID);
    }
}
