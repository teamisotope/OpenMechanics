package com.teamisotope.techexpansion.mineral

import scala.collection.mutable

object MineralRegistry {

  private val map: mutable.HashMap[String, Mineral] = new mutable.HashMap[String, Mineral]()

  private val ids: mutable.HashMap[Int, Mineral] = new mutable.HashMap[Int, Mineral]()

  private var currentId: Int = -1

  def registerMineral(mineral: Mineral): Unit = {
    if (!(ids.contains(currentId+1) && map.contains(mineral.getRegistryName))) {
      currentId+=1
      map.put(mineral.getRegistryName, mineral)
      ids.put(currentId, mineral)
    }
  }

  def getMineralbyName(name: String): Option[Mineral] = {
    map.get(name)
  }

  def getMineralById(id: Int): Option[Mineral] = {
    ids.get(id)
  }

}
