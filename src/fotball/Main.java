package fotball;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //  Contract contract = new Contract();
        Coach coach = new Coach("ashar", "hashpa", "IR", 8, 100);
        Team team = new Team("gholabdozi berlin", coach, Leauge.Beginner);
        Date date = new Date();
        Contract contract2 = new Contract(team, date, date, 1000.2);
        coach.addContract(contract2);
        Player player = new Player("shayan", "moradi", "IR", contract2, 1000, 100);
        DataWarehouse.getDataWarehouse().addPlayer(player);


    }

    void print_all_salaries() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
