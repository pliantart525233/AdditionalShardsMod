package net.pliant.additional_shards.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class instantHealthEffectItem extends Item {

    public instantHealthEffectItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide()){
            ItemStack itemstack = player.getItemInHand(hand);
            if (!player.getAbilities().instabuild) {
                itemstack.shrink(1);
            }
            player.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 0));
            player.getCooldowns().addCooldown(this, 20);
            level.playSound((Player)null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.AMETHYST_BLOCK_PLACE, SoundSource.NEUTRAL, 0.8F, 0.9F / (level.getRandom().nextFloat() * 0.4F + 0.8F));

        }
        return super.use(level, player, hand);
    }
}
