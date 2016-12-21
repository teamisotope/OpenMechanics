package com.teamiurg.techexpansion.item.tools;

import com.teamiurg.techexpansion.TechExpansion;
import com.teamiurg.techexpansion.engine.registry.RegistryHandler;
import com.teamiurg.techexpansion.engine.render.RenderHandler;

import net.minecraft.item.Item;

public class TETools {

	public static Item copper_pickaxe = new TEPickaxe(TechExpansion.TCo, "copper");
	public static Item copper_hoe = new TEHoe(TechExpansion.TCo, "copper");
	public static Item copper_axe = new TEAxe(TechExpansion.TCo, "copper");
	public static Item copper_shovel = new TEShovel(TechExpansion.TCo, "copper");
	public static Item copper_sword = new TESword(TechExpansion.TCo, "copper");
	public static Item tin_pickaxe = new TEPickaxe(TechExpansion.TTin, "tin");
	public static Item tin_axe = new TEAxe(TechExpansion.TTin, "tin");
	public static Item tin_shovel = new TEShovel(TechExpansion.TTin, "tin");
	public static Item tin_sword = new TESword(TechExpansion.TTin, "tin");
	public static Item aluminum_pickaxe = new TEPickaxe(TechExpansion.TAl, "aluminum");
	public static Item aluminum_axe = new TEAxe(TechExpansion.TAl, "aluminum");
	public static Item aluminum_shovel = new TEShovel(TechExpansion.TAl, "aluminum");
	public static Item aluminum_sword = new TESword(TechExpansion.TAl, "aluminum");

	public static void registerItems() {
		RegistryHandler.registerItemsUUN(copper_pickaxe, copper_hoe, copper_axe, copper_shovel, copper_sword,
				tin_pickaxe, tin_axe, tin_shovel, tin_sword, aluminum_pickaxe, aluminum_axe, aluminum_shovel,
				aluminum_sword);
	}

	public static void registerRenders() {
		RenderHandler.registerRenders(copper_pickaxe, copper_hoe, copper_axe, copper_shovel, copper_sword,
				tin_pickaxe, tin_axe, tin_shovel, tin_sword, aluminum_pickaxe, aluminum_axe, aluminum_shovel,
				aluminum_sword);
	}

}
