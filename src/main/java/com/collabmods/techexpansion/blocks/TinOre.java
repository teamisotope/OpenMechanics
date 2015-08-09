package com.collabmods.techexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TinOre extends Block{
	public TinOre(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName)
		.setBlockTextureName("techExpansion:tin_ore")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setHardness(2.5f)
		.setResistance(13.0f)
		.setStepSound(soundTypeStone)
		.setHarvestLevel("pickaxe", 1);
	}
}
