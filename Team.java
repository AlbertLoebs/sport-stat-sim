import java.util.List;

public class Team {
    private String name;
    private String city;
    private List<Player> players;

    public Team(String city, String name, List<Player> players){
        this.city = city;
        this.name = name;
        this.players = players;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(city).append(" ").append(name).append("\n");

        for (int i = 0; i < players.size(); i++){
            sb.append(players.get(i)).append("\n");
        }
        return sb.toString();
    }
}