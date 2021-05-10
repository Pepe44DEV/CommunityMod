package dev.pepe44.dragonmod.util;

import dev.pepe44.dragonmod.entities.EntityNightshade;
import dev.pepe44.dragonmod.entities.render.RenderNightshade;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {

        RenderingRegistry.registerEntityRenderingHandler(EntityNightshade.class, new IRenderFactory<EntityNightshade>() {
            @Override
            public Render<? super EntityNightshade> createRenderFor(RenderManager manager) {
                return new RenderNightshade(manager);
            }
        });
    }

}
