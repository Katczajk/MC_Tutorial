package de.rico.tutorial.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
//hier wird ben�tigtes importiert
// fremde Bibliotheken

import de.rico.tutorial.commands.HealCommand;
import de.rico.tutorial.commands.StartKit;
import de.rico.tutorial.commands.morgens;
// eigene Klassen importiert wegen Zugriff auf die Klassen


public class Main extends JavaPlugin{
// wir erstellen die erste Hauptklasse im Projekt
	
	public void onEnable() {
	// Main erweitert von JavaPlugin, daher die Methode onEnabled
	// wird vom Server getriggert wenn der startet
	// beim laden wird onLoad()
	// weitere Daten in der Library anschauen unter org.bukkit.plugin.java.JavaPlugin.class
		
		loadCommands(HealCommand.heal, new HealCommand());
		// dies ist eine Funktion - selbst geschrieben
		// String commandname und Object CommandExecutor werden �bergeben
		// in diesem Fall wird der Name als String statisch aus einer Klasse HealCommand gezogen
		// HealCommand() ist ein Object mit implementierung aus CommandExecutor
		// daher �bergabe als zweiten Parameter
		
		loadCommands(StartKit.lbl_command, new StartKit());
		loadCommands(morgens.morgens, new morgens());
	}
	
	public void loadCommands( String commandname, CommandExecutor commandexecutor) {
	// Kopf der Funktion mit ( Parameter blabla )
	// Zeichenkette (String) commandname <- ist nur ein Name kann auch Buba oder TV hei�en
	// Object von Klasse CommandExecutor mit name commandexecutor <- kanna auch hei�en wie es will
	// generell sollten namen aber auch das Objekt hindeuten wenn m�glich
		
		getCommand(commandname).setExecutor(commandexecutor);
		
	}

}
