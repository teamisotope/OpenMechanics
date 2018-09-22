package com.teamisotope.openmechanics.common.block;

import com.teamisotope.openmechanics.OMStatic;
import com.teamisotope.openmechanics.common.block.crafting.BlockMachineFrame;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = OMStatic.MODID)
public class OMBlocks {

    @GameRegistry.ObjectHolder(OMStatic.MODID + ":machine_frame")
    public static BlockMachineFrame machine_frame;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        e.getRegistry().register(new BlockMachineFrame());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().register(new ItemBlock(machine_frame).setRegistryName(machine_frame.getRegistryName()));
    }

}
