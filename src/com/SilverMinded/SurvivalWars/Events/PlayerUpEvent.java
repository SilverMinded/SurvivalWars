package com.SilverMinded.SurvivalWars.Events;

import com.SilverMinded.SurvivalWars.Managers.ChatManager;
import com.SilverMinded.SurvivalWars.SurvivalWars;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class PlayerUpEvent implements Listener {
    @EventHandler
    public void levelUp(PlayerLevelChangeEvent e) {

        e.getPlayer().sendMessage(
                SurvivalWars.title + " You levelled up!" + " (New level "
                        + e.getNewLevel() + ")");

        if (e.getNewLevel() == 30)
            ChatManager.broadcast("Player " + e.getPlayer().getPlayerListName()
                    + " has reached level 30!");

    }
}
