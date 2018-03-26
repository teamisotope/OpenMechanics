package com.teamisotope.techexpansion.world

import com.teamisotope.techexpansion.block.TEBlock
import net.minecraft.world.gen.feature.{WorldGenMinable, WorldGenerator}
class Ore(block: TEBlock, veinSize: Int, chancesToSpawn: Int, minHeight: Int, maxHeight: Int, dimension: Int) {

  private val generator: WorldGenerator = new WorldGenMinable(block.getDefaultState(), veinSize)
  val this.chancesToSpawn: Int = chancesToSpawn
  val this.minHeight: Int = minHeight
  val this.maxHeight: Int = maxHeight
  val this.dimension: Int = dimension
  def getChances(): Int = {
    this.chancesToSpawn
  }
  def getMinHeight(): Int = {
    this.minHeight
  }
  def getMaxHeight(): Int = {
    this.maxHeight
  }
  def getDimension(): Int = {
    this.dimension
  }
  def getGenerator(): WorldGenerator = {
    generator
  }
}