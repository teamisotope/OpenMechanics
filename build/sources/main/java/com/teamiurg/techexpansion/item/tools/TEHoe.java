package com.teamiurg.techexpansion.item.tools;

import com.teamiurg.techexpansion.TechExpansion;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class TEHoe extends ItemHoe {
	public TEHoe(ToolMaterial mat, String material, String regName) {
		super(mat);
		this.setUnlocalizedName(material + "_hoe");
		this.setCreativeTab(TechExpansion.tab_techExpansion);
		this.setRegistryName(regName);
	}
}
