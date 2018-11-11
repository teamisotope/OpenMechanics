package com.teamisotope.openmechanics.client.render;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class RenderParams {

    private ModelResourceLocation mrl;

    public RenderParams(ModelResourceLocation mrl) {
        this.mrl = mrl;
    }

    public void setMRL(ModelResourceLocation mrl) {
        this.mrl = mrl;
    }

    public ModelResourceLocation getMRL() {
        return mrl;
    }

}
