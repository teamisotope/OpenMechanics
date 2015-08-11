package com.collabmods.techexpansion.armor;

import com.collabmods.techexpansion.TechExpansion;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class AluminumArmo extends ItemArmor {

	public static String textureName;
	public static String extrapath;
	
	public AluminumArmo(String unlocalizedName, ArmorMaterial material, String textureName, int type,
			String itemTextureName, String extrapath) {
		super(material, 0, type);
		this.textureName = textureName;
		this.extrapath = extrapath;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(TechExpansion.MODID + ":" + itemTextureName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return TechExpansion.MODID + ":textures/armor/" + extrapath + this.textureName + "_"
				+ (this.armorType == 2 ? "2" : "1") + ".png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (itemStack.getItem().equals(AluminumArmor.aluminumLeggings))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
	}
	
}
