package com.collabmods.techexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends Block{

	public CopperOre(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName)
		.setBlockTextureName("techExpansion:copper_ore")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setHardness(3.0f)
		.setResistance(15.0f)
		.setStepSound(soundTypeStone)
		.setHarvestLevel("pickaxe", 1);
	}
	
}
