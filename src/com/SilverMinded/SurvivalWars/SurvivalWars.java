package com.SilverMinded.SurvivalWars;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

public class SurvivalWars extends JavaPlugin {
	
	public static Logger log = Logger.getLogger("Minecraft");
	public static String title = ChatColor.WHITE + "[" + ChatColor.DARK_GREEN
			+ "SurvivalWars" + ChatColor.WHITE + "]";
	public static String normalTitle = "[SurvivalWars]";

	public SurvivalWars() {
	}

	public SurvivalWars(JavaPluginLoader loader,
			PluginDescriptionFile description, File dataFolder, File file) {
		super(loader, description, dataFolder, file);
	}
	
	@EventHandler
	@Override
	public void onEnable() {
		log.info(normalTitle + " Enabled");
		super.onEnable();
		log.info( normalTitle + " This plugin was created by Julius and Chris ");
	}

}
