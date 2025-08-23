import java.util.List;

public class Sim {
    public static void main(String[] args) {
        List<Team> teams = TeamInit.createTeams();

        Team home1 = teams.get(0);
        Team away1 = teams.get(1);

        Team home2 = teams.get(2);
        Team away2 = teams.get(3);

        Game g1 = new Game(home1, away1);
        Game g2 = new Game(home2, away2);
        g1.simGame();
        g2.simGame();
        
    }
}
