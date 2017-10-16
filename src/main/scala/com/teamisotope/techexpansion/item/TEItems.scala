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

  val gear_template: TEItem = new TEItem("gear_template", TechExpansion.tab_resources, 1)
  val copper_gear: TEItem = new TEItem("copper_gear", TechExpansion.tab_resources, 64)
  val aluminum_gear: TEItem = new TEItem("aluminum_gear", TechExpansion.tab_resources, 64)
  val tin_gear: TEItem = new TEItem("tin_gear", TechExpansion.tab_resources, 64)
  val nickel_gear: TEItem = new TEItem("nickel_gear", TechExpansion.tab_resources, 64)
  val lead_gear: TEItem = new TEItem("lead_gear", TechExpansion.tab_resources, 64)
  val silver_gear: TEItem = new TEItem("silver_gear", TechExpansion.tab_resources, 64)

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

    GameRegistry.register(copper_gear)
    OreDictionary.registerOre("gearCopper", copper_gear)
    GameRegistry.register(aluminum_gear)
    OreDictionary.registerOre("gearAluminum", aluminum_gear)
    GameRegistry.register(tin_gear)
    OreDictionary.registerOre("gearTin", tin_gear)
    GameRegistry.register(nickel_gear)
    OreDictionary.registerOre("gearNickel", nickel_gear)
    GameRegistry.register(lead_gear)
    OreDictionary.registerOre("gearLead", lead_gear)
    GameRegistry.register(silver_gear)
    OreDictionary.registerOre("gearSilver", silver_gear)
    GameRegistry.register(gear_template)

    GameRegistry.register(new CoFHTest())
  }

  def renders(): Unit = {
    RenderUtils.register(copper_ingot, "resources")
    RenderUtils.register(aluminum_ingot, "resources")
    RenderUtils.register(tin_ingot, "resources")
    RenderUtils.register(nickel_ingot, "resources")
    RenderUtils.register(lead_ingot, "resources")
    RenderUtils.register(silver_ingot, "resources")

    RenderUtils.register(copper_gear, "gears")
    RenderUtils.register(aluminum_gear, "gears")
    RenderUtils.register(tin_gear, "gears")
    RenderUtils.register(nickel_gear, "gears")
    RenderUtils.register(lead_gear, "gears")
    RenderUtils.register(silver_gear, "gears")
    RenderUtils.register(gear_template, "gears")
  }
}
