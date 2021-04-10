package com.boonchuy.at.uncraftslabs;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class uncraftslabs extends JavaPlugin {
    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
        // Overworld wood based
        CreateUncraftSlabRecipe(Material.OAK_SLAB, Material.OAK_PLANKS, "oak");
        CreateUncraftSlabRecipe(Material.SPRUCE_SLAB, Material.SPRUCE_PLANKS, "spruce");
        CreateUncraftSlabRecipe(Material.BIRCH_SLAB, Material.BIRCH_PLANKS, "birch");
        CreateUncraftSlabRecipe(Material.JUNGLE_SLAB, Material.JUNGLE_PLANKS, "jungle");
        CreateUncraftSlabRecipe(Material.ACACIA_SLAB, Material.ACACIA_PLANKS, "acacia");
        CreateUncraftSlabRecipe(Material.DARK_OAK_SLAB, Material.DARK_OAK_PLANKS, "dark_oak");
        // Stone based
        CreateUncraftSlabRecipe(Material.STONE_SLAB, Material.STONE, "stone");
        CreateUncraftSlabRecipe(Material.SMOOTH_STONE_SLAB, Material.SMOOTH_STONE, "smooth_stone");
        CreateUncraftSlabRecipe(Material.COBBLESTONE_SLAB, Material.COBBLESTONE, "cobblestone");
        CreateUncraftSlabRecipe(Material.MOSSY_COBBLESTONE_SLAB, Material.MOSSY_COBBLESTONE, "mossy_cobblestone");
        CreateUncraftSlabRecipe(Material.STONE_BRICK_SLAB, Material.STONE_BRICKS, "stone_brick");
        CreateUncraftSlabRecipe(Material.MOSSY_STONE_BRICK_SLAB, Material.MOSSY_STONE_BRICKS, "mossy_stone_brick");
        CreateUncraftSlabRecipe(Material.ANDESITE_SLAB, Material.ANDESITE, "andesite");
        CreateUncraftSlabRecipe(Material.POLISHED_ANDESITE_SLAB, Material.POLISHED_ANDESITE, "polished_andesite");
        CreateUncraftSlabRecipe(Material.DIORITE_SLAB, Material.DIORITE, "diorite");
        CreateUncraftSlabRecipe(Material.POLISHED_DIORITE_SLAB, Material.POLISHED_DIORITE, "polished_diorite");
        CreateUncraftSlabRecipe(Material.GRANITE_SLAB, Material.GRANITE, "granite");
        CreateUncraftSlabRecipe(Material.POLISHED_GRANITE_SLAB, Material.POLISHED_GRANITE, "polished_granite");
        // Sand based
        CreateUncraftSlabRecipe(Material.SANDSTONE_SLAB, Material.SANDSTONE, "sandstone");
        CreateUncraftSlabRecipe(Material.CUT_SANDSTONE_SLAB, Material.CUT_SANDSTONE, "cut_sandstone");
        CreateUncraftSlabRecipe(Material.SMOOTH_SANDSTONE_SLAB, Material.SMOOTH_SANDSTONE, "smooth_sandstone");
        CreateUncraftSlabRecipe(Material.RED_SANDSTONE_SLAB, Material.RED_SANDSTONE, "red_sandstone");
        CreateUncraftSlabRecipe(Material.CUT_RED_SANDSTONE_SLAB, Material.CUT_RED_SANDSTONE, "cut_red_sandstone");
        CreateUncraftSlabRecipe(Material.SMOOTH_RED_SANDSTONE_SLAB, Material.SMOOTH_RED_SANDSTONE, "smooth_red_sandstone");
        // Brick based
        CreateUncraftSlabRecipe(Material.BRICK_SLAB, Material.BRICKS, "brick");
        // Ocean based
        CreateUncraftSlabRecipe(Material.PRISMARINE_SLAB, Material.PRISMARINE, "prismarine");
        CreateUncraftSlabRecipe(Material.PRISMARINE_BRICK_SLAB, Material.PRISMARINE_BRICKS, "prismarine_brick");
        CreateUncraftSlabRecipe(Material.DARK_PRISMARINE_SLAB, Material.DARK_PRISMARINE, "dark_prismarine");
        // Nether based
        CreateUncraftSlabRecipe(Material.NETHER_BRICK_SLAB, Material.NETHER_BRICK, "nether_brick");
        CreateUncraftSlabRecipe(Material.RED_NETHER_BRICK_SLAB, Material.RED_NETHER_BRICKS, "red_nether_brick");
        CreateUncraftSlabRecipe(Material.QUARTZ_SLAB, Material.QUARTZ_BLOCK, "quartz");
        CreateUncraftSlabRecipe(Material.SMOOTH_QUARTZ_SLAB, Material.SMOOTH_QUARTZ, "smooth_quartz");
        CreateUncraftSlabRecipe(Material.CRIMSON_SLAB, Material.CRIMSON_PLANKS, "crimson");
        CreateUncraftSlabRecipe(Material.WARPED_SLAB, Material.WARPED_PLANKS, "warped");
        // End based
        CreateUncraftSlabRecipe(Material.PURPUR_SLAB, Material.PURPUR_BLOCK, "purpur");
        CreateUncraftSlabRecipe(Material.END_STONE_BRICK_SLAB, Material.END_STONE_BRICKS, "end_stone_brick");
    }

    void CreateUncraftSlabRecipe(Material slabs, Material planks, String type) {
        ItemStack target = new ItemStack(planks, 1);
        NamespacedKey key = new NamespacedKey(this, "uncraft_" + type + "_slabs");
        ShapelessRecipe recipe = new ShapelessRecipe(key, target);
        recipe.addIngredient(2, slabs);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }
}
