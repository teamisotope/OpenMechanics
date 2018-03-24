package com.teamisotope.techexpansion.proxy

import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.item.TEItems
import com.teamisotope.techexpansion.te.GlassChamberTE
import com.teamisotope.techexpansion.te.render.SpecialRendererGlassChamber
import net.minecraftforge.fml.client.registry.ClientRegistry
import net.minecraftforge.fml.common.event._

class ClientProxy extends CommonProxy {

  override def preInit(event: FMLPreInitializationEvent): Unit = {
    super.preInit(event)
    TEItems.renders()
    TEBlocks.renders()
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[GlassChamberTE], new SpecialRendererGlassChamber())
  }

  override def init(event: FMLInitializationEvent): Unit = {
    super.init(event)
  }

  override def postInit(event: FMLPostInitializationEvent): Unit = {
    super.postInit(event)
  }

}
