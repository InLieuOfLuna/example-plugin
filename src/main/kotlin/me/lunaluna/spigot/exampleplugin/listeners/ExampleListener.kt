package me.lunaluna.spigot.exampleplugin.listeners

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerBedEnterEvent
import org.bukkit.plugin.java.JavaPlugin

class ExampleListener(plugin: JavaPlugin) : Listener {

    init { Bukkit.getPluginManager().registerEvents(this, plugin) }

    @EventHandler
    fun onSleep(event: PlayerBedEnterEvent) {
        event.player.damage(1.0)
    }
}