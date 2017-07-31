package com.teamisotope.techexpansion.item

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class TEItem(name: String, tab: CreativeTabs, maxStackSize: Int) extends Item {
  this.setUnlocalizedName(name).setRegistryName(name).setCreativeTab(tab).setMaxStackSize(maxStackSize)
}
