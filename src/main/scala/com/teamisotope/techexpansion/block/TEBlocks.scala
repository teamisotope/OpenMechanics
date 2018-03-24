package com.teamisotope.techexpansion.block

import com.teamisotope.techexpansion.TechExpansion
import com.teamisotope.techexpansion.block.special.{GlassChamber, ItemRawMineral, RawMineral, VacuumPump}
import com.teamisotope.techexpansion.mineral.{Mineral, MineralRegistry}
import com.teamisotope.techexpansion.util.RenderUtils
import com.teamisotope.techexpansion.world.{EnumDimension, Ore}
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.item.{ItemBlock, ItemStack}
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.oredict.OreDictionary

object TEBlocks {

  val raw_mineral: RawMineral = new RawMineral()
  val raw_mineral_item: ItemRawMineral = new ItemRawMineral()

  val galena: Mineral = new Mineral().setUnlocName("techexpansion.mineral.galena").setRegistryName("techexpansion:galena")
  val native_silver: Mineral = new Mineral().setUnlocName("techexpansion.mineral.native_silver").setRegistryName("techexpansion:native_silver")
  val tetrataenite: Mineral = new Mineral().setUnlocName("techexpansion.mineral.tetrataenite").setRegistryName("techexpansion:tetrataenite")
  val bauxite: Mineral = new Mineral().setUnlocName("techexpansion.mineral.bauxite").setRegistryName("techexpansion:bauxite")
  val cassiterite: Mineral = new Mineral().setUnlocName("techexpansion.mineral.cassiterite").setRegistryName("techexpansion:cassiterite")
  val native_gold: Mineral = new Mineral().setUnlocName("techexpansion.mineral.native_gold").setRegistryName("techexpansion:native_gold")
  val native_copper: Mineral = new Mineral().setUnlocName("techexpansion.mineral.native_copper").setRegistryName("techexpansion:native_copper")

  val copper_block: TEBlock = new TEBlock(Material.ROCK, "copper_block", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val tin_block: TEBlock = new TEBlock(Material.ROCK, "tin_block", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val aluminum_block: TEBlock = new TEBlock(Material.ROCK, "aluminum_block", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val nickel_block: TEBlock = new TEBlock(Material.ROCK, "nickel_block", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val silver_block: TEBlock = new TEBlock(Material.ROCK, "silver_block", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)
  val lead_block: TEBlock = new TEBlock(Material.ROCK, "lead_block", TechExpansion.tab_blocks, 3.0f, 10.0f, "pickaxe", 1)

  val glass_chamber: TEBlock = new GlassChamber()
  val vacuum_pump: TEBlock = new VacuumPump()

  def register(): Unit = {
    GameRegistry.register(raw_mineral)
    GameRegistry.register(raw_mineral_item)
    MineralRegistry.registerMineral(galena)
    MineralRegistry.registerMineral(native_silver)
    MineralRegistry.registerMineral(tetrataenite)
    MineralRegistry.registerMineral(bauxite)
    MineralRegistry.registerMineral(cassiterite)
    MineralRegistry.registerMineral(native_gold)
    MineralRegistry.registerMineral(native_copper)

    OreDictionary.registerOre("oreGalena", new ItemStack(raw_mineral_item, 1, 0))
    OreDictionary.registerOre("oreLead", new ItemStack(raw_mineral_item, 1, 0))
    OreDictionary.registerOre("galena", new ItemStack(raw_mineral_item, 1, 0))

    OreDictionary.registerOre("oreNativeSilver", new ItemStack(raw_mineral_item, 1, 1))
    OreDictionary.registerOre("oreSilver", new ItemStack(raw_mineral_item, 1, 1))
    OreDictionary.registerOre("nativeSilver", new ItemStack(raw_mineral_item, 1, 1))

    OreDictionary.registerOre("oreTetrataenite", new ItemStack(raw_mineral_item, 1, 2))
    OreDictionary.registerOre("oreIron", new ItemStack(raw_mineral_item, 1, 2))
    OreDictionary.registerOre("oreNickel", new ItemStack(raw_mineral_item, 1, 2))
    OreDictionary.registerOre("tetrataenite", new ItemStack(raw_mineral_item, 1, 2))

    OreDictionary.registerOre("oreBauxite", new ItemStack(raw_mineral_item, 1, 3))
    OreDictionary.registerOre("oreAluminum", new ItemStack(raw_mineral_item, 1, 3))
    OreDictionary.registerOre("bauxite", new ItemStack(raw_mineral_item, 1, 3))

    OreDictionary.registerOre("oreCassiterite", new ItemStack(raw_mineral_item, 1, 4))
    OreDictionary.registerOre("oreTin", new ItemStack(raw_mineral_item, 1, 4))
    OreDictionary.registerOre("cassiterite", new ItemStack(raw_mineral_item, 1, 4))

    OreDictionary.registerOre("oreNativeGold", new ItemStack(raw_mineral_item, 1, 5))
    OreDictionary.registerOre("oreGold", new ItemStack(raw_mineral_item, 1, 5))
    OreDictionary.registerOre("nativeGold", new ItemStack(raw_mineral_item, 1, 5))

    OreDictionary.registerOre("oreNativeCopper", new ItemStack(raw_mineral_item, 1, 6))
    OreDictionary.registerOre("oreCopper", new ItemStack(raw_mineral_item, 1, 6))
    OreDictionary.registerOre("nativeCopper", new ItemStack(raw_mineral_item, 1, 6))

    registerBlock(copper_block)
    OreDictionary.registerOre("blockCopper", copper_block)
    registerBlock(tin_block)
    OreDictionary.registerOre("blockTin", tin_block)
    registerBlock(aluminum_block)
    OreDictionary.registerOre("blockAluminum", aluminum_block)
    registerBlock(nickel_block)
    OreDictionary.registerOre("blockNickel", nickel_block)
    registerBlock(silver_block)
    OreDictionary.registerOre("blockSilver", silver_block)
    registerBlock(lead_block)
    OreDictionary.registerOre("blockLead", lead_block)

    registerBlock(vacuum_pump)
    registerBlock(glass_chamber)
  }

  def renders(): Unit = {



    RenderUtils.register(copper_block, "resources")
    RenderUtils.register(tin_block, "resources")
    RenderUtils.register(aluminum_block, "resources")
    RenderUtils.register(nickel_block, "resources")
    RenderUtils.register(silver_block, "resources")
    RenderUtils.register(lead_block, "resources")

    RenderUtils.register(vacuum_pump, "machines")
    RenderUtils.register(glass_chamber, "machines")
    raw_mineral_item.initModel()
  }

  private def registerBlock(b: TEBlock) {
    GameRegistry.register(b)
    GameRegistry.register(b.itemblock)
  }

}
