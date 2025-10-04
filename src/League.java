import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;

public class League {
    private List<Team> teams;
    private List<Game> schedule;
    private Map<Team, Game> teamGames; // wins and loses
    private KafkaProducer<String, String> producer; // kafka connection
    private final String kafkaTopic = "game-updates"; // topic name

    public League(List<Team> teams) {
        this.teams = teams;
        this.schedule = new ArrayList<>();
        initProducer();
    }

    private void initProducer() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        producer = new KafkaProducer<>(props);
    }

    private void sendResultsToKafka(Game game) {
        String home = game.getHomeTeam().getName();
        String away = game.getAwayTeam().getName();
        int homeScore = game.getHomeScore();
        int awayScore = game.getAwayScore();

        // string payload may change later on
        String message = home + " " + homeScore + " -- " + away + " " + awayScore;

        ProducerRecord<String, String> record = new ProducerRecord<>(kafkaTopic, home, message);
        // async send with callback to log errors
        producer.send(record, (metadata, exception) -> {
            if (exception != null) {
                exception.printStackTrace();
            } else {
                // small log
                System.out.println("Sent to Kafka: " + message);
            }
        });
    }

    public void closeProducer() {
        if (producer != null){
            producer.flush(); // push anything buffered
            producer.close();
        }
    }

    public List<Game> makeSchedule(List<Team> teams) {
        // this makes everyone play eachother twice at least
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
            sendResultsToKafka(game);
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
        System.out.println("===== League Standings =====");
        System.out.printf("%-20s %5s %5s%n", "Team", "W", "L");

        for (Team team : teams) {
            System.out.printf("%-20s %5d %5d%n",
                    team.getName(),
                    team.getWins(),
                    team.getLosses());
        }
    }
}
