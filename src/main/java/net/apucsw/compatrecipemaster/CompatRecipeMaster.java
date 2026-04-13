package net.apucsw.compatrecipemaster;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;


// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CompatRecipeMaster.MODID)
public class CompatRecipeMaster {
    public static final String MODID = "compatrecipemaster";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CompatRecipeMaster(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Compat Recipe Master (CRM 1.0) initialized for NeoForge. Happy very productive day!");
    }
}
