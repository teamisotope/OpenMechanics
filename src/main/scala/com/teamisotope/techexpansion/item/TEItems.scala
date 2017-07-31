package com.teamisotope.techexpansion.item

import net.minecraft.creativetab.CreativeTabs
import net.minecraftforge.fml.common.registry.GameRegistry
import com.teamisotope.techexpansion.util._

object TEItems {
  val test_item: TEItem = new TEItem("test_item", CreativeTabs.MISC, 16)

  def register(): Unit = {
    GameRegistry.register(test_item)
  }

  def renders(): Unit = {
    RenderUtils.register(test_item)
  }
}
