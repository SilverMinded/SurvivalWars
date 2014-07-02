package com.SilverMinded.SurvivalWars.Commands;

import com.SilverMinded.SurvivalWars.Game.Status;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {

        if (command.getName().equalsIgnoreCase("quit")) {
            return true;

        } else if (command.getName().equalsIgnoreCase("reset")) {
            Status.setStatus(Status.RESETTING);
            return true;

        }

        return false;
    }

}
