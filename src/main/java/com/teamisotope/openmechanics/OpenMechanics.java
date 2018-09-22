package com.teamisotope.openmechanics;

import com.teamisotope.openmechanics.common.tab.TabMachines;
import com.teamisotope.openmechanics.common.tab.TabMaterials;
import com.teamisotope.openmechanics.common.tab.TabMiscellaneous;
import com.teamisotope.openmechanics.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = OMStatic.MODID, name = OMStatic.MODNAME, version = OMStatic.MODVER, dependencies = OMStatic.MODDEPS, useMetadata = true)
public class OpenMechanics {

    @SidedProxy(clientSide = OMStatic.PROXYCLIENT, serverSide = OMStatic.PROXYSERVER)
    public static CommonProxy proxy;

    public static CreativeTabs tabMaterials = new TabMaterials();

    public static CreativeTabs tabMachines = new TabMachines();

    public static CreativeTabs tabMiscellaneous = new TabMiscellaneous();

    @Mod.Instance
    public static OpenMechanics instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

}
