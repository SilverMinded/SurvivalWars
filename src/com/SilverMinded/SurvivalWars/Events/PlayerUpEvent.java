package com.SilverMinded.SurvivalWars.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import com.SilverMinded.SurvivalWars.SurvivalWars;
import com.SilverMinded.SurvivalWars.Managers.ChatManager;

public class PlayerUpEvent implements Listener {
	@EventHandler
	public void levelUp(PlayerLevelChangeEvent e) {

		e.getPlayer().sendMessage(SurvivalWars.title + " You levelled up "+ (e.getNewLevel()-e.getOldLevel()) +" level(s). (New level "+e.getNewLevel()+")");
		
		if(e.getNewLevel()==30) ChatManager.broadcast("Player "+e.getPlayer().getPlayerListName()+" has reached level 30!");

	}
}
