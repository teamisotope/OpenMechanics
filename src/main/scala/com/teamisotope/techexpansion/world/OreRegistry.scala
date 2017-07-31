package com.teamisotope.techexpansion.world

import com.teamisotope.techexpansion.block.TEBlock

import scala.collection.mutable.ArrayBuffer

object OreRegistry {

  private val ores: ArrayBuffer[Ore] = new ArrayBuffer[Ore]()

  def registerOre(ore: Ore): Unit = {
    ores.append(ore)
  }

  def registerOre(block: TEBlock, veinSize: Int, chancesToSpawn: Int, minHeight: Int, maxHeight: Int, dimension: Int, name: String): Unit = {
    val ore: Ore = new Ore(block, veinSize, chancesToSpawn, minHeight, maxHeight, dimension, name)
    ores.append(ore)
  }

  def getOreList(): ArrayBuffer[Ore] = {
    return ores
  }

}
