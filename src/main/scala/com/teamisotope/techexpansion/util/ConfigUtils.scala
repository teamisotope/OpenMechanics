package com.teamisotope.techexpansion.util

import com.teamisotope.techexpansion.TechExpansion
import net.minecraftforge.common.config.Configuration


object ConfigUtils {

  private final val CATEGORY_GENERAL: String = "general"

  var testEntry = "default"

  def readConfig(): Unit = {
    val cfg: Configuration = TechExpansion.proxy.config
    try {
      cfg.load()
      initGeneralConfig(cfg)
    } catch {
      case e: Exception => LogUtils.error(s"Error while loading configuration file!\n${e}")
    } finally {
      if (cfg.hasChanged()) {
        cfg.save()
      }
    }
  }

  private def initGeneralConfig(cfg: Configuration): Unit = {
    cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration")
    testEntry = cfg.getString("testEntry", CATEGORY_GENERAL, testEntry, "Set some string value here.")
  }

}
