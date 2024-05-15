package fotball;

import java.util.Arrays;

public class Player extends Person {
    private Contract contract;
    private Contract[] contractHistory;
   // private int baseSalery;
    private Game[] playedGames;
   private double permatchSalery;

    public Player(String name, String lastName, String nationality, Contract contract, double permatchSalery, int baseSalery) {
        super(name, lastName, nationality);
        this.contract = contract;
        this.permatchSalery = permatchSalery;
      //  this.baseSalery = baseSalery;
        this.contractHistory = contractHistory;
    }

    @Override
    double calculate() {

        return contract.getBaseContractFee()+(permatchSalery*playedGames.length);

    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Contract[] getContractHistory() {
        return contractHistory;
    }

    public void setContractHistory(Contract[] contractHistory) {
        this.contractHistory = contractHistory;
    }

//    public int getBaseSalery() {
//        return baseSalery;
//    }
//
//    public void setBaseSalery(int baseSalery) {
//        this.baseSalery = baseSalery;
//    }

    public Game[] getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(Game[] playedGames) {
        this.playedGames = playedGames;
    }

    public double getPermatchSalery() {
        return permatchSalery;
    }

    public void setPermatchSalery(double permatchSalery) {
        this.permatchSalery = permatchSalery;
    }

    @Override
    public String toString() {
        return "Player{" +
                "contract=" + contract +
                ", contractHistory=" + Arrays.toString(contractHistory) +
//                ", baseSalery=" + baseSalery +
                ", playedGames=" + Arrays.toString(playedGames) +
                ", permatchSalery=" + permatchSalery +
                '}';
    }
}
