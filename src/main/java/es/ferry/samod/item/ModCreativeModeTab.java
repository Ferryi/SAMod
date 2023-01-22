package es.ferry.samod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SAMOD_TAB = new CreativeModeTab("samodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLATITA.get());
        }
    };
}
