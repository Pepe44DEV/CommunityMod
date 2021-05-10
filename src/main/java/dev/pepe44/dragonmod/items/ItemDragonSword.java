package dev.pepe44.dragonmod.items;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import static dev.pepe44.dragonmod.DragonMod.dragon;


public class ItemDragonSword extends ItemSword {



    public ItemDragonSword() {
        super(dragon);
        setTranslationKey(DragonModConstants.MODID + ".dragonsword");
        setCreativeTab(DragonMod.creativeTabi);
        setMaxDamage(100);

    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)

    {

        target.setFire(12);

        stack.damageItem(1, attacker);

        return true;

    }

}
