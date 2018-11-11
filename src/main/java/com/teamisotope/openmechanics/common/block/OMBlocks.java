package com.teamisotope.openmechanics.common.block;

import com.teamisotope.openmechanics.OMStatic;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = OMStatic.MODID)
public class OMBlocks {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
    }

}
