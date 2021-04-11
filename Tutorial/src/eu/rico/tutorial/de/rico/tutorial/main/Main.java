package de.rico.tutorial.main;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import de.rico.tutorial.commands.HealCommand;
import de.rico.tutorial.commands.StartKit;
import de.rico.tutorial.commands.morgens;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		loadCommands(HealCommand.heal, new HealCommand());
		loadCommands(StartKit.lbl_command, new StartKit());
		loadCommands(morgens.morgens, new morgens());
	}
	
	public void loadCommands( String commandname, CommandExecutor commandexecutor) {
		
		getCommand(commandname).setExecutor(commandexecutor);
		
	}

}
