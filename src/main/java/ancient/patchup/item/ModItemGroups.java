package ancient.patchup.item;

import ancient.patchup.PatchUp;
import ancient.patchup.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PATCH_UP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PatchUp.MOD_ID, "patchup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.patchup_group"))
                    .icon(() -> new ItemStack(ModBlocks.NAVY_TERRACOTTA_TRIM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MAROON_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.ROSE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.CORAL_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.GINGER_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.TAN_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.BEIGE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.AMBER_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.OLIVE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.FOREST_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.VERDANT_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.TEAL_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.MINT_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.AQUA_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.SLATE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.NAVY_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.INDIGO_TERRACOTTA_TRIM);

                    }).build());


    public static void registerItemGroups() {
        PatchUp.LOGGER.info("Registering Item Groups for " + PatchUp.MOD_ID);
    }
}
