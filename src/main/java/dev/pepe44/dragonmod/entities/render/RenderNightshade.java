package dev.pepe44.dragonmod.entities.render;

import dev.pepe44.dragonmod.DragonModConstants;
import dev.pepe44.dragonmod.entities.EntityNightshade;
import dev.pepe44.dragonmod.entities.models.ModelNightshade;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNightshade extends RenderLiving<EntityNightshade> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(DragonModConstants.MODID + ":textures/entity/nightshade.png");

    public RenderNightshade(RenderManager manager) {
        super(manager, new ModelNightshade(), 0.5f);

    }

    @Override
    protected ResourceLocation getEntityTexture(EntityNightshade entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityNightshade entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}
