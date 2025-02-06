package com.ancient.patchup.datagen;

import com.ancient.patchup.block.another_furniture.*;
import com.ninni.dye_depot.registry.DDItems;
import com.starfish_studios.another_furniture.registry.AFItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        /* Built */
        /* Another Furniture */
        /* Stool */
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.MAROON_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.MAROON_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_WOOL), RecipeProvider.conditionsFromItem(DDItems.MAROON_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.MAROON_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.MAROON_STOOL.get(), 1)
                .input(DDItems.MAROON_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_DYE), RecipeProvider.conditionsFromItem(DDItems.MAROON_DYE))
               .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.MAROON_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.ROSE_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.ROSE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_WOOL), RecipeProvider.conditionsFromItem(DDItems.ROSE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.ROSE_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.ROSE_STOOL.get(), 1)
                .input(DDItems.ROSE_WOOL)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_DYE), RecipeProvider.conditionsFromItem(DDItems.ROSE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.ROSE_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.CORAL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.CORAL_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.CORAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.CORAL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.CORAL_STOOL.get(), 1)
                .input(DDItems.CORAL_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_DYE), RecipeProvider.conditionsFromItem(DDItems.CORAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.CORAL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.GINGER_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.GINGER_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_WOOL), RecipeProvider.conditionsFromItem(DDItems.GINGER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.GINGER_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.GINGER_STOOL.get(), 1)
                .input(DDItems.GINGER_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_DYE), RecipeProvider.conditionsFromItem(DDItems.GINGER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.GINGER_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.TAN_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.TAN_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_WOOL), RecipeProvider.conditionsFromItem(DDItems.TAN_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.TAN_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.TAN_STOOL.get(), 1)
                .input(DDItems.TAN_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_DYE), RecipeProvider.conditionsFromItem(DDItems.TAN_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.TAN_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.BEIGE_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.BEIGE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_WOOL), RecipeProvider.conditionsFromItem(DDItems.BEIGE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.BEIGE_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.BEIGE_STOOL.get(), 1)
                .input(DDItems.BEIGE_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_DYE), RecipeProvider.conditionsFromItem(DDItems.BEIGE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.BEIGE_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.AMBER_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.AMBER_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_WOOL), RecipeProvider.conditionsFromItem(DDItems.AMBER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.AMBER_STOOL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.OLIVE_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.OLIVE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_WOOL), RecipeProvider.conditionsFromItem(DDItems.OLIVE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.OLIVE_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.OLIVE_STOOL.get(), 1)
                .input(DDItems.OLIVE_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_DYE), RecipeProvider.conditionsFromItem(DDItems.OLIVE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.OLIVE_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.FOREST_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.FOREST_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_WOOL), RecipeProvider.conditionsFromItem(DDItems.FOREST_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.FOREST_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.FOREST_STOOL.get(), 1)
                .input(DDItems.FOREST_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_DYE), RecipeProvider.conditionsFromItem(DDItems.FOREST_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.FOREST_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.VERDANT_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.VERDANT_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_WOOL), RecipeProvider.conditionsFromItem(DDItems.VERDANT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.VERDANT_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.VERDANT_STOOL.get(), 1)
                .input(DDItems.VERDANT_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_DYE), RecipeProvider.conditionsFromItem(DDItems.VERDANT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.VERDANT_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.TEAL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.TEAL_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.TEAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.TEAL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.TEAL_STOOL.get(), 1)
                .input(DDItems.TEAL_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_DYE), RecipeProvider.conditionsFromItem(DDItems.TEAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.TEAL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.MINT_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.MINT_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_WOOL), RecipeProvider.conditionsFromItem(DDItems.MINT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.MINT_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.MINT_STOOL.get(), 1)
                .input(DDItems.MINT_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_DYE), RecipeProvider.conditionsFromItem(DDItems.MINT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.MINT_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.AQUA_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.AQUA_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_WOOL), RecipeProvider.conditionsFromItem(DDItems.AQUA_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.AQUA_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.AQUA_STOOL.get(), 1)
                .input(DDItems.AQUA_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_DYE), RecipeProvider.conditionsFromItem(DDItems.AQUA_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.AQUA_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.SLATE_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.SLATE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_WOOL), RecipeProvider.conditionsFromItem(DDItems.SLATE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.SLATE_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.SLATE_STOOL.get(), 1)
                .input(DDItems.SLATE_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_DYE), RecipeProvider.conditionsFromItem(DDItems.SLATE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.SLATE_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.NAVY_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.NAVY_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_WOOL), RecipeProvider.conditionsFromItem(DDItems.NAVY_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.NAVY_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.NAVY_STOOL.get(), 1)
                .input(DDItems.NAVY_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_DYE), RecipeProvider.conditionsFromItem(DDItems.NAVY_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.NAVY_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.INDIGO_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.INDIGO_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_WOOL), RecipeProvider.conditionsFromItem(DDItems.INDIGO_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.INDIGO_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Stool.INDIGO_STOOL.get(), 1)
                .input(DDItems.INDIGO_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_DYE), RecipeProvider.conditionsFromItem(DDItems.INDIGO_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.INDIGO_STOOL.get()) + "dye"));

        /* Tall Stool */
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.MAROON_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.MAROON_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_WOOL), RecipeProvider.conditionsFromItem(DDItems.MAROON_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.MAROON_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.MAROON_TALL_STOOL.get(), 1)
                .input(DDItems.MAROON_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_DYE), RecipeProvider.conditionsFromItem(DDItems.MAROON_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.MAROON_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.ROSE_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.ROSE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_WOOL), RecipeProvider.conditionsFromItem(DDItems.ROSE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.ROSE_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.ROSE_TALL_STOOL.get(), 1)
                .input(DDItems.ROSE_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_DYE), RecipeProvider.conditionsFromItem(DDItems.ROSE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.ROSE_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.CORAL_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.CORAL_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.CORAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.CORAL_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.CORAL_TALL_STOOL.get(), 1)
                .input(DDItems.CORAL_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_DYE), RecipeProvider.conditionsFromItem(DDItems.CORAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.CORAL_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.GINGER_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.GINGER_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_WOOL), RecipeProvider.conditionsFromItem(DDItems.GINGER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.GINGER_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.GINGER_TALL_STOOL.get(), 1)
                .input(DDItems.GINGER_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_DYE), RecipeProvider.conditionsFromItem(DDItems.GINGER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.GINGER_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.TAN_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.TAN_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_WOOL), RecipeProvider.conditionsFromItem(DDItems.TAN_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.TAN_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.TAN_TALL_STOOL.get(), 1)
                .input(DDItems.TAN_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_DYE), RecipeProvider.conditionsFromItem(DDItems.TAN_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.TAN_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.BEIGE_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.BEIGE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_WOOL), RecipeProvider.conditionsFromItem(DDItems.BEIGE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.BEIGE_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.BEIGE_TALL_STOOL.get(), 1)
                .input(DDItems.BEIGE_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_DYE), RecipeProvider.conditionsFromItem(DDItems.BEIGE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.BEIGE_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.AMBER_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.AMBER_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_WOOL), RecipeProvider.conditionsFromItem(DDItems.AMBER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.AMBER_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.AMBER_TALL_STOOL.get(), 1)
                .input(DDItems.AMBER_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_DYE), RecipeProvider.conditionsFromItem(DDItems.AMBER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.AMBER_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.OLIVE_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.OLIVE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_WOOL), RecipeProvider.conditionsFromItem(DDItems.OLIVE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.OLIVE_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.OLIVE_TALL_STOOL.get(), 1)
                .input(DDItems.OLIVE_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_DYE), RecipeProvider.conditionsFromItem(DDItems.OLIVE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.OLIVE_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.FOREST_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.FOREST_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_WOOL), RecipeProvider.conditionsFromItem(DDItems.FOREST_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.FOREST_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.FOREST_TALL_STOOL.get(), 1)
                .input(DDItems.FOREST_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_DYE), RecipeProvider.conditionsFromItem(DDItems.FOREST_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.FOREST_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.VERDANT_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.VERDANT_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_WOOL), RecipeProvider.conditionsFromItem(DDItems.VERDANT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.VERDANT_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.VERDANT_TALL_STOOL.get(), 1)
                .input(DDItems.VERDANT_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_DYE), RecipeProvider.conditionsFromItem(DDItems.VERDANT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.VERDANT_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.TEAL_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.TEAL_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.TEAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.TEAL_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.TEAL_TALL_STOOL.get(), 1)
                .input(DDItems.TEAL_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_DYE), RecipeProvider.conditionsFromItem(DDItems.TEAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.TEAL_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.MINT_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.MINT_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_WOOL), RecipeProvider.conditionsFromItem(DDItems.MINT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.MINT_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.MINT_TALL_STOOL.get(), 1)
                .input(DDItems.MINT_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_DYE), RecipeProvider.conditionsFromItem(DDItems.MINT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.MINT_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.AQUA_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.AQUA_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_WOOL), RecipeProvider.conditionsFromItem(DDItems.AQUA_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.AQUA_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.AQUA_TALL_STOOL.get(), 1)
                .input(DDItems.AQUA_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_DYE), RecipeProvider.conditionsFromItem(DDItems.AQUA_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.AQUA_TALL_STOOL.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.SLATE_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.SLATE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_WOOL), RecipeProvider.conditionsFromItem(DDItems.SLATE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.SLATE_TALL_STOOL.get())));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.NAVY_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.NAVY_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_WOOL), RecipeProvider.conditionsFromItem(DDItems.NAVY_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.NAVY_TALL_STOOL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.INDIGO_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.INDIGO_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_WOOL), RecipeProvider.conditionsFromItem(DDItems.INDIGO_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.INDIGO_TALL_STOOL.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, TallStool.INDIGO_TALL_STOOL.get(), 1)
                .input(DDItems.INDIGO_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_DYE), RecipeProvider.conditionsFromItem(DDItems.INDIGO_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.INDIGO_TALL_STOOL.get()) + "dye"));

        /* Sofa */
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.MAROON_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.MAROON_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_WOOL), RecipeProvider.conditionsFromItem(DDItems.MAROON_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.MAROON_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.MAROON_SOFA.get(), 1)
                .input(DDItems.MAROON_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_DYE), RecipeProvider.conditionsFromItem(DDItems.MAROON_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.MAROON_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.ROSE_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.ROSE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_WOOL), RecipeProvider.conditionsFromItem(DDItems.ROSE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.ROSE_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.ROSE_SOFA.get(), 1)
                .input(DDItems.ROSE_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_DYE), RecipeProvider.conditionsFromItem(DDItems.ROSE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.ROSE_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.CORAL_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.CORAL_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.CORAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.CORAL_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.CORAL_SOFA.get(), 1)
                .input(DDItems.CORAL_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_DYE), RecipeProvider.conditionsFromItem(DDItems.CORAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.CORAL_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.GINGER_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.GINGER_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_WOOL), RecipeProvider.conditionsFromItem(DDItems.GINGER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.GINGER_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.GINGER_SOFA.get(), 1)
                .input(DDItems.GINGER_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_DYE), RecipeProvider.conditionsFromItem(DDItems.GINGER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.GINGER_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.TAN_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.TAN_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_WOOL), RecipeProvider.conditionsFromItem(DDItems.TAN_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.TAN_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.TAN_SOFA.get(), 1)
                .input(DDItems.TAN_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_DYE), RecipeProvider.conditionsFromItem(DDItems.TAN_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.TAN_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.BEIGE_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.BEIGE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_WOOL), RecipeProvider.conditionsFromItem(DDItems.BEIGE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.BEIGE_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.BEIGE_SOFA.get(), 1)
                .input(DDItems.BEIGE_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_DYE), RecipeProvider.conditionsFromItem(DDItems.BEIGE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.BEIGE_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.AMBER_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.AMBER_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_WOOL), RecipeProvider.conditionsFromItem(DDItems.AMBER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.AMBER_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.AMBER_SOFA.get(), 1)
                .input(DDItems.AMBER_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_DYE), RecipeProvider.conditionsFromItem(DDItems.AMBER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.AMBER_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.OLIVE_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.OLIVE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_WOOL), RecipeProvider.conditionsFromItem(DDItems.OLIVE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.OLIVE_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.OLIVE_SOFA.get(), 1)
                .input(DDItems.OLIVE_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_DYE), RecipeProvider.conditionsFromItem(DDItems.OLIVE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.OLIVE_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.FOREST_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.FOREST_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_WOOL), RecipeProvider.conditionsFromItem(DDItems.FOREST_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.FOREST_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.FOREST_SOFA.get(), 1)
                .input(DDItems.FOREST_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_DYE), RecipeProvider.conditionsFromItem(DDItems.FOREST_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.FOREST_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.VERDANT_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.VERDANT_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_WOOL), RecipeProvider.conditionsFromItem(DDItems.VERDANT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.VERDANT_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.VERDANT_SOFA.get(), 1)
                .input(DDItems.VERDANT_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_DYE), RecipeProvider.conditionsFromItem(DDItems.VERDANT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.VERDANT_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.TEAL_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.TEAL_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.TEAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.TEAL_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.TEAL_SOFA.get(), 1)
                .input(DDItems.TEAL_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_DYE), RecipeProvider.conditionsFromItem(DDItems.TEAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.TEAL_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.MINT_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.MINT_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_WOOL), RecipeProvider.conditionsFromItem(DDItems.MINT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.MINT_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.MINT_SOFA.get(), 1)
                .input(DDItems.MINT_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_DYE), RecipeProvider.conditionsFromItem(DDItems.MINT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.MINT_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.AQUA_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.AQUA_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_WOOL), RecipeProvider.conditionsFromItem(DDItems.AQUA_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.AQUA_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.AQUA_SOFA.get(), 1)
                .input(DDItems.AQUA_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_DYE), RecipeProvider.conditionsFromItem(DDItems.AQUA_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.AQUA_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.SLATE_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.SLATE_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_WOOL), RecipeProvider.conditionsFromItem(DDItems.SLATE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.SLATE_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.SLATE_SOFA.get(), 1)
                .input(DDItems.SLATE_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_DYE), RecipeProvider.conditionsFromItem(DDItems.SLATE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.SLATE_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.NAVY_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.NAVY_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_WOOL), RecipeProvider.conditionsFromItem(DDItems.NAVY_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.NAVY_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.NAVY_SOFA.get(), 1)
                .input(DDItems.NAVY_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_DYE), RecipeProvider.conditionsFromItem(DDItems.NAVY_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.NAVY_SOFA.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.INDIGO_SOFA.get(), 3)
                .pattern("#W ")
                .pattern("#WW")
                .pattern("/ /")
                .input('W', DDItems.INDIGO_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_WOOL), RecipeProvider.conditionsFromItem(DDItems.INDIGO_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.INDIGO_SOFA.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Sofa.INDIGO_SOFA.get(), 1)
                .input(DDItems.INDIGO_DYE)
                .input(AFItemTags.SOFAS)
                .group("sofas")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_DYE), RecipeProvider.conditionsFromItem(DDItems.INDIGO_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Sofa.INDIGO_SOFA.get()) + "dye"));


        /* Lamp */
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.MAROON_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.MAROON_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_WOOL), RecipeProvider.conditionsFromItem(DDItems.MAROON_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.MAROON_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.MAROON_LAMP.get(), 1)
                .input(DDItems.MAROON_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_DYE), RecipeProvider.conditionsFromItem(DDItems.MAROON_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.MAROON_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.ROSE_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.ROSE_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_WOOL), RecipeProvider.conditionsFromItem(DDItems.ROSE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.ROSE_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.ROSE_LAMP.get(), 1)
                .input(DDItems.ROSE_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_DYE), RecipeProvider.conditionsFromItem(DDItems.ROSE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.ROSE_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.CORAL_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.CORAL_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.CORAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.CORAL_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.CORAL_LAMP.get(), 1)
                .input(DDItems.CORAL_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_DYE), RecipeProvider.conditionsFromItem(DDItems.CORAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.CORAL_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.GINGER_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.GINGER_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_WOOL), RecipeProvider.conditionsFromItem(DDItems.GINGER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.GINGER_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.GINGER_LAMP.get(), 1)
                .input(DDItems.GINGER_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_DYE), RecipeProvider.conditionsFromItem(DDItems.GINGER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.GINGER_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.TAN_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.TAN_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_WOOL), RecipeProvider.conditionsFromItem(DDItems.TAN_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.TAN_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.TAN_LAMP.get(), 1)
                .input(DDItems.TAN_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_DYE), RecipeProvider.conditionsFromItem(DDItems.TAN_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.TAN_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.BEIGE_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.BEIGE_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_WOOL), RecipeProvider.conditionsFromItem(DDItems.BEIGE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.BEIGE_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.BEIGE_LAMP.get(), 1)
                .input(DDItems.BEIGE_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_DYE), RecipeProvider.conditionsFromItem(DDItems.BEIGE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.BEIGE_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.AMBER_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.AMBER_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_WOOL), RecipeProvider.conditionsFromItem(DDItems.AMBER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.AMBER_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.AMBER_LAMP.get(), 1)
                .input(DDItems.AMBER_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_DYE), RecipeProvider.conditionsFromItem(DDItems.AMBER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.AMBER_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.OLIVE_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.OLIVE_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_WOOL), RecipeProvider.conditionsFromItem(DDItems.OLIVE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.OLIVE_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.OLIVE_LAMP.get(), 1)
                .input(DDItems.OLIVE_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_DYE), RecipeProvider.conditionsFromItem(DDItems.OLIVE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.OLIVE_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.FOREST_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.FOREST_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_WOOL), RecipeProvider.conditionsFromItem(DDItems.FOREST_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.FOREST_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.FOREST_LAMP.get(), 1)
                .input(DDItems.FOREST_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_DYE), RecipeProvider.conditionsFromItem(DDItems.FOREST_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.FOREST_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.VERDANT_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.VERDANT_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_WOOL), RecipeProvider.conditionsFromItem(DDItems.VERDANT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.VERDANT_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.VERDANT_LAMP.get(), 1)
                .input(DDItems.VERDANT_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_DYE), RecipeProvider.conditionsFromItem(DDItems.VERDANT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.VERDANT_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.TEAL_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.TEAL_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.TEAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.TEAL_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.TEAL_LAMP.get(), 1)
                .input(DDItems.TEAL_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_DYE), RecipeProvider.conditionsFromItem(DDItems.TEAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.TEAL_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.MINT_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.MINT_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_WOOL), RecipeProvider.conditionsFromItem(DDItems.MINT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.MINT_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.MINT_LAMP.get(), 1)
                .input(DDItems.MINT_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_DYE), RecipeProvider.conditionsFromItem(DDItems.MINT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.MINT_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.AQUA_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.AQUA_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_WOOL), RecipeProvider.conditionsFromItem(DDItems.AQUA_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.AQUA_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.AQUA_LAMP.get(), 1)
                .input(DDItems.AQUA_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_DYE), RecipeProvider.conditionsFromItem(DDItems.AQUA_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.AQUA_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.SLATE_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.SLATE_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_WOOL), RecipeProvider.conditionsFromItem(DDItems.SLATE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.SLATE_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.SLATE_LAMP.get(), 1)
                .input(DDItems.SLATE_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_DYE), RecipeProvider.conditionsFromItem(DDItems.SLATE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.SLATE_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.NAVY_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.NAVY_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_WOOL), RecipeProvider.conditionsFromItem(DDItems.NAVY_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.NAVY_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.NAVY_LAMP.get(), 1)
                .input(DDItems.NAVY_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_DYE), RecipeProvider.conditionsFromItem(DDItems.NAVY_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.NAVY_LAMP.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.INDIGO_LAMP.get(), 3)
                .pattern(" W ")
                .pattern("WTW")
                .pattern(" / ")
                .input('W', DDItems.INDIGO_WOOL)
                .input('T', Items.TORCH)
                .input('/', Items.STICK)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_WOOL), RecipeProvider.conditionsFromItem(DDItems.INDIGO_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.INDIGO_LAMP.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Lamp.INDIGO_LAMP.get(), 1)
                .input(DDItems.INDIGO_DYE)
                .input(AFItemTags.LAMPS)
                .group("lamps")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_DYE), RecipeProvider.conditionsFromItem(DDItems.INDIGO_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Lamp.INDIGO_LAMP.get()) + "dye"));

        /* Curtains */
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.MAROON_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.MAROON_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_WOOL), RecipeProvider.conditionsFromItem(DDItems.MAROON_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.MAROON_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.MAROON_CURTAIN.get(), 1)
                .input(DDItems.MAROON_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_DYE), RecipeProvider.conditionsFromItem(DDItems.MAROON_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.MAROON_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.ROSE_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.ROSE_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_WOOL), RecipeProvider.conditionsFromItem(DDItems.ROSE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.ROSE_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.ROSE_CURTAIN.get(), 1)
                .input(DDItems.ROSE_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_DYE), RecipeProvider.conditionsFromItem(DDItems.ROSE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.ROSE_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.CORAL_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.CORAL_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.CORAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.CORAL_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.CORAL_CURTAIN.get(), 1)
                .input(DDItems.CORAL_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_DYE), RecipeProvider.conditionsFromItem(DDItems.CORAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.CORAL_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.GINGER_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.GINGER_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_WOOL), RecipeProvider.conditionsFromItem(DDItems.GINGER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.GINGER_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.GINGER_CURTAIN.get(), 1)
                .input(DDItems.GINGER_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_DYE), RecipeProvider.conditionsFromItem(DDItems.GINGER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.GINGER_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.TAN_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.TAN_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_WOOL), RecipeProvider.conditionsFromItem(DDItems.TAN_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.TAN_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.TAN_CURTAIN.get(), 1)
                .input(DDItems.TAN_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_DYE), RecipeProvider.conditionsFromItem(DDItems.TAN_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.TAN_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.BEIGE_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.BEIGE_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_WOOL), RecipeProvider.conditionsFromItem(DDItems.BEIGE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.BEIGE_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.BEIGE_CURTAIN.get(), 1)
                .input(DDItems.BEIGE_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_DYE), RecipeProvider.conditionsFromItem(DDItems.BEIGE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.BEIGE_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.AMBER_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.AMBER_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_WOOL), RecipeProvider.conditionsFromItem(DDItems.AMBER_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.AMBER_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.AMBER_CURTAIN.get(), 1)
                .input(DDItems.AMBER_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_DYE), RecipeProvider.conditionsFromItem(DDItems.AMBER_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.AMBER_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.OLIVE_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.OLIVE_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_WOOL), RecipeProvider.conditionsFromItem(DDItems.OLIVE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.OLIVE_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.OLIVE_CURTAIN.get(), 1)
                .input(DDItems.OLIVE_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_DYE), RecipeProvider.conditionsFromItem(DDItems.OLIVE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.OLIVE_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.FOREST_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.FOREST_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_WOOL), RecipeProvider.conditionsFromItem(DDItems.FOREST_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.FOREST_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.FOREST_CURTAIN.get(), 1)
                .input(DDItems.FOREST_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_DYE), RecipeProvider.conditionsFromItem(DDItems.FOREST_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.FOREST_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.VERDANT_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.VERDANT_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_WOOL), RecipeProvider.conditionsFromItem(DDItems.VERDANT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.VERDANT_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.VERDANT_CURTAIN.get(), 1)
                .input(DDItems.VERDANT_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_DYE), RecipeProvider.conditionsFromItem(DDItems.VERDANT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.VERDANT_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.TEAL_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.TEAL_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_WOOL), RecipeProvider.conditionsFromItem(DDItems.TEAL_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.TEAL_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.TEAL_CURTAIN.get(), 1)
                .input(DDItems.TEAL_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_DYE), RecipeProvider.conditionsFromItem(DDItems.TEAL_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.TEAL_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.MINT_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.MINT_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_WOOL), RecipeProvider.conditionsFromItem(DDItems.MINT_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.MINT_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.MINT_CURTAIN.get(), 1)
                .input(DDItems.MINT_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_DYE), RecipeProvider.conditionsFromItem(DDItems.MINT_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.MINT_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.AQUA_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.AQUA_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_WOOL), RecipeProvider.conditionsFromItem(DDItems.AQUA_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.AQUA_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.AQUA_CURTAIN.get(), 1)
                .input(DDItems.AQUA_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_DYE), RecipeProvider.conditionsFromItem(DDItems.AQUA_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.AQUA_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.SLATE_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.SLATE_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_WOOL), RecipeProvider.conditionsFromItem(DDItems.SLATE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.SLATE_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.SLATE_CURTAIN.get(), 1)
                .input(DDItems.SLATE_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_DYE), RecipeProvider.conditionsFromItem(DDItems.SLATE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.SLATE_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.NAVY_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.NAVY_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_WOOL), RecipeProvider.conditionsFromItem(DDItems.NAVY_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.NAVY_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.NAVY_CURTAIN.get(), 1)
                .input(DDItems.NAVY_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_DYE), RecipeProvider.conditionsFromItem(DDItems.NAVY_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.NAVY_CURTAIN.get()) + "dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.INDIGO_CURTAIN.get(), 3)
                .pattern("//")
                .pattern("WW")
                .pattern("WW")
                .input('W', DDItems.INDIGO_WOOL)
                .input('/', Items.STICK)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_WOOL), RecipeProvider.conditionsFromItem(DDItems.INDIGO_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.INDIGO_CURTAIN.get())));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Curtain.INDIGO_CURTAIN.get(), 1)
                .input(DDItems.INDIGO_DYE)
                .input(AFItemTags.CURTAINS)
                .group("curtains")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_DYE), RecipeProvider.conditionsFromItem(DDItems.INDIGO_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Curtain.INDIGO_CURTAIN.get()) + "dye"));
    }
}