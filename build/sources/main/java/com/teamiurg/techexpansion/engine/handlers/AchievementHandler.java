package com.teamiurg.techexpansion.engine.handlers;

import com.teamiurg.techexpansion.block.TEBlocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AchievementHandler {
	
	public static final Achievement achCopper = new Achievement("achievement.copper", "copper", 0, 0, new ItemStack(TEBlocks.copper_ore), null);
	public static final Achievement achAluminum = new Achievement("achievement.aluminum", "aluminum", 6, 0, new ItemStack(TEBlocks.aluminum_ore), null);
	public static final Achievement achTin = new Achievement("achievement.tin", "tin", 3, 0, new ItemStack(TEBlocks.tin_ore), null);
	public static final AchievementPage achPage = new AchievementPage("TechExpansion", achCopper, achTin, achAluminum);
	
	public static void registerAchievements() {
		achCopper.setSpecial().registerStat();
		achAluminum.setSpecial().registerStat();
		achTin.setSpecial().registerStat();
		AchievementPage.registerAchievementPage(achPage);
	}
	
	@SubscribeEvent
	public void playerPickupItem(EntityItemPickupEvent evt) {
		if (evt.getItem().getEntityItem().getItem() == Item.getItemFromBlock(TEBlocks.copper_ore)) {
			evt.getEntityPlayer().addStat(achCopper);
		} else if (evt.getItem().getEntityItem().getItem() == Item.getItemFromBlock(TEBlocks.aluminum_ore)) {
			evt.getEntityPlayer().addStat(achAluminum);
		} else if (evt.getItem().getEntityItem().getItem() == Item.getItemFromBlock(TEBlocks.tin_ore)) {
			evt.getEntityPlayer().addStat(achTin);
		}
	}
}
