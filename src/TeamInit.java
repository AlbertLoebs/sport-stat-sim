import java.util.List;
import java.util.ArrayList;

public class TeamInit {
    public static List<Player> createPlayers(String teamName) {
        List<Player> player = new ArrayList<>();

        switch (teamName) {
            case "Lakers":
                player.add(Player.genPlayerRating("Deandre", "Ayton", "27", "C"));
                player.add(Player.genPlayerRating("RJ", "Davis", "99", "G"));
                player.add(Player.genPlayerRating("Eric", "Dixon", "98", "F"));
                player.add(Player.genPlayerRating("Luka", "Doncic", "77", "PG"));
                player.add(Player.genPlayerRating("Rui", "Hachimura", "28", "PF"));
                player.add(Player.genPlayerRating("Jaxson", "Hayes", "11", "C"));
                player.add(Player.genPlayerRating("Bronny", "James", "9", "G"));
                player.add(Player.genPlayerRating("LeBron", "James", "23", "SF"));
                player.add(Player.genPlayerRating("Arthur", "Kaluma", "97", "F"));
                player.add(Player.genPlayerRating("Maxi", "Kleber", "14", "PF"));
                player.add(Player.genPlayerRating("Dalton", "Knecht", "4", "G"));
                player.add(Player.genPlayerRating("Christian", "Koloko", "10", "C"));
                player.add(Player.genPlayerRating("Jake", "LaRavia", "-", "F"));
                player.add(Player.genPlayerRating("Alex", "Len", "27", "C"));
                player.add(Player.genPlayerRating("Chris", "Manon", "30", "G"));
                player.add(Player.genPlayerRating("Augustas", "Marciulionis", "96", "G"));
                player.add(Player.genPlayerRating("Markieff", "Morris", "88", "PF"));
                player.add(Player.genPlayerRating("Austin", "Reaves", "15", "SG"));
                player.add(Player.genPlayerRating("Marcus", "Smart", "-", "PG"));
                player.add(Player.genPlayerRating("Ethan", "Taylor", "-", "G"));
                player.add(Player.genPlayerRating("Adou", "Thiero", "1", "F"));
                player.add(Player.genPlayerRating("Jarred", "Vanderbilt", "2", "PF"));
                player.add(Player.genPlayerRating("Gabe", "Vincent", "7", "PG"));
                break;

            case "Celtics":
                player.add(Player.genPlayerRating("Jaylen", "Brown", "7", "SG"));
                player.add(Player.genPlayerRating("Torrey", "Craig", "12", "SF"));
                player.add(Player.genPlayerRating("Luka", "Garza", "55", "C"));
                player.add(Player.genPlayerRating("Hugo", "Gonzalez", "28", "G"));
                player.add(Player.genPlayerRating("Sam", "Hauser", "30", "SF"));
                player.add(Player.genPlayerRating("Al", "Horford", "42", "C"));
                player.add(Player.genPlayerRating("Josh", "Minott", "8", "F"));
                player.add(Player.genPlayerRating("Georges", "Niang", "-", "SF"));
                player.add(Player.genPlayerRating("Miles", "Norris", "44", "F"));
                player.add(Player.genPlayerRating("Payton", "Pritchard", "11", "PG"));
                player.add(Player.genPlayerRating("Neemias", "Queta", "88", "C"));
                player.add(Player.genPlayerRating("Baylor", "Scheierman", "55", "F"));
                player.add(Player.genPlayerRating("Max", "Shulga", "29", "G"));
                player.add(Player.genPlayerRating("Anfernee", "Simons", "1", "SG"));
                player.add(Player.genPlayerRating("Jayson", "Tatum", "0", "SF"));
                player.add(Player.genPlayerRating("Xavier", "Tillman", "26", "F"));
                player.add(Player.genPlayerRating("Jordan", "Walsh", "27", "G"));
                player.add(Player.genPlayerRating("Derrick", "White", "9", "PG"));
                player.add(Player.genPlayerRating("Amari", "Williams", "77", "C"));
                break;

            case "Thunder":
                player.add(Player.genPlayerRating("Brooks", "Barnhizer", "23", "F"));
                player.add(Player.genPlayerRating("Branden", "Carlson", "15", "C"));
                player.add(Player.genPlayerRating("Alex", "Caruso", "9", "SG"));
                player.add(Player.genPlayerRating("Ousmane", "Dieng", "13", "F"));
                player.add(Player.genPlayerRating("Luguentz", "Dort", "5", "G"));
                player.add(Player.genPlayerRating("Shai", "Gilgeous-Alexander", "2", "PG"));
                player.add(Player.genPlayerRating("Isaiah", "Hartenstein", "55", "C"));
                player.add(Player.genPlayerRating("Chet", "Holmgren", "7", "PF"));
                player.add(Player.genPlayerRating("Isaiah", "Joe", "11", "SG"));
                player.add(Player.genPlayerRating("Ajay", "Mitchell", "25", "G"));
                player.add(Player.genPlayerRating("Thomas", "Sorber", "12", "C"));
                player.add(Player.genPlayerRating("Nikola", "Topic", "44", "G"));
                player.add(Player.genPlayerRating("Cason", "Wallace", "22", "G"));
                player.add(Player.genPlayerRating("Aaron", "Wiggins", "21", "SG"));
                player.add(Player.genPlayerRating("Jalen", "Williams", "8", "F"));
                player.add(Player.genPlayerRating("Jaylin", "Williams", "6", "F"));
                player.add(Player.genPlayerRating("Kenrich", "Williams", "34", "SF"));
                break;

            case "Pacers":
                player.add(Player.genPlayerRating("Tony", "Bradley", "13", "C"));
                player.add(Player.genPlayerRating("RayJ", "Dennis", "10", "G"));
                player.add(Player.genPlayerRating("Johnny", "Furphy", "12", "F"));
                player.add(Player.genPlayerRating("Tyrese", "Haliburton", "0", "PG"));
                player.add(Player.genPlayerRating("Jay", "Huff", "-", "C"));
                player.add(Player.genPlayerRating("Isaiah", "Jackson", "22", "SF"));
                player.add(Player.genPlayerRating("Quenton", "Jackson", "29", "G"));
                player.add(Player.genPlayerRating("Kam", "Jones", "-", "G"));
                player.add(Player.genPlayerRating("Bennedict", "Mathurin", "00", "SG"));
                player.add(Player.genPlayerRating("T.J.", "McConnell", "9", "PG"));
                player.add(Player.genPlayerRating("Andrew", "Nembhard", "2", "PG"));
                player.add(Player.genPlayerRating("Aaron", "Nesmith", "23", "SF"));
                player.add(Player.genPlayerRating("Taelon", "Peter", "-", "G"));
                player.add(Player.genPlayerRating("Ben", "Sheppard", "26", "G"));
                player.add(Player.genPlayerRating("Pascal", "Siakam", "43", "PF"));
                player.add(Player.genPlayerRating("Obi", "Toppin", "1", "PF"));
                player.add(Player.genPlayerRating("Jarace", "Walker", "5", "F"));
                player.add(Player.genPlayerRating("James", "Wiseman", "-", "C"));

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
        teams.add(new Team("Oklahoma City", "Thunder", createPlayers("Thunder")));
        teams.add(new Team("Indiana", "Pacers", createPlayers("Pacers")));

        for (int i = 0; i < teams.size(); i++) {
            System.out.print(teams.get(i));
        }

        return teams;
    }
}
