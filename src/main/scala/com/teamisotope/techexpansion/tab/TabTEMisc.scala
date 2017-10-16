package com.teamisotope.techexpansion.tab

import com.teamisotope.techexpansion.item.TEItems
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Items
import net.minecraft.item.Item
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class TabTEMisc extends CreativeTabs("tab_techexpansion_misc") {

  @SideOnly(Side.CLIENT)
  @Override
  override def getTabIconItem(): Item = {
    TEItems.technicians_hammer
  }

}
