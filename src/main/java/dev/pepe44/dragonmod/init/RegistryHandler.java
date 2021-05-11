package dev.pepe44.dragonmod.init;


import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import dev.pepe44.dragonmod.blocks.BlockFountain;
import dev.pepe44.dragonmod.items.ItemDragonRing;
import dev.pepe44.dragonmod.items.ItemDragonSword;
import dev.pepe44.dragonmod.items.ItemEnderPouch;
import dev.pepe44.dragonmod.items.armor.ArmorDragonScale;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.lwjgl.Sys;

import javax.annotation.Nonnull;

import static dev.pepe44.dragonmod.init.ObjectsHolder.*;
import static net.minecraft.item.Item.*;

@Mod.EventBusSubscriber
public class RegistryHandler {


    @SubscribeEvent
    public static void addBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockFountain().setRegistryName(DragonModConstants.MODID, "fountain").setCreativeTab(DragonMod.creativeTabb));
    }


    @SubscribeEvent
    public static void addItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemEnderPouch().setRegistryName(DragonModConstants.MODID, "enderpouch"));
        event.getRegistry().register(new ItemDragonRing().setRegistryName(DragonModConstants.MODID, "dragonRing"));
        event.getRegistry().register(new ItemBlock(fountain).setRegistryName(DragonModConstants.MODID, "fountain_block"));
        event.getRegistry().register(new ItemDragonSword().setRegistryName(DragonModConstants.MODID, "dragonsword"));
        event.getRegistry().register(new ArmorDragonScale(DragonMod.dragonscale, EntityEquipmentSlot.HEAD).setRegistryName(DragonModConstants.MODID, "dragonscale_helmet"));
        event.getRegistry().register(new ArmorDragonScale(DragonMod.dragonscale, EntityEquipmentSlot.CHEST).setRegistryName(DragonModConstants.MODID, "dragonscale_chestplate"));
        event.getRegistry().register(new ArmorDragonScale(DragonMod.dragonscale, EntityEquipmentSlot.LEGS).setRegistryName(DragonModConstants.MODID, "dragonscale_leggings"));
        event.getRegistry().register(new ArmorDragonScale(DragonMod.dragonscale, EntityEquipmentSlot.FEET).setRegistryName(DragonModConstants.MODID, "dragonscale_boots"));
    }


    @SubscribeEvent
    public static void onRegisterModelsEvent(@Nonnull final ModelRegistryEvent event) {
        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> item.getRegistryName().getNamespace().equals(DragonModConstants.MODID))
                .forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal")));
    }


    @SubscribeEvent
    public static void addRecipes(RegistryEvent.Register<IRecipe> event) {
        //GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(Items.DIAMOND, 1), 10);


    }







}
