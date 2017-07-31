package com.teamisotope.techexpansion.world

import java.util.Random

import net.minecraft.world.World
import net.minecraft.world.chunk.{IChunkGenerator, IChunkProvider}
import net.minecraft.world.gen.feature.WorldGenerator
import net.minecraftforge.fml.common.IWorldGenerator

import scala.collection.mutable.ArrayBuffer
class WorldGen() extends IWorldGenerator {

  private def runGenerator(gen: WorldGenerator, world: World, rand: Random, chunk_X: Int, chunk_Z: Int, chancesToSpawn: Int, minHeight: Int, maxHeight: Int): Unit = {
    import net.minecraft.util.math.BlockPos
    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) throw new IllegalArgumentException("Illegal height arguments for world generator.")
    val heightDiff: Int = maxHeight - minHeight + 1
    for (i <- 0 to chancesToSpawn) {
      val x: Int = chunk_X * 16 + rand.nextInt(16)
      val y: Int = minHeight + rand.nextInt(heightDiff)
      val z: Int = chunk_Z * 16 + rand.nextInt(16)
      gen.generate(world, rand, new BlockPos(x,y,z))
    }
  }

  @Override
  override def generate(random: Random, chunkX: Int, chunkZ: Int, world: World, chunkGenerator: IChunkGenerator, chunkProvider: IChunkProvider): Unit = {
    val ores: ArrayBuffer[Ore] = OreRegistry.getOreList()
    for (ore: Ore <- ores) {
      world.provider.getDimension() match {
        case 0 => {
          if (ore.getDimension() == 0) {
            this.runGenerator(ore.getGenerator(), world, random, chunkX, chunkZ, ore.getChances(), ore.getMinHeight(), ore.getMaxHeight())
          }
        }
        case 1 => {
          if (ore.getDimension() == 1) {
            this.runGenerator(ore.getGenerator(), world, random, chunkX, chunkZ, ore.getChances(), ore.getMinHeight(), ore.getMaxHeight())
          }
        }
        case -1 => {
          if (ore.getDimension() == -1) {
            this.runGenerator(ore.getGenerator(), world, random, chunkX, chunkZ, ore.getChances(), ore.getMinHeight(), ore.getMaxHeight())
          }
        }
      }
    }
  }

}
