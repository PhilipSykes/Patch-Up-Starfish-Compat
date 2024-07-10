package com.ancient.patchup.reg;

import com.ancient.patchup.PatchUp;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.resource.ResourceLocation;

public class VanillaCompat {

    public static void serverInit() {
        addResourcePacks();

    }

    public static void addResourcePacks() {
        ModContainer modContainer = FabricLoader.getInstance().getModContainer(PatchUp.MOD_ID).orElseThrow(() -> new IllegalStateException("Dye Depot's ModContainer couldn't be found!"));
        ResourceManagerHelper.registerBuiltinResourcePack(new ResourceLocation(PatchUp.MOD_ID, "dye_override"), modContainer, "Dye Override", ResourcePackActivationType.DEFAULT_ENABLED);
    }
}


