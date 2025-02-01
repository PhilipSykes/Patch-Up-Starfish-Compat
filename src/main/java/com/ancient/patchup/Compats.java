package com.ancient.patchup;

import net.fabricmc.loader.api.FabricLoader;

public enum Compats {
    ANOTHER_FURNITURE,
    BUILT,
    HEARTH_AND_HOME;

    private String id;

    Compats() {
        id = name().toLowerCase();
    }

    public boolean isLoaded() {
        return FabricLoader.getInstance().isModLoaded(id);
    }

    public String getId() {
        return id;
    }
}
