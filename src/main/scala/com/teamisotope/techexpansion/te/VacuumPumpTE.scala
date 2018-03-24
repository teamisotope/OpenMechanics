package com.teamisotope.techexpansion.te

import com.teamisotope.techexpansion.TechExpansion
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.{EnumParticleTypes, ITickable}
import net.minecraft.util.math.BlockPos

class VacuumPumpTE extends TileEntity with ITickable {

  private var state: Boolean = false
  private var timer: Int = 0

  def toggle(): Unit = {
    state = !state
    markDirty()
  }

  def on(): Unit = {
    state = true
    markDirty()
  }

  def off(): Unit = {
    state = false
    markDirty()
  }

  def getState: Boolean = {
    state
  }

  override def readFromNBT(compound: NBTTagCompound): Unit = {
    super.readFromNBT(compound)
    state = compound.getBoolean("toggled")
  }

  override def writeToNBT(compound: NBTTagCompound): NBTTagCompound = {
    super.writeToNBT(compound)
    compound.setBoolean("toggled", state)
    compound
  }

  override def update(): Unit = {
    if (this.state) {
      if (!worldObj.isRemote) {
        val pos2: BlockPos = new BlockPos(pos.getX, pos.getY + 1, pos.getZ)
        if (worldObj.getTileEntity(pos2) != null && worldObj.getTileEntity(pos2).isInstanceOf[GlassChamberTE]) {
          val chamber: GlassChamberTE = worldObj.getTileEntity(pos2).asInstanceOf[GlassChamberTE]
          if (chamber.getItem != null) {
            if (timer + 1 < 100) {
              timer += 1

            } else {
              if (chamber.getItem.getItem == Items.DIAMOND) {
                chamber.setItem(new ItemStack(Items.EMERALD))
              }

              timer = 0
            }
          }
        }
      }

    }
  }



}
