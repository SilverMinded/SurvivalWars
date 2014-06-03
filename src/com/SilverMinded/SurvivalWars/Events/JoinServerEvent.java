package com.SilverMinded.SurvivalWars.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinServerEvent implements Listener {

	public static String team;
	
	@EventHandler
	public void playerJoin(PlayerJoinEvent e) {

		e.setJoinMessage("Hello, You have been added to team"+team);
		
	}
}
