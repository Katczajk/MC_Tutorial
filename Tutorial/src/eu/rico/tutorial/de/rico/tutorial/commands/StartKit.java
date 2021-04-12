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
	// Zeichenkette lbl_inventory mit "StarterKit" gefüllt
	private String msg = "StarterKit geöffnet";
	// Zeichenkette msg mit "StarterKit geöffnet" gefüllt
	public StartKit() {
	// öffentlicher constructor aber wird nie verwendet	
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {
	// Funktion onCommand mit Parametern (siehe HealCommand)
		if (sender instanceof Player) {
		// wenn der Aufrufer "sender" teil von "Player" ist dann gehts los  
		Player p = (Player) sender;
		// objekt p Typ Player wird gesetzt mit Werten von sender aus Klassentyp Player
		Inventory inventory = Bukkit.createInventory(p, 9*3, lbl_inventory);
		// object "inventory" von Inventory Typ erstellt und Ergebsniss von Bukkit.createInventory zugewiesen mit Parametern
		inventory.addItem(addItem("StartKit Brustplatte", Material.DIAMOND_CHESTPLATE, Enchantment.LOOT_BONUS_MOBS, true));
		inventory.addItem(addItem("StartKit Schuhe", Material.DIAMOND_BOOTS, Enchantment.WATER_WORKER, true));
		inventory.addItem(addItem("StartKit Kopf", Material.DIAMOND_HELMET, Enchantment.LUCK, true));
		inventory.addItem(addItem("StartKit Hose", Material.DIAMOND_LEGGINGS, Enchantment.DAMAGE_ALL ,true));
		inventory.addItem(addItem("StartKit Axt", Material.DIAMOND_AXE, Enchantment.DIG_SPEED, true));
		inventory.addItem(addItem("StartKit Spitzhacke", Material.DIAMOND_PICKAXE, Enchantment.DIG_SPEED, true));
		// Funktionsaufruf mit Parametern
		
		p.openInventory(inventory);
		// öffne das fertige Inventarfür den Spieler
		p.sendMessage(msg);
		// Spieler die Nachricht "msg" senden
		
		
		}
		
		return false;
		// boolscher Wert wird rückgegeben
		// Rückgabe ist immer erlaubt aber nicht besonders relevant wenn diese vom Empfänger nicht geprüft wird.
		// muss aber vorhanden sein, wenn das die Funktion erfordert
		
		
	}
	
	public boolean machmitrueckgabe() { return false; }
	// Funktion mit Rückgabe wert
	// Rückgabewert ist im Beispiel drin
	// kann man auch separat deklarieren
	// boolean Check = true;
	// return Check;
	// durch eine Variable wird er dynamisch und kann überschrieben werden
	// z.B. Check = false; oder Check = true;
	// dann wird die Variable Check überschrieben
	
	public void ohnerueckgabe() { return; }
	// Funktion ohne Rückgabe wert
	
	private ItemStack addItem (String lbl_chest, Material material, Enchantment enchantment, Boolean unbreakable) {
	// eigene geschriebene Zusatzfunktion
	// Parameter hier, Bezeichner lbl_chest aus Typ String(Zeichenkette), Objekt material vom Typ Material, 
	// enchantment vom Typ Enchantment und Boolean unbreakable (möglich dort nur true oder false !) 
		
		ItemStack item = new ItemStack(material);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(lbl_chest);
		itemmeta.addEnchant(enchantment, 5, false);
		itemmeta.setUnbreakable(unbreakable);
		item.setItemMeta(itemmeta);
		return item;
	}

}
