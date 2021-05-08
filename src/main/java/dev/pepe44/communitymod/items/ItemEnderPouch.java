package dev.pepe44.communitymod.items;

import dev.pepe44.communitymod.CommunityMod;
import dev.pepe44.communitymod.CommunityModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemEnderPouch extends Item {

    public ItemEnderPouch() {
        setTranslationKey(CommunityModConstants.MODID + ".enderpouch");
        setCreativeTab(CommunityMod.creativeTabs);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer p, EnumHand hand) {
        InventoryEnderChest inventoryEnderChest = p.getInventoryEnderChest();
        if(!(p.isSneaking())) {
            p.displayGUIChest(inventoryEnderChest);
        }else {

        }
            return new ActionResult<ItemStack>(EnumActionResult.FAIL, p.getHeldItem(hand));
    }



}
