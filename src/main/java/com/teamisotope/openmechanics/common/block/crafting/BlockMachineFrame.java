package com.teamisotope.openmechanics.common.block.crafting;

import com.teamisotope.openmechanics.OMStatic;
import com.teamisotope.openmechanics.OpenMechanics;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;

public class BlockMachineFrame extends Block {

    public BlockMachineFrame() {
        super(Material.IRON);
        this.setUnlocalizedName(OMStatic.MODID + ".machine_frame").setRegistryName(OMStatic.MODID, "machine_frame").setHardness(2.0f).setResistance(5.0f).setCreativeTab(OpenMechanics.tabMaterials).setHarvestLevel("pickaxe", 1);
    }

}
