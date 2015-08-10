package com.collabmods.techexpansion.armor;

import com.collabmods.techexpansion.TechExpansion;

import cpw.mods.fml.common.registry.GameRegistry;

public class TinArmor {

	public static TinArmo tinHelmet;
	public static TinArmo tinChestplate;
	public static TinArmo tinLeggings;
	public static TinArmo tinBoots;
	
	
	public static void loadTinArmor() {
		// tin

		// helmet
		tinHelmet = new TinArmo("tinHelmet", TechExpansion.TIN, "tin_armor", 0, "tin_helmet", "tin/");

		// chestplate
		tinChestplate = new TinArmo("tinChestplate", TechExpansion.TIN, "tin_armor", 1, "tin_chestplate", "tin/");

		// leggings
		tinLeggings = new TinArmo("tinLeggings", TechExpansion.TIN, "tin_armor", 2, "tin_leggings", "tin/");

		// boots
		tinBoots = new TinArmo("tinBoots", TechExpansion.TIN, "tin_armor", 3, "tin_boots", "tin/");
	}
	
	public static void registerTinArmor() {
	

		GameRegistry.registerItem(tinHelmet, "tin_helmet");

		GameRegistry.registerItem(tinChestplate, "tin_chestplate");

		GameRegistry.registerItem(tinLeggings, "tin_leggings");

		GameRegistry.registerItem(tinBoots, "tin_boots");
		
	}
	
	
}
