package com.teamisotope.techexpansion.util

import com.teamisotope.techexpansion.block.TEBlocks
import com.teamisotope.techexpansion.item.TEItems
import com.teamisotope.techexpansion.recipe.RecipeSilicon
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.oredict.OreDictionary

object RecipeUtils {

  def init(): Unit = {
    GameRegistry.addRecipe(new RecipeSilicon())
    GameRegistry.addSmelting(TEBlocks.copper_ore, new ItemStack(TEItems.copper_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.aluminum_ore, new ItemStack(TEItems.aluminum_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.tin_ore, new ItemStack(TEItems.tin_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.nickel_ore, new ItemStack(TEItems.nickel_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.lead_ore, new ItemStack(TEItems.lead_ingot), 3.0F)
    GameRegistry.addSmelting(TEBlocks.silver_ore, new ItemStack(TEItems.silver_ingot), 3.0F)
  }

}
