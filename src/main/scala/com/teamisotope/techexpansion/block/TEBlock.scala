package com.teamisotope.techexpansion.block

import net.minecraft.block._
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemBlock

class TEBlock(mat: Material, name: String, tab: CreativeTabs, hardness: Float, resistance: Float, toolType: String, toolLevel: Int) extends Block(mat) {
  this.setUnlocalizedName(name).setRegistryName(name).setCreativeTab(tab).setHardness(hardness).setResistance(resistance).setHarvestLevel(toolType, toolLevel);
  val itemblock: ItemBlock = new ItemBlock(this)
  itemblock.setRegistryName(name).setUnlocalizedName(name)
}
