package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemHoe;

public class ItemCopperHoe extends ItemHoe{
	
	public ItemCopperHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:copper_hoe");
		this.setCreativeTab(TechExpansion.techExpansionTools);
	}
}
