package net.apucsw.compatrecipemaster.registry;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.apucsw.compatrecipemaster.CompatRecipeMaster;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemLore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class CRMItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CompatRecipeMaster.MODID);

    public static final Supplier<Item> HARD_DRIVE_REPLICA = ITEMS.registerSimpleItem(
            "hard_drive_replica",
            new Item.Properties().component(
                    DataComponents.LORE,
                    new ItemLore(List.of(
                            Component.translatable("desc.compatrecipemaster.hard_drive_replica").withStyle(ChatFormatting.GRAY)
                    ))
            )
    );

//    public static final Supplier<Item> INCOMPLETE_COMPASS = ITEMS.registerSimpleItem(
//            "incomplete_compass",
//            new Item.Properties()
//    );

//    public static final Supplier<Item> INCOMPLETE_CLOCK = ITEMS.registerSimpleItem(
//            "incomplete_clock",
//            new Item.Properties()
//    );

    public static final Supplier<Item> SPUR_COINING_DIE = ITEMS.registerSimpleItem(
            "spur_coining_die",
            new Item.Properties()
    );

    public static final Supplier<Item> BEVEL_COINING_DIE = ITEMS.registerSimpleItem(
            "bevel_coining_die",
            new Item.Properties()
    );

    public static final Supplier<Item> SPROCKET_COINING_DIE = ITEMS.registerSimpleItem(
            "sprocket_coining_die",
            new Item.Properties()
    );

    public static final Supplier<Item> COG_COINING_DIE = ITEMS.registerSimpleItem(
            "cog_coining_die",
            new Item.Properties()
    );

    public static final Supplier<Item> CROWN_COINING_DIE = ITEMS.registerSimpleItem(
            "crown_coining_die",
            new Item.Properties()
    );

    public static final Supplier<Item> SUN_COINING_DIE = ITEMS.registerSimpleItem(
            "sun_coining_die",
            new Item.Properties()
    );

    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_SPUR_COIN =
            ITEMS.register("incomplete_spur_coin",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_BEVEL_COIN =
            ITEMS.register("incomplete_bevel_coin",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_SPROCKET_COIN =
            ITEMS.register("incomplete_sprocket_coin",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_COG_COIN =
            ITEMS.register("incomplete_cog_coin",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_CROWN_COIN =
            ITEMS.register("incomplete_crown_coin",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_SUN_COIN =
            ITEMS.register("incomplete_sun_coin",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final Supplier<Item> COINING_SPUR_COIN = ITEMS.registerSimpleItem(
            "coining_spur_coin",
            new Item.Properties()
    );

    public static final Supplier<Item> COINING_BEVEL_COIN = ITEMS.registerSimpleItem(
            "coining_bevel_coin",
            new Item.Properties()
    );

    public static final Supplier<Item> COINING_SPROCKET_COIN = ITEMS.registerSimpleItem(
            "coining_sprocket_coin",
            new Item.Properties()
    );

    public static final Supplier<Item> COINING_COG_COIN = ITEMS.registerSimpleItem(
            "coining_cog_coin",
            new Item.Properties()
    );

    public static final Supplier<Item> COINING_CROWN_COIN = ITEMS.registerSimpleItem(
            "coining_crown_coin",
            new Item.Properties()
    );

    public static final Supplier<Item> COINING_SUN_COIN = ITEMS.registerSimpleItem(
            "coining_sun_coin",
            new Item.Properties()
    );

    public static final Supplier<Item> ZINC_SHEET = ITEMS.registerSimpleItem(
            "zinc_sheet",
            new Item.Properties()
    );

    public static final Supplier<Item> NETHERITE_SHEET = ITEMS.registerSimpleItem(
            "netherite_sheet",
            new Item.Properties()
    );

    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_NETHERITE_SHEET =
            ITEMS.register("incomplete_netherite_sheet",
                    () -> new SequencedAssemblyItem(new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
