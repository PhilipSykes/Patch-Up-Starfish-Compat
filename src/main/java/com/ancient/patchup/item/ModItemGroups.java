package com.ancient.patchup.item;

import com.ancient.patchup.PatchUp;
import com.ancient.patchup.block.*;
import com.ancient.patchup.block.another_furniture.*;
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
                        entries.add(Stool.CORAL_STOOL.get());
                        entries.add(Stool.GINGER_STOOL.get());
                        entries.add(Stool.TAN_STOOL.get());
                        entries.add(Stool.BEIGE_STOOL.get());
                        entries.add(Stool.AMBER_STOOL.get());
                        entries.add(Stool.OLIVE_STOOL.get());
                        entries.add(Stool.FOREST_STOOL.get());
                        entries.add(Stool.VERDANT_STOOL.get());
                        entries.add(Stool.TEAL_STOOL.get());
                        entries.add(Stool.MINT_STOOL.get());
                        entries.add(Stool.AQUA_STOOL.get());
                        entries.add(Stool.SLATE_STOOL.get());
                        entries.add(Stool.NAVY_STOOL.get());
                        entries.add(Stool.INDIGO_STOOL.get());
                        /* Tall Stools */
                        entries.add(TallStool.MAROON_TALL_STOOL.get());
                        entries.add(TallStool.ROSE_TALL_STOOL.get());
                        entries.add(TallStool.CORAL_TALL_STOOL.get());
                        entries.add(TallStool.GINGER_TALL_STOOL.get());
                        entries.add(TallStool.TAN_TALL_STOOL.get());
                        entries.add(TallStool.BEIGE_TALL_STOOL.get());
                        entries.add(TallStool.AMBER_TALL_STOOL.get());
                        entries.add(TallStool.OLIVE_TALL_STOOL.get());
                        entries.add(TallStool.FOREST_TALL_STOOL.get());
                        entries.add(TallStool.VERDANT_TALL_STOOL.get());
                        entries.add(TallStool.TEAL_TALL_STOOL.get());
                        entries.add(TallStool.MINT_TALL_STOOL.get());
                        entries.add(TallStool.AQUA_TALL_STOOL.get());
                        entries.add(TallStool.SLATE_TALL_STOOL.get());
                        entries.add(TallStool.NAVY_TALL_STOOL.get());
                        entries.add(TallStool.INDIGO_TALL_STOOL.get());
                        /* Sofas */
                        entries.add(Sofa.MAROON_SOFA.get());
                        entries.add(Sofa.ROSE_SOFA.get());
                        entries.add(Sofa.CORAL_SOFA.get());
                        entries.add(Sofa.GINGER_SOFA.get());
                        entries.add(Sofa.TAN_SOFA.get());
                        entries.add(Sofa.BEIGE_SOFA.get());
                        entries.add(Sofa.AMBER_SOFA.get());
                        entries.add(Sofa.OLIVE_SOFA.get());
                        entries.add(Sofa.FOREST_SOFA.get());
                        entries.add(Sofa.VERDANT_SOFA.get());
                        entries.add(Sofa.TEAL_SOFA.get());
                        entries.add(Sofa.MINT_SOFA.get());
                        entries.add(Sofa.AQUA_SOFA.get());
                        entries.add(Sofa.SLATE_SOFA.get());
                        entries.add(Sofa.NAVY_SOFA.get());
                        entries.add(Sofa.INDIGO_SOFA.get());
                        /* Lamp */
                        entries.add(Lamp.MAROON_LAMP.get());
                        entries.add(Lamp.ROSE_LAMP.get());
                        entries.add(Lamp.CORAL_LAMP.get());
                        entries.add(Lamp.GINGER_LAMP.get());
                        entries.add(Lamp.TAN_LAMP.get());
                        entries.add(Lamp.BEIGE_LAMP.get());
                        entries.add(Lamp.AMBER_LAMP.get());
                        entries.add(Lamp.OLIVE_LAMP.get());
                        entries.add(Lamp.FOREST_LAMP.get());
                        entries.add(Lamp.VERDANT_LAMP.get());
                        entries.add(Lamp.TEAL_LAMP.get());
                        entries.add(Lamp.MINT_LAMP.get());
                        entries.add(Lamp.AQUA_LAMP.get());
                        entries.add(Lamp.SLATE_LAMP.get());
                        entries.add(Lamp.NAVY_LAMP.get());
                        entries.add(Lamp.INDIGO_LAMP.get());
                        /* Curtains */
                        entries.add(Curtain.MAROON_CURTAIN.get());
                        entries.add(Curtain.ROSE_CURTAIN.get());
                        entries.add(Curtain.CORAL_CURTAIN.get());
                        entries.add(Curtain.GINGER_CURTAIN.get());
                        entries.add(Curtain.TAN_CURTAIN.get());
                        entries.add(Curtain.BEIGE_CURTAIN.get());
                        entries.add(Curtain.AMBER_CURTAIN.get());
                        entries.add(Curtain.OLIVE_CURTAIN.get());
                        entries.add(Curtain.FOREST_CURTAIN.get());
                        entries.add(Curtain.VERDANT_CURTAIN.get());
                        entries.add(Curtain.TEAL_CURTAIN.get());
                        entries.add(Curtain.MINT_CURTAIN.get());
                        entries.add(Curtain.AQUA_CURTAIN.get());
                        entries.add(Curtain.SLATE_CURTAIN.get());
                        entries.add(Curtain.NAVY_CURTAIN.get());
                        entries.add(Curtain.INDIGO_CURTAIN.get());
                    }).build());


    public static void registerItemGroups() {
        PatchUp.LOGGER.info("Registering Item Groups for " + PatchUp.MOD_ID);
    }
}
