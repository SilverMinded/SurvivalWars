package com.SilverMinded.SurvivalWars.Team;

import com.SilverMinded.SurvivalWars.SurvivalWars;
import org.bukkit.entity.Player;

public abstract class TeamBase implements ITeam {

    private static int bluePlayers;
    private static TeamBlue blue = new TeamBlue();

    private static int redPlayers;

    private static int yellowPlayers;

    private static int purplePlayers;


    public static Team getTeamWithLessPlayers() throws NullPointerException {

        if (bluePlayers < (redPlayers & yellowPlayers & purplePlayers)) {
            //Hier voeg je de player toe aan team rood en else: aan team blue (andersom xD )
            SurvivalWars.log.info("blue");
            return Team.blue;


        } else if (redPlayers < (bluePlayers & yellowPlayers & purplePlayers)) {

            return Team.red;

        } else if (yellowPlayers < (bluePlayers & redPlayers & purplePlayers)) {
            return Team.yellow;
        } else if (purplePlayers < (bluePlayers & redPlayers & yellowPlayers)) {
            return Team.purple;
        }
        throw new NullPointerException("Please add a Team that exists");
    }

    public static boolean joinTeam(Team team, Player player) {
        if (team == Team.blue) {
            blue.addToTeam(player);
        }


        return false;
    }


}
