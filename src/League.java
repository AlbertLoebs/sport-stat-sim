import java.util.List;
import java.util.Map;

public class League {
    private List<Team> teams;
    private List<Game> schedule;
    private Map<Team, Game> teamGames; // wins and loses

    public League(List<Team> teams) {
        this.teams = teams;
    }

    public List<Game> makeSchedule(List<Team> teams) {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Team home = teams.get(i);
                Team away = teams.get(j);

                schedule.add(new Game(home, away)); // i is home
                schedule.add(new Game(away, home)); // j is home
            }
        }
        return schedule;
    }

    public void playSeason() {

    }

    public void recordResult() {

    }

    public void printStandings() {

    }

}
