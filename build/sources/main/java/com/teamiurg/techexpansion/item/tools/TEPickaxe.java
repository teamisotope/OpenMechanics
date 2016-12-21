package com.teamiurg.techexpansion.item.tools;

import com.teamiurg.techexpansion.TechExpansion;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class TEPickaxe extends ItemPickaxe {
	public TEPickaxe(ToolMaterial mat, String material, String regName) {
		super(mat);
		this.setUnlocalizedName(material + "_pickaxe");
		this.setCreativeTab(TechExpansion.tab_techExpansion);
		this.setRegistryName(regName);
	}
}
