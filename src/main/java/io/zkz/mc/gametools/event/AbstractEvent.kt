package io.zkz.mc.gametools.event

import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import kotlin.reflect.KClass

abstract class AbstractEvent : Event() {
    companion object {
        private val handlerLists = mutableMapOf<KClass<*>, HandlerList>()
    }

    override fun getHandlers(): HandlerList {
        return handlerLists.getOrPut(this::class, ::HandlerList)
    }
}
