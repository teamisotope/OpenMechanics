package com.teamisotope.techexpansion.block.special

import java.util.Random
import java.lang.Integer

import com.teamisotope.techexpansion.TechExpansion
import com.teamisotope.techexpansion.block.{TEBlock, TEBlocks}
import net.minecraft.block.material.Material
import net.minecraft.block.properties.{IProperty, PropertyInteger}
import net.minecraft.block.state.{BlockStateContainer, IBlockState}
import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.item.EntityItem
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.util.{EnumFacing, EnumHand}
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import com.teamisotope.techexpansion.block.special.RawMaterialProps._

class RawMineral extends TEBlock(Material.ROCK, "raw_mineral", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1) {

  override protected def createBlockState(): BlockStateContainer = {
    new BlockStateContainer(this, MINERAL_TYPE)
  }

  override def getStateFromMeta(meta: Int): IBlockState = {
    getDefaultState.withProperty(MINERAL_TYPE, meta.asInstanceOf[Integer])
  }

  override def getMetaFromState(state: IBlockState): Int = {
    state.getValue(MINERAL_TYPE)
  }

  override def onBlockPlacedBy(world: World, pos: BlockPos, state: IBlockState, placer: EntityLivingBase, stack: ItemStack): Unit = {
    world.setBlockState(pos, state.withProperty(MINERAL_TYPE, stack.getMetadata.asInstanceOf[Integer]))
  }

  override def onBlockActivated(world: World, pos: BlockPos, state: IBlockState, player: EntityPlayer, hand: EnumHand, heldItem: ItemStack, side: EnumFacing, hitX: Float, hitY: Float, hitZ: Float): Boolean = {
    if (!world.isRemote) {
      // TODO: Send message 'Hmm... it looks like _____' if player has magnifying glass in hand
    }
    true
  }

  override def breakBlock(world: World, pos: BlockPos, state: IBlockState): Unit = {
    val stack: ItemStack = new ItemStack(Item.getItemFromBlock(TEBlocks.raw_mineral))
    stack.setItemDamage(this.getMetaFromState(state))
    val item: EntityItem = new EntityItem(world, pos.getX, pos.getY, pos.getZ, stack)
    world.spawnEntityInWorld(item)
  }

}
