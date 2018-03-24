package com.teamisotope.techexpansion.te.render

import com.teamisotope.techexpansion.te.{GlassChamberTE, VacuumPumpTE}
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.block.model.ItemCameraTransforms
import net.minecraft.client.renderer.{GlStateManager, RenderHelper}
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import net.minecraft.item.ItemStack

class SpecialRendererGlassChamber extends TileEntitySpecialRenderer[GlassChamberTE] {


  override def renderTileEntityAt(te: GlassChamberTE, x: Double, y: Double, z: Double, partialTicks: Float, destroyStage: Int): Unit = {
    GlStateManager.pushAttrib()
    GlStateManager.pushMatrix()
    GlStateManager.translate(x, y, z)
    GlStateManager.disableRescaleNormal()
    if (te.getItem != null) {
      val stack: ItemStack = te.getItem
          if (te.rot >= 360.0f) {
            te.rot = 0.0f
          } else {
            RenderHelper.enableStandardItemLighting()
            GlStateManager.enableLighting()
            GlStateManager.pushMatrix()
            GlStateManager.translate(.5, .35, .5)
            GlStateManager.scale(.4f, .4f, .4f)
            GlStateManager.rotate(te.rot, 0.0f, 1.0f, 0.0f)
            Minecraft.getMinecraft.getRenderItem.renderItem(stack, ItemCameraTransforms.TransformType.NONE)
            GlStateManager.popMatrix()
            te.rot += 0.1f
          }
    }
    GlStateManager.popMatrix()
    GlStateManager.popAttrib()
  }

}
