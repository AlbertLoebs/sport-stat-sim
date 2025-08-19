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
    Random rand = new Random();

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

    public void simGame() {
        boolean homePossession = true; // start with home team
        int totalPossessions = 200; // around the avg amount of poss in an nba game

        for (int i = 0; i < totalPossessions; i++) {
            if (homePossession) {
                PlayerGameStats player = selectRandomPlayer(homePlayerStats);

            } else {

            }

            // Switch possession for next loop
            homePossession = !homePossession;
        }

    }

    // this method can be used to get a random player for stats like pts, reb, asst
    public PlayerGameStats selectRandomPlayer(List<PlayerGameStats> teamStats) {
        return teamStats.get(rand.nextInt(teamStats.size()));
    }

    public boolean simPlayerShot(PlayerGameStats playerStats) {
        boolean isThreePointer = rand.nextInt(100) < 30;

        int playerShotRating = playerStats.getPlayer().getShooting();
        int roll = rand.nextInt(100);

        boolean madeShot = roll < playerShotRating;

        playerStats.addFieldGoalsAttempted(1);
        if (isThreePointer) {
            playerStats.addThreePointerAttemped(1);
        }

        if (madeShot) {
            playerStats.addFieldGoalsMade(1);
            int pointsScored = isThreePointer ? 3 : 2;
            playerStats.addPoints(pointsScored);

            if (isThreePointer) {
                playerStats.addThreePointerMade(1);
            }
        }
        return madeShot;
    }

    public PlayerGameStats simRebound(List<PlayerGameStats> teamStats) {
        PlayerGameStats player = selectRandomPlayer(teamStats);

        int rebRating = player.getPlayer().getRebounding();

        int roll = rand.nextInt(100);

        if (roll > rebRating) {
            player.addRebounds(1);
            return player;
        }
        return null;
    }

    public boolean simTurnover(List<PlayerGameStats> teamStats) {
        PlayerGameStats player = selectRandomPlayer(teamStats);

        int ballHandle = player.getPlayer().getBallHandle();

        int roll = rand.nextInt(100);

        boolean turnover = roll > ballHandle;
        if (turnover) {
            player.addTurnover(1);
        }
        return turnover;
    }

    public boolean simBlock(PlayerGameStats defender) {
        int blockRating = defender.getPlayer().getBlock();
        int roll = rand.nextInt(100);

        boolean blocked = roll < blockRating;
        if (blocked) {
            defender.addBlocks(1);
        }
        return blocked;
    }

    public boolean simSteal(PlayerGameStats defender) {
        int stealRating = defender.getPlayer().getDefense();
        int roll = rand.nextInt(100);

        boolean stolen = roll < stealRating;
        if (stolen) {
            defender.addSteals(1);
        }
        return stolen;
    }

}
