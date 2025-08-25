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
        for (Game game : schedule) {
            game.simGame();
            recordResult(game);
        }
    }

    public void recordResult(Game game) {
        Team home = game.getHomeTeam();
        Team away = game.getAwayTeam();

        int homeScore = game.getHomeScore();
        int awayScore = game.getAwayScore();

        home.addPoints(homeScore);
        home.addPointsAllowed(awayScore);

        away.addPoints(awayScore);
        away.addPointsAllowed(homeScore);

        if (homeScore > awayScore) {
            home.addWin();
            away.addLoss();
        } else {
            away.addWin();
            home.addLoss();
        }
    }

    public void printStandings() {

    }

}
