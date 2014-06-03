package com.SilverMinded.SurvivalWars.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.SilverMinded.SurvivalWars.Managers.TeamManager;

public class JoinServerEvent implements Listener {

	@EventHandler
	public void playerJoin(PlayerJoinEvent e) {

		e.setJoinMessage("Hello, You have been added to team: "
				+ TeamManager.teamname);

		Player p = e.getPlayer();

		p.getName();
	}

	@EventHandler
	public void playerQuit(PlayerQuitEvent e) {

	}

	@EventHandler
	public void levelUp(PlayerLevelChangeEvent e) {

		e.getPlayer().sendMessage("So, you levelled up?");
		e.getPlayer().sendMessage("Or lost a level?");
	}

}
