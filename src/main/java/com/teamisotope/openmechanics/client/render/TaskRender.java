package com.teamisotope.openmechanics.client.render;

import com.teamisotope.openmechanics.api.task.Task;
import com.teamisotope.openmechanics.api.task.TaskMalformedInputException;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;

public class TaskRender extends Task {

    @Override
    public void run(TaskEnvironment env) throws TaskMalformedInputException {
        Object[] inputs = this.getInputs();
        if ((inputs[0] instanceof Item) && (inputs[1] instanceof RenderParams)) {
            ModelRegistryEvent e = (ModelRegistryEvent) env.evtInstance;
            Item item = (Item) inputs[0];
            RenderParams params = (RenderParams) inputs[1];
            System.out.println(item.getRegistryName() + ": " + params.getMRL().toString());
        } else {
            throw new TaskMalformedInputException();
        }
    }

    @Override
    public TaskEnvironment getWantedEnvironment() {
        return new TaskEnvironment(ModelRegistryEvent.class);
    }

    /**
     * @param inputs
     * The inputs should be in this format, otherwise it will throw a TaskInputException:
     * {
     *     [0]: Item item,
     *     [1]: RenderParams parameters,
     *     [2+]: Ignored
     * }
     */

    public TaskRender(Object[] inputs) {
        super(inputs);
    }

}
