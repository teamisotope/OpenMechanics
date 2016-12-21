package com.teamiurg.techexpansion.engine.registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {
	
	// use unlocalized name
	public static void registerItems(Item... items) {
		for (int i = 0; i < items.length; i++) {
			items[i].setRegistryName(items[i].getRegistryName());
			GameRegistry.register(items[i]);
		}
	}
	
}
