package com.terraformersmc.terrestria.biome;

import com.terraformersmc.terrestria.biome.builder.TerrestriaBiome;
import com.terraformersmc.terrestria.init.TerrestriaBiomes;
import com.terraformersmc.terrestria.init.TerrestriaFeatures;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MineshaftFeature;
import net.minecraft.world.gen.feature.MineshaftFeatureConfig;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import static com.terraformersmc.terrestria.biome.builder.DefaultFeature.*;
import static com.terraformersmc.terrestria.biome.builder.DefaultFeature.FROZEN_TOP_LAYER;

public class RainbowRainforestBiomes {
	public static void register() {
		TerrestriaBiomes.RAINBOW_RAINFOREST = TerrestriaBiomes.register("rainbow_rainforest", TerrestriaBiome.builder()
				.configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.JUNGLE)
				.depth(0.4F)
				.scale(0.4F)
				.temperature(0.95F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						JUNGLE_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, JUNGLE_VEGETATION, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.JUNGLE_TEMPLE)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.RAINBOW_EUCALYPTUS_TREE, 5)
				.addTreeFeature(Feature.FANCY_TREE, 5)
				.addTreeFeature(TerrestriaFeatures.RUBBER_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 40, 1, 2))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.OCELOT, 2, 1, 1))
				.build());

		TerrestriaBiomes.RAINBOW_RAINFOREST_MOUNTAINS = TerrestriaBiomes.register("rainbow_rainforest_mountains", TerrestriaBiome.builder()
				.configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.JUNGLE)
				.depth(1.0F)
				.scale(0.5F)
				.temperature(0.95F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						JUNGLE_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, JUNGLE_VEGETATION, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.JUNGLE_TEMPLE)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.RAINBOW_EUCALYPTUS_TREE, 5)
				.addTreeFeature(Feature.FANCY_TREE, 5)
				.addTreeFeature(TerrestriaFeatures.RUBBER_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 40, 1, 2))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.OCELOT, 2, 1, 1))
				.build());

		TerrestriaBiomes.RAINBOW_RAINFOREST_LAKE = TerrestriaBiomes.register("rainbow_rainforest_lake", TerrestriaBiome.builder()
				.configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.JUNGLE)
				.depth(-0.2F)
				.scale(0.0F)
				.temperature(0.95F)
				.downfall(0.9F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, DISKS, DEFAULT_FLOWERS,
						JUNGLE_GRASS, DEFAULT_MUSHROOMS, DEFAULT_VEGETATION, SPRINGS, JUNGLE_VEGETATION, FROZEN_TOP_LAYER)
				.addStructureFeature(Feature.STRONGHOLD)
				.addStructureFeature(Feature.JUNGLE_TEMPLE)
				.addStructureFeature(Feature.MINESHAFT, new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL))
				.addTreeFeature(TerrestriaFeatures.RAINBOW_EUCALYPTUS_TREE, 5)
				.addTreeFeature(Feature.FANCY_TREE, 5)
				.addTreeFeature(TerrestriaFeatures.RUBBER_TREE, 3)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.PARROT, 40, 1, 2))
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.OCELOT, 2, 1, 1))
				.build());
	}
}
