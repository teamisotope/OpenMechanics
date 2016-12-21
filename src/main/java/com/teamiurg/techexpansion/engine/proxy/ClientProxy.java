package com.teamiurg.techexpansion.engine.proxy;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.item.TEItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		TEItems.registerRenders();
		TEBlocks.registerRenders();
	}
	public void init(FMLInitializationEvent e) {
		
	}
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
