package com.SilverMinded.SurvivalWars.Game;

import org.bukkit.Bukkit;

public class CountDown implements Runnable{
	
	private static int timeUntilStart;
	//Checkt hoeveel tijd je moet wachten tot volgend potje zegmaar
	public void run() {
		timeUntilStart = 60;
		while (true) {
			for(; timeUntilStart >= 0; timeUntilStart--) {
				if (timeUntilStart == 0) {
					//Hier begint de game
					break;
				}
				//Dit zorgt ervoor dat de Runnable niet gaat buggen en crashen xd
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
					Bukkit.shutdown();
				}
			}
		}
	}
}
