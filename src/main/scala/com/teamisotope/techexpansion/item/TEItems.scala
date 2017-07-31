package com.teamisotope.techexpansion.item

import com.teamisotope.techexpansion.TechExpansion
import net.minecraftforge.fml.common.registry.GameRegistry
import com.teamisotope.techexpansion.util._

object TEItems {
  val test_item: TEItem = new TEItem("test_item", TechExpansion.tab_misc, 16)

  def register(): Unit = {
    GameRegistry.register(test_item)
  }

  def renders(): Unit = {
    RenderUtils.register(test_item, "tests")
  }
}
