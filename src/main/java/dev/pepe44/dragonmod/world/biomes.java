package dev.pepe44.dragonmod.world;

import dev.pepe44.dragonmod.entities.EntityNightshade;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class biomes {
    public static class BiomeDragonCave extends Biome {
        public BiomeDragonCave() {
            super(new BiomeProperties("DragonCave").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled());
            topBlock = Blocks.GRASS.getDefaultState();
            fillerBlock = Blocks.STONE.getDefaultState();

            this.spawnableCaveCreatureList.clear();
            this.spawnableCreatureList.clear();
            this.spawnableMonsterList.clear();
            this.spawnableWaterCreatureList.clear();

            this.spawnableCreatureList.add(new SpawnListEntry(EntityNightshade.class, 5, 1, 5));
        }
    }
}
