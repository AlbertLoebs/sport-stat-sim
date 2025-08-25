import java.util.List;

public class Team {
    private String name;
    private String city;
    private List<Player> players;
    private int wins;
    private int losses;
    private int points;
    private int pointsAllowed;

    public Team(String city, String name, List<Player> players){
        this.city = city;
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers(){
        return players;
    }

    public void addWin(){
        wins++;
    }

    public void addLoss(){
        losses++;
    }

    public void addPoints(int point){
        points += point;
    }

    public void addPointsAllowed(int point){
        pointsAllowed += point;
    }

    public int getPoints(){
        return points;
    }

    public int getPointsAllowed(){
        return pointsAllowed;
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