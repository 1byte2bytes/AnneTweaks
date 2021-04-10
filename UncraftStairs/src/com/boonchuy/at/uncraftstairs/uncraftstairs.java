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
        // Plank based
        CreateUncraftStairRecipe(Material.OAK_STAIRS, Material.OAK_PLANKS, "oak");
        CreateUncraftStairRecipe(Material.SPRUCE_STAIRS, Material.SPRUCE_PLANKS, "spruce");
        CreateUncraftStairRecipe(Material.BIRCH_STAIRS, Material.BIRCH_PLANKS, "birch");
        CreateUncraftStairRecipe(Material.JUNGLE_STAIRS, Material.JUNGLE_PLANKS, "jungle");
        CreateUncraftStairRecipe(Material.ACACIA_STAIRS, Material.ACACIA_PLANKS, "acacia");
        CreateUncraftStairRecipe(Material.DARK_OAK_STAIRS, Material.DARK_OAK_PLANKS, "dark_oak");
        CreateUncraftStairRecipe(Material.CRIMSON_STAIRS, Material.CRIMSON_PLANKS, "crimson");
        CreateUncraftStairRecipe(Material.WARPED_STAIRS, Material.WARPED_PLANKS, "warped");
        // Stone based
        CreateUncraftStairRecipe(Material.STONE_STAIRS, Material.STONE, "stone");
        CreateUncraftStairRecipe(Material.COBBLESTONE_STAIRS, Material.COBBLESTONE, "cobblestone");
        CreateUncraftStairRecipe(Material.MOSSY_COBBLESTONE_STAIRS, Material.MOSSY_COBBLESTONE, "mossy_cobblestone");
        CreateUncraftStairRecipe(Material.STONE_BRICK_STAIRS, Material.STONE_BRICKS, "stone_brick");
        CreateUncraftStairRecipe(Material.MOSSY_STONE_BRICK_STAIRS, Material.MOSSY_STONE_BRICKS, "mossy_stone_bricks");
        CreateUncraftStairRecipe(Material.ANDESITE_STAIRS, Material.ANDESITE, "andesite");
        CreateUncraftStairRecipe(Material.POLISHED_ANDESITE_STAIRS, Material.POLISHED_ANDESITE, "polished_andesite");
        CreateUncraftStairRecipe(Material.DIORITE_STAIRS, Material.DIORITE, "diorite");
        CreateUncraftStairRecipe(Material.POLISHED_DIORITE_STAIRS, Material.POLISHED_DIORITE, "polished_diorite");
        CreateUncraftStairRecipe(Material.GRANITE_STAIRS, Material.GRANITE, "granite");
        CreateUncraftStairRecipe(Material.POLISHED_GRANITE_STAIRS, Material.POLISHED_GRANITE, "polished_granite");
        // Sand based
        CreateUncraftStairRecipe(Material.SANDSTONE_STAIRS, Material.SANDSTONE, "sandstone");
        CreateUncraftStairRecipe(Material.SMOOTH_SANDSTONE_STAIRS, Material.SMOOTH_SANDSTONE, "smooth_sandstone");
        CreateUncraftStairRecipe(Material.RED_SANDSTONE_STAIRS, Material.RED_SANDSTONE, "red_sandstone");
        CreateUncraftStairRecipe(Material.SMOOTH_RED_SANDSTONE_STAIRS, Material.SMOOTH_RED_SANDSTONE, "smooth_red_sandstone");
        // Brick based
        CreateUncraftStairRecipe(Material.BRICK_STAIRS, Material.BRICKS, "bricks");
        // Ocean based
        CreateUncraftStairRecipe(Material.PRISMARINE_STAIRS, Material.PRISMARINE, "prismarine");
        CreateUncraftStairRecipe(Material.PRISMARINE_BRICK_STAIRS, Material.PRISMARINE_BRICKS, "prismarine_brick");
        CreateUncraftStairRecipe(Material.DARK_PRISMARINE_STAIRS, Material.DARK_PRISMARINE, "dark_prismarine");
        // Nether based
        CreateUncraftStairRecipe(Material.NETHER_BRICK_STAIRS, Material.NETHER_BRICK, "nether_brick");
        CreateUncraftStairRecipe(Material.RED_NETHER_BRICK_STAIRS, Material.RED_NETHER_BRICKS, "red_nether_brick");
        CreateUncraftStairRecipe(Material.QUARTZ_STAIRS, Material.QUARTZ, "quartz");
        CreateUncraftStairRecipe(Material.SMOOTH_QUARTZ_STAIRS, Material.SMOOTH_QUARTZ, "smooth_quartz");
        CreateUncraftStairRecipe(Material.BLACKSTONE_STAIRS, Material.BLACKSTONE, "blackstone");
        // End based
        CreateUncraftStairRecipe(Material.PURPUR_STAIRS, Material.PURPUR_BLOCK, "purpur");
        CreateUncraftStairRecipe(Material.END_STONE_BRICK_STAIRS, Material.END_STONE_BRICKS, "end_stone_bricks");
    }

    void CreateUncraftStairRecipe(Material stairs, Material planks, String type) {
        ItemStack target = new ItemStack(planks, 4);
        NamespacedKey key = new NamespacedKey(this, "uncraft_" + type + "_stairs");
        ShapelessRecipe recipe = new ShapelessRecipe(key, target);
        recipe.addIngredient(4, stairs);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }
}
