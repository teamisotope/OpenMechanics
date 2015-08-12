package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemSword;

public class ItemCopperSword extends ItemSword{
	
	public ItemCopperSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:copper_sword");
		this.setCreativeTab(TechExpansion.techExpansionTools);
	}
}
