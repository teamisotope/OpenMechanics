package com.teamiurg.techexpansion.item.tools;

import com.teamiurg.techexpansion.TechExpansion;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class TEShovel extends ItemSpade {
	public TEShovel(ToolMaterial mat, String material, String regName) {
		super(mat);
		this.setUnlocalizedName(material + "_shovel");
		this.setCreativeTab(TechExpansion.tab_techExpansion);
		this.setRegistryName(regName);
	}
}
