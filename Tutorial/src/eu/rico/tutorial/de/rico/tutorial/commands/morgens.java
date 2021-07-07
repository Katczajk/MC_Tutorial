package de.rico.tutorial.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
// Automatischer Import ben�tigter Sachen wie schon in HeaCommand.java

public class morgens implements CommandExecutor {
	// wir bauen Klasse morgens mit implementierung CommandExecutor Klasse

	public static String morgens = "morgens";
	// �ffentlicher Statischer String names morgens mit Wert "morgens"
	// Wenn statt dem Namen dieser String genommen wird, brauchen wir bei �nderungen nur den String hier 1x �ndern
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	// kennen wir schon aus dem HealCommand

		for (World world : org.bukkit.Bukkit.getServer().getWorlds()){
		// f�r Objektklasse "World" mit Namen "world" werdem alle org.bukkit.Bukkit.getServer().getWorlds() eingesetzt
			
			
	        if (world.getTime() >= 0700){
	        // nur wenn die objekt world bekommene Zeit mit .getTime() gr��er-gleich 0700 ist dann tuh was
	            world.setTime(0600);
	            // setzte Zeit von Objekt world auf 0600
	        }
	    }
		
		return false;
	}
	
	

}
