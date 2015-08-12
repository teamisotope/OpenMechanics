package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemAxe;

public class ItemCopperAxe extends ItemAxe{
	
	public ItemCopperAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:copper_axe");
		this.setCreativeTab(TechExpansion.techExpansionTools);
	}
}
