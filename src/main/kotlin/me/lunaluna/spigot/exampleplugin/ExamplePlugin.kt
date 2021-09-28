package me.lunaluna.spigot.exampleplugin

import me.lunaluna.spigot.exampleplugin.listeners.ExampleListener
import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugin : JavaPlugin() {
    override fun onEnable() {
        ExampleListener(this)
    }
    override fun onDisable() { }
}