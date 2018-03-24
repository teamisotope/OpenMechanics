package com.teamisotope.techexpansion.mineral

import scala.collection.mutable

object MineralRegistry {

  private val map: mutable.HashMap[String, Mineral] = new mutable.HashMap[String, Mineral]()

  private val ids: mutable.HashMap[Int, Mineral] = new mutable.HashMap[Int, Mineral]()

  private var currentId: Int = 0

  def registerMineral(mineral: Mineral): Unit = {
    if (!(ids.contains(currentId) && !map.contains(mineral.getRegistryName))) {
      map.put(mineral.getRegistryName, mineral)
      ids.put(currentId, mineral)
      currentId+=1
    }
  }

  def getMineralbyName(name: String): Option[Mineral] = {
    map.get(name)
  }

  def getMineralById(id: Int): Option[Mineral] = {
    ids.get(id)
  }

}
