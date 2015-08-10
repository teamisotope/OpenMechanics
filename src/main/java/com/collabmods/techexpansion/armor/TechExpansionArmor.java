package com.collabmods.techexpansion.armor;

import com.collabmods.techexpansion.TechExpansion;

import cpw.mods.fml.common.registry.GameRegistry;

public class TechExpansionArmor {

	public static TechExpansionArmo copperHelmet;
	public static TechExpansionArmo copperChestplate;
	public static TechExpansionArmo copperLeggings;
	public static TechExpansionArmo copperBoots;
	
	


	public static void loadArmorItem() {

		// copper

		// helmet
		copperHelmet = new TechExpansionArmo("copperHelmet", TechExpansion.COPPER, "copper_armor", 0, "copper_helmet", "copper/");

		// chestplate
		copperChestplate = new TechExpansionArmo("copperChestplate", TechExpansion.COPPER, "copper_armor", 1, "copper_chestplate", "copper/");

		// leggings
		copperLeggings = new TechExpansionArmo("copperLeggings", TechExpansion.COPPER, "copper_armor", 2, "copper_leggings", "copper/");

		// boots
		copperBoots = new TechExpansionArmo("copperBoots", TechExpansion.COPPER, "copper_armor", 3, "copper_boots", "copper/");

		TinArmor.loadTinArmor();
		TechExpansionArmor.registerArmorItem();
	}

	

	public static void registerArmorItem() {

		GameRegistry.registerItem(copperHelmet, "copper_helmet");

		GameRegistry.registerItem(copperChestplate, "copper_chestplate");

		GameRegistry.registerItem(copperLeggings, "copper_leggings");

		GameRegistry.registerItem(copperBoots, "copper_boots");
		
		TinArmor.registerTinArmor();


	}

}
