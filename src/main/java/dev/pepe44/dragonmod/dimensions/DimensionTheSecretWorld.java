package dev.pepe44.dragonmod.dimensions;

import dev.pepe44.dragonmod.init.BiomeInit;
import dev.pepe44.dragonmod.init.DimensionInit;
import dev.pepe44.dragonmod.world.generators.ChunkGeneratorDragonCave;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionTheSecretWorld extends WorldProvider {

    public DimensionTheSecretWorld(){
        this.biomeProvider = new BiomeProviderSingle(BiomeInit.DRAGON_CAVE);
        this.hasSkyLight = false;
    }

    @Override
    public DimensionType getDimensionType() {
        return DimensionInit.SECRET_WORLD;
    }

    @Override
    public IChunkGenerator createChunkGenerator(){
        return new ChunkGeneratorDragonCave(world, false, world.getSeed());
    }

    @Override
    public boolean canRespawnHere() {
        return false;
    }

    @Override
    public boolean isSurfaceWorld() {
        return false;
    }
}
