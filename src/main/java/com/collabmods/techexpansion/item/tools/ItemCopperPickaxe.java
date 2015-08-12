package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemPickaxe;

public class ItemCopperPickaxe extends ItemPickaxe{

	public ItemCopperPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:copper_pickaxe");
		this.setCreativeTab(TechExpansion.techExpansionTools);
	}
}
