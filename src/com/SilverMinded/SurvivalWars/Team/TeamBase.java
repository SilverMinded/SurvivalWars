package com.SilverMinded.SurvivalWars.Team;

import com.SilverMinded.SurvivalWars.SurvivalWars;
import org.bukkit.entity.Player;

public abstract class TeamBase implements ITeam {

    private static final TeamBlue blue = new TeamBlue();
    private static int bluePlayers=0;
    private static int redPlayers=0;

    private static int yellowPlayers=0;

    private static int purplePlayers=0;


    public static Team getTeamWithLessPlayers() throws NullPointerException {

        if(bluePlayers==0){
            SurvivalWars.log.info("blue");
            bluePlayers++;
            return Team.blue;
        }

        if ((bluePlayers < (redPlayers & yellowPlayers & purplePlayers))) {
            //Hier voeg je de player toe aan team rood en else: aan team blue (andersom xD )
            SurvivalWars.log.info("blue");
            bluePlayers++;
            return Team.blue;

        } else if (redPlayers < (bluePlayers & yellowPlayers & purplePlayers)) {
            redPlayers++;
            return Team.red;

        } else if (yellowPlayers < (bluePlayers & redPlayers & purplePlayers)) {
            yellowPlayers++;
            return Team.yellow;
        } else if (purplePlayers < (bluePlayers & redPlayers & yellowPlayers)) {
            purplePlayers++;
            return Team.purple;
        }
        throw new NullPointerException("Please add a Team that exists");
    }

    public static boolean joinTeam(Team team, Player player) {
        if (team == Team.blue) {
            blue.addToTeam(player);
            return true;
        }


        return false;
    }


}
