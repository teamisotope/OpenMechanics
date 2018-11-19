package com.teamisotope.openmechanics.client.render;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class RenderParams {

    private ModelResourceLocation mrl;
    private int meta;

    public RenderParams(int meta, ModelResourceLocation mrl) {
        this.mrl = mrl;
        this.meta = meta;
    }

    public RenderParams(ModelResourceLocation mrl) {
        this.mrl = mrl;
        this.meta = 0;
    }

    public void setMRL(ModelResourceLocation mrl) {
        this.mrl = mrl;
    }

    public void setMeta(int meta) { this.meta = meta; }

    public ModelResourceLocation getMRL() {
        return mrl;
    }

    public int getMeta() { return meta; }

}
