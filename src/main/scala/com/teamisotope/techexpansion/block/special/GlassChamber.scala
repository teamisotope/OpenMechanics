package com.teamisotope.techexpansion.block.special

import com.teamisotope.techexpansion.TechExpansion
import com.teamisotope.techexpansion.block.TEBlock
import com.teamisotope.techexpansion.te.GlassChamberTE
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.block.ITileEntityProvider
import net.minecraft.entity.item.EntityItem
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.{BlockRenderLayer, EnumFacing, EnumHand}
import net.minecraft.util.math.{AxisAlignedBB, BlockPos}
import net.minecraft.world.{IBlockAccess, World}

class GlassChamber extends TEBlock(Material.ROCK, "glass_chamber", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 2) with ITileEntityProvider {

  object props {
    val BB: AxisAlignedBB = new AxisAlignedBB(0.0625 * 2, 0, 0.0625 * 2, 0.0625 * 15, 0.0625 * 11, 0.0625 * 15)
  }

  def createNewTileEntity(world: World, meta: Int) : TileEntity = {
    new GlassChamberTE()
  }
  private def getTE(world: World, pos: BlockPos): GlassChamberTE = {
    world.getTileEntity(pos).asInstanceOf[GlassChamberTE]
  }

  override def onBlockActivated(world: World, pos: BlockPos, state: IBlockState, player: EntityPlayer, hand: EnumHand, heldItem: ItemStack, side: EnumFacing, hitX: Float, hitY: Float, hitZ: Float): Boolean = {
    if (!world.isRemote) {
      val te: GlassChamberTE = getTE(world, pos)
      if (te.getItem != null) {
        val i: ItemStack = te.getItem
        te.setItem(null)
        world.spawnEntityInWorld(new EntityItem(world, pos.getX(),pos.getY+1.5,pos.getZ(),i))
      } else if (heldItem != null) {
        if (te.insertItem(heldItem)) {
          if (heldItem.stackSize-1 != 0) {
            val tmp: ItemStack = heldItem.copy()
            tmp.stackSize -= 1
            player.setHeldItem(hand, tmp)
          } else if (heldItem.stackSize-1 == 0) {
            player.setHeldItem(hand, null)
          }
        } else {
          return true
        }
      }

    }
    true
  }

  override def breakBlock(world: World, pos: BlockPos, state: IBlockState): Unit = {
    val te: GlassChamberTE = getTE(world, pos)
    if (te.getItem != null) {
      val i: ItemStack = te.getItem
      te.setItem(null)
      world.spawnEntityInWorld(new EntityItem(world, pos.getX(), pos.getY + 1.5, pos.getZ(), i))
    }
  }

  override def isFullCube(state: IBlockState): Boolean = {
    false
  }

  override def isOpaqueCube(state: IBlockState): Boolean = {
    false
  }

  override def getBlockLayer: BlockRenderLayer = {
    BlockRenderLayer.TRANSLUCENT
  }

  override def getBoundingBox(state: IBlockState, source: IBlockAccess, pos: BlockPos): AxisAlignedBB = {
    props.BB
  }

  override def getCollisionBoundingBox(blockState: IBlockState, worldIn: World, pos: BlockPos): AxisAlignedBB = {
    props.BB
  }
}
