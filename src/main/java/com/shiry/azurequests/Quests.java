package com.shiry.azurequests;

import org.bukkit.plugin.java.JavaPlugin;

public final class Quests extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello, Paper world!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Goodbye, Paper world!");
    }
}
