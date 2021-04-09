package com.boonchuy.at.uncraftstairs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class uncraftstairs extends JavaPlugin {
    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
        ItemStack target = new ItemStack(Material.OAK_PLANKS, 6);
        NamespacedKey key = new NamespacedKey(this, "uncraft_oak_stairs");
        ShapelessRecipe recipe = new ShapelessRecipe(key, target);
        recipe.addIngredient(4, Material.OAK_STAIRS);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }
}
