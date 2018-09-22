package com.teamisotope.openmechanics.common.tab;

import com.teamisotope.openmechanics.OMStatic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TabMiscellaneous extends CreativeTabs {

    public TabMiscellaneous() {
        super(OMStatic.MODID + ".miscellaneous");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.LAVA_BUCKET);
    }

}
