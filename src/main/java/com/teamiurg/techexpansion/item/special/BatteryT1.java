package com.teamiurg.techexpansion.item.special;

import java.util.List;

import com.teamiurg.techexpansion.TechExpansion;
import com.teamiurg.techexpansion.item.TEItem;

import cofh.api.energy.ItemEnergyContainer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BatteryT1 extends ItemEnergyContainer {
	
	public BatteryT1() {
		this.setUnlocalizedName("battery_t1").setCreativeTab(TechExpansion.tab_techExpansion).setMaxStackSize(1)
				.setRegistryName("battery_t1");
	}

	public BatteryT1(int capacity) {

		this(capacity, capacity, capacity);
	}

	public BatteryT1(int capacity, int maxTransfer) {

		this(capacity, maxTransfer, maxTransfer);
	}

	public BatteryT1(int capacity, int maxReceive, int maxExtract) {

		this.capacity = capacity;
		this.maxReceive = maxReceive;
		this.maxExtract = maxExtract;
		this.setUnlocalizedName("battery_t1").setCreativeTab(TechExpansion.tab_techExpansion).setMaxStackSize(1)
				.setRegistryName("battery_t1");
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean idk) {
		tooltip.add("Current energy: " + this.getEnergyStored(stack) + "/" + this.getMaxEnergyStored(stack) + " RF");
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world,
			EntityPlayer player, EnumHand hand) {
		this.receiveEnergy(stack, 1, false);
		return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
	}
	
	
	
}
