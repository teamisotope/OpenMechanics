package com.collabmods.techexpansion.armor;

import com.collabmods.techexpansion.TechExpansion;

import cpw.mods.fml.common.registry.GameRegistry;

public class CopperArmor {

	public static CopperArmo copperHelmet;
	public static CopperArmo copperChestplate;
	public static CopperArmo copperLeggings;
	public static CopperArmo copperBoots;
	
	


	public static void loadArmorItem() {

		// copper

		// helmet
		copperHelmet = new CopperArmo("copperHelmet", TechExpansion.COPPERA, "copper_armor", 0, "copper/armor/copper_helmet", "copper/");

		// chestplate
		copperChestplate = new CopperArmo("copperChestplate", TechExpansion.COPPERA, "copper_armor", 1, "copper/armor/copper_chestplate", "copper/");

		// leggings
		copperLeggings = new CopperArmo("copperLeggings", TechExpansion.COPPERA, "copper_armor", 2, "copper/armor/copper_leggings", "copper/");

		// boots
		copperBoots = new CopperArmo("copperBoots", TechExpansion.COPPERA, "copper_armor", 3, "copper/armor/copper_boots", "copper/");

		TinArmor.loadTinArmor();
		CopperArmor.registerCopperArmor();
	}

	

	private static void registerCopperArmor() {

		GameRegistry.registerItem(copperHelmet, "copper_helmet");

		GameRegistry.registerItem(copperChestplate, "copper_chestplate");

		GameRegistry.registerItem(copperLeggings, "copper_leggings");

		GameRegistry.registerItem(copperBoots, "copper_boots");


	}

}
