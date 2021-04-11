package com.boonchuy.at.undyeterracotta;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class rightclicklistener implements Listener {
    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        // If the player is sneaking or not clicking a cauldron, we don't care. Return to cancel event.
        if (p.isSneaking() || event.getClickedBlock().getType() != Material.CAULDRON) {
            return;
        }

        // Check that cauldron has water in it
        Block b = event.getClickedBlock();
        Levelled cauldronData = (Levelled) b.getBlockData();
        // Cauldron does not have any water, return to cancel event.
        if (cauldronData.getLevel() == 0) {
            return;
        }

        // Check the item being right clicked onto a water filled cauldron is non-glazed terracotta, but not white
        // terracotta, and then replace one item of it with white wool. If it isn't, we return to cancel removing a
        // water level.
        ItemStack i = event.getItem();
        if (i.getType().toString().endsWith("_TERRACOTTA") && !i.getType().toString().contains("GLAZED")
                && i.getType() != Material.WHITE_TERRACOTTA) {
            i.setAmount(i.getAmount() - 1);
            p.getInventory().addItem(new ItemStack(Material.TERRACOTTA));
            event.setCancelled(true);
        } else {
            return;
        }

        // Remove a water level from the cauldron
        cauldronData.setLevel(cauldronData.getLevel() - 1);
        b.setBlockData(cauldronData);
    }
}
