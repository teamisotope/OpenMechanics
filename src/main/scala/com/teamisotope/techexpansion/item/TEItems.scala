package com.teamisotope.techexpansion.item

import com.teamisotope.techexpansion.TechExpansion
import com.teamisotope.techexpansion.item.special.CoFHTest
import net.minecraftforge.fml.common.registry.GameRegistry
import com.teamisotope.techexpansion.util._
import net.minecraftforge.oredict.OreDictionary

object TEItems {

  val copper_ingot: TEItem = new TEItem("copper_ingot", TechExpansion.tab_resources, 64)
  val aluminum_ingot: TEItem = new TEItem("aluminum_ingot", TechExpansion.tab_resources, 64)
  val tin_ingot: TEItem = new TEItem("tin_ingot", TechExpansion.tab_resources, 64)
  val nickel_ingot: TEItem = new TEItem("nickel_ingot", TechExpansion.tab_resources, 64)
  val lead_ingot: TEItem = new TEItem("lead_ingot", TechExpansion.tab_resources, 64)
  val silver_ingot: TEItem = new TEItem("silver_ingot", TechExpansion.tab_resources, 64)

  def register(): Unit = {
    GameRegistry.register(copper_ingot)
    OreDictionary.registerOre("ingotCopper", copper_ingot)
    GameRegistry.register(aluminum_ingot)
    OreDictionary.registerOre("ingotAluminum", aluminum_ingot)
    GameRegistry.register(tin_ingot)
    OreDictionary.registerOre("ingotTin", tin_ingot)
    GameRegistry.register(nickel_ingot)
    OreDictionary.registerOre("ingotNickel", nickel_ingot)
    GameRegistry.register(lead_ingot)
    OreDictionary.registerOre("ingotLead", lead_ingot)
    GameRegistry.register(silver_ingot)
    OreDictionary.registerOre("ingotSilver", silver_ingot)
    GameRegistry.register(new CoFHTest())
  }

  def renders(): Unit = {
    RenderUtils.register(copper_ingot, "resources")
    RenderUtils.register(aluminum_ingot, "resources")
    RenderUtils.register(tin_ingot, "resources")
    RenderUtils.register(nickel_ingot, "resources")
    RenderUtils.register(lead_ingot, "resources")
    RenderUtils.register(silver_ingot, "resources")
  }
}
