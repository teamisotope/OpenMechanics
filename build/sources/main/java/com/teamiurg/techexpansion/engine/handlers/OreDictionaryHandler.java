package com.teamiurg.techexpansion.engine.handlers;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.item.TEItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	
	public static void registerOres() {
		/* ores */
		OreDictionary.registerOre("oreCopper", TEBlocks.copper_ore);
		OreDictionary.registerOre("oreAluminum", TEBlocks.aluminum_ore);
		OreDictionary.registerOre("oreTin", TEBlocks.tin_ore);
		/* ingots */
		OreDictionary.registerOre("ingotCopper", TEItems.copper_ingot);
		OreDictionary.registerOre("ingotAluminum", TEItems.aluminum_ingot);
		OreDictionary.registerOre("ingotTin", TEItems.tin_ingot);
		/* blocks */
		OreDictionary.registerOre("blockCopper", TEBlocks.copper_block);
		OreDictionary.registerOre("blockAluminum", TEBlocks.aluminum_block);
		OreDictionary.registerOre("blockTin", TEBlocks.tin_block);
	}
}
