package dev.pepe44.dragonmod.util;

import dev.pepe44.dragonmod.entities.EntityNightshade;
import dev.pepe44.dragonmod.entities.render.RenderNightshade;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderHandler {
    @SideOnly(Side.CLIENT)
    public static void registerEntityRenders() {

        RenderingRegistry.registerEntityRenderingHandler(EntityNightshade.class, new IRenderFactory<EntityNightshade>() {
            @Override
            public Render<? super EntityNightshade> createRenderFor(RenderManager manager) {
                return new RenderNightshade(manager);
            }
        });
    }

}
