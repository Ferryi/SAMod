package es.ferry.samod.block;

import es.ferry.samod.SaMod;
import es.ferry.samod.block.custom.RaythunBlock;
import es.ferry.samod.item.ModCreativeModeTab;
import es.ferry.samod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SaMod.MOD_ID);

    public static final RegistryObject<Block> PLATITA_BLOCK = registerBlock("platita_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SAMOD_TAB);

    public static final RegistryObject<Block> PLATITA_ORE = registerBlock("platita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.SAMOD_TAB);

    public static final RegistryObject<Block> DEEP_PLATITA_ORE = registerBlock("deep_platita_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.SAMOD_TAB);

    public static final RegistryObject<Block> RAYTHUN_BLOCK = registerBlock("raythun_block",
            () -> new RaythunBlock(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SAMOD_TAB);


    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                                CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
