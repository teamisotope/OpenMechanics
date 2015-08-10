package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemSword;

public class ItemAluminumSword extends ItemSword{
	
	public ItemAluminumSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:aluminum_sword");
		this.setCreativeTab(TechExpansion.techExpansion);
	}
}
