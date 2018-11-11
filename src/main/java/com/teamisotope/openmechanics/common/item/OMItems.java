package com.teamisotope.openmechanics.common.item;

import com.teamisotope.openmechanics.client.render.RenderParams;
import com.teamisotope.openmechanics.client.render.TaskRender;
import com.teamisotope.openmechanics.common.util.TaskLists;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class OMItems {

    @GameRegistry.ObjectHolder("openmechanics:temporary_item")
    public static Item temporary_item;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        temporary_item = new Item().setRegistryName("openmechanics:temporary_item");
        e.getRegistry().register(temporary_item);
        TaskLists.TASK_LIST_RENDER.register(new TaskRender(new Object[]{temporary_item, new RenderParams(new ModelResourceLocation(new ResourceLocation("openmechanics", "temporary_item"), "inventory"))}));
    }


}
