package com.teamiurg.techexpansion.engine.registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {
	
	// use unloc as reg name
	public static void registerItems(Item... items) {
		for (int i = 0; i < items.length; i++) {
			GameRegistry.register(items[i]);
		}
	}
	
}
