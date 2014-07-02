package com.SilverMinded.SurvivalWars.Team;

import org.bukkit.entity.Player;

interface ITeam {

    public void addToTeam(Player player);

    public Team isTeam();

    public boolean canJoinTeam();

    public Team getTeam(Player player);

    public Player[] getPlayers();


}
