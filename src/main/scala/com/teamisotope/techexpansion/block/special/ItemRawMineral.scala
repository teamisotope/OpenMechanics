package com.teamisotope.techexpansion.block.special

import java.util

import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.mineral.{Mineral, MineralRegistry}
import net.minecraft.client.resources.I18n
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.{ItemBlock, ItemStack}

class ItemRawMineral extends ItemBlock(TEBlocks.raw_mineral) {

  this.setRegistryName(TEBlocks.raw_mineral.getRegistryName)
  this.setUnlocalizedName(TEBlocks.raw_mineral.getUnlocalizedName)
  this.setMaxDamage(0)
  this.setHasSubtypes(true)

  override def addInformation(stack: ItemStack, player: EntityPlayer, tooltip: util.List[String], advanced: Boolean): Unit = {
    var mineral: Mineral = null
    var unlocName: String = ""
    if (MineralRegistry.getMineralById(stack.getMetadata).get != null) {
      mineral = MineralRegistry.getMineralById(stack.getMetadata).get
      unlocName = mineral.getUnlocName
      tooltip.add(I18n.format("techexpansion.mineral.type") + ": " + I18n.format(unlocName+".name"))
      tooltip.add(I18n.format(unlocName+".yield"))
      tooltip.add(I18n.format(unlocName+".desc"))
    } else {
      unlocName = "techexpansion.mineral.unknown"
      tooltip.add(I18n.format(unlocName))
    }


  }

}
