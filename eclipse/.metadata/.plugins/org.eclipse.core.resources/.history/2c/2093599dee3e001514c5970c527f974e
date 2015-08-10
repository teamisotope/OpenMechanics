package com.collabmods.techexpansion;

import com.collabmods.techexpansion.item.TechExpansionItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TechExpansionCrafting {
	public static void init() {
		GameRegistry.addSmelting(TechExpansionBlocks.copperOre, new ItemStack(TechExpansionItems.copperIngot), 1.0F);
		GameRegistry.addSmelting(TechExpansionBlocks.tinOre, new ItemStack(TechExpansionItems.tinIngot), 1.0F);
		GameRegistry.addRecipe(new ItemStack(TechExpansionBlocks.copperBlock), new Object[] {
				"ccc",
				"ccc",
				"ccc", 'c', TechExpansionItems.copperIngot 	
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionBlocks.tinBlock), new Object[] {
				"ttt",
				"ttt",
				"ttt", 't', TechExpansionItems.tinIngot
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.copperIngot, 9), new Object[] {
				"c", 'c', TechExpansionBlocks.copperBlock
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.tinIngot, 9), new Object[] {
				"t", 't', TechExpansionBlocks.tinBlock
		});
	}
}
