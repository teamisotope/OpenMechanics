package com.teamiurg.techexpansion.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class TEBlockTileEntity<TE extends TileEntity> extends Block {
	
	public TEBlockTileEntity(Material mat, String name, String regName, CreativeTabs tab, float hardness, float resistance,
			SoundType stepSound, int lightOpacity, float lightLevel, String toolTypeRequired, int toolLevelRequired,
			boolean tickRandomly) {
		super(mat);
		this.setUnlocalizedName(name).setHardness(hardness).setResistance(resistance);
		this.setLightOpacity(lightOpacity).setLightLevel(lightLevel).setCreativeTab(tab)
				.setHarvestLevel(toolTypeRequired, toolLevelRequired);
		this.setTickRandomly(tickRandomly);
		this.setRegistryName(regName);
		this.setSoundType(stepSound);
	}
	
	public abstract Class<TE> getTileEntityClass();
	
	public TE getTileEntity(IBlockAccess world, BlockPos pos) {
		return (TE)world.getTileEntity(pos);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Nullable
	@Override
	public abstract TE createTileEntity(World world, IBlockState state);
	
}
