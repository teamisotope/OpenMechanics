package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemAxe;

public class ItemAluminumAxe extends ItemAxe{
	
	public ItemAluminumAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:aluminum_axe");
		this.setCreativeTab(TechExpansion.techExpansionTools);
	}
}
