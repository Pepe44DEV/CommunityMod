package dev.pepe44.communitymod.items;

import dev.pepe44.communitymod.CommunityMod;
import dev.pepe44.communitymod.CommunityModConstants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DragonRing extends Item {

    public DragonRing(World worldIn, EntityPlayer p) {
        setTranslationKey(CommunityModConstants.MODID + ".dragonring");
        setCreativeTab(CommunityMod.creativeTabs);

        ItemStack ring = new ItemStack()


        if(p.inventory.hasItemStack())

    }




}
