package com.teamisotope.techexpansion.te

import net.minecraft.block.state.IBlockState
import net.minecraftforge.items.ItemStackHandler
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.Blocks
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.util.EnumFacing
import net.minecraft.util.math.BlockPos
import net.minecraftforge.common.capabilities.Capability
import net.minecraftforge.items.CapabilityItemHandler

class GlassChamberTE extends TileEntity {

  val SIZE = 1
  var rot: Float = 0.0f

  private val itemStackHandler = new ItemStackHandler(SIZE) {
    override protected def onContentsChanged(slot: Int): Unit = {
      GlassChamberTE.this.markDirty()
      val state: IBlockState = worldObj.getBlockState(getPos)
      worldObj.notifyBlockUpdate(getPos, state, state, 3)
    }
  }

  override def readFromNBT(compound: NBTTagCompound): Unit = {
    super.readFromNBT(compound)
    if (compound.hasKey("items")) itemStackHandler.deserializeNBT(compound.getTag("items").asInstanceOf[NBTTagCompound])
  }

  override def writeToNBT(compound: NBTTagCompound): NBTTagCompound = {
    super.writeToNBT(compound)
    compound.setTag("items", itemStackHandler.serializeNBT)
    compound
  }

  def canInteractWith(playerIn: EntityPlayer): Boolean = {
    !isInvalid && playerIn.getDistanceSq(pos.add(0.5D, 0.5D, 0.5D)) <= 64D
  }

  override def hasCapability(capability: Capability[_], facing: EnumFacing): Boolean = {
    if (capability eq CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true
    super.hasCapability(capability, facing)
  }

  override def getCapability[T](capability: Capability[T], facing: EnumFacing): T = {
    if (capability eq CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return itemStackHandler.asInstanceOf[T]
    super.getCapability(capability, facing)
  }

  def insertItem(i: ItemStack): Boolean = {
    if (itemStackHandler.getStackInSlot(0) == null) {
      val tmp: ItemStack = i.copy()
      tmp.stackSize = 1
      itemStackHandler.setStackInSlot(0, tmp)
      markDirty()
      true
    } else {
      false
    }
  }

  def removeItem(): ItemStack = {
    if (itemStackHandler.getStackInSlot(0) != null) {
      val i: ItemStack = itemStackHandler.getStackInSlot(0)
      itemStackHandler.setStackInSlot(0, null)
      markDirty()
      i

    } else {
      null
    }

  }

  def getItem: ItemStack = {
    if (itemStackHandler.getStackInSlot(0) != null) {
      itemStackHandler.getStackInSlot(0)
    } else {
      null
    }
  }

  def setItem(i: ItemStack): Unit = {
    itemStackHandler.setStackInSlot(0, i)
    markDirty()
  }

  import net.minecraft.nbt.NBTTagCompound
  import net.minecraft.network.NetworkManager
  import net.minecraft.network.play.server.SPacketUpdateTileEntity

  override def getUpdateTag: NBTTagCompound = { // getUpdateTag() is called whenever the chunkdata is sent to the
    // client. In contrast getUpdatePacket() is called when the tile entity
    // itself wants to sync to the client. In many cases you want to send
    // over the same information in getUpdateTag() as in getUpdatePacket().
    writeToNBT(new NBTTagCompound)
  }

  override def getUpdatePacket: SPacketUpdateTileEntity = { // Prepare a packet for syncing our TE to the client. Since we only have to sync the stack
    // and that's all we have we just write our entire NBT here. If you have a complex
    // tile entity that doesn't need to have all information on the client you can write
    // a more optimal NBT here.
    val nbtTag = new NBTTagCompound
    this.writeToNBT(nbtTag)
    new SPacketUpdateTileEntity(getPos, 1, nbtTag)
  }

  override def onDataPacket(net: NetworkManager, packet: SPacketUpdateTileEntity): Unit = { // Here we get the packet from the server and read it into our client side tile entity
    this.readFromNBT(packet.getNbtCompound)
  }




}
