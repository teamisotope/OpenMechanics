package com.teamisotope.techexpansion.block.special

import java.util

import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.mineral.{Mineral, MineralRegistry}
import net.minecraft.client.renderer.ItemMeshDefinition
import net.minecraft.client.renderer.block.model.{ModelBakery, ModelResourceLocation}
import net.minecraft.client.resources.I18n
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.{Item, ItemBlock, ItemStack}
import net.minecraftforge.client.model.ModelLoader
import org.apache.commons.math3.util.Precision

class ItemRawMineral extends ItemBlock(TEBlocks.raw_mineral) {

  this.setRegistryName(TEBlocks.raw_mineral.getRegistryName)
  this.setUnlocalizedName(TEBlocks.raw_mineral.getUnlocalizedName)
  this.setMaxDamage(0)
  this.setHasSubtypes(true)

  override def getSubItems(itemIn: Item, tab: CreativeTabs, subItems: util.List[ItemStack]): Unit = {
    for (i <- 0 to 6 ) {
      subItems.add(i, new ItemStack(this, 1, i))
    }
  }

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

  def initModel() : Unit = {
    val galena: ModelResourceLocation = new ModelResourceLocation("techexpansion:blocks/ores/galena", "inventory")
    val native_silver: ModelResourceLocation = new ModelResourceLocation("techexpansion:blocks/ores/native_silver", "inventory")
    val tetrataenite: ModelResourceLocation = new ModelResourceLocation("techexpansion:blocks/ores/tetrataenite", "inventory")
    val bauxite: ModelResourceLocation = new ModelResourceLocation("techexpansion:blocks/ores/bauxite", "inventory")
    val cassiterite: ModelResourceLocation = new ModelResourceLocation("techexpansion:blocks/ores/cassiterite", "inventory")
    val native_gold: ModelResourceLocation = new ModelResourceLocation("minecraft:gold_ore", "inventory")
    val native_copper: ModelResourceLocation = new ModelResourceLocation("techexpansion:blocks/ores/native_copper", "inventory")
    val undefined: ModelResourceLocation = new ModelResourceLocation("minecraft:missing", "inventory")


    ModelBakery.registerItemVariants(this, galena, native_silver, tetrataenite, bauxite, cassiterite, native_gold, native_copper, undefined)

    ModelLoader.setCustomMeshDefinition(this, new ItemMeshDefinition() {
      override def getModelLocation(stack: ItemStack): ModelResourceLocation = {

        stack.getMetadata match {
          case 0 => galena;
          case 1 => native_silver;
          case 2 => tetrataenite;
          case 3 => bauxite;
          case 4 => cassiterite;
          case 5 => native_gold;
          case 6 => native_copper;
          case _ => undefined;
        }
      }
    })
  }

}
