package com.teamiurg.techexpansion.item.tools;

import com.teamiurg.techexpansion.TechExpansion;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class TEAxe extends ItemAxe {
	public TEAxe(ToolMaterial mat, String material) {
		super(mat);
		this.setUnlocalizedName(material + "_axe");
		this.setCreativeTab(TechExpansion.tab_techExpansion);
	}
}
