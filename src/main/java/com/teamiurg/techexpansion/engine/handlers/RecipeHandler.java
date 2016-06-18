package com.teamiurg.techexpansion.engine.handlers;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.item.TEItems;
import com.teamiurg.techexpansion.item.tools.TETools;

import net.minecraft.init.Items;
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
		
		/* aluminum -> tools */
		GameRegistry.addRecipe(new ItemStack(TETools.aluminum_axe), new Object[] {"aa ","as "," s ", 'a', TEItems.aluminum_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.aluminum_pickaxe), new Object[] {"aaa", " s ", " s ", 'a', TEItems.aluminum_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.aluminum_shovel), new Object[] {" a ", " s ", " s ", 'a', TEItems.aluminum_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.aluminum_sword), new Object[] {" a ", " a ", " s ", 'a', TEItems.aluminum_ingot, 's', Items.stick});
		
		/* copper -> tools */
		GameRegistry.addRecipe(new ItemStack(TETools.copper_axe), new Object[] {"cc ", "cs ", " s ", 'c', TEItems.copper_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.copper_hoe), new Object[] {"cc ", " s ", " s ", 'c', TEItems.copper_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.copper_pickaxe), new Object[] {"ccc", " s ", " s ", 'c', TEItems.copper_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.copper_shovel), new Object[] {" c ", " s ", " s ", 'c', TEItems.copper_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.copper_sword), new Object[] {" c ", " c ", " s ", 'c', TEItems.copper_ingot, 's', Items.stick});
		/* tin -> tools */
		GameRegistry.addRecipe(new ItemStack(TETools.tin_axe), new Object[] {"tt ", "ts ", " s ", 't', TEItems.tin_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.tin_pickaxe), new Object[] {"ttt", " s ", " s ", 't', TEItems.tin_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.tin_shovel), new Object[] {" t ", " s ", " s ", 't', TEItems.tin_ingot, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TETools.tin_sword), new Object[] {" t ", " t ", " s ", 't', TEItems.tin_ingot, 's', Items.stick});
	}
}