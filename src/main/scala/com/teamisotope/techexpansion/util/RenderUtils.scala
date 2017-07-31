package com.teamisotope.techexpansion.util

import com.teamisotope.techexpansion.block.TEBlock
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.{Item, ItemBlock}
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader


object RenderUtils {

  def register(item: Item, extra: String): Unit = {
    var rl: ResourceLocation = item.getRegistryName()
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(rl.getResourceDomain() + ":" + extra + "/" + rl.getResourcePath(),"inventory"))
  }

  def register(block: TEBlock, extra: String): Unit = {
    val ib: ItemBlock = block.itemblock
    val rl: ResourceLocation = ib.getRegistryName()
    ModelLoader.setCustomModelResourceLocation(ib, 0, new ModelResourceLocation(rl.getResourceDomain() + ":blocks/" + extra + "/" + rl.getResourcePath(), "inventory"))
  }
}
