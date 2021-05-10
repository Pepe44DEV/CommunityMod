package dev.pepe44.communitymod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static dev.pepe44.communitymod.CommunityModConstants.*;
import static net.minecraft.item.Item.getItemById;



@Mod(modid = MODID, name = NAME, version = VERSION)
public class CommunityMod {
    public static Item.ToolMaterial dragon;


    private Minecraft mc = Minecraft.getMinecraft();

    @Mod.Instance
    public static CommunityMod instance;

    public static CommunityMod getInstance() {
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
        dragon = EnumHelper.addToolMaterial("dragonite", 4, 10000, 20.0f, 12, 30);
    }






}
