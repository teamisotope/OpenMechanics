package com.collabmods.techexpansion.armor;

import com.collabmods.techexpansion.TechExpansion;

import cpw.mods.fml.common.registry.GameRegistry;

public class AluminumArmor {

	public static AluminumArmo aluminumHelmet;
	public static AluminumArmo aluminumChestplate;
	public static AluminumArmo aluminumLeggings;
	public static AluminumArmo aluminumBoots;

	public static void loadArmorItem(){
				// helmet
				aluminumHelmet = new AluminumArmo("aluminumHelmet", TechExpansion.ALUMINUMA, "aluminum_armor", 0, "aluminum/armor/aluminum_helmet", "aluminum/");

				// chestplate
				aluminumChestplate = new AluminumArmo("aluminumChestplate", TechExpansion.ALUMINUMA, "aluminum_armor", 1, "aluminum/armor/aluminum_chestplate", "aluminum/");

				// leggings
				aluminumLeggings = new AluminumArmo("aluminumLeggings", TechExpansion.ALUMINUMA, "aluminum_armor", 2, "aluminum/armor/aluminum_leggings", "aluminum/");

				// boots
				aluminumBoots = new AluminumArmo("aluminumBoots", TechExpansion.ALUMINUMA, "aluminum_armor", 3, "aluminum/armor/aluminum_boots", "aluminum/");

		AluminumArmor.registerAluminumArmor();
	}
	
	private static void registerAluminumArmor() {

		GameRegistry.registerItem(aluminumHelmet, "aluminum_helmet");

		GameRegistry.registerItem(aluminumChestplate, "aluminum_chestplate");

		GameRegistry.registerItem(aluminumLeggings, "aluminum_leggings");

		GameRegistry.registerItem(aluminumBoots, "aluminum_boots");


	}
	
}
