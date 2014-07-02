package com.SilverMinded.SurvivalWars;

import com.SilverMinded.SurvivalWars.Commands.Commands;
import com.SilverMinded.SurvivalWars.Events.JoinServerEvent;
import com.SilverMinded.SurvivalWars.Events.LeaveServerEvent;
import com.SilverMinded.SurvivalWars.Events.PlayerUpEvent;
import com.SilverMinded.SurvivalWars.Game.CountDown;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class SurvivalWars extends JavaPlugin {

    public static Logger log = Logger.getLogger("Minecraft");
    public static String title = ChatColor.WHITE + "[" + ChatColor.DARK_GREEN
            + "SurvivalWars" + ChatColor.WHITE + "]";
    public static String normalTitle = "[SurvivalWars]";

    public static void start() {

    }

    public static void stop() {

    }

    @EventHandler
    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new JoinServerEvent(),
                this);

        new Thread(new CountDown()).start();
        getServer().getPluginManager().registerEvents(new PlayerUpEvent(),
                this);
        getServer().getPluginManager().registerEvents(new LeaveServerEvent(),
                this);

        log.info(normalTitle + " Enabled");
        getServer().getPluginCommand("quit").setExecutor(new Commands());
        getServer().getPluginCommand("reset").setExecutor(new Commands());
    }

}
