package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemSpade;

public class ItemTinSpade extends ItemSpade{
	
	public ItemTinSpade(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:tin_spade");
		this.setCreativeTab(TechExpansion.techExpansion);
	}
}
