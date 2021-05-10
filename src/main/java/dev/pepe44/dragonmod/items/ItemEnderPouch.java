package dev.pepe44.dragonmod.items;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemEnderPouch extends Item {

    public ItemEnderPouch() {
        setTranslationKey(DragonModConstants.MODID + ".enderpouch");
        setCreativeTab(DragonMod.creativeTabi);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer p, EnumHand hand) {
        InventoryEnderChest inventoryEnderChest = p.getInventoryEnderChest();
        if(!(p.isSneaking())) {
            p.displayGUIChest(inventoryEnderChest);
            p.playSound(SoundEvents.ENTITY_ENDERMEN_TELEPORT, 1, 0);
        }else {

        }
            return new ActionResult<ItemStack>(EnumActionResult.FAIL, p.getHeldItem(hand));
    }



}
