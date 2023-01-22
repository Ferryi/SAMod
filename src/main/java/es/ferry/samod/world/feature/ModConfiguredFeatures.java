package es.ferry.samod.world.feature;

import com.google.common.base.Suppliers;
import es.ferry.samod.SaMod;
import es.ferry.samod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURE_DEFERRED_REGISTER =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SaMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PLATITA_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PLATITA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,ModBlocks.DEEP_PLATITA_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?,?>> PLATITA_ORE = CONFIGURED_FEATURE_DEFERRED_REGISTER.register("platita_ore",
            () -> new ConfiguredFeature<>(Feature.ORE,new OreConfiguration(OVERWORLD_PLATITA_ORES.get(), 10)));


    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURE_DEFERRED_REGISTER.register(eventBus);
    }
}
