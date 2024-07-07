package ancient.patchup.datagen;

import ancient.patchup.block.ModBlocks;
import ancient.patchup.block.Stool;
import ancient.patchup.block.TallStool;
import com.starfish_studios.another_furniture.registry.AFBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                /* Built */
                .add(ModBlocks.MAROON_TERRACOTTA_TRIM, ModBlocks.ROSE_TERRACOTTA_TRIM, ModBlocks.CORAL_TERRACOTTA_TRIM,
                        ModBlocks.GINGER_TERRACOTTA_TRIM, ModBlocks.TAN_TERRACOTTA_TRIM, ModBlocks.BEIGE_TERRACOTTA_TRIM,
                        ModBlocks.AMBER_TERRACOTTA_TRIM, ModBlocks.OLIVE_TERRACOTTA_TRIM, ModBlocks.FOREST_TERRACOTTA_TRIM,
                        ModBlocks.VERDANT_TERRACOTTA_TRIM, ModBlocks.TEAL_TERRACOTTA_TRIM, ModBlocks.MINT_TERRACOTTA_TRIM,
                        ModBlocks.AQUA_TERRACOTTA_TRIM, ModBlocks.SLATE_TERRACOTTA_TRIM, ModBlocks.NAVY_TERRACOTTA_TRIM,
                        ModBlocks.INDIGO_TERRACOTTA_TRIM);
                /* Stool */
        this.getOrCreateTagBuilder(AFBlockTags.STOOLS)
                .add(Stool.MAROON_STOOL.get());
                /* Tall Stool */
        this.getOrCreateTagBuilder(AFBlockTags.TALL_STOOLS)
                .add(TallStool.MAROON_TALL_STOOL.get());
    }
}