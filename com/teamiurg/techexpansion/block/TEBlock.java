package com.teamiurg.techexpansion.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TEBlock extends Block {

	public TEBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, SoundType stepSound,
			int lightOpacity, float lightLevel, String toolTypeRequired, int toolLevelRequired, boolean tickRandomly) {
		super(mat);
		this.setUnlocalizedName(name).setHardness(hardness).setResistance(resistance).setStepSound(stepSound)
				.setLightOpacity(lightOpacity).setLightLevel(lightLevel).setCreativeTab(tab)
				.setHarvestLevel(toolTypeRequired, toolLevelRequired);
		this.setTickRandomly(tickRandomly);
	}

}
