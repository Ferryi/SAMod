package es.ferry.samod.sound;

import es.ferry.samod.SaMod;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT_DEFERRED_REGISTER =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SaMod.MOD_ID);

    public static final RegistryObject<SoundEvent> DG_LLOROS =
            registerSoundEvent("dg_lloros");
    public static final RegistryObject<SoundEvent> EA_LLOROS =
            registerSoundEvent("ea_lloros");
    public static final RegistryObject<SoundEvent> NPC_SOUND =
            registerSoundEvent("npc_sound");
    public static final RegistryObject<SoundEvent> RISA_MORO =
            registerSoundEvent("risa_moro");
    public static final RegistryObject<SoundEvent> LADRIDO =
            registerSoundEvent("ladrido");
    public static final RegistryObject<SoundEvent> MONO =
            registerSoundEvent("mono");

    public static final RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENT_DEFERRED_REGISTER.register(name, () -> new SoundEvent(new ResourceLocation(SaMod.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus){
        SOUND_EVENT_DEFERRED_REGISTER.register(eventBus);
    }
}
