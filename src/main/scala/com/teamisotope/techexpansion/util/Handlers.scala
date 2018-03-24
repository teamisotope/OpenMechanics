package com.teamisotope.techexpansion.util

import net.minecraft.client.resources.I18n
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.text.{TextComponentString, TextFormatting}
import net.minecraftforge.event.entity.EntityJoinWorldEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

object Handlers {

  @SubscribeEvent
  def entityJoinWorldEvent(e: EntityJoinWorldEvent): Unit = {
    // TODO: Update checker?
  }

}
