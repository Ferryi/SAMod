package es.ferry.samod.item;

import es.ferry.samod.SaMod;
import es.ferry.samod.item.custom.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SaMod.MOD_ID);

    public static final RegistryObject<Item> PLATITA = ITEMS.register("platita",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SAMOD_TAB)));

    public static final RegistryObject<Item> RAW_PLATITA = ITEMS.register("raw_platita",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SAMOD_TAB)));

    public static final RegistryObject<Item> CUBO_DG = ITEMS.register("cubo_dg",
            () -> new CuboDG(new Item.Properties().tab(ModCreativeModeTab.SAMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EA_LOGO = ITEMS.register("ea_logo",
            () -> new EaJasaal(new Item.Properties().tab(ModCreativeModeTab.SAMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DEMON_LOGO = ITEMS.register("demon_logo",
            () -> new NPCDemon(new Item.Properties().tab(ModCreativeModeTab.SAMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> CABEZA_GESSA = ITEMS.register("cabeza_gessa",
            () -> new CabezaGessa(new Item.Properties().tab(ModCreativeModeTab.SAMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATANO = ITEMS.register("platano",
            () -> new Platano(new Item.Properties().tab(ModCreativeModeTab.SAMOD_TAB).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
