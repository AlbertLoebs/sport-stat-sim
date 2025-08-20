import java.util.List;

public class Sim {
    public static void main(String[] args) {
        List<Team> teams = TeamInit.createTeams();

        Team home = teams.get(0);
        Team away = teams.get(1);

        Game g = new Game(home, away);
        g.simGame();
        
    }
}
