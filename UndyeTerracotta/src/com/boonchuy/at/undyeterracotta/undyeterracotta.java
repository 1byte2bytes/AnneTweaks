package com.boonchuy.at.undyeterracotta;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class undyeterracotta extends JavaPlugin {
    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
        Bukkit.getServer().getPluginManager().registerEvents(new rightclicklistener(), this);
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }
}
