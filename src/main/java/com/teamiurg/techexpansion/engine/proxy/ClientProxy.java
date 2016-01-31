package com.teamiurg.techexpansion.engine.proxy;

import com.teamiurg.techexpansion.block.TEBlocks;
import com.teamiurg.techexpansion.item.TEItems;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy{

	@Override
	@SideOnly(Side.CLIENT)
	public void registerRenders() {
		TEBlocks.registerRenders();
		TEItems.registerRenders();
	}
}
