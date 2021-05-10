package dev.pepe44.communitymod.items;

import dev.pepe44.communitymod.CommunityMod;
import dev.pepe44.communitymod.CommunityModConstants;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import static dev.pepe44.communitymod.CommunityMod.dragon;


public class ItemDragonSword extends ItemSword {



    public ItemDragonSword() {
        super(dragon);
        setTranslationKey(CommunityModConstants.MODID + ".dragonring");
        setCreativeTab(CommunityMod.creativeTabi);
        setMaxDamage(12);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)

    {

        target.setFire(12);

        stack.damageItem(1, attacker);

        return true;

    }

}
