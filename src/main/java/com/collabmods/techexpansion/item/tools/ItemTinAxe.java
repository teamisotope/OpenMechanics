package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemTinAxe extends ItemAxe{
	
	public ItemTinAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:tin_axe");
		this.setCreativeTab(TechExpansion.techExpansion);
	}
}