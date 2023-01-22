package es.ferry.samod.world.feature;

import es.ferry.samod.SaMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE_DEFERRED_REGISTER =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SaMod.MOD_ID);



    public static final RegistryObject<PlacedFeature> PLATITA_ORE_PLACED = PLACED_FEATURE_DEFERRED_REGISTER.register("platita_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.PLATITA_ORE.getHolder().get(),
                    commonOrePlacemente(7,
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(-120),VerticalAnchor.absolute(120)))));

    public static List<PlacementModifier> orePlacemente(PlacementModifier placementModifier,PlacementModifier placementModifier2){
        return List.of(placementModifier, InSquarePlacement.spread(),placementModifier2, BiomeFilter.biome());

    }
    public static List<PlacementModifier> commonOrePlacemente(int num,PlacementModifier placementModifier){
        return List.of(CountPlacement.of(num),placementModifier);

    }
    public static List<PlacementModifier> rareOrePlacemente(int num,PlacementModifier placementModifier){
        return List.of(RarityFilter.onAverageOnceEvery(num),placementModifier);

    }
    public static void register(IEventBus eventBus){
        PLACED_FEATURE_DEFERRED_REGISTER.register(eventBus);
    }
}
