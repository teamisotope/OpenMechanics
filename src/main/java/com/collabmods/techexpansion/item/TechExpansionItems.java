package com.collabmods.techexpansion.item;

import com.collabmods.techexpansion.TechExpansion;
import com.collabmods.techexpansion.item.tools.ItemAluminumPickaxe;
import com.collabmods.techexpansion.item.tools.ItemAluminumSpade;
import com.collabmods.techexpansion.item.tools.ItemAluminumSword;
import com.collabmods.techexpansion.item.tools.ItemCopperAxe;
import com.collabmods.techexpansion.item.tools.ItemCopperHoe;
import com.collabmods.techexpansion.item.tools.ItemCopperPickaxe;
import com.collabmods.techexpansion.item.tools.ItemCopperSpade;
import com.collabmods.techexpansion.item.tools.ItemCopperSword;
import com.collabmods.techexpansion.item.tools.ItemTinAxe;
import com.collabmods.techexpansion.item.tools.ItemTinPickaxe;
import com.collabmods.techexpansion.item.tools.ItemTinSpade;
import com.collabmods.techexpansion.item.tools.ItemTinSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class TechExpansionItems {
	
	//ingots

	public static TechExpansionItem copperIngot;
	public static TechExpansionItem tinIngot;
	public static TechExpansionItem aluminumIngot;
	
	//tools
	
	public static ItemPickaxe tinPickaxe;
	public static ItemPickaxe copperPickaxe;
	public static ItemPickaxe aluminumPickaxe;
	
	public static ItemSpade copperSpade;
	public static ItemSpade tinSpade;
	public static ItemSpade aluminumSpade;
	
	public static ItemHoe copperHoe;
	
	public static ItemSword copperSword;
	public static ItemSword tinSword;
	public static ItemSword aluminumSword;
	
	public static ItemAxe copperAxe;
	public static ItemAxe tinAxe;

	
	public static void loadItems() {
		//ingots
		copperIngot = new TechExpansionItem("copperIngot", TechExpansion.techExpansion, "copper_ingot");
		tinIngot = new TechExpansionItem("tinIngot", TechExpansion.techExpansion, "tin_ingot");
		aluminumIngot = new TechExpansionItem("aluminumIngot", TechExpansion.techExpansion, "aluminum_ingot");
		
		TechExpansionItems.registerItems();
	}
	public static void registerItems() {
		//ingots
		GameRegistry.registerItem(copperIngot, "copperIngot");
		GameRegistry.registerItem(tinIngot, "tinIngot");
		GameRegistry.registerItem(aluminumIngot, "aluminumIngot");
		
		//tools
		GameRegistry.registerItem(copperPickaxe = new ItemCopperPickaxe("copper_pickaxe", TechExpansion.COPPER), "copper_pickaxe");
		GameRegistry.registerItem(tinPickaxe = new ItemTinPickaxe("tin_pickaxe", TechExpansion.TIN), "tin_pickaxe");
		GameRegistry.registerItem(aluminumPickaxe = new ItemAluminumPickaxe("aluminum_pickaxe", TechExpansion.ALUMINUM), "aluminum_pickaxe");
		
		GameRegistry.registerItem(copperSpade = new ItemCopperSpade("copper_spade", TechExpansion.COPPER), "copper_spade");
		GameRegistry.registerItem(tinSpade = new ItemTinSpade("tin_spade", TechExpansion.TIN), "tin_spade");
		GameRegistry.registerItem(aluminumSpade = new ItemAluminumSpade("aluminum_spade", TechExpansion.ALUMINUM), "aluminum_spade");
		
		GameRegistry.registerItem(copperHoe = new ItemCopperHoe("copper_hoe", TechExpansion.COPPER), "copper_hoe");
		
		GameRegistry.registerItem(copperSword = new ItemCopperSword("copper_sword", TechExpansion.COPPER), "copper_sword");
		GameRegistry.registerItem(tinSword = new ItemTinSword("tin_sword", TechExpansion.TIN), "tin_sword");
		GameRegistry.registerItem(aluminumSword = new ItemAluminumSword("aluminum_sword", TechExpansion.ALUMINUM), "aluminum_sword");
		
		GameRegistry.registerItem(copperAxe = new ItemCopperAxe("copper_axe", TechExpansion.COPPER), "copper_axe");
		GameRegistry.registerItem(tinAxe = new ItemTinAxe("tin_axe", TechExpansion.COPPER), "tin_axe");
		
	}
}
