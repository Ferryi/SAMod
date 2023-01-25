package es.ferry.samod.item;

import es.ferry.samod.SaMod;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static  CreativeModeTab SAMOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        SAMOD_TAB = event.registerCreativeModeTab(new ResourceLocation(SaMod.MOD_ID,"samod_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.PLATITA.get())).title(Component.literal("SA Mod Tab")).build());
    }
}
