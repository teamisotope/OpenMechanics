package com.teamisotope.techexpansion.item

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class TEItem(regName: String, tab: CreativeTabs, maxStackSize: Int) extends Item {
  val name: String = regName
  this.setUnlocalizedName(name).setRegistryName(name).setCreativeTab(tab).setMaxStackSize(maxStackSize)
}
