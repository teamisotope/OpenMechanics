package com.teamisotope.techexpansion.util

import com.teamisotope.techexpansion.item.TEItem
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader


object RenderUtils {

  def register(item: Item): Unit = {
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().getResourceDomain() + ":" + item.getRegistryName().getResourcePath(),"inventory"))
  }

  /*def register(block: TEBlock): Unit = {
    ModelLoader.setCustomModelResourceLocation(block.itemblock, 0, new ModelResourceLocation(Ref.MODID + ":" + block.itemblock.name, "inventory"))
  } temporarily disabled, blocks not done yet */

}
