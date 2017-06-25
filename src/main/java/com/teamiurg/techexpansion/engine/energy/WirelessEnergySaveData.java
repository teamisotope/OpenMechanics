/*package com.teamiurg.techexpansion.engine.energy;

import com.teamiurg.techexpansion.utils.Reference;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapStorage;

public class WirelessEnergySaveData extends WorldSavedData { 
	private static final String DATA_NAME = Reference.MOD_ID + "_WE";
	
	public WirelessEnergySaveData() {
		super(DATA_NAME);
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound tag) {
		
		return tag;
	}
	public NBTTagCompound setEnergy(int channel, int energy) {
		NBTTagCompound tag = writeToNBT
		return tag;
	}
	public static WirelessEnergySaveData get(World world) {
		  // The IS_GLOBAL constant is there for clarity, and should be simplified into the right branch.
		  MapStorage storage = world.getMapStorage();
		  WirelessEnergySaveData instance = (WirelessEnergySaveData) storage.getOrLoadData(WirelessEnergySaveData.class, DATA_NAME);

		  if (instance == null) {
		    instance = new WirelessEnergySaveData();
		    storage.setData(DATA_NAME, instance);
		  }
		  return instance;
		}
	
}
*/