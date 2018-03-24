package com.teamisotope.techexpansion.tab

import com.teamisotope.techexpansion.block.TEBlocks
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

class TabTEBlocks extends CreativeTabs("tab_techexpansion_blocks") {

  @SideOnly(Side.CLIENT)
  @Override
  override def getTabIconItem(): Item = {
    TEBlocks.copper_block.itemblock
  }

}
