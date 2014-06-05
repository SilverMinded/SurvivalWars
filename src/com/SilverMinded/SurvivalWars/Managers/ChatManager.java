package com.SilverMinded.SurvivalWars.Managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.SilverMinded.SurvivalWars.SurvivalWars;

public class ChatManager {

	public static void broadcast(String msg) {
		for (Player player : Bukkit.getOnlinePlayers()) {
			player.sendMessage(starter() + " " + msg);
		}
	}

	private static String starter() {
		return SurvivalWars.title;
	}
	
	public static String newLine(){
		return "\n";
	}

}
