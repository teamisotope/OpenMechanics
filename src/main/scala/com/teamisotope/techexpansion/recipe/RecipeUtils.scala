package com.teamisotope.techexpansion.util

import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.item.TEItems
import net.minecraft.init.{Blocks, Items}
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.oredict.OreDictionary

object RecipeUtils {

  def init(): Unit = {
    GameRegistry.addSmelting(TEBlocks.copper_ore, new ItemStack(TEItems.copper_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.aluminum_ore, new ItemStack(TEItems.aluminum_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.tin_ore, new ItemStack(TEItems.tin_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.nickel_ore, new ItemStack(TEItems.nickel_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.lead_ore, new ItemStack(TEItems.lead_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.silver_ore, new ItemStack(TEItems.silver_ingot), 3.0F)

    GameRegistry.addRecipe(new ItemStack(TEBlocks.copper_block), "iii", "iii", "iii", 'i'.asInstanceOf[java.lang.Character], TEItems.copper_ingot)
    GameRegistry.addRecipe(new ItemStack(TEBlocks.aluminum_block), "iii", "iii", "iii", 'i'.asInstanceOf[java.lang.Character], TEItems.aluminum_ingot)
    GameRegistry.addRecipe(new ItemStack(TEBlocks.tin_block), "iii", "iii", "iii", 'i'.asInstanceOf[java.lang.Character], TEItems.tin_ingot)
    GameRegistry.addRecipe(new ItemStack(TEBlocks.nickel_block), "iii", "iii", "iii", 'i'.asInstanceOf[java.lang.Character], TEItems.nickel_ingot)
    GameRegistry.addRecipe(new ItemStack(TEBlocks.silver_block), "iii", "iii", "iii", 'i'.asInstanceOf[java.lang.Character], TEItems.silver_ingot)
    GameRegistry.addRecipe(new ItemStack(TEBlocks.lead_block), "iii", "iii", "iii", 'i'.asInstanceOf[java.lang.Character], TEItems.lead_ingot)

    GameRegistry.addShapelessRecipe(new ItemStack(TEItems.copper_ingot, 9), TEBlocks.copper_block)
    GameRegistry.addShapelessRecipe(new ItemStack(TEItems.aluminum_ingot, 9), TEBlocks.aluminum_block)
    GameRegistry.addShapelessRecipe(new ItemStack(TEItems.tin_ingot, 9), TEBlocks.tin_block)
    GameRegistry.addShapelessRecipe(new ItemStack(TEItems.nickel_ingot, 9), TEBlocks.nickel_block)
    GameRegistry.addShapelessRecipe(new ItemStack(TEItems.silver_ingot, 9), TEBlocks.silver_block)
    GameRegistry.addShapelessRecipe(new ItemStack(TEItems.lead_ingot, 9), TEBlocks.lead_block)

    GameRegistry.addRecipe(new ItemStack(TEItems.copper_gear), " i ", "iti", " i ", 'i'.asInstanceOf[java.lang.Character], new ItemStack(TEItems.copper_ingot, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], TEItems.gear_template)
    GameRegistry.addRecipe(new ItemStack(TEItems.aluminum_gear), " i ", "iti", " i ", 'i'.asInstanceOf[java.lang.Character], new ItemStack(TEItems.aluminum_ingot, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], TEItems.gear_template)
    GameRegistry.addRecipe(new ItemStack(TEItems.tin_gear), " i ", "iti", " i ", 'i'.asInstanceOf[java.lang.Character], new ItemStack(TEItems.tin_ingot, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], TEItems.gear_template)
    GameRegistry.addRecipe(new ItemStack(TEItems.nickel_gear), " i ", "iti", " i ", 'i'.asInstanceOf[java.lang.Character], new ItemStack(TEItems.nickel_ingot, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], TEItems.gear_template)
    GameRegistry.addRecipe(new ItemStack(TEItems.silver_gear), " i ", "iti", " i ", 'i'.asInstanceOf[java.lang.Character], new ItemStack(TEItems.silver_ingot, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], TEItems.gear_template)
    GameRegistry.addRecipe(new ItemStack(TEItems.lead_gear), " i ", "iti", " i ", 'i'.asInstanceOf[java.lang.Character], new ItemStack(TEItems.lead_ingot, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], TEItems.gear_template)
    GameRegistry.addRecipe(new ItemStack(TEItems.iron_gear), " i ", "iti", " i ", 'i'.asInstanceOf[java.lang.Character], new ItemStack(Items.IRON_INGOT, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], TEItems.gear_template)
    GameRegistry.addRecipe(new ItemStack(TEItems.gear_template), " s ", "sws", " s ", 's'.asInstanceOf[java.lang.Character], new ItemStack(Items.STICK, 1, OreDictionary.WILDCARD_VALUE), 'w'.asInstanceOf[java.lang.Character], new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE))

    GameRegistry.addRecipe(new ItemStack(TEItems.technicians_hammer), " ti", " st", "s  ", 's'.asInstanceOf[java.lang.Character], new ItemStack(Items.STICK, 1, OreDictionary.WILDCARD_VALUE), 't'.asInstanceOf[java.lang.Character], new ItemStack(TEItems.tin_ingot, 1, OreDictionary.WILDCARD_VALUE), 'i'.asInstanceOf[java.lang.Character], new ItemStack(Items.IRON_INGOT, 1, OreDictionary.WILDCARD_VALUE))
  }

}
