package com.collabmods.techexpansion;

import com.collabmods.techexpansion.item.TechExpansionItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TechExpansionCrafting {
	public static void init() {
		
		//smelting
		GameRegistry.addSmelting(TechExpansionBlocks.copperOre, new ItemStack(TechExpansionItems.copperIngot), 1.0F);
		GameRegistry.addSmelting(TechExpansionBlocks.tinOre, new ItemStack(TechExpansionItems.tinIngot), 1.0F);
		GameRegistry.addSmelting(TechExpansionBlocks.aluminumOre, new ItemStack(TechExpansionItems.aluminumIngot), 1.0F);
		
		//metal blocks
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
		GameRegistry.addRecipe(new ItemStack(TechExpansionBlocks.aluminumBlock), new Object[] {
				"aaa",
				"aaa",
				"aaa", 'a', TechExpansionItems.aluminumIngot
		});
		
		//back into items
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.copperIngot, 9), new Object[] {
				"c", 'c', TechExpansionBlocks.copperBlock
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.tinIngot, 9), new Object[] {
				"t", 't', TechExpansionBlocks.tinBlock
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.aluminumIngot, 9), new Object[] {
				"a", 'a', TechExpansionBlocks.aluminumBlock
		});
		
		//pickaxe crafting
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.copperPickaxe), new Object[] {
				"ccc",
				" s ",
				" s ", 'c', TechExpansionItems.copperIngot, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.tinPickaxe), new Object[] {
				"ttt",
				" s ",
				" s ", 't', TechExpansionItems.tinIngot, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.aluminumPickaxe), new Object[] {
				"aaa",
				" s ",
				" s ", 'a', TechExpansionItems.aluminumIngot, 's', Items.stick
		});
		
		//spade crafting
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.copperSpade), new Object[] {
				" c ",
				" s ",
				" s ", 'c', TechExpansionItems.copperIngot, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.tinSpade), new Object[] {
				" t ",
				" s ",
				" s ", 't', TechExpansionItems.tinIngot, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.aluminumSpade), new Object[] {
				" a ",
				" s ",
				" s ", 'a', TechExpansionItems.aluminumIngot, 's', Items.stick
		});
		
		//hoe crafting
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.copperHoe), new Object[] {
				"cc ",
				" s ",
				" s ", 'c', TechExpansionItems.copperIngot, 's', Items.stick
		});
		
		//sword crafting
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.copperSword), new Object[] {
				" c ",
				" c ",
				" s ", 'c', TechExpansionItems.copperIngot, 's', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.tinSword), new Object[] {
				" t ",
				" t ",
				" s ", 't', TechExpansionItems.tinIngot, 's', Items.stick
		});
		
		//axe crafting
		GameRegistry.addRecipe(new ItemStack(TechExpansionItems.copperAxe), new Object[] {
				"cc ",
				"cs ",
				" s ", 'c', TechExpansionItems.copperIngot, 's', Items.stick
		});
		
	}
}
