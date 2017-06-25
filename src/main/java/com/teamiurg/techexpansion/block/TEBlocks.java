package com.teamiurg.techexpansion.block;

import com.teamiurg.techexpansion.TechExpansion;
import com.teamiurg.techexpansion.engine.render.RenderHandler;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TEBlocks {

	/* ores */
	public static Block copper_ore = new TEBlock(Material.IRON, "copper_ore", "copper_ore",
			TechExpansion.tab_techExpansion, 3.0f, 15.0f, SoundType.STONE, 0, 0.0f, "pickaxe", 1, false);
	public static Block aluminum_ore = new TEBlock(Material.IRON, "aluminum_ore", "aluminum_ore",
			TechExpansion.tab_techExpansion, 3.0f, 15.0f, SoundType.STONE, 0, 0.0f, "pickaxe", 1, false);
	public static Block tin_ore = new TEBlock(Material.IRON, "tin_ore", "tin_ore", TechExpansion.tab_techExpansion,
			2.5f, 13.0f, SoundType.STONE, 0, 0.0f, "pickaxe", 1, false);
	/* blocks */
	public static Block copper_block = new TEBlock(Material.IRON, "copper_block", "copper_block",
			TechExpansion.tab_techExpansion, 3.5f, 17.0f, SoundType.METAL, 0, 0.0f, "pickaxe", 1, false);
	public static Block aluminum_block = new TEBlock(Material.IRON, "aluminum_block", "aluminum_block",
			TechExpansion.tab_techExpansion, 3.5f, 17.0f, SoundType.METAL, 0, 0.0f, "pickaxe", 1, false);
	public static Block tin_block = new TEBlock(Material.IRON, "tin_block", "tin_block",
			TechExpansion.tab_techExpansion, 3.0f, 15.0f, SoundType.METAL, 0, 0.0f, "pickaxe", 1, false);

	/* tile entities */
	
	/* ItemBlocks */
	public static ItemBlock item_copper_ore = new ItemBlock(copper_ore);
	public static ItemBlock item_aluminum_ore = new ItemBlock(aluminum_ore);
	public static ItemBlock item_tin_ore = new ItemBlock(tin_ore);

	public static ItemBlock item_copper_block = new ItemBlock(copper_block);
	public static ItemBlock item_aluminum_block = new ItemBlock(aluminum_block);
	public static ItemBlock item_tin_block = new ItemBlock(tin_block);
	
	
	public static void registers() {
		/* ores */
		GameRegistry.register(copper_ore);
		GameRegistry.register(aluminum_ore);
		GameRegistry.register(tin_ore);
		item_copper_ore.setRegistryName(copper_ore.getRegistryName());
		item_aluminum_ore.setRegistryName(aluminum_ore.getRegistryName());
		item_tin_ore.setRegistryName(tin_ore.getRegistryName());
		GameRegistry.register(item_copper_ore);
		GameRegistry.register(item_aluminum_ore);
		GameRegistry.register(item_tin_ore);
		/* blocks */
		GameRegistry.register(copper_block);
		GameRegistry.register(aluminum_block);
		GameRegistry.register(tin_block);
		item_copper_block.setRegistryName(copper_block.getRegistryName());
		item_aluminum_block.setRegistryName(aluminum_block.getRegistryName());
		item_tin_block.setRegistryName(tin_block.getRegistryName());
		GameRegistry.register(item_copper_block);
		GameRegistry.register(item_aluminum_block);
		GameRegistry.register(item_tin_block);
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
