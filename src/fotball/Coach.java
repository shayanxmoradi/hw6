package fotball;

import java.util.Arrays;

public class Coach extends Person {
    private Contract contract;
    private Contract[] contractHistory;
    private int vactionDays;
    private double perDaySalery;

    public Coach(String name, String lastName, String nationality, int vactionDays, double perDaySalery) {
        super(name, lastName, nationality);
        this.contractHistory = contractHistory;
        this.vactionDays = vactionDays;
        this.perDaySalery = perDaySalery;
    }
    public void addContract(Contract contract) {
        for (int i = 0; i < contractHistory.length; i++) {
            if (contractHistory[i] == null) {
                contractHistory[i] = contract;
                return;
            }
        }
        System.err.println("Failed to add .Array is full.");
    }

    @Override
    double calculate() {
        return contract.getBaseContractFee()+ (30-vactionDays)*perDaySalery;

    }

    @Override
    public String toString() {
        return "Coach{" +
                "contract=" + contract +
                ", contractHistory=" + Arrays.toString(contractHistory) +
                ", vactionDays=" + vactionDays +
                ", perDaySalery=" + perDaySalery +
                '}';
    }
}
