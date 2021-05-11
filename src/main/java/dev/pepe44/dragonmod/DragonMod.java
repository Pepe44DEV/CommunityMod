package dev.pepe44.dragonmod;

import dev.pepe44.dragonmod.init.EntityInit;
import dev.pepe44.dragonmod.util.RenderHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static dev.pepe44.dragonmod.DragonModConstants.*;


@Mod(modid = MODID, name = NAME, version = VERSION)
public class DragonMod {
    public static Item.ToolMaterial dragon;
    public static ItemArmor.ArmorMaterial dragonscale;


    private Minecraft mc = Minecraft.getMinecraft();

    @Mod.Instance
    public static DragonMod instance;

    public static DragonMod getInstance() {
        return instance;
    }

    public static CreativeTabs creativeTabi= new CreativeTabs("commtabi") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.FLINT_AND_STEEL);
        }
    };
    public static CreativeTabs creativeTabb = new CreativeTabs("commtabb") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.COMMAND_BLOCK_MINECART);
        }
    };

    @Mod.EventHandler
    public void postLoad(FMLPostInitializationEvent e) {

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        dragon = EnumHelper.addToolMaterial("dragonite", 4, 10000, 20.0f, 12, 30);
        dragonscale = EnumHelper.addArmorMaterial(MODID + ":textures/models/armor/dragonscale", MODID + ":" + "dragon_scales",1000, new int[]{4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 12.0f);
    }






}
