package com.collabmods.techexpansion.item;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TechExpansionItem extends Item {

	public TechExpansionItem(String unlocalizedName, CreativeTabs tab, String texture) {
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
		this.setTextureName(TechExpansion.MODID + ":" + texture);
	}
	
	
}
