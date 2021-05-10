package dev.pepe44.dragonmod.init;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.DragonModConstants;
import dev.pepe44.dragonmod.entities.EntityNightshade;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities() {
        registerEntity("nightshade", EntityNightshade.class, DragonModConstants.ENTITY_NIGHTSHADE, 50, 1117457, 000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(DragonModConstants.MODID + ":" + name),entity, name, id, DragonMod.instance, range, 1, true, color1, color2);
    }

}
