package com.teamiurg.techexpansion.item.tools;

import com.teamiurg.techexpansion.TechExpansion;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class TESword extends ItemSword {
	public TESword(ToolMaterial mat, String material) {
		super(mat);
		this.setUnlocalizedName(material + "_sword");
		this.setCreativeTab(TechExpansion.tab_techExpansion);
	}
}
