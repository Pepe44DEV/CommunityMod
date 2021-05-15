package dev.pepe44.dragonmod.items;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import dev.pepe44.dragonmod.util.BookGui;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDragonBook extends Item {
    public ItemDragonBook() {
        setTranslationKey(DragonModConstants.MODID + ".dragonbook");
        setCreativeTab(DragonMod.creativeTabi);
    }
    @SideOnly(Side.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer p, EnumHand hand) {
        if(!(p.isSneaking())) {
            Minecraft.getMinecraft().displayGuiScreen(new BookGui());
        }else {

        }
        return new ActionResult<ItemStack>(EnumActionResult.FAIL, p.getHeldItem(hand));
    }

}
