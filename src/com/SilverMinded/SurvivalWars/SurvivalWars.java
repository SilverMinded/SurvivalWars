package com.SilverMinded.SurvivalWars;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import com.SilverMinded.SurvivalWars.Commands.Commands;
import com.SilverMinded.SurvivalWars.Events.JoinServerEvent;
import com.SilverMinded.SurvivalWars.Game.CountDown;

public class SurvivalWars extends JavaPlugin {

	public static Logger log = Logger.getLogger("Minecraft");
	public static String title = ChatColor.WHITE + "[" + ChatColor.DARK_GREEN
			+ "SurvivalWars" + ChatColor.WHITE + "]";
	public static String normalTitle = "[SurvivalWars]";

	public static SurvivalWars instance;

	public SurvivalWars() {
		// TODO Auto-generated constructor stub
	}

	public SurvivalWars(JavaPluginLoader loader,
			PluginDescriptionFile description, File dataFolder, File file) {
		super(loader, description, dataFolder, file);
		// TODO Auto-generated constructor stub
	}

	@EventHandler
	@Override
	public void onEnable() {

		getServer().getPluginManager().registerEvents(new JoinServerEvent(),
				this);

		new Thread(new CountDown()).start();
		getServer().getPluginManager().registerEvents(new JoinServerEvent(),
				this);

		log.info(normalTitle + " Enabled");
		getServer().getPluginCommand("quit").setExecutor(new Commands());
	}

	public static void start() {
		
	}

	public static void stop() {
		
	}

}
