package dev.pepe44.dragonmod.items.armor;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorDragonScale  extends ItemArmor {

    public ArmorDragonScale(ArmorMaterial material, EntityEquipmentSlot equipmentSlotIn) {
        super(material, 0, equipmentSlotIn);
        setTranslationKey(DragonModConstants.MODID + ".dragonscalearmor");
        setCreativeTab(DragonMod.creativeTabi);
    }



}
