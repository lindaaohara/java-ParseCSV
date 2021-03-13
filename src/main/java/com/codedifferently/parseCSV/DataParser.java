package com.codedifferently.parseCSV;

import java.util.ArrayList;

public class DataParser {
    public ArrayList<Team> parseTeamsDataIntoObject(String data){
        String[] lines = data.split("\n");
        ArrayList<Team> teams = new ArrayList<>();
        for(int i=1; i< lines.length; i++){
            Team team = new Team();
            String[] teamData = lines[i].split(",");
            team.setName(teamData[0]);
            team.setGames(Integer.parseInt(teamData[1]));
            team.setWins(Integer.parseInt(teamData[2]));
            team.setLosses(Integer.parseInt(teamData[3]));
            team.setDraws(Integer.parseInt(teamData[4]));
            team.setGoals(Integer.parseInt(teamData[5]));
            team.setGoalsAllowed(Integer.parseInt(teamData[6]));
            team.setPoints(Integer.parseInt(teamData[7]));
            teams.add(team);
        }
        return teams;
    }
}
