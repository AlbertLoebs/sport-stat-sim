import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;
    private List<PlayerGameStats> homePlayerStats;
    private List<PlayerGameStats> awayPlayerStats;
    Random rand;

    Game(Team homeTeam, Team awayTeam) {
        // setting each score to zero
        // each player on away and home get arr with stats
        homeScore = 0;
        awayScore = 0;

        homePlayerStats = new ArrayList<PlayerGameStats>();

        for (Player player : homeTeam.getPlayers()) {
            homePlayerStats.add(new PlayerGameStats(player));
        }

        awayPlayerStats = new ArrayList<PlayerGameStats>();

        for (Player player : awayTeam.getPlayers()) {
            awayPlayerStats.add(new PlayerGameStats(player));
        }

    }

}
