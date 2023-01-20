package es.ferry.samod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CuboDG extends Item {
    public CuboDG(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            //Dice que DG es un lloron
            outputLinea(player);
            // Poner cooldown
            player.getCooldowns().addCooldown(this,20);
        }

        return super.use(level, player, hand);
    }
    private void outputLinea(Player player){
        player.sendSystemMessage(Component.literal("Este cubo se ha llenado con lagrimas de DG14 jugando al LOL"));
    }
}
