package dev.pepe44.dragonmod.init;

import dev.pepe44.dragonmod.world.biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;



public class BiomeInit {
    public static final Biome DRAGON_CAVE = new biomes.BiomeDragonCave();
;
   public static void registerBiomes() {
        initBiome(DRAGON_CAVE, "Dragon Cave", BiomeType.COOL, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SPOOKY, BiomeDictionary.Type.DRY) ;
   }


    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, BiomeDictionary.Type... types) {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }

}