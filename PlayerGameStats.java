public class PlayerGameStats {
    Player player;
    private int points;
    private int assists;
    private int rebounds;
    private int turnovers;
    private int steals;
    private int blocks;
    private int minPlayed;
    private int fieldGoalsMade;
    private int fieldGoalsAttempted;
    //private double fieldGoalPercentage;
    private int threePointerAttempted;
    private int threePointerMade;
    //private double threePointerPercentage;
    private int freeThrowsAttempted;
    private int freeThrowsMade;
    //private double freeThrowPercentage;

    PlayerGameStats(Player player) {
        this.player = player;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int pointsToAdd) {
        if (pointsToAdd > 0) {
            this.points += pointsToAdd;
        }
    }

    public int getAssists() {
        return assists;
    }

    public void addAssists(int assistsToAdd) {
        if (assistsToAdd > 0) {
            this.assists += assistsToAdd;
        }
    }

    public int getRebounds() {
        return rebounds;
    }

    public void addRebounds(int reboundsToAdd) {
        if (reboundsToAdd > 0) {
            this.rebounds += reboundsToAdd;
        }
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void addTurnovers(int turnoversToAdd) {
        if (turnoversToAdd > 0) {
            this.turnovers += turnoversToAdd;
        }
    }

    public int getSteals() {
        return steals;
    }

    public void addSteals(int stealsToAdd) {
        if (stealsToAdd > 0) {
            this.steals += stealsToAdd;
        }
    }

    public int getBlocks() {
        return blocks;
    }

    public void addBlocks(int blocksToAdd) {
        if (blocksToAdd > 0) {
            blocks += blocksToAdd;
        }
    }

    public int getMinPlayed() {
        return minPlayed;
    }

    public void addMinPlayed(int minPlayedToAdd) {
        if (minPlayed > 0) {
            minPlayed += minPlayedToAdd;
        }
    }

    public int getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public void addFieldGoalsMade(int fieldGoalsMadeToAdd) {
        if (fieldGoalsMadeToAdd > 0) {
            fieldGoalsMade += fieldGoalsMadeToAdd;
        }
    }

    public int getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    public void addFieldGoalsAttempted(int fieldGoalsAttemptedToAdd) {
        if (fieldGoalsAttemptedToAdd > 0) {
            fieldGoalsAttempted += fieldGoalsAttemptedToAdd;
        }
    }

    public double getfieldGoalPercentage() {
        if (fieldGoalsAttempted == 0) {
            return 0.0;
        } else {
            return (double) fieldGoalsMade / fieldGoalsAttempted;
        }
    }

    public int getThreePointerMade() {
        return threePointerMade;
    }

    public void addThreePointerMade(int threePointerMadeToAdd) {
        if (threePointerMadeToAdd > 0) {
            threePointerMade += threePointerMadeToAdd;
        }
    }

    public int getThreePointerAttempted() {
        return threePointerAttempted;
    }

    public void addThreepointerAttemped(int threePointerAttemptedToAdd) {
        if (threePointerAttemptedToAdd > 0) {
            threePointerAttempted += threePointerAttemptedToAdd;
        }
    }

    public double getThreePointerPercentage() {
        if (threePointerAttempted == 0) {
            return 0.0;
        } else {
            return (double) threePointerMade / threePointerAttempted;
        }
    }

    public int getFreeThrowsMade() {
        return freeThrowsMade;
    }

    public void addFreeThrowsMade(int freeThrowsMadeToAdd) {
        if (freeThrowsMadeToAdd > 0) {
            freeThrowsMade += freeThrowsMadeToAdd;
        }
    }

    public int getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    public void addFreeThrowsAttempted(int freeThrowsAttemptedToAdd) {
        if (freeThrowsAttemptedToAdd > 0) {
            freeThrowsAttempted += freeThrowsAttemptedToAdd;
        }
    }

    public double getFreeThrowPercentage() {
        if (freeThrowsAttempted == 0) {
            return 0.0;
        } else {
            return (double) freeThrowsMade / freeThrowsAttempted;
        }
    }

}
