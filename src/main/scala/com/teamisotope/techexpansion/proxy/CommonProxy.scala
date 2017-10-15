package com.teamisotope.techexpansion.proxy

import java.io.File

import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.item.TEItems
import com.teamisotope.techexpansion.util._
import com.teamisotope.techexpansion.world.{OreRegistry, WorldGen}
import net.minecraftforge.common.config.Configuration
import net.minecraftforge.fml.common.event._
import net.minecraftforge.fml.common.registry.GameRegistry
import org.apache.logging.log4j.Logger

class CommonProxy {

  var config: Configuration = null

  var logger: Logger = null

  def preInit(event: FMLPreInitializationEvent): Unit = {
    val dir: File = event.getModConfigurationDirectory()
    logger = event.getModLog()
    config = new Configuration(new File(dir.getPath(),"techexpansion/main.cfg"))
    ConfigUtils.readConfig()
    TEItems.register()
    TEBlocks.register()
    RecipeUtils.init()
    LogUtils.info("Pre-initialization finished.")
  }

  def init(event: FMLInitializationEvent): Unit = {
    GameRegistry.registerWorldGenerator(new WorldGen(), 0)
    OreRegistry.registerOre(TEBlocks.ore_copper)
    OreRegistry.registerOre(TEBlocks.ore_aluminum)
    OreRegistry.registerOre(TEBlocks.ore_lead)
    OreRegistry.registerOre(TEBlocks.ore_nickel)
    OreRegistry.registerOre(TEBlocks.ore_silver)
    OreRegistry.registerOre(TEBlocks.ore_lead)
    LogUtils.info("Initialization finished.")
  }

  def postInit(event: FMLPostInitializationEvent): Unit = {
    if (config.hasChanged())
      config.save()
    LogUtils.info("Post-initialization finished.")
  }

}
