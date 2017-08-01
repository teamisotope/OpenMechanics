package com.teamisotope.techexpansion.tab

import com.teamisotope.techexpansion.item.TEItems
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class TabTEResources extends CreativeTabs("tab_techexpansion_resources") {

  @SideOnly(Side.CLIENT)
  @Override
  override def getTabIconItem(): Item = {
    TEItems.copper_ingot
  }

}
