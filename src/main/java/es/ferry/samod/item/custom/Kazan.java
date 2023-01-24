package es.ferry.samod.item.custom;


import es.ferry.samod.sound.ModSounds;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Kazan extends Item {
    public Kazan(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        //Poner cooldown
        player.getCooldowns().addCooldown(this,20);
        // SOY EL MEJOR DE LA SALA
        sound(player);

        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()){
            components.add(Component.literal("Dale al Click derecho para saber que es esto").withStyle(ChatFormatting.YELLOW));
        }else{
            components.add(Component.literal("Dale al shift para mas info").withStyle(ChatFormatting.BLUE));
        }

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }

    private void sound(Player player){
        player.playSound(ModSounds.KAZAN_SOUND.get(), 1.0F, 1.0F);
    }
}


