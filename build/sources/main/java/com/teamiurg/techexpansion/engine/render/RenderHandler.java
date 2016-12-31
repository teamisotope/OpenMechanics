package com.teamiurg.techexpansion.engine.render;

import com.teamiurg.techexpansion.utils.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderHandler {
	

	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	@SideOnly(Side.CLIENT)
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders(Item... items) {
		for (int i = 0; i < items.length; i++) {
			registerRender(items[i]);
		}
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders(Block... blocks) {
		for (int i = 0; i < blocks.length; i++) {
			registerRender(blocks[i]);
		}
	}
	
}
