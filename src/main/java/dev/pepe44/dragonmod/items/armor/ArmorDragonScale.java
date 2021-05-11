package dev.pepe44.dragonmod.items.armor;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ArmorDragonScale  extends ItemArmor {

    public ArmorDragonScale(ArmorMaterial material, EntityEquipmentSlot equipmentSlotIn) {
        super(material, 0, equipmentSlotIn);
        setTranslationKey(DragonModConstants.MODID + ".dragonscalearmor");
        setCreativeTab(DragonMod.creativeTabi);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("dragontime.dragonscale.tooltip"));
    }



}
