package com.teamiurg.techexpansion;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.item.TEItems;

class Initialization {
	
	public static void preInit() {
		TEBlocks.registerBlocks();
		TEItems.registerItems();
	}
	public static void init() {
		
	}
	public static void postInit() { 
		
	}
}
