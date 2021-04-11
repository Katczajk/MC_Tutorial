package de.rico.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class StartKit implements CommandExecutor{
	
	public static String lbl_command = "startkit";
	
	private String lbl_inventory = "StarterKit";
	private String msg = "StarterKit geöffnet";
	
	public StartKit() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {

		if (sender instanceof Player) {
		Player p = (Player) sender;
		
		//Inventory inventory = Bukkit.createInventory(p, 9*3, lbl_inventory);
		//ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		//ItemMeta itemmeta = item.getItemMeta();
		//itemmeta.setDisplayName(lbl_chest);
		//itemmeta.addEnchant(Enchantment.QUICK_CHARGE, 5, false);
		//item.setItemMeta(itemmeta);
		//inventory.addItem(item);
		Inventory inventory = Bukkit.createInventory(p, 9*3, lbl_inventory); 
		inventory.addItem(addItem("StartKit Brustplatte", Material.DIAMOND_CHESTPLATE, Enchantment.LOOT_BONUS_MOBS, true));
		inventory.addItem(addItem("StartKit Schuhe", Material.DIAMOND_BOOTS, Enchantment.WATER_WORKER, true));
		inventory.addItem(addItem("StartKit Kopf", Material.DIAMOND_HELMET, Enchantment.LUCK, true));
		inventory.addItem(addItem("StartKit Hose", Material.DIAMOND_LEGGINGS, Enchantment.DAMAGE_ALL ,true));
		inventory.addItem(addItem("StartKit Axt", Material.DIAMOND_AXE, Enchantment.DIG_SPEED, true));
		inventory.addItem(addItem("StartKit Spitzhacke", Material.DIAMOND_PICKAXE, Enchantment.DIG_SPEED, true));
		
		p.openInventory(inventory);
		p.sendMessage(msg);
		
		
		
		}
		
		return false;
	}
	
	private ItemStack addItem (String lbl_chest, Material material, Enchantment enchantment, Boolean unbreakable) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(lbl_chest);
		itemmeta.addEnchant(enchantment, 5, false);
		itemmeta.setUnbreakable(unbreakable);
		item.setItemMeta(itemmeta);
		return item;
	}

}
