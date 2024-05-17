package fotball;

import fotball.repository.DataWarehouse;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static Person[] member;

    public static void main(String[] args) {
        //write codes here
        //handle some complixity


        //  Contract contract = new Contract();
        Coach coach = new Coach("ashar", "hashpa", "IR", 8, 100);
        Team team = new Team("gholabdozi berlin", coach, Leauge.Beginner);
        Date date = new Date();
        Contract contract2 = new Contract(team, date, date, 1000.2);
        Contract contract4 = new Contract(team, date, date, 1040.2);
        coach.addContract(contract2);
        coach.setContract(contract4);
        Player player = new Player("shayan", "moradi", "IR", contract2, 1000, 100);
        Player player2 = new Player("hosein", "bi pa", "IR", contract2, 1000, 100);
        Player player3 = new Player("mohsen", "4 pa", "DE", contract2, 1000, 100);
        Player player4 = new Player("soghra", "8 pa", "TR", contract2, 1000, 100);
        Player[] players = new Player[]{player, player2};
        Player[] players2 = new Player[]{player3, player4};
        Player playe5 = new Player("shayan", "moradi", "IR", contract2, 1000, 100);
        Player player6 = new Player("hosein", "bi pa", "IR", contract2, 1000, 100);
        Player player7 = new Player("mohsen", "4 pa", "DE", contract2, 1000, 100);
        Player player8 = new Player("soghra", "8 pa", "TR", contract2, 1000, 100);
        Player[] players3 = new Player[]{player6, player7};
        Player[] players4 = new Player[]{player8, playe5};
        Goal goal = new Goal(new Time(12, 30, 40), player2);
        Goal goal2 = new Goal(new Time(12, 44, 40), player6);
        Goal[] goals = new Goal[]{goal, goal2};
        Referee referee = new Referee("masood", "sadeghlo", "IR", RefereeLevl.BEGINNER);
        Referee referee2 = new Referee("solton", "derakthi", "IR", RefereeLevl.MID_LEVEL);
        //   DataWarehouse.getDataWarehouse().addPerson(referee);
        //    DataWarehouse.getDataWarehouse().addPerson(referee);


        Referee[] refereres = new Referee[]{referee, referee2};
        Game game = new Game(players, players2, players3, players4, refereres, goals);
        player.addGame(game);
        DataWarehouse.getDataWarehouse().addPerson(player);
        DataWarehouse.getDataWarehouse().addPerson(coach);

        member = DataWarehouse.getDataWarehouse().getPersonList();

        // System.out.println(Arrays.toString(member));
        // print_all_salaries();
        for (Person person : member) {
            if (member != null) {
                try {
                    //      System.out.println(person);
                } catch (Exception e) {
                }

            }
        }
        print_all_salaries();


    }

    static void print_all_salaries() {
        for (int i = 0; i < member.length; i++) {
            try {
                System.out.println(member[i].calculate());
                System.out.println("xxxx");
            } catch (Exception e) {
            }

        }


    }
}

