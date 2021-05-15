package dev.pepe44.dragonmod.items;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.property.Properties;

import javax.annotation.Nullable;

public class ItemBackpack extends Item {
    public ItemBackpack (){
        setTranslationKey(DragonModConstants.MODID + ".backpack");
        setCreativeTab(DragonMod.creativeTabi);

    }
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer p, EnumHand hand) {
        if(!(p.isSneaking())) {

        }
        else{

        }

        return new ActionResult<ItemStack>(EnumActionResult.FAIL, p.getHeldItem(hand));
    }


}
