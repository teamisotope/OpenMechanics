package com.teamiurg.techexpansion.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TEItem extends Item {

	public TEItem(String name, String regName, CreativeTabs tab, int maxStackSize) {
		this.setUnlocalizedName(name).setCreativeTab(tab).setMaxStackSize(maxStackSize).setRegistryName(regName);
	}
}
