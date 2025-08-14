import java.util.List;
import java.util.ArrayList;

public class TeamInit {
    public static List<Player> createPlayers(String teamName) {
        List<Player> player = new ArrayList<>();

        switch (teamName) {
            case "Lakers":
                player.add(new Player("Deandre", "Ayton", "27", "C"));
                player.add(new Player("RJ", "Davis", "99", "G"));
                player.add(new Player("Eric", "Dixon", "98", "F"));
                player.add(new Player("Luka", "Doncic", "77", "PG"));
                player.add(new Player("Rui", "Hachimura", "28", "PF"));
                player.add(new Player("Jaxson", "Hayes", "11", "C"));
                player.add(new Player("Bronny", "James", "9", "G"));
                player.add(new Player("LeBron", "James", "23", "SF"));
                player.add(new Player("Arthur", "Kaluma", "97", "F"));
                player.add(new Player("Maxi", "Kleber", "14", "PF"));
                player.add(new Player("Dalton", "Knecht", "4", "G"));
                player.add(new Player("Christian", "Koloko", "10", "C"));
                player.add(new Player("Jake", "LaRavia", "-", "F"));
                player.add(new Player("Alex", "Len", "27", "C"));
                player.add(new Player("Chris", "Manon", "30", "G"));
                player.add(new Player("Augustas", "Marciulionis", "96", "G"));
                player.add(new Player("Markieff", "Morris", "88", "PF"));
                player.add(new Player("Austin", "Reaves", "15", "SG"));
                player.add(new Player("Marcus", "Smart", "-", "PG"));
                player.add(new Player("Ethan", "Taylor", "-", "G"));
                player.add(new Player("Adou", "Thiero", "1", "F"));
                player.add(new Player("Jarred", "Vanderbilt", "2", "PF"));
                player.add(new Player("Gabe", "Vincent", "7", "PG"));
                break;

            case "Celtics":
                player.add(new Player("Jaylen", "Brown", "7", "SG"));
                player.add(new Player("Torrey", "Craig", "12", "SF"));
                player.add(new Player("Luka", "Garza", "55", "C"));
                player.add(new Player("Hugo", "Gonzalez", "28", "G"));
                player.add(new Player("Sam", "Hauser", "30", "SF"));
                player.add(new Player("Al", "Horford", "42", "C"));
                player.add(new Player("Josh", "Minott", "8", "F"));
                player.add(new Player("Georges", "Niang", "-", "SF"));
                player.add(new Player("Miles", "Norris", "44", "F"));
                player.add(new Player("Payton", "Pritchard", "11", "PG"));
                player.add(new Player("Neemias", "Queta", "88", "C"));
                player.add(new Player("Baylor", "Scheierman", "55", "F"));
                player.add(new Player("Max", "Shulga", "29", "G"));
                player.add(new Player("Anfernee", "Simons", "1", "SG"));
                player.add(new Player("Jayson", "Tatum", "0", "SF"));
                player.add(new Player("Xavier", "Tillman", "26", "F"));
                player.add(new Player("Jordan", "Walsh", "27", "G"));
                player.add(new Player("Derrick", "White", "9", "PG"));
                player.add(new Player("Amari", "Williams", "77", "C"));
                break;

            default:
                System.out.println("Unknown team");
                break;

        }
        return player;
    }

    public static List<Team> createTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Los Angeles", "Lakers", createPlayers("Lakers")));
        teams.add(new Team("Boston", "Celtics", createPlayers("Celtics")));

        for (int i = 0; i < teams.size(); i++){
            System.out.print(teams.get(i));
        }

        return teams;
    }
}
