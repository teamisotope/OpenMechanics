package com.collabmods.techexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlock extends Block{
	
	public CopperBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName)
		.setBlockTextureName("techExpansion:copper_block")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setHardness(3.5f)
		.setResistance(17.0f)
		.setStepSound(soundTypeMetal)
		.setHarvestLevel("pickaxe", 1);
	}
}
