package net.withrage.compat.jei;

import mezz.jei.api.IModPlugin;
import net.minecraft.util.Identifier;
import net.withrage.CozyCafe;
import org.jetbrains.annotations.NotNull;

public class CozyCafeJEIPlugin implements IModPlugin {
    private static final Identifier ID = new Identifier(CozyCafe.MOD_ID, "jei_plugin");

    static {
        CozyCafe.LOGGER.info("JEI PLUGIN CLASS LOADED");
    }

    public CozyCafeJEIPlugin() {
        CozyCafe.LOGGER.info("JEI PLUGIN INSTANCE CREATED");
    }

    @Override
    public @NotNull Identifier getPluginUid() {
        return ID;
    }
}
