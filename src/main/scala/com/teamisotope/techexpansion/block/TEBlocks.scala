package com.teamisotope.techexpansion.block

import com.teamisotope.techexpansion.TechExpansion
import com.teamisotope.techexpansion.util.RenderUtils
import com.teamisotope.techexpansion.world.{EnumDimension, Ore}
import net.minecraft.block.material.Material
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.oredict.OreDictionary

object TEBlocks {

  val copper_ore: TEBlock = new TEBlock(Material.ROCK, "copper_ore", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val ore_copper: Ore = new Ore(copper_ore, 5, 50, 0, 64, EnumDimension.OVERWORLD)
  val tin_ore: TEBlock = new TEBlock(Material.ROCK, "tin_ore", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val ore_tin: Ore = new Ore(tin_ore, 5, 50, 0, 64, EnumDimension.OVERWORLD)
  val aluminum_ore: TEBlock = new TEBlock(Material.ROCK, "aluminum_ore", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val ore_aluminum: Ore = new Ore(aluminum_ore, 5, 50, 0, 64, EnumDimension.OVERWORLD)
  val nickel_ore: TEBlock = new TEBlock(Material.ROCK, "nickel_ore", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val ore_nickel: Ore = new Ore(nickel_ore, 5, 50, 0, 64, EnumDimension.OVERWORLD)
  val silver_ore: TEBlock = new TEBlock(Material.ROCK, "silver_ore", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val ore_silver: Ore = new Ore(silver_ore, 5, 25, 0, 12, EnumDimension.OVERWORLD)
  val lead_ore: TEBlock = new TEBlock(Material.ROCK, "lead_ore", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val ore_lead: Ore = new Ore(lead_ore, 5, 25, 0, 12, EnumDimension.OVERWORLD)

  def register(): Unit = {
    registerBlock(copper_ore)
    OreDictionary.registerOre("oreCopper", copper_ore)
    registerBlock(tin_ore)
    OreDictionary.registerOre("oreTin", tin_ore)
    registerBlock(aluminum_ore)
    OreDictionary.registerOre("oreAluminum", aluminum_ore)
    registerBlock(nickel_ore)
    OreDictionary.registerOre("oreNickel", nickel_ore)
    registerBlock(silver_ore)
    OreDictionary.registerOre("oreSilver", silver_ore)
    registerBlock(lead_ore)
    OreDictionary.registerOre("oreLead", lead_ore)
  }

  def renders(): Unit = {
    RenderUtils.register(copper_ore, "ores")
    RenderUtils.register(tin_ore, "ores")
    RenderUtils.register(aluminum_ore, "ores")
    RenderUtils.register(nickel_ore, "ores")
    RenderUtils.register(silver_ore, "ores")
    RenderUtils.register(lead_ore, "ores")

  }

  private def registerBlock(b: TEBlock) {
    GameRegistry.register(b)
    GameRegistry.register(b.itemblock)
  }

}
