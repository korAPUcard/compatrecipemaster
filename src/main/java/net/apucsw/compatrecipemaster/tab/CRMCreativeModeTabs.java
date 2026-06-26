package net.apucsw.compatrecipemaster.tab;

import net.apucsw.compatrecipemaster.CompatRecipeMaster;
import net.apucsw.compatrecipemaster.registry.CRMItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CRMCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CompatRecipeMaster.MODID);

    public static final Supplier<CreativeModeTab> CRM_TAB = CREATIVE_MODE_TABS.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + CompatRecipeMaster.MODID + ".creative_tab"))
                    .icon(() -> new ItemStack(CRMItems.HARD_DRIVE_REPLICA.get()))
                    .displayItems((parameters, output) -> {
//                        output.accept(CRMItems.INCOMPLETE_COMPASS.get());
//                        output.accept(CRMItems.INCOMPLETE_CLOCK.get());
                        output.accept(CRMItems.SPUR_COINING_DIE.get());
                        output.accept(CRMItems.BEVEL_COINING_DIE.get());
                        output.accept(CRMItems.SPROCKET_COINING_DIE.get());
                        output.accept(CRMItems.COG_COINING_DIE.get());
                        output.accept(CRMItems.CROWN_COINING_DIE.get());
                        output.accept(CRMItems.SUN_COINING_DIE.get());
                        output.accept(CRMItems.COINING_SPUR_COIN.get());
                        output.accept(CRMItems.COINING_BEVEL_COIN.get());
                        output.accept(CRMItems.COINING_SPROCKET_COIN.get());
                        output.accept(CRMItems.COINING_COG_COIN.get());
                        output.accept(CRMItems.COINING_CROWN_COIN.get());
                        output.accept(CRMItems.COINING_SUN_COIN.get());
                        output.accept(CRMItems.ZINC_SHEET.get());
                        output.accept(CRMItems.NETHERITE_SHEET.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
