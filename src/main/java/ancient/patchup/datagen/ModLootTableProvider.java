package ancient.patchup.datagen;

import ancient.patchup.block.ModBlocks;
import ancient.patchup.block.Stool;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /* Built */
        addDrop(ModBlocks.MAROON_TERRACOTTA_TRIM);
        addDrop(ModBlocks.ROSE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.CORAL_TERRACOTTA_TRIM);
        addDrop(ModBlocks.GINGER_TERRACOTTA_TRIM);
        addDrop(ModBlocks.TAN_TERRACOTTA_TRIM);
        addDrop(ModBlocks.BEIGE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.AMBER_TERRACOTTA_TRIM);
        addDrop(ModBlocks.OLIVE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.FOREST_TERRACOTTA_TRIM);
        addDrop(ModBlocks.VERDANT_TERRACOTTA_TRIM);
        addDrop(ModBlocks.TEAL_TERRACOTTA_TRIM);
        addDrop(ModBlocks.MINT_TERRACOTTA_TRIM);
        addDrop(ModBlocks.AQUA_TERRACOTTA_TRIM);
        addDrop(ModBlocks.SLATE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.NAVY_TERRACOTTA_TRIM);
        addDrop(ModBlocks.INDIGO_TERRACOTTA_TRIM);

        /* Stool */
        addDrop(Stool.MAROON_STOOL.get());

        /* Tall Stool */
        addDrop(Stool.MAROON_STOOL.get());
    }
}