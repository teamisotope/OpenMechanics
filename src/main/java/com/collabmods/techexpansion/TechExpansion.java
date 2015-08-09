package com.collabmods.techexpansion;

import com.collabmods.techexpansion.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = TechExpansion.MODID, name = TechExpansion.MODNAME, version = TechExpansion.VERSION)

public class TechExpansion {

	@SidedProxy(clientSide="com.collabmods.techexpansion.proxies.ClientProxy", serverSide="com.collabmods.techexpansion.proxies.ServerProxy" )
	public static CommonProxy proxy;

	
	public static final String MODID = "techExpansion";
	public static final String MODNAME = "Tech Expansion";
	public static final String VERSION = "v0.1";
	//preinit
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	//init
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	//postinit
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
