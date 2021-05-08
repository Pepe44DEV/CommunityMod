package dev.pepe44.communitymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import static dev.pepe44.communitymod.CommunityModConstants.*;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class CommunityMod {

    @Mod.Instance
    public static CommunityMod instance;

    public static CommunityMod getInstance() {
        return instance;
    }

    public static CreativeTabs creativeTabs = new CreativeTabs("commtab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.FLINT_AND_STEEL);
        }
    };

    @Mod.EventHandler
    public void postLoad(FMLPostInitializationEvent e) {

    }



}
