package com.collabmods.techexpansion.item;

import com.collabmods.techexpansion.TechExpansion;

import cpw.mods.fml.common.registry.GameRegistry;

public class TechExpansionItems {

	public static TechExpansionItem copperIngot;
	public static TechExpansionItem tinIngot;
	
	
	public static void loadItems() {
		copperIngot = new TechExpansionItem("copperIngot", TechExpansion.techExpansion, "copper_ingot");
		tinIngot = new TechExpansionItem("tinIngot", TechExpansion.techExpansion, "tin_ingot");
		
		TechExpansionItems.registerItems();
	}
	public static void registerItems() {
		GameRegistry.registerItem(copperIngot, "copperIngot");
		GameRegistry.registerItem(tinIngot, "tinIngot");
	}
}
