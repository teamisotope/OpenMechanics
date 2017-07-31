package com.teamisotope.techexpansion.util

import com.teamisotope.techexpansion.TechExpansion
import org.apache.logging.log4j.Level

object LogUtils {

  def info(msg: Any): Unit = {
    TechExpansion.proxy.logger.log(Level.INFO, msg)
  }

  def error(msg: Any): Unit = {
    TechExpansion.proxy.logger.log(Level.ERROR, msg)
  }

  def warn(msg: Any): Unit = {
    TechExpansion.proxy.logger.log(Level.WARN, msg)
  }

  def fatal(msg: Any): Unit = {
    TechExpansion.proxy.logger.log(Level.FATAL, msg)
  }

}
