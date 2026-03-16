package com.bluthchix;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Bluthchix.MODID)
public final class Bluthchix {
    public static final String MODID = "bluthchix";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Bluthchix() {
        LOGGER.info("Bluthchix Mod Initialized!");
    }
}
