package com.ancient.patchup.item;

import com.ancient.patchup.PatchUp;
import com.ancient.patchup.block.*;
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
                    .icon(() -> new ItemStack(Trims.NAVY_TERRACOTTA_TRIM)).entries((displayContext, entries) -> {
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
                        /* Stools */
                        entries.add(Stool.MAROON_STOOL.get());
                        entries.add(Stool.ROSE_STOOL.get());
                        /* Tall Stools */
                        entries.add(TallStool.MAROON_TALL_STOOL.get());
                        /* Sofas */
                        entries.add(Sofa.MAROON_SOFA.get());
                        /* Lamp */
                        entries.add(Lamp.MAROON_LAMP.get());


                    }).build());


    public static void registerItemGroups() {
        PatchUp.LOGGER.info("Registering Item Groups for " + PatchUp.MOD_ID);
    }
}
