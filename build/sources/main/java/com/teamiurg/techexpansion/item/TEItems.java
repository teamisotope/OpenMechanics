package com.teamiurg.techexpansion.item;

import com.teamiurg.techexpansion.TechExpansion;
import com.teamiurg.techexpansion.engine.render.RenderHandler;
//import com.teamiurg.techexpansion.item.tools.TETools;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TEItems {
	
	/* ingots */
	public static Item copper_ingot = new TEItem("copper_ingot", "copper_ingot", TechExpansion.tab_techExpansion, 64);
	public static Item aluminum_ingot = new TEItem("aluminum_ingot", "aluminum_ingot", TechExpansion.tab_techExpansion, 64);
	public static Item tin_ingot = new TEItem("tin_ingot", "tin_ingot", TechExpansion.tab_techExpansion, 64);
	
	public static void registerItems() {
		/* ingots */
		GameRegistry.register(copper_ingot);
		GameRegistry.register(aluminum_ingot);
		GameRegistry.register(tin_ingot);
		//TETools.registerItems();
	}

	public static void registerRenders() {
		/* ingots */
		RenderHandler.registerRender(copper_ingot);
		RenderHandler.registerRender(aluminum_ingot);
		RenderHandler.registerRender(tin_ingot);
		//TETools.registerRenders();
	}
}
