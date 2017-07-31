package com.teamisotope.techexpansion
import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.item.TEItems
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.Mod._
import net.minecraftforge.fml.common.event._
import com.teamisotope.techexpansion.util._
import com.teamisotope.techexpansion.proxy._
import com.teamisotope.techexpansion.tab.TabTEMisc

@Mod(modid=Ref.MODID,version=Ref.VERSION,modLanguage="scala",name=Ref.NAME,acceptedMinecraftVersions="")
object TechExpansion {

  @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
  var proxy: CommonProxy = null

  val tab_misc: TabTEMisc = new TabTEMisc()

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    proxy.preInit(event)
  }

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    proxy.init(event)
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent): Unit = {
    proxy.postInit(event)
  }


}