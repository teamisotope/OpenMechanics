package com.teamiurg.techexpansion.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TEBlock extends Block {

	public TEBlock(Material mat, String name, String regName, CreativeTabs tab, float hardness, float resistance, SoundType stepSound,
			int lightOpacity, float lightLevel, String toolTypeRequired, int toolLevelRequired, boolean tickRandomly) {
		super(mat);
		this.setUnlocalizedName(name).setHardness(hardness).setResistance(resistance);
		this.setLightOpacity(lightOpacity).setLightLevel(lightLevel).setCreativeTab(tab).setHarvestLevel(toolTypeRequired, toolLevelRequired);
		this.setTickRandomly(tickRandomly);
		this.setRegistryName(regName);
		this.setSoundType(stepSound);
	}

}
