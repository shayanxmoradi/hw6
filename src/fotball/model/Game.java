package fotball.model;

import java.util.Arrays;

public class Game {
    private Player[] hostPlayers;
    private Player[] hostSavedPlayers;
    private Player[] opponentPlayers;
    private Player[] opponentSavedPlayers;
    private Referee[] refereeTeam;
    private Goal[] goals;

    public Game(Player[] hostPlayers, Player[] hostSavedPlayers, Player[] opponentPlayers, Player[] opponentSavedPlayers, Referee[] refereeTeam, Goal[] goals) {
        this.hostPlayers = hostPlayers;
        this.hostSavedPlayers = hostSavedPlayers;
        this.opponentPlayers = opponentPlayers;
        this.opponentSavedPlayers = opponentSavedPlayers;
        this.refereeTeam = refereeTeam;
        this.goals = goals;
    }

    public Player[] getHostPlayers() {
        return hostPlayers;
    }

    public void setHostPlayers(Player[] hostPlayers) {
        this.hostPlayers = hostPlayers;
    }

    public Player[] getHostSavedPlayers() {
        return hostSavedPlayers;
    }

    public void setHostSavedPlayers(Player[] hostSavedPlayers) {
        this.hostSavedPlayers = hostSavedPlayers;
    }

    public Player[] getOpponentPlayers() {
        return opponentPlayers;
    }

    public void setOpponentPlayers(Player[] opponentPlayers) {
        this.opponentPlayers = opponentPlayers;
    }

    public Player[] getOpponentSavedPlayers() {
        return opponentSavedPlayers;
    }

    public void setOpponentSavedPlayers(Player[] opponentSavedPlayers) {
        this.opponentSavedPlayers = opponentSavedPlayers;
    }

    public Referee[] getRefereeTeam() {
        return refereeTeam;
    }

    public void setRefereeTeam(Referee[] refereeTeam) {
        this.refereeTeam = refereeTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "Game{" +
                "hostPlayers=" + Arrays.toString(hostPlayers) +
                ", hostSavedPlayers=" + Arrays.toString(hostSavedPlayers) +
                ", opponentPlayers=" + Arrays.toString(opponentPlayers) +
                ", opponentSavedPlayers=" + Arrays.toString(opponentSavedPlayers) +
                ", refereeTeam=" + Arrays.toString(refereeTeam) +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }
}
