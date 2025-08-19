import java.util.Random;

public class Player {
    private String firstName;
    private String lastName;
    private String jerseyNumber;
    private String position;
    private int shooting;
    private int defense;
    private int passing;
    private int rebounding;
    private int speed;
    private int stamina;
    private int strength;
    private int ballHandle;
    private int block;
    private static Random rand = new Random();

    public Player(String firstName, String lastName, String jerseyNumber, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
    }

    public static Player genPlayerRating(String firstName, String lastName, String jerseyNumber, String position) {
        Player player = new Player(firstName, lastName, jerseyNumber, position);

        switch (position) {
            case "G":
            case "PG":
                player.shooting = 65 + rand.nextInt(36);
                player.defense = 70 + rand.nextInt(31);
                player.passing = 75 + rand.nextInt(26);
                player.rebounding = 20 + rand.nextInt(81);
                player.speed = 70 + rand.nextInt(31);
                player.stamina = 75 + rand.nextInt(26);
                player.strength = 50 + rand.nextInt(51);
                player.ballHandle = 75 + rand.nextInt(26);
                player.block = 50 + rand.nextInt(51);
                break;

            case "SG":
                player.shooting = 75 + rand.nextInt(26);
                player.defense = 65 + rand.nextInt(36);
                player.passing = 60 + rand.nextInt(41);
                player.rebounding = 40 + rand.nextInt(61);
                player.speed = 60 + rand.nextInt(41);
                player.stamina = 70 + rand.nextInt(31);
                player.strength = 55 + rand.nextInt(56);
                player.ballHandle = 70 + rand.nextInt(31);
                player.block = 55 + rand.nextInt(46);
                break;

            case "F":
            case "SF":
                player.shooting = 65 + rand.nextInt(36);
                player.defense = 60 + rand.nextInt(41);
                player.passing = 55 + rand.nextInt(46);
                player.rebounding = 60 + rand.nextInt(41);
                player.speed = 55 + rand.nextInt(46);
                player.stamina = 60 + rand.nextInt(31);
                player.strength = 60 + rand.nextInt(41);
                player.ballHandle = 65 + rand.nextInt(36);
                player.block = 60 + rand.nextInt(41);
                break;

            case "PF":
                player.shooting = 55 + rand.nextInt(46);
                player.defense = 55 + rand.nextInt(46);
                player.passing = 50 + rand.nextInt(51);
                player.rebounding = 70 + rand.nextInt(31);
                player.speed = 50 + rand.nextInt(51);
                player.stamina = 55 + rand.nextInt(46);
                player.strength = 70 + rand.nextInt(31);
                player.ballHandle = 60 + rand.nextInt(41);
                player.block = 65 + rand.nextInt(36);
                break;

            case "C":
                player.shooting = 50 + rand.nextInt(51);
                player.defense = 50 + rand.nextInt(51);
                player.passing = 45 + rand.nextInt(56);
                player.rebounding = 75 + rand.nextInt(26);
                player.speed = 45 + rand.nextInt(56);
                player.stamina = 50 + rand.nextInt(51);
                player.strength = 75 + rand.nextInt(26);
                player.ballHandle = 55 + rand.nextInt(46);
                player.block = 70 + rand.nextInt(31);
                break;

            default:
                System.err.println("Could not create player");
        }
        return player;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public int getShooting() {
        return shooting;
    }

    public int getDefense() {
        return defense;
    }

    public int getPassing() {
        return passing;
    }

    public int getRebounding() {
        return rebounding;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public int getBallHandle(){
        return ballHandle;
    }

    public int getBlock(){
        return block;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " #" + jerseyNumber + " (" + position + ") " +
           "Shooting: " + shooting +
           ", Defense: " + defense +
           ", Passing: " + passing +
           ", Rebounding: " + rebounding +
           ", Speed: " + speed +
           ", Stamina: " + stamina +
           ", Strength: " + strength;
    }
}
