package dev.pepe44.dragonmod.init;

import dev.pepe44.dragonmod.DragonModConstants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nonnull;

public class ClientRegistry {

    @SubscribeEvent
    public static void onRegisterModelsEvent(@Nonnull final ModelRegistryEvent event) {
        //ModelLoader.setCustomStateMapper(ModBlocks.UMATTER_BLOCK, new StateMap.Builder().ignore(ModBlocks.UMATTER_BLOCK.LEVEL).build());
        //ModelLoader.setCustomStateMapper(ModBlocks.STABILIZER_BLOCK, new StateMap.Builder().ignore(ModBlocks.STABILIZER_BLOCK.LEVEL).build());

        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> item.getRegistryName().getNamespace().equals(DragonModConstants.MODID))
                .forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal")));
    }
}


