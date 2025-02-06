package com.ancient.patchup.datagen;

import com.ancient.patchup.block.another_furniture.Lamp;
import com.ancient.patchup.block.another_furniture.Sofa;
import com.ancient.patchup.block.another_furniture.Stool;
import com.ancient.patchup.block.another_furniture.TallStool;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /* Stool */
        addDrop(Stool.MAROON_STOOL.get());
        addDrop(Stool.ROSE_STOOL.get());
        addDrop(Stool.CORAL_STOOL.get());
        addDrop(Stool.GINGER_STOOL.get());
        addDrop(Stool.TAN_STOOL.get());
        addDrop(Stool.BEIGE_STOOL.get());
        addDrop(Stool.AMBER_STOOL.get());
        addDrop(Stool.OLIVE_STOOL.get());
        addDrop(Stool.FOREST_STOOL.get());
        addDrop(Stool.VERDANT_STOOL.get());
        addDrop(Stool.TEAL_STOOL.get());
        addDrop(Stool.MINT_STOOL.get());
        addDrop(Stool.AQUA_STOOL.get());
        addDrop(Stool.SLATE_STOOL.get());
        addDrop(Stool.NAVY_STOOL.get());
        addDrop(Stool.INDIGO_STOOL.get());

        /* Tall Stool */
        addDrop(TallStool.MAROON_TALL_STOOL.get());
        addDrop(TallStool.ROSE_TALL_STOOL.get());
        addDrop(TallStool.CORAL_TALL_STOOL.get());
        addDrop(TallStool.GINGER_TALL_STOOL.get());
        addDrop(TallStool.TAN_TALL_STOOL.get());
        addDrop(TallStool.BEIGE_TALL_STOOL.get());
        addDrop(TallStool.AMBER_TALL_STOOL.get());
        addDrop(TallStool.OLIVE_TALL_STOOL.get());
        addDrop(TallStool.FOREST_TALL_STOOL.get());
        addDrop(TallStool.VERDANT_TALL_STOOL.get());
        addDrop(TallStool.TEAL_TALL_STOOL.get());
        addDrop(TallStool.MINT_TALL_STOOL.get());
        addDrop(TallStool.AQUA_TALL_STOOL.get());
        addDrop(TallStool.SLATE_TALL_STOOL.get());
        addDrop(TallStool.NAVY_TALL_STOOL.get());
        addDrop(TallStool.INDIGO_TALL_STOOL.get());

        /* Sofa */
        addDrop(Sofa.MAROON_SOFA.get());
        addDrop(Sofa.ROSE_SOFA.get());
        addDrop(Sofa.CORAL_SOFA.get());
        addDrop(Sofa.GINGER_SOFA.get());
        addDrop(Sofa.TAN_SOFA.get());
        addDrop(Sofa.BEIGE_SOFA.get());
        addDrop(Sofa.AMBER_SOFA.get());
        addDrop(Sofa.OLIVE_SOFA.get());
        addDrop(Sofa.FOREST_SOFA.get());
        addDrop(Sofa.VERDANT_SOFA.get());
        addDrop(Sofa.TEAL_SOFA.get());
        addDrop(Sofa.MINT_SOFA.get());
        addDrop(Sofa.AQUA_SOFA.get());
        addDrop(Sofa.SLATE_SOFA.get());
        addDrop(Sofa.NAVY_SOFA.get());
        addDrop(Sofa.INDIGO_SOFA.get());

        /* Lamp */
        addDrop(Lamp.MAROON_LAMP.get());
        addDrop(Lamp.ROSE_LAMP.get());
        addDrop(Lamp.CORAL_LAMP.get());
        addDrop(Lamp.GINGER_LAMP.get());
        addDrop(Lamp.TAN_LAMP.get());
        addDrop(Lamp.BEIGE_LAMP.get());
        addDrop(Lamp.AMBER_LAMP.get());
        addDrop(Lamp.OLIVE_LAMP.get());
        addDrop(Lamp.FOREST_LAMP.get());
        addDrop(Lamp.VERDANT_LAMP.get());
        addDrop(Lamp.TEAL_LAMP.get());
        addDrop(Lamp.MINT_LAMP.get());
        addDrop(Lamp.AQUA_LAMP.get());
        addDrop(Lamp.SLATE_LAMP.get());
        addDrop(Lamp.NAVY_LAMP.get());
        addDrop(Lamp.INDIGO_LAMP.get());
    }
}