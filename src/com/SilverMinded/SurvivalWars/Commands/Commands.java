package com.SilverMinded.SurvivalWars.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("quit")){
			
		}
		
		
		return false;
	}

}
