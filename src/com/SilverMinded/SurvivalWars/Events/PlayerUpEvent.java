package com.SilverMinded.SurvivalWars.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class PlayerUpEvent {
	@EventHandler
	public void levelUp(PlayerLevelChangeEvent e) {

		e.getPlayer().sendMessage("So, you levelled up?");
		e.getPlayer().sendMessage("Or lost a level?");

	}
}
