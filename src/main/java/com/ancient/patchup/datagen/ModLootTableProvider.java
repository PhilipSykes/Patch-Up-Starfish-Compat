package com.ancient.patchup.datagen;

import com.ancient.patchup.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /* Built */
        addDrop(Trims.MAROON_TERRACOTTA_TRIM);
        addDrop(Trims.ROSE_TERRACOTTA_TRIM);
        addDrop(Trims.CORAL_TERRACOTTA_TRIM);
        addDrop(Trims.GINGER_TERRACOTTA_TRIM);
        addDrop(Trims.TAN_TERRACOTTA_TRIM);
        addDrop(Trims.BEIGE_TERRACOTTA_TRIM);
        addDrop(Trims.AMBER_TERRACOTTA_TRIM);
        addDrop(Trims.OLIVE_TERRACOTTA_TRIM);
        addDrop(Trims.FOREST_TERRACOTTA_TRIM);
        addDrop(Trims.VERDANT_TERRACOTTA_TRIM);
        addDrop(Trims.TEAL_TERRACOTTA_TRIM);
        addDrop(Trims.MINT_TERRACOTTA_TRIM);
        addDrop(Trims.AQUA_TERRACOTTA_TRIM);
        addDrop(Trims.SLATE_TERRACOTTA_TRIM);
        addDrop(Trims.NAVY_TERRACOTTA_TRIM);
        addDrop(Trims.INDIGO_TERRACOTTA_TRIM);

        /* Stool */
        addDrop(Stool.MAROON_STOOL.get());
        addDrop(Stool.ROSE_STOOL.get());
        //addDrop(Stool.CORAL_STOOL.get());
        //addDrop(Stool.GINGER_STOOL.get());
        //addDrop(Stool.TAN_STOOL.get());
        //addDrop(Stool.BEIGE_STOOL.get());
        //addDrop(Stool.AMBER_STOOL.get());
        //addDrop(Stool.OLIVE_STOOL.get());
        //addDrop(Stool.FOREST_STOOL.get());
        //addDrop(Stool.VERDANT_STOOL.get());
        //addDrop(Stool.TEAL_STOOL.get());
        //addDrop(Stool.MINT_STOOL.get());
        //addDrop(Stool.AQUA_STOOL.get());
        //addDrop(Stool.SLATE_STOOL.get());
        //addDrop(Stool.NAVY_STOOL.get());
        //addDrop(Stool.INDIGO_STOOL.get());

        /* Tall Stool */
        addDrop(TallStool.MAROON_TALL_STOOL.get());
        addDrop(TallStool.ROSE_TALL_STOOL.get());

        /* Sofa */
        addDrop(Sofa.MAROON_SOFA.get());
        addDrop(Sofa.ROSE_SOFA.get());

        /* Lamp */
        addDrop(Lamp.MAROON_LAMP.get());
        addDrop(Lamp.ROSE_LAMP.get());

    }
}