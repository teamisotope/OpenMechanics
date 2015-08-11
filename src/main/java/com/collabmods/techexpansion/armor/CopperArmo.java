package com.collabmods.techexpansion.armor;

import com.collabmods.techexpansion.TechExpansion;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CopperArmo extends ItemArmor{

	public static String textureName;
	public static String extrapath;
	
	public CopperArmo(String unlocalizedName, ArmorMaterial material, String textureName, int type, String itemTextureName, String extrapath) {
		super(material, 0, type);
		this.textureName = textureName;
		this.extrapath = extrapath;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(TechExpansion.MODID + ":" + itemTextureName );
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return TechExpansion.MODID + ":textures/armor/" + extrapath + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	
}
