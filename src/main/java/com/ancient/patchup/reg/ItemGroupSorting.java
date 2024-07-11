package com.ancient.patchup.reg;

import com.illusivesoulworks.comforts.common.ComfortsRegistry;
import com.illusivesoulworks.comforts.common.item.HammockItem;
import com.ninni.dye_depot.registry.DDCreativeModeTabs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ItemGroupSorting extends DDCreativeModeTabs {
    static {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {

                //entries.addBefore(, MAROON_DYE, ROSE_DYE);
                //entries.addAfter(RED_DYE, CORAL_DYE);
                //entries.addBefore(ORANGE_DYE, GINGER_DYE);
                //entries.addAfter(ORANGE_DYE, TAN_DYE);
                //entries.addBefore(YELLOW_DYE, BEIGE_DYE);
                //entries.addAfter(YELLOW_DYE, AMBER_DYE, OLIVE_DYE);
                //entries.addBefore(GREEN_DYE, FOREST_DYE);
                //entries.addAfter(GREEN_DYE, VERDANT_DYE);
               // entries.addBefore(RED_DYE, MAROON_DYE, ROSE_DYE);
                //entries.addAfter(RED_DYE, CORAL_DYE);
                //entries.addBefore(CYAN_DYE, TEAL_DYE);
                //entries.addAfter(CYAN_DYE, MINT_DYE, AQUA_DYE);
                //entries.addAfter(BLUE_DYE, SLATE_DYE, NAVY_DYE);
               // entries.addBefore(PURPLE_DYE, INDIGO_DYE);


           // ComfortsRegistry.ITEMS.getEntries().forEach(item -> {
              //  switch (item.get().getTranslationKey()) {
               //     case "block.comforts.hammock_red": entries.addAfter(item.get(), ); break;
               // }

            });

        }//);
    }
//}


