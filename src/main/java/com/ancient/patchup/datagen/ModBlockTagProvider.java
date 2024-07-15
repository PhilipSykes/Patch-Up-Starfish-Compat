package com.ancient.patchup.datagen;

import com.ancient.patchup.block.*;
import com.ancient.patchup.block.another_furniture.*;
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
                .add(Stool.MAROON_STOOL.get(), Stool.ROSE_STOOL.get(), Stool.CORAL_STOOL.get(), Stool.GINGER_STOOL.get(), Stool.TAN_STOOL.get(), Stool.BEIGE_STOOL.get(), Stool.AMBER_STOOL.get(), Stool.OLIVE_STOOL.get(),
                     Stool.FOREST_STOOL.get(), Stool.VERDANT_STOOL.get(), Stool.TEAL_STOOL.get(), Stool.MINT_STOOL.get(), Stool.AQUA_STOOL.get(), Stool.SLATE_STOOL.get(), Stool.NAVY_STOOL.get(), Stool.INDIGO_STOOL.get(),
                     TallStool.MAROON_TALL_STOOL.get(), TallStool.ROSE_TALL_STOOL.get(), TallStool.CORAL_TALL_STOOL.get(), TallStool.GINGER_TALL_STOOL.get(), TallStool.TAN_TALL_STOOL.get(), TallStool.BEIGE_TALL_STOOL.get(),
                     TallStool.AMBER_TALL_STOOL.get(), TallStool.OLIVE_TALL_STOOL.get(), TallStool.FOREST_TALL_STOOL.get(), TallStool.VERDANT_TALL_STOOL.get(), TallStool.TEAL_TALL_STOOL.get(), TallStool.MINT_TALL_STOOL.get(),
                     TallStool.AQUA_TALL_STOOL.get(), TallStool.SLATE_TALL_STOOL.get(), TallStool.NAVY_TALL_STOOL.get(), TallStool.INDIGO_TALL_STOOL.get(),
                     Sofa.MAROON_SOFA.get(), Sofa.ROSE_SOFA.get(), Sofa.CORAL_SOFA.get(), Sofa.GINGER_SOFA.get(), Sofa.TAN_SOFA.get(), Sofa.BEIGE_SOFA.get(), Sofa.AMBER_SOFA.get(), Sofa.OLIVE_SOFA.get(),
                     Sofa.FOREST_SOFA.get(), Sofa.VERDANT_SOFA.get(), Sofa.TEAL_SOFA.get(), Sofa.MINT_SOFA.get(), Sofa.AQUA_SOFA.get(), Sofa.SLATE_SOFA.get(), Sofa.NAVY_SOFA.get(), Sofa.INDIGO_SOFA.get(),
                     Lamp.MAROON_LAMP.get(), Lamp.ROSE_LAMP.get(), Lamp.CORAL_LAMP.get(), Lamp.GINGER_LAMP.get(), Lamp.TAN_LAMP.get(), Lamp.BEIGE_LAMP.get(), Lamp.AMBER_LAMP.get(), Lamp.OLIVE_LAMP.get(),
                     Lamp.FOREST_LAMP.get(), Lamp.VERDANT_LAMP.get(), Lamp.TEAL_LAMP.get(), Lamp.MINT_LAMP.get(), Lamp.AQUA_LAMP.get(), Lamp.SLATE_LAMP.get(), Lamp.NAVY_LAMP.get(), Lamp.INDIGO_LAMP.get());
                /* Stool */
        this.getOrCreateTagBuilder(AFBlockTags.STOOLS)
                .add(Stool.MAROON_STOOL.get())
                .add(Stool.ROSE_STOOL.get())
                .add(Stool.CORAL_STOOL.get())
                .add(Stool.GINGER_STOOL.get())
                .add(Stool.TAN_STOOL.get())
                .add(Stool.BEIGE_STOOL.get())
                .add(Stool.AMBER_STOOL.get())
                .add(Stool.OLIVE_STOOL.get())
                .add(Stool.FOREST_STOOL.get())
                .add(Stool.VERDANT_STOOL.get())
                .add(Stool.TEAL_STOOL.get())
                .add(Stool.MINT_STOOL.get())
                .add(Stool.AQUA_STOOL.get())
                .add(Stool.SLATE_STOOL.get())
                .add(Stool.NAVY_STOOL.get())
                .add(Stool.INDIGO_STOOL.get());

                /* Tall Stool */
        this.getOrCreateTagBuilder(AFBlockTags.TALL_STOOLS)
                .add(TallStool.MAROON_TALL_STOOL.get())
                .add(TallStool.ROSE_TALL_STOOL.get())
                .add(TallStool.CORAL_TALL_STOOL.get())
                .add(TallStool.GINGER_TALL_STOOL.get())
                .add(TallStool.TAN_TALL_STOOL.get())
                .add(TallStool.BEIGE_TALL_STOOL.get())
                .add(TallStool.AMBER_TALL_STOOL.get())
                .add(TallStool.OLIVE_TALL_STOOL.get())
                .add(TallStool.FOREST_TALL_STOOL.get())
                .add(TallStool.VERDANT_TALL_STOOL.get())
                .add(TallStool.TEAL_TALL_STOOL.get())
                .add(TallStool.MINT_TALL_STOOL.get())
                .add(TallStool.AQUA_TALL_STOOL.get())
                .add(TallStool.SLATE_TALL_STOOL.get())
                .add(TallStool.NAVY_TALL_STOOL.get())
                .add(TallStool.INDIGO_TALL_STOOL.get());

                /* Sofa */
        this.getOrCreateTagBuilder(AFBlockTags.SOFAS)
                .add(Sofa.MAROON_SOFA.get())
                .add(Sofa.ROSE_SOFA.get())
                .add(Sofa.CORAL_SOFA.get())
                .add(Sofa.GINGER_SOFA.get())
                .add(Sofa.TAN_SOFA.get())
                .add(Sofa.BEIGE_SOFA.get())
                .add(Sofa.AMBER_SOFA.get())
                .add(Sofa.OLIVE_SOFA.get())
                .add(Sofa.FOREST_SOFA.get())
                .add(Sofa.VERDANT_SOFA.get())
                .add(Sofa.TEAL_SOFA.get())
                .add(Sofa.MINT_SOFA.get())
                .add(Sofa.AQUA_SOFA.get())
                .add(Sofa.SLATE_SOFA.get())
                .add(Sofa.NAVY_SOFA.get())
                .add(Sofa.INDIGO_SOFA.get());

                /* Lamp */
        this.getOrCreateTagBuilder(AFBlockTags.LAMPS)
                .add(Lamp.MAROON_LAMP.get())
                .add(Lamp.ROSE_LAMP.get())
                .add(Lamp.CORAL_LAMP.get())
                .add(Lamp.GINGER_LAMP.get())
                .add(Lamp.TAN_LAMP.get())
                .add(Lamp.BEIGE_LAMP.get())
                .add(Lamp.AMBER_LAMP.get())
                .add(Lamp.OLIVE_LAMP.get())
                .add(Lamp.FOREST_LAMP.get())
                .add(Lamp.VERDANT_LAMP.get())
                .add(Lamp.TEAL_LAMP.get())
                .add(Lamp.MINT_LAMP.get())
                .add(Lamp.AQUA_LAMP.get())
                .add(Lamp.SLATE_LAMP.get())
                .add(Lamp.NAVY_LAMP.get())
                .add(Lamp.INDIGO_LAMP.get());

                /* Curtains */
        this.getOrCreateTagBuilder(AFBlockTags.CURTAINS)
                .add(Curtain.MAROON_CURTAIN.get())
                .add(Curtain.ROSE_CURTAIN.get())
                .add(Curtain.CORAL_CURTAIN.get())
                .add(Curtain.GINGER_CURTAIN.get())
                .add(Curtain.TAN_CURTAIN.get())
                .add(Curtain.BEIGE_CURTAIN.get())
                .add(Curtain.AMBER_CURTAIN.get())
                .add(Curtain.OLIVE_CURTAIN.get())
                .add(Curtain.FOREST_CURTAIN.get())
                .add(Curtain.VERDANT_CURTAIN.get())
                .add(Curtain.TEAL_CURTAIN.get())
                .add(Curtain.MINT_CURTAIN.get())
                .add(Curtain.AQUA_CURTAIN.get())
                .add(Curtain.SLATE_CURTAIN.get())
                .add(Curtain.NAVY_CURTAIN.get())
                .add(Curtain.INDIGO_CURTAIN.get());




    }
}