package com.collabmods.techexpansion.blocks;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumBlock extends Block{
	
	

	public AluminumBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName)
		.setBlockTextureName("techExpansion:aluminum_block")
		.setCreativeTab(TechExpansion.techExpansion)
		.setHardness(3.5f)
		.setResistance(17.0f)
		.setStepSound(soundTypeMetal)
		.setHarvestLevel("pickaxe", 1);
	}
}
