package com.teamiurg.techexpansion;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.engine.proxy.CommonProxy;
import com.teamiurg.techexpansion.utils.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid=Reference.MOD_ID,version=Reference.VERSION,name=Reference.MOD_NAME)
public class TechExpansion {

	@Mod.Instance
	public TechExpansion instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_LOCATION,serverSide=Reference.SERVER_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		Initialization.preInit();
		//world#23seed=2963109850767971935
		if (Reference.XX20 != "7e493c61894cc1209dcdfe239b22c3023d57dddfeee859fc7f4d1ff91a2837e9") {
			System.out.println("Please go to http://teamiurg.github.io/te/0x000000");
			System.exit();
		}
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
	
	public static CreativeTabs tab_techExpansion = new CreativeTabs("tab_techExpansion") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(TEBlocks.copper_block);
		}
		
	};
	
}
