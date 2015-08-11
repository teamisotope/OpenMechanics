package com.collabmods.techexpansion;

import com.collabmods.techexpansion.blocks.CopperOre;
import com.collabmods.techexpansion.item.TechExpansionItems;
import com.collabmods.techexpansion.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = TechExpansion.MODID, name = TechExpansion.MODNAME, version = TechExpansion.VERSION)

public class TechExpansion {
	
		//tool materials
	public static Item.ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 260, 6.3f, 2.1f, 14);
	public static Item.ToolMaterial TIN = EnumHelper.addToolMaterial("TIN", 2, 250, 6.0f, 2.0f, 14);
	public static Item.ToolMaterial ALUMINUM = EnumHelper.addToolMaterial("ALUMINUM", 2, 255, 6.2f, 2.0f, 14);
	
	
	
	public static CreativeTabs techExpansion = new CreativeTabs("techExpansion") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(TechExpansionBlocks.copperBlock);
		}
	};
	
	@SidedProxy(clientSide="com.collabmods.techexpansion.proxies.ClientProxy", serverSide="com.collabmods.techexpansion.proxies.ServerProxy" )
	public static CommonProxy proxy;

	
	public static final String MODID = "techExpansion";
	public static final String MODNAME = "Tech Expansion";
	public static final String VERSION = "v0.1";
	//preinit
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		TechExpansionCrafting.init();
	}
	
	//ArmorMaterial
	public static ArmorMaterial COPPERA = EnumHelper.addArmorMaterial("COPPER", 20, new int[]{3, 6, 5, 4}, 12);
	public static ArmorMaterial TINA = EnumHelper.addArmorMaterial("TIN", 18, new int[]{3, 6, 5, 2}, 10);
	public static ArmorMaterial ALUMINUMA = EnumHelper.addArmorMaterial("ALUMINUM", 19, new int[]{3, 6, 5, 3}, 11);
	
	
	//init
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		OreDictionary.registerOre("oreCopper", new ItemStack(Item.getItemFromBlock(TechExpansionBlocks.copperOre)));
		OreDictionary.registerOre("oreTin", new ItemStack(Item.getItemFromBlock(TechExpansionBlocks.tinOre)));
		OreDictionary.registerOre("oreAluminum", new ItemStack(Item.getItemFromBlock(TechExpansionBlocks.aluminumOre)));
		OreDictionary.registerOre("ingotCopper", TechExpansionItems.copperIngot);
		OreDictionary.registerOre("ingotTin", TechExpansionItems.tinIngot);
		OreDictionary.registerOre("ingotAluminum", TechExpansionItems.aluminumIngot);
	}
	
	//postinit
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
