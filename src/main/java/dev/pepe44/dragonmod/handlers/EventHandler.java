package dev.pepe44.dragonmod.handlers;

import dev.pepe44.dragonmod.entities.EntityNightshade;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;

import static dev.pepe44.dragonmod.init.ObjectsHolder.*;

@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void checkOffhand(TickEvent.PlayerTickEvent e) {
        if (!(e.player.capabilities.isCreativeMode)) {
            if(e.player.getHeldItemOffhand().getItem().equals(dragonRing)){
                e.player.capabilities.allowFlying = true;
            }else {
                e.player.capabilities.allowFlying = false;
                e.player.capabilities.isFlying = false;
            }
        }

    }


    @SubscribeEvent
    public static void checkArmor(TickEvent.PlayerTickEvent e) {
        if (!(e.player.capabilities.isCreativeMode)) {
            if(e.player.inventory.armorItemInSlot(3).getItem().equals(dragonscale_helmet) && e.player.inventory.armorItemInSlot(2).getItem().equals(dragonscale_chestplate) && e.player.inventory.armorItemInSlot(1).getItem().equals(dragonscale_leggings) && e.player.inventory.armorItemInSlot(0).getItem().equals(dragonscale_boots)){
                e.player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 2, false, false));
            }else {
                e.player.removePotionEffect(MobEffects.FIRE_RESISTANCE);
            }
        }

    }


    @SubscribeEvent
    public static void checkPlayerisJumping(TickEvent.PlayerTickEvent e) {
        if (Keyboard.isKeyDown(Keyboard.KEY_SPACE) && e.player.isRiding() && e.player.getRidingEntity() instanceof EntityNightshade) {
            EntityNightshade nightshade = (EntityNightshade) e.player.getRidingEntity();
            nightshade.motionY = 0.7F * 1.0F;
            if (nightshade.moveForward > 0.0F)
            {
                float f = MathHelper.sin(nightshade.rotationYaw * 0.017453292F);
                float f1 = MathHelper.cos(nightshade.rotationYaw * 0.017453292F);
                nightshade.motionX += (double)(-0.4F * f);
                nightshade.motionZ += (double)(0.4F * f1);
            }

        }
    }


}
