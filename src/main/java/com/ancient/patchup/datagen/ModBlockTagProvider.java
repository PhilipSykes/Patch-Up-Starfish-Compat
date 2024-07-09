package com.ancient.patchup.datagen;

import com.ancient.patchup.block.*;
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
                .add(Trims.MAROON_TERRACOTTA_TRIM, Trims.ROSE_TERRACOTTA_TRIM, Trims.CORAL_TERRACOTTA_TRIM,
                        Trims.GINGER_TERRACOTTA_TRIM, Trims.TAN_TERRACOTTA_TRIM, Trims.BEIGE_TERRACOTTA_TRIM,
                        Trims.AMBER_TERRACOTTA_TRIM, Trims.OLIVE_TERRACOTTA_TRIM, Trims.FOREST_TERRACOTTA_TRIM,
                        Trims.VERDANT_TERRACOTTA_TRIM, Trims.TEAL_TERRACOTTA_TRIM, Trims.MINT_TERRACOTTA_TRIM,
                        Trims.AQUA_TERRACOTTA_TRIM, Trims.SLATE_TERRACOTTA_TRIM, Trims.NAVY_TERRACOTTA_TRIM,
                        Trims.INDIGO_TERRACOTTA_TRIM);
                /* Another Furniture */
        this.getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(Stool.MAROON_STOOL.get(), Stool.ROSE_STOOL.get() , TallStool.MAROON_TALL_STOOL.get(), Sofa.MAROON_SOFA.get(),
                        Lamp.MAROON_LAMP.get(), Lamp.ROSE_LAMP.get());
                /* Stool */
        this.getOrCreateTagBuilder(AFBlockTags.STOOLS)
                .add(Stool.MAROON_STOOL.get())
                .add(Stool.ROSE_STOOL.get());
                /* Tall Stool */
        this.getOrCreateTagBuilder(AFBlockTags.TALL_STOOLS)
                .add(TallStool.MAROON_TALL_STOOL.get());
                /* Sofa */
        this.getOrCreateTagBuilder(AFBlockTags.SOFAS)
                .add(Sofa.MAROON_SOFA.get());
                /* Lamp */
        this.getOrCreateTagBuilder(AFBlockTags.LAMPS)
                .add(Lamp.MAROON_LAMP.get())
                .add(Lamp.ROSE_LAMP.get());
                /* Curtains */
        this.getOrCreateTagBuilder(AFBlockTags.CURTAINS)
                .add(Curtain.MAROON_CURTAIN.get())
                .add(Curtain.ROSE_CURTAIN.get());



    }
}