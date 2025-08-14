public class Player {
    private String firstName;
    private String lastName;
    private String jerseyNumber;
    private String position;

    public Player(String firstName, String lastName, String jerseyNumber, String position){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " #" + jerseyNumber + " (" + position + ")";
    }
}
