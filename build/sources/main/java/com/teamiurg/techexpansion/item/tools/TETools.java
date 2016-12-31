package com.teamiurg.techexpansion.item.tools;

import com.teamiurg.techexpansion.TechExpansion;
import com.teamiurg.techexpansion.engine.render.RenderHandler;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TETools {

	public static Item copper_pickaxe = new TEPickaxe(TechExpansion.TCo, "copper", "copper_pickaxe");
	public static Item copper_hoe = new TEHoe(TechExpansion.TCo, "copper", "copper_hoe");
	public static Item copper_axe = new TEAxe(TechExpansion.TCo, "copper", "copper_axe");
	public static Item copper_shovel = new TEShovel(TechExpansion.TCo, "copper", "copper_shovel");
	public static Item copper_sword = new TESword(TechExpansion.TCo, "copper", "copper_sword");
	public static Item tin_pickaxe = new TEPickaxe(TechExpansion.TTin, "tin", "tin_pickaxe");
	public static Item tin_axe = new TEAxe(TechExpansion.TTin, "tin", "tin_axe");
	public static Item tin_shovel = new TEShovel(TechExpansion.TTin, "tin", "tin_shovel");
	public static Item tin_sword = new TESword(TechExpansion.TTin, "tin", "tin_sword");
	public static Item aluminum_pickaxe = new TEPickaxe(TechExpansion.TAl, "aluminum", "aluminum_pickaxe");
	public static Item aluminum_axe = new TEAxe(TechExpansion.TAl, "aluminum", "aluminum_axe");
	public static Item aluminum_shovel = new TEShovel(TechExpansion.TAl, "aluminum", "aluminum_shovel");
	public static Item aluminum_sword = new TESword(TechExpansion.TAl, "aluminum", "aluminum_sword");

	public static void registerItems() {
		GameRegistry.register(copper_pickaxe);
		GameRegistry.register(copper_hoe);
		GameRegistry.register(copper_axe);
		GameRegistry.register(copper_shovel);
		GameRegistry.register(copper_sword);
		GameRegistry.register(tin_pickaxe);
		GameRegistry.register(tin_axe);
		GameRegistry.register(tin_shovel);
		GameRegistry.register(tin_sword);
		GameRegistry.register(aluminum_pickaxe);
		GameRegistry.register(aluminum_axe);
		GameRegistry.register(aluminum_shovel);
		GameRegistry.register(aluminum_sword);
	}

	public static void registerRenders() {
		RenderHandler.registerRender(copper_pickaxe);
		RenderHandler.registerRender(copper_hoe);
		RenderHandler.registerRender(copper_axe);
		RenderHandler.registerRender(copper_shovel);
		RenderHandler.registerRender(copper_sword);
		RenderHandler.registerRender(tin_pickaxe);
		RenderHandler.registerRender(tin_axe);
		RenderHandler.registerRender(tin_shovel);
		RenderHandler.registerRender(tin_sword);
		RenderHandler.registerRender(aluminum_pickaxe);
		RenderHandler.registerRender(aluminum_axe);
		RenderHandler.registerRender(aluminum_shovel);
		RenderHandler.registerRender(aluminum_sword);

	}

}