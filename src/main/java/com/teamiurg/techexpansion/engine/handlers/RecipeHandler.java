package com.teamiurg.techexpansion.engine.handlers;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.item.TEItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerRecipes() {
		/* ore -> ingot */
		GameRegistry.addSmelting(TEBlocks.copper_ore, new ItemStack(TEItems.copper_ingot), 5.0f);
		GameRegistry.addSmelting(TEBlocks.aluminum_ore, new ItemStack(TEItems.aluminum_ingot), 5.0f);
		GameRegistry.addSmelting(TEBlocks.tin_ore, new ItemStack(TEItems.tin_ingot), 5.0f);
		/* ingot -> block */
		GameRegistry.addRecipe(new ItemStack(TEBlocks.copper_block),
				new Object[] { "ccc", "ccc", "ccc", 'c', TEItems.copper_ingot });
		GameRegistry.addRecipe(new ItemStack(TEBlocks.aluminum_block),
				new Object[] { "aaa", "aaa", "aaa", 'a', TEItems.aluminum_ingot });
		GameRegistry.addRecipe(new ItemStack(TEBlocks.tin_block),
				new Object[] { "ttt", "ttt", "ttt", 't', TEItems.tin_ingot });
		/* block -> ingot */
		GameRegistry.addShapelessRecipe(new ItemStack(TEItems.copper_ingot, 9), new Object[] {TEBlocks.copper_block});
		GameRegistry.addShapelessRecipe(new ItemStack(TEItems.aluminum_ingot, 9), new Object[] {TEBlocks.aluminum_block});
		GameRegistry.addShapelessRecipe(new ItemStack(TEItems.tin_ingot, 9), new Object[] {TEBlocks.tin_block});
	}
}