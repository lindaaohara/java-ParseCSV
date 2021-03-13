package com.codedifferently.parseCSV;

public class Team {

    //TODO place all your code here
    private String name;
    private Integer games;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private Integer goals;
    private Integer goalsAllowed;
    private Integer points;

    public Team() {

    }

    public Team(String name, Integer games, Integer wins, Integer losses, Integer draws, Integer goals, Integer goalsAllowed, Integer points) {
        this.name = name;
        this.games = games;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(Integer goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return
                "Team Name: " + name + '\n' +
                "Games: " + games + '\n' +
                "Wins: " + wins + '\n' +
                "Losses: " + losses + '\n' +
                "Draws: " + draws + '\n' +
                "Goals: " + goals + '\n' +
                "Goals Allowed: " + goalsAllowed + '\n' +
                "Points: " + points
                ;
    }
}
