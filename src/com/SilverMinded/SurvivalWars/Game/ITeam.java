package com.SilverMinded.SurvivalWars.Game;

import org.bukkit.entity.Player;

public interface ITeam {

    public void isTeam(Team team);
    public void canJoinTeam(Team team);
    public Team getTeam(Player player);
    public Player[] getPlayers(Team team);


}
