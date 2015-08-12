package com.collabmods.techexpansion.item.tools;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.item.ItemPickaxe;

public class ItemTinPickaxe extends ItemPickaxe{
	public ItemTinPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("techExpansion:tin_pickaxe");
		this.setCreativeTab(TechExpansion.techExpansionTools);
	}
}
