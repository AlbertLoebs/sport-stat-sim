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

        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;

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

            List<PlayerGameStats> offenseStats = homePossession ? homePlayerStats : awayPlayerStats;
            List<PlayerGameStats> defenseStats = homePossession ? awayPlayerStats : homePlayerStats;

            // --- 12% turnover chance ---
            if (Math.random() < 0.12) {
                // Turnover
                PlayerGameStats turnoverPlayer = selectRandomPlayer(offenseStats);
                turnoverPlayer.addTurnover(1);
                ;

                // 60% chance it’s a steal
                if (Math.random() < 0.6) {
                    PlayerGameStats stealer = selectRandomPlayer(defenseStats);
                    stealer.addSteals(1);
                }

                homePossession = !homePossession;
                continue;
            }

            PlayerGameStats shooter = selectRandomPlayer(offenseStats);
            PlayerGameStats defender = selectRandomPlayer(defenseStats);

            int points = simPlayerShot(shooter, defender); // sim shot

            if (points > 0) {
                // Update TEAM score
                if (homePossession) {
                    homeScore += points;
                } else {
                    awayScore += points;
                }

                if (Math.random() < 0.70) { // 70% of made shots are assisted
                    PlayerGameStats assister = selectRandomPlayer(offenseStats);
                    if (assister != shooter) {
                        assister.addAssists(1);
                    }
                }
            } else {
                // Shot missed → rebound chance
                PlayerGameStats rebounder = simRebound(defenseStats);
                if (rebounder == null) {
                    // Nobody on defense got it, try offense
                    rebounder = simRebound(offenseStats);
                    if (rebounder != null) {
                        // Offensive rebound = same team keeps possession
                        i--; // don’t count this as a full possession
                        continue;
                    }
                }
            }

            // Switch possession if no offensive rebound
            homePossession = !homePossession;
        }

        //System.out.println("Final Score: Home " + homeScore + " - Away " + awayScore);

    // System.out.println("\nHome Team Box Score:");
    // for (PlayerGameStats p : homePlayerStats) {
    //     System.out.println(p);
    // }

    // System.out.println("\nAway Team Box Score:");
    // for (PlayerGameStats p : awayPlayerStats) {
    //     System.out.println(p);
    // }
    }

    // this method can be used to get a random player for stats like pts, reb, asst
    public PlayerGameStats selectRandomPlayer(List<PlayerGameStats> teamStats) {
        return teamStats.get(rand.nextInt(teamStats.size()));
    }

    public int simPlayerShot(PlayerGameStats shooter, PlayerGameStats defender) {
        boolean isThreePointer = rand.nextInt(100) < 30;

        int blockChance = rand.nextInt(100);

        if (Math.random() < .20){ // 20% in a block
        if (blockChance < defender.getPlayer().getBlock()) {
            defender.addBlocks(1);
            shooter.addFieldGoalsAttempted(1); // even if shot is blocked count as an attempt
            if (isThreePointer) {
                shooter.addThreePointerAttemped(1);
            }
            return 0; // blocked shot
        }
    }

        int playerShotRating = shooter.getPlayer().getShooting();
        int roll = rand.nextInt(100);

        boolean madeShot = roll < playerShotRating;

        shooter.addFieldGoalsAttempted(1);
        if (isThreePointer) {
            shooter.addThreePointerAttemped(1);
        }

        if (madeShot) {
            shooter.addFieldGoalsMade(1);
            int pointsScored = isThreePointer ? 3 : 2;
            shooter.addPoints(pointsScored);

            if (isThreePointer) {
                shooter.addThreePointerMade(1);
            }
            return pointsScored; // make
        }
        return 0; // miss
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

    public int getHomeScore(){
        return homeScore;
    }

    public int getAwayScore(){
        return awayScore;
    }

    public Team getHomeTeam(){
        return homeTeam;
    }

    public Team getAwayTeam(){
        return awayTeam;
    }

}