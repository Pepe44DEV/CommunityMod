package dev.pepe44.dragonmod.world;

import net.minecraft.world.biome.Biome;

public class biomes {
    public static class BiomeDragonCave extends Biome {
        public BiomeDragonCave() {
            super(new BiomeProperties("Dragon Cave").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled());
        }
    }
}
