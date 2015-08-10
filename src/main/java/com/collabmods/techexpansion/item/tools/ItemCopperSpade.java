package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemSpade;

public class ItemCopperSpade extends ItemSpade{
	
	public ItemCopperSpade(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:copper_spade");
		this.setCreativeTab(TechExpansion.techExpansion);
	}
}
