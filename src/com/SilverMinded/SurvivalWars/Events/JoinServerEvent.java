package com.SilverMinded.SurvivalWars.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.SilverMinded.SurvivalWars.Managers.TeamManager;

public class JoinServerEvent implements Listener {

	@EventHandler
	public void playerJoin(PlayerJoinEvent e) {

		

		Player p = e.getPlayer();

		p.getName();
		p.sendMessage("Hello, you have been added to team: " + TeamManager.teamname);

	
	}

}
