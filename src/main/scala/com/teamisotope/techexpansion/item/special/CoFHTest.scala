package com.teamisotope.techexpansion.item.special

import java.util

import cofh.api.energy.ItemEnergyContainer
import com.teamisotope.techexpansion.TechExpansion
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.util.{ActionResult, EnumActionResult, EnumHand}
import net.minecraft.world.World

class CoFHTest extends ItemEnergyContainer(1000) {

  this.setRegistryName("cofh_test").setUnlocalizedName("cofh_test").setCreativeTab(TechExpansion.tab_misc).setMaxStackSize(1)

  override def addInformation(stack: ItemStack, playerIn: EntityPlayer, tooltip: util.List[String], advanced: Boolean): Unit = {
    tooltip.add("Energy:" + this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack))
  }

  override def onItemRightClick(stack: ItemStack, world: World, player: EntityPlayer, hand: EnumHand): ActionResult[ItemStack] = {
    this.receiveEnergy(stack, 10, false)
    ActionResult.newResult(EnumActionResult.SUCCESS, stack)
  }

}
