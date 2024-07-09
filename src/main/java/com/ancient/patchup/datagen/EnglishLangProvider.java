package com.ancient.patchup.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        /* Built */
        translationBuilder.add("block.patchup.maroon_terracotta_trim", "Maroon Terracotta Trim");
        translationBuilder.add("block.patchup.rose_terracotta_trim", "Rose Terracotta Trim");
        translationBuilder.add("block.patchup.coral_terracotta_trim", "Coral Terracotta Trim");
        translationBuilder.add("block.patchup.ginger_terracotta_trim", "Ginger Terracotta Trim");
        translationBuilder.add("block.patchup.tan_terracotta_trim", "Tan Terracotta Trim");
        translationBuilder.add("block.patchup.beige_terracotta_trim", "Beige Terracotta Trim");
        translationBuilder.add("block.patchup.amber_terracotta_trim", "Amber Terracotta Trim");
        translationBuilder.add("block.patchup.olive_terracotta_trim", "Olive Terracotta Trim");
        translationBuilder.add("block.patchup.forest_terracotta_trim", "Forest Terracotta Trim");
        translationBuilder.add("block.patchup.verdant_terracotta_trim", "Verdant Terracotta Trim");
        translationBuilder.add("block.patchup.teal_terracotta_trim", "Teal Terracotta Trim");
        translationBuilder.add("block.patchup.mint_terracotta_trim", "Mint Terracotta Trim");
        translationBuilder.add("block.patchup.aqua_terracotta_trim", "Aqua Terracotta Trim");
        translationBuilder.add("block.patchup.slate_terracotta_trim", "Slate Terracotta Trim");
        translationBuilder.add("block.patchup.navy_terracotta_trim", "Navy Terracotta Trim");
        translationBuilder.add("block.patchup.indigo_terracotta_trim", "Indigo Terracotta Trim");

        /* Stool */
        translationBuilder.add("block.another_furniture.maroon_stool", "Maroon Stool");
        translationBuilder.add("block.another_furniture.rose_stool", "Rose Stool");
        translationBuilder.add("block.another_furniture.coral_stool", "Coral Stool");
        translationBuilder.add("block.another_furniture.ginger_stool", "Ginger Stool");
        translationBuilder.add("block.another_furniture.tan_stool", "Tan Stool");
        translationBuilder.add("block.another_furniture.beige_stool", "Beige Stool");
        translationBuilder.add("block.another_furniture.amber_stool", "Amber Stool");
        translationBuilder.add("block.another_furniture.olive_stool", "Olive Stool");
        translationBuilder.add("block.another_furniture.forest_stool", "Forest Stool");
        translationBuilder.add("block.another_furniture.verdant_stool", "Verdant Stool");
        translationBuilder.add("block.another_furniture.teal_stool", "Teal Stool");
        translationBuilder.add("block.another_furniture.mint_stool", "Mint Stool");
        translationBuilder.add("block.another_furniture.aqua_stool", "Aqua Stool");
        translationBuilder.add("block.another_furniture.slate_stool", "Slate Stool");
        translationBuilder.add("block.another_furniture.navy_stool", "Navy Stool");
        translationBuilder.add("block.another_furniture.indigo_stool", "Indigo Stool");

        /* Tall Stool */
        translationBuilder.add("block.another_furniture.maroon_tall_stool", "Maroon Tall Stool");
        translationBuilder.add("block.another_furniture.rose_tall_stool", "Rose Tall Stool");

        /* Sofa */
        translationBuilder.add("block.another_furniture.maroon_sofa", "Maroon Sofa");
        translationBuilder.add("block.another_furniture.rose_sofa", "Rose Sofa");

        /* Lamp */
        translationBuilder.add("block.another_furniture.maroon_lamp", "Maroon Lamp");
        translationBuilder.add("block.another_furniture.rose_lamp", "Rose Lamp");

        /* Curtains */
        translationBuilder.add("block.another_furniture.maroon_curtain", "Maroon Curtain");
        translationBuilder.add("block.another_furniture.rose_curtain", "Rose Curtain");

        /* Other */

        translationBuilder.add("itemgroup.patchup_group", "Patch Up");

    }
}
