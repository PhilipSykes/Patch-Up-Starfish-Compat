package ancient.patchup.datagen;

import ancient.patchup.block.ModBlocks;
import ancient.patchup.block.Stool;
import ancient.patchup.block.TallStool;
import com.ninni.dye_depot.registry.DDItems;
import com.starfish_studios.another_furniture.registry.AFBlockTags;
import com.starfish_studios.another_furniture.registry.AFItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
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
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAROON_TERRACOTTA_TRIM, DDItems.MAROON_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_TERRACOTTA_TRIM, DDItems.ROSE_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORAL_TERRACOTTA_TRIM, DDItems.CORAL_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GINGER_TERRACOTTA_TRIM, DDItems.GINGER_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TAN_TERRACOTTA_TRIM, DDItems.TAN_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEIGE_TERRACOTTA_TRIM, DDItems.BEIGE_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_TERRACOTTA_TRIM, DDItems.AMBER_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_TERRACOTTA_TRIM, DDItems.OLIVE_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOREST_TERRACOTTA_TRIM, DDItems.FOREST_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_TERRACOTTA_TRIM, DDItems.VERDANT_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAL_TERRACOTTA_TRIM, DDItems.TEAL_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MINT_TERRACOTTA_TRIM, DDItems.MINT_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUA_TERRACOTTA_TRIM, DDItems.AQUA_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SLATE_TERRACOTTA_TRIM, DDItems.SLATE_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NAVY_TERRACOTTA_TRIM, DDItems.NAVY_TERRACOTTA);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INDIGO_TERRACOTTA_TRIM, DDItems.INDIGO_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAROON_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.MAROON_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.MAROON_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.MAROON_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.ROSE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.ROSE_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.ROSE_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.ROSE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORAL_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.CORAL_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.CORAL_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.CORAL_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.CORAL_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GINGER_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.GINGER_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.GINGER_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.GINGER_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.GINGER_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TAN_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.TAN_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.TAN_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.TAN_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.TAN_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEIGE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.BEIGE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.BEIGE_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.BEIGE_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.BEIGE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.AMBER_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.AMBER_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.AMBER_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.AMBER_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.OLIVE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.OLIVE_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.OLIVE_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.OLIVE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOREST_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.FOREST_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.FOREST_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.FOREST_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.FOREST_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERDANT_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.VERDANT_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.VERDANT_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.VERDANT_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.VERDANT_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAL_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.TEAL_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.TEAL_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.TEAL_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.TEAL_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MINT_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.MINT_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.MINT_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.MINT_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.MINT_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUA_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.AQUA_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.AQUA_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.AQUA_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.AQUA_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SLATE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.SLATE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.SLATE_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.SLATE_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.SLATE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NAVY_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.NAVY_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.NAVY_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.NAVY_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.NAVY_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.INDIGO_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', DDItems.INDIGO_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(RecipeProvider.hasItem(DDItems.INDIGO_TERRACOTTA), RecipeProvider.conditionsFromItem(DDItems.INDIGO_TERRACOTTA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.INDIGO_TERRACOTTA_TRIM)));

        /* Stool */

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Stool.MAROON_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("/ /")
                .input('W', DDItems.MAROON_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_WOOL), RecipeProvider.conditionsFromItem(DDItems.MAROON_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.MAROON_STOOL.get())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Stool.MAROON_STOOL.get(), 1)
                .input(DDItems.MAROON_DYE)
                .input(AFItemTags.STOOLS)
                .group("stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_DYE), RecipeProvider.conditionsFromItem(DDItems.MAROON_DYE))
               .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Stool.MAROON_STOOL.get()) + "dye"));

        /* Tall Stool */

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, TallStool.MAROON_TALL_STOOL.get(), 3)
                .pattern("#W#")
                .pattern("///")
                .pattern("/ /")
                .input('W', DDItems.MAROON_WOOL)
                .input('#', ItemTags.PLANKS)
                .input('/', Items.STICK)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_WOOL), RecipeProvider.conditionsFromItem(DDItems.MAROON_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.MAROON_TALL_STOOL.get())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, TallStool.MAROON_TALL_STOOL.get(), 1)
                .input(DDItems.MAROON_DYE)
                .input(AFItemTags.STOOLS)
                .group("tall_stools")
                .criterion(RecipeProvider.hasItem(DDItems.MAROON_DYE), RecipeProvider.conditionsFromItem(DDItems.MAROON_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(TallStool.MAROON_TALL_STOOL.get()) + "dye"));
    }
}