package com.SilverMinded.SurvivalWars.Team;


import org.bukkit.entity.Player;

import java.util.ArrayList;

public class TeamBlue extends TeamBase {

    public static String TeamName = "Blue";
    private ArrayList<Player> players;

    @Override
    public void addToTeam(Player player) {
        players.add(player);
    }

    @Override
    public Team isTeam() {
        return Team.blue;
    }

    @Override
    public boolean canJoinTeam() {
        return true;
    }

    @Override
    public Team getTeam(Player player) {
        if (players.contains(player)) {
            return Team.blue;
        }
        return null;
    }

    @Override
    public Player[] getPlayers() {

        Player player[] = (Player[]) players.toArray();


        return player;
    }
}
