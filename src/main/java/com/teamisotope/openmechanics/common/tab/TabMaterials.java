package com.teamisotope.openmechanics.common.tab;

import com.teamisotope.openmechanics.OMStatic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabMaterials extends CreativeTabs {

    public TabMaterials() {
        super(OMStatic.MODID + ".materials");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.DIAMOND);
    }

}
