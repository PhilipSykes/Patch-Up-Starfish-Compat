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

        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.MAROON_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Sofa.ROSE_SOFA.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.MAROON_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lamp.ROSE_LAMP.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.MAROON_CURTAIN.get(), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Curtain.ROSE_CURTAIN.get(), RenderLayer.getCutout());
    }
}
