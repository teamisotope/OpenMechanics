package com.teamiurg.techexpansion.engine.handlers;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import com.teamiurg.techexpansion.block.*;

public class WorldGenerationHandler implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case /* Overworld */ 0:
			this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 20, 0, 64);
			this.runGenerator(this.gen_tin_ore, world, random, chunkX, chunkZ, 22, 0, 64);
			this.runGenerator(this.gen_aluminum_ore, world, random, chunkX, chunkZ, 21, 0, 64);
			break;
		case /* Nether */ -1:
			
			break;
		case /* End */ 1:
			
			break;
		}
	}
	
	private WorldGenerator gen_copper_ore; //Generates Copper Ore (used in Overworld)
	
	private WorldGenerator gen_tin_ore; //Generates Tin Ore (used in Overworld)
	
	private WorldGenerator gen_aluminum_ore; //Generates Aluminum Ore (used in Overworld)
	
	public WorldGenerationHandler() {
		this.gen_copper_ore = new WorldGenMinable(TEBlocks.copper_ore.getDefaultState(), 8);
		this.gen_tin_ore = new WorldGenMinable(TEBlocks.tin_ore.getDefaultState(), 10);
		this.gen_aluminum_ore = new WorldGenMinable(TEBlocks.aluminum_ore.getDefaultState(), 9);
	} 
	
	
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
			if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
				throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
	
	int heightDiff = maxHeight - minHeight + 1;
	for (int i = 0; i < chancesToSpawn; i++) {
		int x = chunk_X * 16 + rand.nextInt(16);
		int y = minHeight + rand.nextInt(heightDiff);
		int z = chunk_Z * 16 + rand.nextInt(16);
		generator.generate(world, rand, new BlockPos(x,y,z));
	}
	}
	

	
}