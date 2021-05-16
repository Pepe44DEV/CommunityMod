package dev.pepe44.dragonmod.init;

import dev.pepe44.dragonmod.DragonMod;
import dev.pepe44.dragonmod.dimensions.DimensionTheSecretWorld;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {

    public static final DimensionType SECRET_WORLD = DimensionType.register("SECRET_WORLD", "_secret_world", DragonMod.dimId, DimensionTheSecretWorld.class, false);

    public static void init() {
        registerDimensions();
    }

    private static void registerDimensions() {
        DimensionManager.registerDimension(DragonMod.dimId, SECRET_WORLD);
    }

}

