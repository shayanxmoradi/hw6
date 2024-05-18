package fotball.model;

public class Coach extends Person {
    private Contract contract;
    private Contract[] contractHistory = new Contract[100];
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
    public double calculate() {
        System.out.println("salery for coach -->" + this.getLastName());

        return this.getContract().getBaseContractFee() + (30 - vactionDays) * perDaySalery;

    }

    @Override
    public String toString() {
        return "Coach{" +
                "contract=" + contract +
                //    ", contractHistory=" + Arrays.toString(contractHistory) +
                ", vactionDays=" + vactionDays +
                ", perDaySalery=" + perDaySalery +
                '}';
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

    public int getVactionDays() {
        return vactionDays;
    }

    public void setVactionDays(int vactionDays) {
        this.vactionDays = vactionDays;
    }

    public double getPerDaySalery() {
        return perDaySalery;
    }

    public void setPerDaySalery(double perDaySalery) {
        this.perDaySalery = perDaySalery;
    }
}
