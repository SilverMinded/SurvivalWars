package com.SilverMinded.SurvivalWars.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.SilverMinded.SurvivalWars.SurvivalWars;
import com.SilverMinded.SurvivalWars.Managers.ChatManager;

public class LeaveServerEvent implements Listener {
	@EventHandler
	public void playerQuit(PlayerQuitEvent e) {
		
		e.setQuitMessage("");
		
		ChatManager.broadcast("Player "+e.getPlayer().getDisplayName()+" has left the game.");
		
		SurvivalWars.log.info(e.getPlayer().getDisplayName()+" Left.");

	}
	
}
