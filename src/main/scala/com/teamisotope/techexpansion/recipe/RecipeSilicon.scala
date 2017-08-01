package com.teamisotope.techexpansion.recipe

import javax.annotation.Nullable

import com.teamisotope.techexpansion.item.TEItems
import net.minecraft.init.{Blocks, Items}
import net.minecraft.inventory.InventoryCrafting
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.item.crafting.IRecipe
import net.minecraft.world.World

class RecipeSilicon extends IRecipe {

  def matches(inv: InventoryCrafting, worldIn: World): Boolean = {
    var flint_and_steel_present: Boolean = false
    var sand_present: Boolean = false
    var valid: Boolean = false
    var invalid: Boolean = false
    if (inv.getSizeInventory() == 9) {
      for (i <- 0 to 8) {
        if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() == Items.FLINT_AND_STEEL) {
          flint_and_steel_present = true
          if (sand_present)
            valid = true
        } else if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() == Item.getItemFromBlock(Blocks.SAND)) {
          if (!sand_present)
            sand_present = true
          else
            invalid = true
          if (flint_and_steel_present)
              valid = true
        } else {
          valid = false
        }
      }
    } else if (inv.getSizeInventory() == 4) {
      for (i <- 0 to 3) {
        if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() == Items.FLINT_AND_STEEL) {
          flint_and_steel_present = true
          if (sand_present)
            valid = true
        } else if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() == Item.getItemFromBlock(Blocks.SAND)) {
          if (!sand_present)
            sand_present = true
          else
            invalid = true
          if (flint_and_steel_present)
            valid = true
        } else {
          valid = false
        }
      }
    }
    if (!valid && flint_and_steel_present && sand_present)
      valid = true
    if (!invalid)
      valid
    else
      false
  }

  @Nullable
  def getCraftingResult(inv: InventoryCrafting): ItemStack = {
    new ItemStack(TEItems.silicon)
  }

  def getRecipeSize: Int = {
    4
  }

  @Nullable
  def getRecipeOutput: ItemStack = {
    new ItemStack(TEItems.silicon)
  }

  def getRemainingItems(inv: InventoryCrafting): Array[ItemStack] = {
    val arr: Array[ItemStack] = new Array[ItemStack](9)
    if (inv.getSizeInventory() == 9) {
      for (i <- 0 to 8) {
        if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() == Items.FLINT_AND_STEEL) {
          val stack: ItemStack = new ItemStack(Items.FLINT_AND_STEEL, 1)
          if (!(inv.getStackInSlot(i).getItemDamage() >= 63)) {
            stack.setItemDamage(inv.getStackInSlot(i).getItemDamage() + 1)
            arr(i) = stack
          }
        }
      }
    } else if (inv.getSizeInventory() == 4) {
      for (i <- 0 to 3) {
        if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() == Items.FLINT_AND_STEEL) {
          val stack: ItemStack = new ItemStack(Items.FLINT_AND_STEEL, 1)
          if (!(inv.getStackInSlot(i).getItemDamage() >= 63)) {
            stack.setItemDamage(inv.getStackInSlot(i).getItemDamage() + 1)
            arr(i) = stack
          }
        }
      }
    }
    arr
  }

}
