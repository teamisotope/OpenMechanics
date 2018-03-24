package com.teamisotope.techexpansion.block.special

import java.util
import java.util.Random

import com.teamisotope.techexpansion.TechExpansion
import com.teamisotope.techexpansion.block.TEBlock
import com.teamisotope.techexpansion.te.{GlassChamberTE, VacuumPumpTE}
import net.minecraft.block.material.Material
import net.minecraft.block.properties.{PropertyBool, PropertyDirection}
import net.minecraft.block.state.{BlockStateContainer, IBlockState}
import net.minecraft.block.{Block, ITileEntityProvider}
import net.minecraft.client.renderer.ItemMeshDefinition
import net.minecraft.client.renderer.block.model.{ModelBakery, ModelResourceLocation}
import net.minecraft.client.resources.I18n
import net.minecraft.entity.{Entity, EntityLivingBase}
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.{Blocks, Items}
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.{BlockRenderLayer, EnumFacing, EnumHand}
import net.minecraft.util.math.{AxisAlignedBB, BlockPos}
import net.minecraft.util.text.{TextComponentString, TextFormatting}
import net.minecraft.world.{IBlockAccess, World}

class VacuumPump extends TEBlock(Material.ROCK, "vacuum_pump", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 2) with ITileEntityProvider {
  object props {
    val FACING: PropertyDirection = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL)
  }
  def createNewTileEntity(world: World, meta: Int) : TileEntity = {
    new VacuumPumpTE()
  }
  private def getTE(world: World, pos: BlockPos): VacuumPumpTE = {
    world.getTileEntity(pos).asInstanceOf[VacuumPumpTE]
  }

  override def onBlockActivated(world: World, pos: BlockPos, state: IBlockState, player: EntityPlayer, hand: EnumHand, heldItem: ItemStack, side: EnumFacing, hitX: Float, hitY: Float, hitZ: Float): Boolean = {
    if (!world.isRemote) {
      val pos2: BlockPos = new BlockPos(pos.getX,pos.getY+1,pos.getZ)
      if (world.getTileEntity(pos2) != null && world.getTileEntity(pos2).isInstanceOf[GlassChamberTE]) {
        var str: String = ""
        getTE(world,pos).toggle()
        getTE(world,pos).getState match {
          case true => str = I18n.format("techexpansion.general.on");
          case false => str = I18n.format("techexpansion.general.on");
        }
        player.addChatComponentMessage(new TextComponentString(TextFormatting.GREEN + I18n.format("techexpansion.vacuum_pump.info") + " " + str + "."))
      } else {
        player.addChatComponentMessage(new TextComponentString(TextFormatting.RED + I18n.format("techexpansion.vacuum_pump.error") + " (x,y,z) ["+pos2.getX+","+pos2.getY+","+pos2.getZ+"]."))
      }
    }
    true
  }

  override def onBlockPlacedBy(world: World, pos: BlockPos, state: IBlockState, placer: EntityLivingBase, stack: ItemStack): Unit = {
    world.setBlockState(pos, state.withProperty(props.FACING, placer.getHorizontalFacing.getOpposite), 2)
  }

  override def getStateFromMeta(meta: Int): IBlockState = {
    getDefaultState.withProperty(props.FACING, EnumFacing.getFront((meta & 3) + 2))
  }

  override def getMetaFromState(state: IBlockState): Int = {
    state.getValue(props.FACING).getIndex-2
  }

  override protected def createBlockState(): BlockStateContainer = {
    new BlockStateContainer(this, props.FACING)
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


}
