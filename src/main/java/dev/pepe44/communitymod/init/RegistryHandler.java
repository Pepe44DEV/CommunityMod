package dev.pepe44.communitymod.init;


import dev.pepe44.communitymod.CommunityModConstants;
import dev.pepe44.communitymod.items.ItemEnderPouch;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nonnull;

import static dev.pepe44.communitymod.init.ObjectsHolder.*;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void addBlocks(RegistryEvent.Register<Block> event) {
        //event.getRegistry().register(new CarbonBlock().setRegistryName(SurvivalPlusConstants.MODID, "carbonblock").setCreativeTab(SurvivalPlus.creativeTab));
    }


    @SubscribeEvent
    public static void addItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemEnderPouch().setRegistryName(CommunityModConstants.MODID, "enderpouch"));
    }


    @SubscribeEvent
    public static void onRegisterModelsEvent(@Nonnull final ModelRegistryEvent event) {
        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> item.getRegistryName().getNamespace().equals(CommunityModConstants.MODID))
                .forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal")));
    }


    @SubscribeEvent
    public static void addRecipes(RegistryEvent.Register<IRecipe> event) {
        //GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(carbon, 1), 1.5f);


    }




}
