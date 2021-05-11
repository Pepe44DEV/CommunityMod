package dev.pepe44.dragonmod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityNightshade extends EntityHorse {

    public EntityNightshade(World world) {
        super(world);
        //this.noClip = true;
    }

    @Override
    public EntityHorse createChild(EntityAgeable ageable) {
        return new EntityNightshade(world);
    }


    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return super.getHurtSound(source);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

    protected boolean canTriggerWalking()
    {
        return true;
    }
}
