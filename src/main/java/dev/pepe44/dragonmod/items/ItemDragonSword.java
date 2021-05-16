package dev.pepe44.dragonmod.items;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

import static dev.pepe44.dragonmod.DragonMod.dragon;


public class ItemDragonSword extends ItemSword {

    public ItemDragonSword() {
        this(dragon);
        //super(dragon);
        setTranslationKey(DragonModConstants.MODID + ".dragonsword");
        setCreativeTab(DragonMod.creativeTabi);
        setMaxDamage(100);

    }
    public ActionResult<ItemStack> onItemRightClick (World world, EntityPlayer p, EnumHand hand){

        if ((p.isSneaking())){
            world.createExplosion(p, p.getPosition().getX(), p.getPosition().getY(), p.getPosition().getZ(), 4.0F, true);
            //p.attackEntityFrom(DamageSource.DROWN,20);
        }
        return new ActionResult<ItemStack>(EnumActionResult.FAIL, p.getHeldItem(hand));

    }

    public ItemDragonSword(ToolMaterial material) {
        super(material);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("dragontime.dragonsword.tooltip"));
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)

    {

        target.setFire(12);

        stack.damageItem(1, attacker);

        return true;

    }

}
