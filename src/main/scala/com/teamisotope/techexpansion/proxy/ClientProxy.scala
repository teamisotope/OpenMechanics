package com.teamisotope.techexpansion.proxy

import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.item.TEItems
import net.minecraftforge.fml.common.event._

class ClientProxy extends CommonProxy {

  override def preInit(event: FMLPreInitializationEvent): Unit = {
    TEItems.renders()
    TEBlocks.renders()
  }

  override def init(event: FMLInitializationEvent): Unit = {

  }

  override def postInit(event: FMLPostInitializationEvent): Unit = {

  }

}
