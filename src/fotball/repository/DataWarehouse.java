package fotball.repository;

import fotball.*;

public class DataWarehouse {
    private static DataWarehouse instance;
    private Coach[] coachList = new Coach[100];
    private Contract[] contractList = new Contract[100];
    private Game[] gameList = new Game[100];
    private Referee[] refereeList = new Referee[100];
    private Team[] teamList = new Team[100];
    private Player[] playerList = new Player[100];
    private Person[] personList = new Person[100];

    public static DataWarehouse getDataWarehouse() {
        if (instance == null) {
            synchronized (DataWarehouse.class) {
                if (instance == null) {
                    instance = new DataWarehouse();
                }
            }
        }
        return instance;
    }

    public void addContract(Contract contract) {
        for (int i = 0; i < contractList.length; i++) {
            if (contractList[i] == null) {
                contractList[i] = contract;
                return;
            }
        }
        System.err.println("Failed to add . Array is full.");
    }

    public void addCoach(Coach coach) {
        for (int i = 0; i < coachList.length; i++) {
            if (coachList[i] == null) {
                coachList[i] = coach;
                return;
            }
        }
        System.err.println("Failed to add .Array is full.");
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
    public void addPerson(Person person) {
        for (int i = 0; i < personList.length; i++) {
            if (personList[i] == null) {
                personList[i] = person;
                return;
            }
        }
        System.err.println("Failed to add .Array is full.");
    }


    public void addGame(Game game) {
        for (int i = 0; i < gameList.length; i++) {
            if (gameList[i] == null) {
                gameList[i] = game;
                return;
            }
        }
        System.err.println("Failed to add .Array is full.");
    }

    public void addTeam(Team team) {
        for (int i = 0; i < teamList.length; i++) {
            if (teamList[i] == null) {
                teamList[i] = team;
                return;
            }
        }
        System.err.println("Failed to add .Array is full.");
    }

    public void addReferee(Referee referee) {
        for (int i = 0; i < refereeList.length; i++) {
            if (refereeList[i] == null) {
                refereeList[i] = referee;
                return;
            }
        }
        System.err.println("Failed to add .Array is full.");
    }


    public static DataWarehouse getInstance() {
        return instance;
    }

    public static void setInstance(DataWarehouse instance) {
        DataWarehouse.instance = instance;
    }

    public Coach[] getCoachList() {
        return coachList;
    }

    public void setCoachList(Coach[] coachList) {
        this.coachList = coachList;
    }

    public Contract[] getContractList() {
        return contractList;
    }

    public void setContractList(Contract[] contractList) {
        this.contractList = contractList;
    }

    public Game[] getGameList() {
        return gameList;
    }

    public void setGameList(Game[] gameList) {
        this.gameList = gameList;
    }

    public Referee[] getRefereeList() {
        return refereeList;
    }

    public void setRefereeList(Referee[] refereeList) {
        this.refereeList = refereeList;
    }

    public Team[] getTeamList() {
        return teamList;
    }

    public void setTeamList(Team[] teamList) {
        this.teamList = teamList;
    }

    public Player[] getPlayerList() {
        return playerList;
    }

    public void setPlayerList(Player[] playerList) {
        this.playerList = playerList;
    }

    public Person[] getPersonList() {
        return personList;
    }

    public void setPersonList(Person[] personList) {
        this.personList = personList;
    }
}


//
//public static Library getInstance() {
//    if (instance == null) {
//        synchronized (Library.class) {
//            if (instance == null) {
//                instance = new Library();
//            }
//        }
//    }
//    //  System.out.println();
//    return instance;
