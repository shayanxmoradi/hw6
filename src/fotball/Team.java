package fotball;

import java.util.Arrays;

public class Team {
    private String name;
    private Coach coach;
    private Leauge leauge;
    private Player[] playerList;

    public Team(String name, Coach coach, Leauge leauge) {
        this.name = name;
        this.coach = coach;
        this.leauge = leauge;
       // this.playerList = playerList;
    }
    public void addPlayer(Player player) {
        for (int i = 0; i < playerList.length; i++) {
            if (playerList[i] == null) {
                playerList[i] = player;
                return;
            }
        }
        System.err.println("Failed to add .Array is full.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Leauge getLeauge() {
        return leauge;
    }

    public void setLeauge(Leauge leauge) {
        this.leauge = leauge;
    }

    public Player[] getPlayerList() {
        return playerList;
    }

    public void setPlayerList(Player[] playerList) {
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", coach=" + coach +
                ", leauge=" + leauge +
                ", player=" + Arrays.toString(playerList) +
                '}';
    }

}
