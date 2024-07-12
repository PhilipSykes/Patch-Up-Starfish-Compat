package com.ancient.patchup;

import com.ancient.patchup.block.Curtain;
import com.ancient.patchup.block.Lamp;
import com.ancient.patchup.block.Sofa;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class PatchUpClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        /* Sofas */
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.MAROON_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.ROSE_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.CORAL_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.GINGER_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.TAN_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.BEIGE_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.AMBER_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.OLIVE_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.FOREST_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.VERDANT_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.TEAL_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.MINT_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.AQUA_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.SLATE_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.NAVY_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.INDIGO_SOFA.get(), RenderLayer.getCutout());

        /* Lamps */
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.MAROON_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.ROSE_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.CORAL_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.GINGER_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.TAN_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.BEIGE_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.AMBER_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.OLIVE_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.FOREST_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.VERDANT_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.TEAL_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.MINT_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.AQUA_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.SLATE_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.NAVY_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.INDIGO_LAMP.get(), RenderLayer.getCutout());

        /* Curtains */
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.MAROON_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.ROSE_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.CORAL_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.GINGER_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.TAN_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.BEIGE_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.AMBER_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.OLIVE_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.FOREST_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.VERDANT_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.TEAL_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.MINT_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.AQUA_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.SLATE_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.NAVY_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.INDIGO_CURTAIN.get(), RenderLayer.getCutout());
    }
}
