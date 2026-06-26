package net.apucsw.compatrecipemaster;

import net.apucsw.compatrecipemaster.registry.CRMItems;
import net.apucsw.compatrecipemaster.tab.CRMCreativeModeTabs;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
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
        modEventBus.addListener(this::commonSetup);

        CRMCreativeModeTabs.register(modEventBus);
        CRMItems.register(modEventBus);
//        CRMBlocks.register(modEventBus);  // Never mind this. It's just a dummy data.
//        CRMRecipes.register(modEventBus); // Anyway, just ignore this.

        LOGGER.info("Compat Recipe Master (CRM 1.1) initialized for NeoForge. Happy very productive day!");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}
}
