package com.collabmods.techexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TinBlock extends Block{
	
	public TinBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName)
		.setBlockTextureName("techExpansion:tin_block")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setHardness(3.0f)
		.setResistance(15.0f)
		.setStepSound(soundTypeMetal)
		.setHarvestLevel("pickaxe", 1);
	}
}
