package com.teamiurg.techexpansion.engine.registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {
	
	// use unlocalized name
	public static void registerItemsUUN(Item... items) {
		for (int i = 0; i < items.length; i++) {
			GameRegistry.registerItem(items[i], items[i].getUnlocalizedName().substring(5));
		}
	}
	
}
