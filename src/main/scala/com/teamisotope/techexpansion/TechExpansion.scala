package com.teamisotope.techexpansion
import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.item.TEItems
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import net.minecraftforge.fml.common.Mod._
import net.minecraftforge.fml.common.event._
import com.teamisotope.techexpansion.util._
import com.teamisotope.techexpansion.proxy._
import com.teamisotope.techexpansion.tab._

@Mod(modid=Ref.MODID,version=Ref.VERSION,modLanguage="scala",name=Ref.NAME,acceptedMinecraftVersions="1.10.2",dependencies="required-after:cofhcore@4.1.12.17")
object TechExpansion {

  @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
  var proxy: CommonProxy = null

  /* Tabs have temporary icons, until I have created the actual items that would represent them */
  val tab_misc: TabTEMisc = new TabTEMisc()
  val tab_equipment: TabTEEquipment = new TabTEEquipment()
  val tab_blocks: TabTEBlocks = new TabTEBlocks()
  val tab_resources: TabTEResources = new TabTEResources()

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