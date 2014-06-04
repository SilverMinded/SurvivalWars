package com.SilverMinded.SurvivalWars.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import com.SilverMinded.SurvivalWars.SurvivalWars;

public class PlayerUpEvent {
	@EventHandler
	public void levelUp(PlayerLevelChangeEvent e) {

		e.getPlayer().sendMessage(SurvivalWars.title + " You levelled up");

	}
}
