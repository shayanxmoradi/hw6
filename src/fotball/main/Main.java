package fotball.main;

import fotball.model.Person;
import fotball.enums.League;
import fotball.enums.RefereeLevl;
import fotball.model.*;
import fotball.repository.DataWarehouse;

import java.sql.Time;
import java.util.Date;

public class Main {
    public static Person[] members;

    public static void main(String[] args) {
        // Creating multiple coaches
        Coach coach1 = new Coach("Ashar", "Hashpa", "IR", 8, 100);
        Coach coach2 = new Coach("Johan", "Schmidt", "DE", 10, 150);
        Coach coach3 = new Coach("Mario", "Rossi", "IT", 9, 130);
        Coach coach4 = new Coach("Carlos", "Santos", "BR", 11, 160);
        Coach coach5 = new Coach("Ali", "Jafari", "IR", 7, 90);

        // Creating multiple teams
        Team team1 = new Team("Gholabdozi Berlin", coach1, League.Beginner);
        Team team2 = new Team("Munich Lions", coach2, League.Professional);
        Team team3 = new Team("Rome Gladiators", coach3, League.Mid);
        Team team4 = new Team("Rio Warriors", coach4, League.Beginner);
        Team team5 = new Team("Tehran Tigers", coach5, League.Professional);

        // Creating contracts for coaches
        Date currentDate = new Date();
        Contract contract1 = new Contract(team1, currentDate, currentDate, 1200.5);
        Contract contract2 = new Contract(team2, currentDate, currentDate, 1400.8);
        Contract contract3 = new Contract(team3, currentDate, currentDate, 1300.3);
        Contract contract4 = new Contract(team4, currentDate, currentDate, 1500.4);
        Contract contract5 = new Contract(team5, currentDate, currentDate, 1100.2);

        coach1.setContract(contract1);
        coach2.setContract(contract2);
        coach3.setContract(contract3);
        coach4.setContract(contract4);
        coach5.setContract(contract5);

        // Creating multiple players for each team
        Player[] team1Players = new Player[]{
                new Player("Shayan", "Moradi", "IR", contract1, 1000, 100),
                new Player("Hosein", "Bi Pa", "IR", contract1, 950, 90),
                new Player("Mohsen", "4 Pa", "DE", contract1, 1100, 105),
                new Player("Soghra", "8 Pa", "TR", contract1, 980, 95),
                new Player("Alex", "Smith", "US", contract1, 1020, 98)
        };

        Player[] team2Players = new Player[]{
                new Player("Hans", "Muller", "DE", contract2, 1200, 110),
                new Player("Peter", "Schneider", "DE", contract2, 1150, 100),
                new Player("Ali", "Vaziri", "IR", contract2, 1050, 95),
                new Player("Mehmet", "Yildiz", "TR", contract2, 1000, 90),
                new Player("Luis", "Garcia", "ES", contract2, 1100, 100)
        };

        Player[] team3Players = new Player[]{
                new Player("Marco", "Verdi", "IT", contract3, 1100, 105),
                new Player("Luca", "Bianchi", "IT", contract3, 1070, 98),
                new Player("Giovanni", "Rossi", "IT", contract3, 1150, 110),
                new Player("Francesco", "Esposito", "IT", contract3, 1200, 115),
                new Player("Antonio", "Romano", "IT", contract3, 1000, 90)
        };

        Player[] team4Players = new Player[]{
                new Player("Joao", "Silva", "BR", contract4, 1300, 120),
                new Player("Gabriel", "Costa", "BR", contract4, 1250, 115),
                new Player("Rafael", "Alves", "BR", contract4, 1350, 130),
                new Player("Lucas", "Ferreira", "BR", contract4, 1400, 140),
                new Player("Pedro", "Sousa", "BR", contract4, 1200, 110)
        };

        Player[] team5Players = new Player[]{
                new Player("Reza", "Khan", "IR", contract5, 900, 85),
                new Player("Omid", "Karimi", "IR", contract5, 950, 90),
                new Player("Nima", "Ghasemi", "IR", contract5, 980, 95),
                new Player("Sara", "Mousavi", "IR", contract5, 920, 88),
                new Player("Arash", "Tehrani", "IR", contract5, 1000, 100)
        };

        // Creating more players for additional teams
        Player[] additionalPlayers = new Player[]{
                new Player("Carlos", "Perez", "ES", contract1, 950, 85),
                new Player("Luca", "Rossi", "IT", contract1, 1000, 90),
                new Player("John", "Doe", "US", contract1, 1100, 95),
                new Player("Ivan", "Petrov", "RU", contract1, 1050, 100),
                new Player("Ahmed", "Khan", "PK", contract2, 950, 85),
                new Player("Yuki", "Tanaka", "JP", contract2, 1000, 90),
                new Player("George", "Smith", "UK", contract2, 1100, 95),
                new Player("Francois", "Leroy", "FR", contract2, 1050, 100),
                new Player("Miguel", "Hernandez", "ES", contract3, 950, 85),
                new Player("Nikola", "Jovanovic", "RS", contract3, 1000, 90),
                new Player("Viktor", "Kovalenko", "UA", contract3, 1100, 95),
                new Player("Chen", "Wei", "CN", contract3, 1050, 100),
                new Player("Raj", "Patel", "IN", contract4, 950, 85),
                new Player("Yusuf", "Ali", "EG", contract4, 1000, 90),
                new Player("Tom", "Brown", "AU", contract4, 1100, 95),
                new Player("Hans", "Schmidt", "DE", contract4, 1050, 100)
        };

        // Grouping additional players into new teams
        Player[] team6Players = new Player[]{additionalPlayers[0], additionalPlayers[1], additionalPlayers[2], additionalPlayers[3]};
        Player[] team7Players = new Player[]{additionalPlayers[4], additionalPlayers[5], additionalPlayers[6], additionalPlayers[7]};
        Player[] team8Players = new Player[]{additionalPlayers[8], additionalPlayers[9], additionalPlayers[10], additionalPlayers[11]};
        Player[] team9Players = new Player[]{additionalPlayers[12], additionalPlayers[13], additionalPlayers[14], additionalPlayers[15]};

        // Creating goals
        Goal[] goals = new Goal[]{
                new Goal(new Time(12, 30, 40), team1Players[1]),
                new Goal(new Time(12, 44, 40), team2Players[3]),
                new Goal(new Time(13, 10, 30), team3Players[0]),
                new Goal(new Time(13, 25, 50), team4Players[1]),
                new Goal(new Time(13, 40, 10), team5Players[4]),
                new Goal(new Time(14, 00, 00), team6Players[2]),
                new Goal(new Time(14, 15, 30), team7Players[3]),
                new Goal(new Time(14, 45, 20), team8Players[1]),
                new Goal(new Time(15, 00, 45), team9Players[0])
        };

        // Creating referees
        Referee[] referees = new Referee[]{
                new Referee("Masood", "Sadeghlo", "IR", RefereeLevl.BEGINNER),
                new Referee("Solton", "Derakthi", "IR", RefereeLevl.MID_LEVEL),
                new Referee("Anna", "Muller", "DE", RefereeLevl.PROFESSIONAL),
                new Referee("Michael", "Johnson", "US", RefereeLevl.PROFESSIONAL),
                new Referee("Yuki", "Nakamura", "JP", RefereeLevl.BEGINNER)
        };

        // Creating multiple games
        Game[] games = new Game[]{
                new Game(team1Players, team2Players, team3Players, team4Players, referees, goals),
                new Game(team5Players, team6Players, team7Players, team8Players, referees, goals),
                new Game(team9Players, team1Players, team2Players, team3Players, referees, goals)
        };

        // Assigning games to players
        for (Player player : team1Players) player.addGame(games[0]);
        for (Player player : team5Players) player.addGame(games[1]);
        for (Player player : team9Players) player.addGame(games[2]);

        // Adding people to DataWarehouse
        for (Player player : team1Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team2Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team3Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team4Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team5Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team6Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team7Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team8Players) DataWarehouse.getDataWarehouse().addPerson(player);
        for (Player player : team9Players) DataWarehouse.getDataWarehouse().addPerson(player);

        DataWarehouse.getDataWarehouse().addPerson(coach1);
        DataWarehouse.getDataWarehouse().addPerson(coach2);
        DataWarehouse.getDataWarehouse().addPerson(coach3);
        DataWarehouse.getDataWarehouse().addPerson(coach4);
        DataWarehouse.getDataWarehouse().addPerson(coach5);

        // for (Referee referee : referees) DataWarehouse.getDataWarehouse().addPerson(referee);

        // Retrieving members
        members = DataWarehouse.getDataWarehouse().getPersonList();

        // Print all salaries
        printAllSalaries();
    }

    static void printAllSalaries() {
        for (Person member : members) {
            try {
                System.out.println(member.calculate());
                System.out.println("xxxx");
            } catch (Exception e) {
                // System.out.println("Error calculating salary for " + member.getName());
            }
        }
    }
}