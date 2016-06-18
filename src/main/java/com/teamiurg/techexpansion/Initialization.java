package com.teamiurg.techexpansion;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.engine.handlers.AchievementHandler;
import com.teamiurg.techexpansion.engine.handlers.OreDictionaryHandler;
import com.teamiurg.techexpansion.engine.handlers.RecipeHandler;
import com.teamiurg.techexpansion.engine.handlers.WorldGenerationHandler;
import com.teamiurg.techexpansion.item.TEItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

class Initialization {
	
	public static void preInit() {
		TEBlocks.registerBlocks();
		TEItems.registerItems();
		OreDictionaryHandler.registerOres();
		AchievementHandler.registerAchievements();
		AchievementHandler achHandler = new AchievementHandler();
		MinecraftForge.EVENT_BUS.register(achHandler);
		FMLCommonHandler.instance().bus().register(achHandler);
		RecipeHandler.registerRecipes();
		GameRegistry.registerWorldGenerator(new WorldGenerationHandler(), 0);
	}
	public static void init() {
		
	}
	public static void postInit() { 
		
	}
}
