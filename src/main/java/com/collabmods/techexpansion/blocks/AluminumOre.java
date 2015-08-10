package com.collabmods.techexpansion.blocks;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumOre extends Block{
	
	public AluminumOre(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName)
		.setBlockTextureName("techExpansion:aluminum_ore")
		.setCreativeTab(TechExpansion.techExpansion)
		.setHardness(3.0f)
		.setResistance(15.0f)
		.setStepSound(soundTypeStone)
		.setHarvestLevel("pickaxe", 1);
		
	}
}
