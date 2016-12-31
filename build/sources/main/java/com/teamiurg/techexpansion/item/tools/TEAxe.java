package com.teamiurg.techexpansion.item.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.teamiurg.techexpansion.TechExpansion;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class TEAxe extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.PLANKS, Blocks.BOOKSHELF,
			Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK,
			Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE });
	
	public TEAxe(ToolMaterial mat, String material, String regName) {
		super(mat, EFFECTIVE_ON);
		this.setUnlocalizedName(material + "_axe");
		this.setCreativeTab(TechExpansion.tab_techExpansion);
		this.setRegistryName(regName);
	}
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return Sets.newHashSet("axe");
	}
	@Override
	public int getHarvestLevel(ItemStack stack, String p_getHarvestLevel_2_) {
		return 2;
	}
}
