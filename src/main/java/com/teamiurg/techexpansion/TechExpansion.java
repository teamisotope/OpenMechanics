package com.teamiurg.techexpansion;

import com.teamiurg.techexpansion.engine.proxy.CommonProxy;
import com.teamiurg.techexpansion.utils.Reference;

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
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_LOCATION,serverSide=Reference.SERVER_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		Initialization.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt) {
		Initialization.init();
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		Initialization.postInit();
	}
	
	
}
