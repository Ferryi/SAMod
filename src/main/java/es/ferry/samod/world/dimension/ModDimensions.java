package es.ferry.samod.world.dimension;

import es.ferry.samod.SaMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {


    public static final ResourceKey<Level> SECTOR1_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(SaMod.MOD_ID, "sector1"));
    public static final ResourceKey<DimensionType> SECTOR1_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, SECTOR1_KEY.location());


    public static void register() {
        System.out.println("Registering ModDimensions for " + SaMod.MOD_ID);
    }


}
