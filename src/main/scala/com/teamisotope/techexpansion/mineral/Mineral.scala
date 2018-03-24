package com.teamisotope.techexpansion.mineral

class Mineral() {

  private var unlocName: String = ""

  def setUnlocName(value: String): Mineral = { unlocName = value; this }

  def getUnlocName: String = unlocName

  private var registryName: String = ""

  def setRegistryName(value: String): Mineral = { registryName = value; this }

  def getRegistryName: String = registryName

}
