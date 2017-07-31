package com.teamisotope.techexpansion.block

import com.teamisotope.techexpansion.TechExpansion
import com.teamisotope.techexpansion.util.RenderUtils
import net.minecraft.block.material.Material
import net.minecraftforge.fml.common.registry.GameRegistry

object TEBlocks {

  val test_block: TEBlock = new TEBlock(Material.IRON, "test_block", TechExpansion.tab_misc, 3.0F, 20.0F, "pickaxe", 1)

  def register(): Unit = {
    registerBlock(test_block)
  }

  def renders(): Unit = {
    RenderUtils.register(test_block, "tests")
  }

  private def registerBlock(b: TEBlock) {
    GameRegistry.register(b)
    GameRegistry.register(b.itemblock)
  }

}
