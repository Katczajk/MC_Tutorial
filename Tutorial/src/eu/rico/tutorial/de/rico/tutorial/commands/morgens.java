package de.rico.tutorial.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class morgens implements CommandExecutor {

	public static String morgens = "morgens";
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		for (World world : org.bukkit.Bukkit.getServer().getWorlds()){
	        if (world.getTime() >= 0700){
	            world.setTime(0600);
	        }
	    }
		
		return false;
	}
	
	

}
