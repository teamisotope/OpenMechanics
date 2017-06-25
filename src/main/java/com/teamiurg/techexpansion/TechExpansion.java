package com.teamiurg.techexpansion;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.engine.proxy.CommonProxy;
import com.teamiurg.techexpansion.utils.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,version=Reference.VERSION,name=Reference.MOD_NAME)
public class TechExpansion {
	
	@Mod.Instance
	public TechExpansion instance;

	public static ToolMaterial TCo = EnumHelper.addToolMaterial("TCo", 2, 260, 6.3f, 2.1f, 14);
	public static ToolMaterial TTin = EnumHelper.addToolMaterial("TTi", 2, 250, 6.0f, 2.0f, 14);
	public static ToolMaterial TAl = EnumHelper.addToolMaterial("TAl", 2, 255, 6.2f, 2.0f, 14);
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_LOCATION,serverSide=Reference.SERVER_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Initialization.preInit();
		proxy.preInit(e);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		Initialization.init();
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		Initialization.postInit();
		proxy.postInit(e);
	}
	
	public static CreativeTabs tab_techExpansion = new CreativeTabs("tab_techExpansion") {
		@Override
		public Item getTabIconItem() {
			return TEBlocks.item_copper_block;
		}
			
	};
	
}