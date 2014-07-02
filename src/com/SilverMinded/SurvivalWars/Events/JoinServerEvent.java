package com.SilverMinded.SurvivalWars.Events;

import com.SilverMinded.SurvivalWars.Managers.ChatManager;
import com.SilverMinded.SurvivalWars.Team.TeamBase;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinServerEvent implements Listener {


    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        e.setJoinMessage("");

        if (e.getPlayer().getName().equalsIgnoreCase("juliusdejeu")) {
            ChatManager.broadcast("" + ChatColor.UNDERLINE + ChatColor.GREEN
                    + "The Owner " + ChatColor.RESET + ChatColor.RED
                    + ChatColor.BOLD + "Julius" + ChatColor.RESET
                    + ChatColor.UNDERLINE + ChatColor.GREEN
                    + " Joined the game.");
        } else if (e.getPlayer().getPlayerListName()
                .equalsIgnoreCase("testyflesty")) {
            ChatManager.broadcast("" + ChatColor.UNDERLINE + ChatColor.AQUA
                    + "The Owner " + ChatColor.RESET + ChatColor.YELLOW
                    + ChatColor.BOLD + "Chris" + ChatColor.RESET
                    + ChatColor.UNDERLINE + ChatColor.AQUA
                    + " Joined the game.");
        }
        TeamBase.joinTeam(TeamBase.getTeamWithLessPlayers(), e.getPlayer());


    }

}
