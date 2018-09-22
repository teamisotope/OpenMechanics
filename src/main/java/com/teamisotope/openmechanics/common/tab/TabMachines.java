package com.teamisotope.openmechanics.common.tab;

import com.teamisotope.openmechanics.OMStatic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabMachines extends CreativeTabs {

    public TabMachines() {
        super(OMStatic.MODID + ".machines");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Blocks.FURNACE);
    }

}
