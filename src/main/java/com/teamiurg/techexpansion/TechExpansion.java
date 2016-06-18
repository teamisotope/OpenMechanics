package com.teamiurg.techexpansion;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.engine.proxy.CommonProxy;
import com.teamiurg.techexpansion.utils.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,version=Reference.VERSION,name=Reference.MOD_NAME)
public class TechExpansion {
	
	public static final ToolMaterial TCo = EnumHelper.addToolMaterial("TCo", 2, 260, 6.3f, 2.1f, 14);
	public static final ToolMaterial TTin = EnumHelper.addToolMaterial("TTi", 2, 250, 6.0f, 2.0f, 14);
	public static final ToolMaterial TAl = EnumHelper.addToolMaterial("TAl", 2, 255, 6.2f, 2.0f, 14);
	
	public static final ArmorMaterial ACo = EnumHelper.addArmorMaterial("ACo", "copper_armor", 20, new int[]{3,6,5,4}, 12);
	public static final ArmorMaterial ATin = EnumHelper.addArmorMaterial("ATi", "tin_armor", 18, new int[]{3, 6,5,2}, 10);
	public static final ArmorMaterial AAl = EnumHelper.addArmorMaterial("AAl", "aluminum_armor", 19, new int[]{3,6,5,3}, 11);
	
	@Mod.Instance
	public TechExpansion instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_LOCATION,serverSide=Reference.SERVER_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		Initialization.preInit();
		//world#23seed=2963109850767971935
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
