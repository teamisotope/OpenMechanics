package com.teamisotope.techexpansion.item.special

import java.util

import cofh.api.energy.ItemEnergyContainer
import com.teamisotope.techexpansion.TechExpansion
import net.minecraft.client.renderer.ItemMeshDefinition
import net.minecraft.client.renderer.block.model.{ModelBakery, ModelResourceLocation}
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraftforge.client.model.ModelLoader
import org.apache.commons.math3.util.Precision

class BatteryT1 extends ItemEnergyContainer(1000, 1, 1) {

  this.setRegistryName("battery_t1").setUnlocalizedName("battery_t1").setCreativeTab(TechExpansion.tab_misc).setMaxStackSize(1)

  override def addInformation(stack: ItemStack, playerIn: EntityPlayer, tooltip: util.List[String], advanced: Boolean): Unit = {
    tooltip.add("Energy: " + this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack))
  }

  def initModel() : Unit = {
    val l100: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_l100", "inventory")
    val r100: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r100", "inventory")
    val r200: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r200", "inventory")
    val r300: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r300", "inventory")
    val r400: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r400", "inventory")
    val r500: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r500", "inventory")
    val r600: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r600", "inventory")
    val r700: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r700", "inventory")
    val r800: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r800", "inventory")
    val r900: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r900", "inventory")
    val r1000: ModelResourceLocation = new ModelResourceLocation("techexpansion:misc/battery_t1/battery_t1_r1000", "inventory")

    ModelBakery.registerItemVariants(this, l100, r100, r200, r300, r400, r500, r600, r700, r800, r900, r1000)

    ModelLoader.setCustomMeshDefinition(this, new ItemMeshDefinition() {
      override def getModelLocation(stack: ItemStack): ModelResourceLocation = {

        Precision.round(getEnergyStored(stack), -2) match {
          case 100 => r100;
          case 200 => r200;
          case 300 => r300;
          case 400 => r400;
          case 500 => r500;
          case 600 => r600;
          case 700 => r700;
          case 800 => r800;
          case 900 => r900;
          case 1000 => r1000;
          case _ => l100;
        }
      }
    })
  }

}
