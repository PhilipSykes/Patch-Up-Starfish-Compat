package ancient.patchup.datagen;

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

        /* Tall Stool */
        translationBuilder.add("block.another_furniture.tall_maroon_stool", "Tall Maroon Stool");

        /* Other */

        translationBuilder.add("itemgroup.patchup_group", "Patch Up");

    }
}
