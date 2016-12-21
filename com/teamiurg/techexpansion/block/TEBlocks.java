package com.teamiurg.techexpansion.block;

import com.teamiurg.techexpansion.TechExpansion;
import com.teamiurg.techexpansion.engine.render.RenderHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TEBlocks {
	
	
	/* ores */
	public static Block copper_ore = new TEBlock(Material.iron, "copper_ore", TechExpansion.tab_techExpansion, 3.0f, 15.0f, Block.soundTypeStone, 0, 0.0f, "pickaxe", 1, false);
	public static Block aluminum_ore = new TEBlock(Material.iron, "aluminum_ore", TechExpansion.tab_techExpansion, 3.0f, 15.0f, Block.soundTypeStone, 0, 0.0f, "pickaxe", 1, false);
	public static Block tin_ore = new TEBlock(Material.iron, "tin_ore", TechExpansion.tab_techExpansion, 2.5f, 13.0f, Block.soundTypeStone, 0, 0.0f, "pickaxe", 1, false);
	/* blocks */
	public static Block copper_block = new TEBlock(Material.iron, "copper_block", TechExpansion.tab_techExpansion, 3.5f, 17.0f, Block.soundTypeMetal, 0, 0.0f, "pickaxe", 1, false);
	public static Block aluminum_block = new TEBlock(Material.iron, "aluminum_block", TechExpansion.tab_techExpansion, 3.5f, 17.0f, Block.soundTypeMetal,0 ,0.0f, "pickaxe", 1, false);
	public static Block tin_block = new TEBlock(Material.iron, "tin_block", TechExpansion.tab_techExpansion, 3.0f, 15.0f, Block.soundTypeMetal, 0, 0.0f, "pickaxe", 1, false);
	
	public static void registerBlocks() {
		/* ores */
		GameRegistry.registerBlock(copper_ore, "copper_ore");
		GameRegistry.registerBlock(aluminum_ore, "aluminum_ore");
		GameRegistry.registerBlock(tin_ore, "tin_ore");
		/* blocks */
		GameRegistry.registerBlock(copper_block, "copper_block");
		GameRegistry.registerBlock(aluminum_block, "aluminum_block");
		GameRegistry.registerBlock(tin_block, "tin_block");
	}

	public static void registerRenders() {
		/* ores */
		RenderHandler.registerRender(copper_ore);
		RenderHandler.registerRender(aluminum_ore);
		RenderHandler.registerRender(tin_ore);
		/* blocks */
		RenderHandler.registerRender(copper_block);
		RenderHandler.registerRender(aluminum_block);
		RenderHandler.registerRender(tin_block);
	}
}
