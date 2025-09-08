import java.util.List;
import java.util.ArrayList;

public class TeamInit {
    public static List<Player> createPlayers(String teamName) {
        List<Player> player = new ArrayList<>();

        switch (teamName) {
            case "Lakers":
                player.add(Player.genPlayerRating("Deandre", "Ayton", "27", "C"));
                player.add(Player.genPlayerRating("RJ", "Davis", "99", "G"));
                player.add(Player.genPlayerRating("Eric", "Dixon", "98", "F"));
                player.add(Player.genPlayerRating("Luka", "Doncic", "77", "PG"));
                player.add(Player.genPlayerRating("Rui", "Hachimura", "28", "PF"));
                player.add(Player.genPlayerRating("Jaxson", "Hayes", "11", "C"));
                player.add(Player.genPlayerRating("Bronny", "James", "9", "G"));
                player.add(Player.genPlayerRating("LeBron", "James", "23", "SF"));
                player.add(Player.genPlayerRating("Arthur", "Kaluma", "97", "F"));
                player.add(Player.genPlayerRating("Maxi", "Kleber", "14", "PF"));
                player.add(Player.genPlayerRating("Dalton", "Knecht", "4", "G"));
                player.add(Player.genPlayerRating("Christian", "Koloko", "10", "C"));
                player.add(Player.genPlayerRating("Jake", "LaRavia", "-", "F"));
                player.add(Player.genPlayerRating("Alex", "Len", "27", "C"));
                player.add(Player.genPlayerRating("Chris", "Manon", "30", "G"));
                player.add(Player.genPlayerRating("Augustas", "Marciulionis", "96", "G"));
                player.add(Player.genPlayerRating("Markieff", "Morris", "88", "PF"));
                player.add(Player.genPlayerRating("Austin", "Reaves", "15", "SG"));
                player.add(Player.genPlayerRating("Marcus", "Smart", "-", "PG"));
                player.add(Player.genPlayerRating("Ethan", "Taylor", "-", "G"));
                player.add(Player.genPlayerRating("Adou", "Thiero", "1", "F"));
                player.add(Player.genPlayerRating("Jarred", "Vanderbilt", "2", "PF"));
                player.add(Player.genPlayerRating("Gabe", "Vincent", "7", "PG"));
                break;

            case "Celtics":
                player.add(Player.genPlayerRating("Jaylen", "Brown", "7", "SG"));
                player.add(Player.genPlayerRating("Torrey", "Craig", "12", "SF"));
                player.add(Player.genPlayerRating("Luka", "Garza", "55", "C"));
                player.add(Player.genPlayerRating("Hugo", "Gonzalez", "28", "G"));
                player.add(Player.genPlayerRating("Sam", "Hauser", "30", "SF"));
                player.add(Player.genPlayerRating("Al", "Horford", "42", "C"));
                player.add(Player.genPlayerRating("Josh", "Minott", "8", "F"));
                player.add(Player.genPlayerRating("Georges", "Niang", "-", "SF"));
                player.add(Player.genPlayerRating("Miles", "Norris", "44", "F"));
                player.add(Player.genPlayerRating("Payton", "Pritchard", "11", "PG"));
                player.add(Player.genPlayerRating("Neemias", "Queta", "88", "C"));
                player.add(Player.genPlayerRating("Baylor", "Scheierman", "55", "F"));
                player.add(Player.genPlayerRating("Max", "Shulga", "29", "G"));
                player.add(Player.genPlayerRating("Anfernee", "Simons", "1", "SG"));
                player.add(Player.genPlayerRating("Jayson", "Tatum", "0", "SF"));
                player.add(Player.genPlayerRating("Xavier", "Tillman", "26", "F"));
                player.add(Player.genPlayerRating("Jordan", "Walsh", "27", "G"));
                player.add(Player.genPlayerRating("Derrick", "White", "9", "PG"));
                player.add(Player.genPlayerRating("Amari", "Williams", "77", "C"));
                break;

            case "Thunder":
                player.add(Player.genPlayerRating("Brooks", "Barnhizer", "23", "F"));
                player.add(Player.genPlayerRating("Branden", "Carlson", "15", "C"));
                player.add(Player.genPlayerRating("Alex", "Caruso", "9", "SG"));
                player.add(Player.genPlayerRating("Ousmane", "Dieng", "13", "F"));
                player.add(Player.genPlayerRating("Luguentz", "Dort", "5", "G"));
                player.add(Player.genPlayerRating("Shai", "Gilgeous-Alexander", "2", "PG"));
                player.add(Player.genPlayerRating("Isaiah", "Hartenstein", "55", "C"));
                player.add(Player.genPlayerRating("Chet", "Holmgren", "7", "PF"));
                player.add(Player.genPlayerRating("Isaiah", "Joe", "11", "SG"));
                player.add(Player.genPlayerRating("Ajay", "Mitchell", "25", "G"));
                player.add(Player.genPlayerRating("Thomas", "Sorber", "12", "C"));
                player.add(Player.genPlayerRating("Nikola", "Topic", "44", "G"));
                player.add(Player.genPlayerRating("Cason", "Wallace", "22", "G"));
                player.add(Player.genPlayerRating("Aaron", "Wiggins", "21", "SG"));
                player.add(Player.genPlayerRating("Jalen", "Williams", "8", "F"));
                player.add(Player.genPlayerRating("Jaylin", "Williams", "6", "F"));
                player.add(Player.genPlayerRating("Kenrich", "Williams", "34", "SF"));
                break;

            case "Pacers":
                player.add(Player.genPlayerRating("Tony", "Bradley", "13", "C"));
                player.add(Player.genPlayerRating("RayJ", "Dennis", "10", "G"));
                player.add(Player.genPlayerRating("Johnny", "Furphy", "12", "F"));
                player.add(Player.genPlayerRating("Tyrese", "Haliburton", "0", "PG"));
                player.add(Player.genPlayerRating("Jay", "Huff", "-", "C"));
                player.add(Player.genPlayerRating("Isaiah", "Jackson", "22", "SF"));
                player.add(Player.genPlayerRating("Quenton", "Jackson", "29", "G"));
                player.add(Player.genPlayerRating("Kam", "Jones", "-", "G"));
                player.add(Player.genPlayerRating("Bennedict", "Mathurin", "00", "SG"));
                player.add(Player.genPlayerRating("T.J.", "McConnell", "9", "PG"));
                player.add(Player.genPlayerRating("Andrew", "Nembhard", "2", "PG"));
                player.add(Player.genPlayerRating("Aaron", "Nesmith", "23", "SF"));
                player.add(Player.genPlayerRating("Taelon", "Peter", "-", "G"));
                player.add(Player.genPlayerRating("Ben", "Sheppard", "26", "G"));
                player.add(Player.genPlayerRating("Pascal", "Siakam", "43", "PF"));
                player.add(Player.genPlayerRating("Obi", "Toppin", "1", "PF"));
                player.add(Player.genPlayerRating("Jarace", "Walker", "5", "F"));
                player.add(Player.genPlayerRating("James", "Wiseman", "-", "C"));
                break;

            case "Warriors":
                player.add(Player.genPlayerRating("Taran", "Armstrong", "1", "G"));
                player.add(Player.genPlayerRating("Jimmy", "Butler III", "10", "SF"));
                player.add(Player.genPlayerRating("Stephen", "Curry", "30", "PG"));
                player.add(Player.genPlayerRating("Draymond", "Green", "23", "PF"));
                player.add(Player.genPlayerRating("Buddy", "Hield", "7", "SG"));
                player.add(Player.genPlayerRating("Trayce", "Jackson-Davis", "32", "F"));
                player.add(Player.genPlayerRating("Braxton", "Key", "12", "F"));
                player.add(Player.genPlayerRating("Kevin", "Knox II", "32", "F"));
                player.add(Player.genPlayerRating("Jonathan", "Kuminga", "00", "PF"));
                player.add(Player.genPlayerRating("Moses", "Moody", "4", "SG"));
                player.add(Player.genPlayerRating("Gary", "Payton II", "0", "SG"));
                player.add(Player.genPlayerRating("Brandin", "Podziemski", "2", "G"));
                player.add(Player.genPlayerRating("Quinten", "Post", "21", "C"));
                player.add(Player.genPlayerRating("Pat", "Spencer", "61", "G"));
                break;

            case "Nuggets":
                player.add(Player.genPlayerRating("Tamar", "Bates", "23", "G"));
                player.add(Player.genPlayerRating("Christian", "Braun", "0", "G"));
                player.add(Player.genPlayerRating("Bruce", "Brown", "", "SF"));
                player.add(Player.genPlayerRating("Kessler", "Edwards", "", "F"));
                player.add(Player.genPlayerRating("Tim", "Hardaway Jr.", "", "SF"));
                player.add(Player.genPlayerRating("DaRon", "Holmes II", "14", "C"));
                player.add(Player.genPlayerRating("Cameron", "Johnson", "", "SF"));
                player.add(Player.genPlayerRating("Nikola", "Jokic", "15", "C"));
                player.add(Player.genPlayerRating("Curtis", "Jones", "", "G"));
                player.add(Player.genPlayerRating("Spencer", "Jones", "", "F"));
                player.add(Player.genPlayerRating("Jamal", "Murray", "27", "PG"));
                player.add(Player.genPlayerRating("Zeke", "Nnaji", "22", "PF"));
                player.add(Player.genPlayerRating("Jalen", "Pickett", "", "G"));
                player.add(Player.genPlayerRating("Julian", "Strawther", "3", "G"));
                player.add(Player.genPlayerRating("Hunter", "Tyson", "5", "F"));
                player.add(Player.genPlayerRating("Jonas", "Valanciunas", "17", "C"));
                player.add(Player.genPlayerRating("Peyton", "Watson", "8", "F"));
                break;

            case "Bulls":
                player.add(Player.genPlayerRating("Matas", "Buzelis", "14", "F"));
                player.add(Player.genPlayerRating("Jevon", "Carter", "5", "PG"));
                player.add(Player.genPlayerRating("Zach", "Collins", "12", "PF"));
                player.add(Player.genPlayerRating("Ayo", "Dosunmu", "11", "SG"));
                player.add(Player.genPlayerRating("Noa", "Essengue", "24", "F"));
                player.add(Player.genPlayerRating("Caleb", "Grill", "", "G"));
                player.add(Player.genPlayerRating("Kevin", "Huerter", "13", "SG"));
                player.add(Player.genPlayerRating("Tre", "Jones", "30", "PG"));
                player.add(Player.genPlayerRating("Yuki", "Kawamura", "", "G"));
                player.add(Player.genPlayerRating("Emanuel", "Miller", "20", "F"));
                player.add(Player.genPlayerRating("Isaac", "Okoro", "", "SF"));
                player.add(Player.genPlayerRating("Lachlan", "Olbrich", "", "F"));
                player.add(Player.genPlayerRating("Julian", "Phillips", "15", "F"));
                player.add(Player.genPlayerRating("Wooga", "Poplar", "", "G"));
                player.add(Player.genPlayerRating("Jalen", "Smith", "7", "PF"));
                player.add(Player.genPlayerRating("Dalen", "Terry", "25", "F"));
                player.add(Player.genPlayerRating("Nikola", "Vucevic", "9", "C"));
                player.add(Player.genPlayerRating("Coby", "White", "0", "PG"));
                player.add(Player.genPlayerRating("Patrick", "Williams", "44", "PF"));
                break;

            case "Grizzlies":
                player.add(Player.genPlayerRating("Santi", "Aldama", "7", "PF"));
                player.add(Player.genPlayerRating("Marvin", "Bagley III", "35", "PF"));
                player.add(Player.genPlayerRating("Desmond", "Bane", "22", "SG"));
                player.add(Player.genPlayerRating("Brandon", "Clarke", "15", "PF"));
                player.add(Player.genPlayerRating("Zach", "Edey", "14", "C"));
                player.add(Player.genPlayerRating("Jay", "Huff", "30", "C"));
                player.add(Player.genPlayerRating("GG", "Jackson", "45", "F"));
                player.add(Player.genPlayerRating("Jaren", "Jackson Jr.", "13", "PF"));
                player.add(Player.genPlayerRating("Yuki", "Kawamura", "17", "G"));
                player.add(Player.genPlayerRating("Luke", "Kennard", "10", "SG"));
                player.add(Player.genPlayerRating("John", "Konchar", "46", "SG"));
                player.add(Player.genPlayerRating("Ja", "Morant", "12", "PG"));
                player.add(Player.genPlayerRating("Scotty", "Pippen Jr.", "1", "G"));
                player.add(Player.genPlayerRating("Zyon", "Pullin", "2", "G"));
                player.add(Player.genPlayerRating("Cam", "Spencer", "24", "G"));
                player.add(Player.genPlayerRating("Lamar", "Stevens", "8", "F"));
                player.add(Player.genPlayerRating("Jaylen", "Wells", "0", "F"));
                player.add(Player.genPlayerRating("Vince", "Williams Jr.", "5", "G"));
                break;

            case "Nets":
                player.add(Player.genPlayerRating("Reece", "Beekman", "4", "G"));
                player.add(Player.genPlayerRating("Nic", "Claxton", "33", "C"));
                player.add(Player.genPlayerRating("Noah", "Clowney", "21", "F"));
                player.add(Player.genPlayerRating("Tyson", "Etienne", "11", "G"));
                player.add(Player.genPlayerRating("Tosan", "Evbuomwan", "12", "F"));
                player.add(Player.genPlayerRating("Killian", "Hayes", "7", "G"));
                player.add(Player.genPlayerRating("Cameron", "Johnson", "2", "SF"));
                player.add(Player.genPlayerRating("Keon", "Johnson", "45", "G"));
                player.add(Player.genPlayerRating("Maxwell", "Lewis", "27", "F"));
                player.add(Player.genPlayerRating("Tyrese", "Martin", "13", "G"));
                player.add(Player.genPlayerRating("De'Anthony", "Melton", "14", "SG"));
                player.add(Player.genPlayerRating("D'Angelo", "Russell", "1", "G"));
                player.add(Player.genPlayerRating("Day'Ron", "Sharpe", "20", "C"));
                player.add(Player.genPlayerRating("Cam", "Thomas", "24", "SG"));
                player.add(Player.genPlayerRating("Trendon", "Watford", "9", "PF"));
                player.add(Player.genPlayerRating("Dariq", "Whitehead", "0", "F"));
                player.add(Player.genPlayerRating("Ziaire", "Williams", "8", "F"));
                player.add(Player.genPlayerRating("Jalen", "Wilson", "22", "F"));
                break;

            case "Hornets":
                player.add(Player.genPlayerRating("LaMelo", "Ball", "1", "PG"));
                player.add(Player.genPlayerRating("Miles", "Bridges", "0", "SF"));
                player.add(Player.genPlayerRating("Seth", "Curry", "30", "SG"));
                player.add(Player.genPlayerRating("Moussa", "Diabate", "14", "F"));
                player.add(Player.genPlayerRating("Marcus", "Garrett", "28", "G"));
                player.add(Player.genPlayerRating("Taj", "Gibson", "67", "F"));
                player.add(Player.genPlayerRating("Josh", "Green", "10", "SG"));
                player.add(Player.genPlayerRating("DaQuan", "Jeffries", "3", "SG"));
                player.add(Player.genPlayerRating("Tre", "Mann", "23", "PG"));
                player.add(Player.genPlayerRating("Brandon", "Miller", "24", "F"));
                player.add(Player.genPlayerRating("Wendell", "Moore Jr.", "9", "G"));
                player.add(Player.genPlayerRating("Jusuf", "Nurkic", "11", "C"));
                player.add(Player.genPlayerRating("Josh", "Okogie", "12", "SF"));
                player.add(Player.genPlayerRating("Elfrid", "Payton", "22", "G"));
                player.add(Player.genPlayerRating("Tidjane", "Salaun", "31", "F"));
                player.add(Player.genPlayerRating("KJ", "Simpson", "25", "G"));
                player.add(Player.genPlayerRating("Jaylen", "Sims", "30", "G"));
                player.add(Player.genPlayerRating("Nick", "Smith Jr.", "8", "G"));
                player.add(Player.genPlayerRating("Grant", "Williams", "2", "PF"));
                player.add(Player.genPlayerRating("Mark", "Williams", "5", "C"));
                break;

            case "Cavaliers":
                player.add(Player.genPlayerRating("Jarrett", "Allen", "31", "C"));
                player.add(Player.genPlayerRating("Lonzo", "Ball", "", "PG"));
                player.add(Player.genPlayerRating("Darius", "Garland", "10", "PG"));
                player.add(Player.genPlayerRating("De'Andre", "Hunter", "12", "SF"));
                player.add(Player.genPlayerRating("Sam", "Merrill", "5", "SG"));
                player.add(Player.genPlayerRating("Donovan", "Mitchell", "45", "SG"));
                player.add(Player.genPlayerRating("Evan", "Mobley", "4", "PF"));
                player.add(Player.genPlayerRating("Larry", "Nance Jr.", "22", "PF"));
                player.add(Player.genPlayerRating("Craig", "Porter Jr.", "9", "G"));
                player.add(Player.genPlayerRating("Tyrese", "Proctor", "", "G"));
                player.add(Player.genPlayerRating("Max", "Strus", "1", "SG"));
                player.add(Player.genPlayerRating("Nae'Qwan", "Tomlin", "30", "F"));
                player.add(Player.genPlayerRating("Luke", "Travers", "33", "G"));
                player.add(Player.genPlayerRating("Jaylon", "Tyson", "24", "F"));
                player.add(Player.genPlayerRating("Dean", "Wade", "32", "PF"));
                break;

            case "Pistons":
                player.add(Player.genPlayerRating("Malik", "Beasley", "5", "SG"));
                player.add(Player.genPlayerRating("Cade", "Cunningham", "2", "PG"));
                player.add(Player.genPlayerRating("Jalen", "Duren", "0", "C"));
                player.add(Player.genPlayerRating("Simone", "Fontecchio", "19", "F"));
                player.add(Player.genPlayerRating("Tim", "Hardaway Jr.", "8", "SF"));
                player.add(Player.genPlayerRating("Tobias", "Harris", "12", "F"));
                player.add(Player.genPlayerRating("Ronald", "Holland II", "00", "F"));
                player.add(Player.genPlayerRating("Jaden", "Ivey", "23", "PG"));
                player.add(Player.genPlayerRating("Daniss", "Jenkins", "24", "G"));
                player.add(Player.genPlayerRating("Bobi", "Klintman", "34", "F"));
                player.add(Player.genPlayerRating("Paul", "Reed", "7", "F"));
                player.add(Player.genPlayerRating("Marcus", "Sasser", "25", "G"));
                player.add(Player.genPlayerRating("Dennis", "Schroder", "71", "PG"));
                player.add(Player.genPlayerRating("Isaiah", "Stewart", "28", "C"));
                player.add(Player.genPlayerRating("Ausar", "Thompson", "9", "F"));
                player.add(Player.genPlayerRating("Lindy", "Waters III", "43", "F"));
                player.add(Player.genPlayerRating("Tolu", "Smith", "35", "F"));
                player.add(Player.genPlayerRating("Cole", "Swider", "", "F"));
                player.add(Player.genPlayerRating("Alondes", "Williams", "31", "G"));
                player.add(Player.genPlayerRating("Javante", "McCoy", "", "G"));
                break;

            case "Mavericks":
                player.add(Player.genPlayerRating("Max", "Christie", "00", "G"));
                player.add(Player.genPlayerRating("Moussa", "Cisse", "45", "C"));
                player.add(Player.genPlayerRating("Matthew", "Cleveland", "35", "G"));
                player.add(Player.genPlayerRating("Anthony", "Davis", "3", "PF"));
                player.add(Player.genPlayerRating("Dante", "Exum", "0", "G"));
                player.add(Player.genPlayerRating("Cooper", "Flagg", "32", "F"));
                player.add(Player.genPlayerRating("Daniel", "Gafford", "21", "C"));
                player.add(Player.genPlayerRating("Jaden", "Hardy", "1", "G"));
                player.add(Player.genPlayerRating("Kyrie", "Irving", "11", "PG"));
                player.add(Player.genPlayerRating("Dereck", "Lively II", "2", "C"));
                player.add(Player.genPlayerRating("Naji", "Marshall", "13", "SF"));
                player.add(Player.genPlayerRating("Caleb", "Martin", "16", "SF"));
                player.add(Player.genPlayerRating("Ryan", "Nembhard", "9", "G"));
                player.add(Player.genPlayerRating("Dwight", "Powell", "7", "C"));
                player.add(Player.genPlayerRating("D'Angelo", "Russell", "5", "PG"));
                player.add(Player.genPlayerRating("Klay", "Thompson", "31", "SG"));
                player.add(Player.genPlayerRating("P.J.", "Washington", "25", "PF"));
                player.add(Player.genPlayerRating("Brandon", "Williams", "10", "G"));
                break;

            case "Rockets":
                player.add(Player.genPlayerRating("Steven", "Adams", "12", "C"));
                player.add(Player.genPlayerRating("Clint", "Capela", "99", "C"));
                player.add(Player.genPlayerRating("Isaiah", "Crawford", "", "F"));
                player.add(Player.genPlayerRating("J.D.", "Davison", "", "G"));
                player.add(Player.genPlayerRating("Kevin", "Durant", "7", "PF"));
                player.add(Player.genPlayerRating("Tari", "Eason", "17", "F"));
                player.add(Player.genPlayerRating("Dorian", "Finney-Smith", "", "PF"));
                player.add(Player.genPlayerRating("Jeff", "Green", "32", "PF"));
                player.add(Player.genPlayerRating("Kevon", "Harris", "12", "G"));
                player.add(Player.genPlayerRating("Aaron", "Holiday", "0", "G"));
                player.add(Player.genPlayerRating("Josh", "Okogie", "", "SF"));
                player.add(Player.genPlayerRating("Alperen", "Şengün", "28", "C"));
                player.add(Player.genPlayerRating("Reed", "Sheppard", "15", "G"));
                player.add(Player.genPlayerRating("Jabari", "Smith Jr.", "10", "PF"));
                player.add(Player.genPlayerRating("Jae'Sean", "Tate", "8", "SF"));
                player.add(Player.genPlayerRating("Amen", "Thompson", "1", "F"));
                player.add(Player.genPlayerRating("Fred", "VanVleet", "5", "PG"));
                break;

            case "Clippers":
                player.add(Player.genPlayerRating("Nicolas", "Batum", "33", "PF"));
                player.add(Player.genPlayerRating("Bradley", "Beal", "", "SG"));
                player.add(Player.genPlayerRating("Bogdan", "Bogdanović", "10", "SG"));
                player.add(Player.genPlayerRating("Kobe", "Brown", "21", "G"));
                player.add(Player.genPlayerRating("Cam", "Christie", "12", "G"));
                player.add(Player.genPlayerRating("John", "Collins", "", "F-C"));
                player.add(Player.genPlayerRating("Kris", "Dunn", "8", "G"));
                player.add(Player.genPlayerRating("Trentyn", "Flowers", "9", "G"));
                player.add(Player.genPlayerRating("James", "Harden", "1", "SG"));
                player.add(Player.genPlayerRating("Derrick", "Jones Jr.", "55", "SF"));
                player.add(Player.genPlayerRating("Yanic", "Konan Niederhauser", "", "C"));
                player.add(Player.genPlayerRating("Patty", "Mills", "88", "PG"));
                player.add(Player.genPlayerRating("Chris", "Paul", "3", "PG"));
                player.add(Player.genPlayerRating("Brook", "Lopez", "", "C"));
                player.add(Player.genPlayerRating("Jordan", "Miller", "", "G"));
                player.add(Player.genPlayerRating("Kobe", "Sanders", "", "G"));
                player.add(Player.genPlayerRating("TyTy", "Washington Jr.", "", "G"));
                player.add(Player.genPlayerRating("Ivica", "Zubac", "40", "C"));
                break;

            case "Heat":
                player.add(Player.genPlayerRating("Bam", "Adebayo", "13", "C"));
                player.add(Player.genPlayerRating("Simone", "Fontecchio", "0", "F"));
                player.add(Player.genPlayerRating("Myron", "Gardner", "15", "F"));
                player.add(Player.genPlayerRating("Vladislav", "Goldin", "50", "C"));
                player.add(Player.genPlayerRating("Tyler", "Herro", "14", "PG"));
                player.add(Player.genPlayerRating("Kasparas", "Jakucionis", "25", "G"));
                player.add(Player.genPlayerRating("Jaime", "Jaquez Jr.", "11", "G"));
                player.add(Player.genPlayerRating("Keshad", "Johnson", "16", "F"));
                player.add(Player.genPlayerRating("Nikola", "Jovic", "5", "F"));
                player.add(Player.genPlayerRating("Pelle", "Larsson", "9", "G"));
                player.add(Player.genPlayerRating("Davion", "Mitchell", "45", "PG"));
                player.add(Player.genPlayerRating("Norman", "Powell", "24", "G"));
                player.add(Player.genPlayerRating("Terry", "Rozier", "2", "SG"));
                player.add(Player.genPlayerRating("Dru", "Smith", "12", "G"));
                player.add(Player.genPlayerRating("Ethan", "Thompson", "", "G"));
                player.add(Player.genPlayerRating("Kel'el", "Ware", "7", "C"));
                player.add(Player.genPlayerRating("Andrew", "Wiggins", "22", "SF"));
                break;

            case "Bucks":
                player.add(Player.genPlayerRating("Giannis", "Antetokounmpo", "34", "PF"));
                player.add(Player.genPlayerRating("Bobby", "Portis", "9", "PF"));
                player.add(Player.genPlayerRating("Kyle", "Kuzma", "33", "SF"));
                player.add(Player.genPlayerRating("Taurean", "Prince", "12", "SF"));
                player.add(Player.genPlayerRating("Pat", "Connaughton", "24", "SG"));
                player.add(Player.genPlayerRating("Kevin", "Porter Jr.", "3", "PG"));
                player.add(Player.genPlayerRating("Ryan", "Rollins", "30", "SG"));
                player.add(Player.genPlayerRating("AJ", "Green", "23", "SG"));
                player.add(Player.genPlayerRating("Andre", "Jackson Jr.", "10", "SF"));
                player.add(Player.genPlayerRating("Jamaree", "Bouyea", "15", "PG"));
                player.add(Player.genPlayerRating("Cole", "Anthony", "50", "PG"));
                player.add(Player.genPlayerRating("Chris", "Livingston", "0", "SF"));
                player.add(Player.genPlayerRating("Jericho", "Sims", "33", "C"));
                player.add(Player.genPlayerRating("Vasa", "Micic", "44", "PG"));
                player.add(Player.genPlayerRating("Mark", "Sears", "12", "PG"));
                break;

            case "Timberwolves":
                player.add(Player.genPlayerRating("Mike", "Conley", "10", "PG"));
                player.add(Player.genPlayerRating("Donte", "DiVincenzo", "0", "SG"));
                player.add(Player.genPlayerRating("Rob", "Dillingham", "11", "PG"));
                player.add(Player.genPlayerRating("Anthony", "Edwards", "5", "SG"));
                player.add(Player.genPlayerRating("Bones", "Hyland", "8", "PG"));
                player.add(Player.genPlayerRating("Nickeil", "Alexander-Walker", "6", "SG"));
                player.add(Player.genPlayerRating("Terrence", "Shannon Jr.", "3", "SF"));
                player.add(Player.genPlayerRating("Jaylen", "Clark", "2", "SF"));
                player.add(Player.genPlayerRating("Jaden", "McDaniels", "3", "SF"));
                player.add(Player.genPlayerRating("Julius", "Randle", "30", "PF"));
                player.add(Player.genPlayerRating("Naz", "Reid", "11", "C"));
                player.add(Player.genPlayerRating("Joe", "Ingles", "7", "SF"));
                player.add(Player.genPlayerRating("Leonard", "Miller", "0", "SF"));
                player.add(Player.genPlayerRating("Rocco", "Zikarsky", "0", "C"));
                player.add(Player.genPlayerRating("Joan", "Beringer", "0", "C"));
                break;

            case "Pelicans":
                player.add(Player.genPlayerRating("Jose", "Alvarado", "15", "PG"));
                player.add(Player.genPlayerRating("Elfrid", "Payton", "6", "PG"));
                player.add(Player.genPlayerRating("Jordan", "Hawkins", "55", "SG"));
                player.add(Player.genPlayerRating("DDAntonio", "Reeves", "0", "SG"));
                player.add(Player.genPlayerRating("Lester", "Quinones", "0", "SG"));
                player.add(Player.genPlayerRating("Bruce", "Brown", "11", "SF"));
                player.add(Player.genPlayerRating("Keion", "Brooks Jr.", "0", "SF"));
                player.add(Player.genPlayerRating("Jamal", "Cain", "0", "SF"));
                player.add(Player.genPlayerRating("Kelly", "Olynyk", "41", "PF"));
                player.add(Player.genPlayerRating("Jeremiah", "Robinson-Earl", "0", "PF"));
                player.add(Player.genPlayerRating("Karlo", "Matkovic", "0", "PF"));
                player.add(Player.genPlayerRating("Brandon", "Boston Jr.", "0", "SF"));
                player.add(Player.genPlayerRating("Herbert", "Jones", "5", "SF"));
                player.add(Player.genPlayerRating("Kevon", "Looney", "0", "C"));
                player.add(Player.genPlayerRating("Jeremiah", "Fears", "0", "PG"));
                break;

            case "Knicks":
                player.add(Player.genPlayerRating("Jalen", "Brunson", "11", "PG"));
                player.add(Player.genPlayerRating("Delon", "Wright", "55", "PG"));
                player.add(Player.genPlayerRating("Miles", "McBride", "2", "SG"));
                player.add(Player.genPlayerRating("Cameron", "Payne", "0", "PG"));
                player.add(Player.genPlayerRating("Tyler", "Kolek", "0", "PG"));
                player.add(Player.genPlayerRating("Mikal", "Bridges", "0", "SF"));
                player.add(Player.genPlayerRating("Landry", "Shamet", "0", "SG"));
                player.add(Player.genPlayerRating("OG", "Anunoby", "0", "SF"));
                player.add(Player.genPlayerRating("Josh", "Hart", "9", "SF"));
                player.add(Player.genPlayerRating("Karl-Anthony", "Towns", "0", "C"));
                player.add(Player.genPlayerRating("Precious", "Achiuwa", "0", "PF"));
                player.add(Player.genPlayerRating("Matisse", "Thybulle", "0", "SF"));
                player.add(Player.genPlayerRating("Pacome", "Dadiet", "0", "SF"));
                player.add(Player.genPlayerRating("Jericho", "Sims", "0", "C"));
                player.add(Player.genPlayerRating("Isaiah", "Stewart", "0", "C"));
                break;

            case "Magic":
                player.add(Player.genPlayerRating("Jalen", "Suggs", "4", "PG"));
                player.add(Player.genPlayerRating("Desmond", "Bane", "10", "SG"));
                player.add(Player.genPlayerRating("Franz", "Wagner", "22", "SF"));
                player.add(Player.genPlayerRating("Paolo", "Banchero", "5", "PF"));
                player.add(Player.genPlayerRating("Wendell", "Carter Jr.", "33", "C"));
                player.add(Player.genPlayerRating("Tyus", "Jones", "3", "PG"));
                player.add(Player.genPlayerRating("Cole", "Anthony", "50", "PG"));
                player.add(Player.genPlayerRating("Gary", "Harris", "14", "SG"));
                player.add(Player.genPlayerRating("Markelle", "Fultz", "20", "PG"));
                player.add(Player.genPlayerRating("Jonathan", "Isaac", "1", "SF"));
                player.add(Player.genPlayerRating("Chuma", "Okeke", "3", "PF"));
                player.add(Player.genPlayerRating("Mo", "Bamba", "5", "C"));
                player.add(Player.genPlayerRating("Bol", "Bol", "10", "C"));
                player.add(Player.genPlayerRating("Kevon", "Harris", "0", "SG"));
                player.add(Player.genPlayerRating("Jett", "Howard", "0", "SF"));
                break;

            case "76ers":
                player.add(Player.genPlayerRating("Tyrese", "Maxey", "0", "PG"));
                player.add(Player.genPlayerRating("James", "Harden", "13", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Ivey", "0", "SG"));
                player.add(Player.genPlayerRating("Tobias", "Harris", "12", "SF"));
                player.add(Player.genPlayerRating("Paul", "Reed", "44", "PF"));
                player.add(Player.genPlayerRating("Joel", "Embiid", "21", "C"));
                player.add(Player.genPlayerRating("De'Anthony", "Melton", "8", "SG"));
                player.add(Player.genPlayerRating("Furkan", "Korkmaz", "30", "SG"));
                player.add(Player.genPlayerRating("Matisse", "Thybulle", "0", "SF"));
                player.add(Player.genPlayerRating("Jaden", "Hardy", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Shackelford", "0", "SG"));
                player.add(Player.genPlayerRating("Bojan", "Bogdanovic", "0", "SF"));
                player.add(Player.genPlayerRating("Jaden", "Wilson", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Wilson", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Wilson", "0", "SG"));
                break;

            case "Suns":
                player.add(Player.genPlayerRating("Kevin", "Durant", "7", "SF"));
                player.add(Player.genPlayerRating("Devin", "Booker", "1", "SG"));
                player.add(Player.genPlayerRating("Bradley", "Beal", "3", "SG"));
                player.add(Player.genPlayerRating("Deandre", "Ayton", "22", "C"));
                player.add(Player.genPlayerRating("Jusuf", "Nurkic", "27", "C"));
                player.add(Player.genPlayerRating("Eric", "Gordon", "10", "SG"));
                player.add(Player.genPlayerRating("Damion", "Lee", "26", "SG"));
                player.add(Player.genPlayerRating("Grayson", "Allen", "0", "SG"));
                player.add(Player.genPlayerRating("Keita", "Bates-Diop", "0", "SF"));
                player.add(Player.genPlayerRating("Yuta", "Watanabe", "0", "SF"));
                player.add(Player.genPlayerRating("Joshua", "Kogi", "0", "SF"));
                player.add(Player.genPlayerRating("Saben", "Lee", "0", "PG"));
                player.add(Player.genPlayerRating("Jordan", "Goodwin", "0", "PG"));
                player.add(Player.genPlayerRating("Dwayne", "Washington Jr.", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Ivey", "0", "SG"));
                break;

            case "Blazers":
                player.add(Player.genPlayerRating("Damian", "Lillard", "0", "PG"));
                player.add(Player.genPlayerRating("Jrue", "Holiday", "0", "PG"));
                player.add(Player.genPlayerRating("Anfernee", "Simons", "0", "SG"));
                player.add(Player.genPlayerRating("Shaedon", "Sharpe", "0", "SG"));
                player.add(Player.genPlayerRating("Matisse", "Thybulle", "0", "SF"));
                player.add(Player.genPlayerRating("Jerami", "Grant", "0", "PF"));
                player.add(Player.genPlayerRating("Trendon", "Watford", "0", "PF"));
                player.add(Player.genPlayerRating("Drew", "Eubanks", "0", "C"));
                player.add(Player.genPlayerRating("Robert", "Williams III", "0", "C"));
                player.add(Player.genPlayerRating("Malcolm", "Brogdon", "0", "PG"));
                player.add(Player.genPlayerRating("Jusuf", "Nurkic", "0", "C"));
                player.add(Player.genPlayerRating("Keon", "Johnson", "0", "SG"));
                player.add(Player.genPlayerRating("Jabari", "Walker", "0", "SF"));
                player.add(Player.genPlayerRating("Scoot", "Henderson", "0", "PG"));
                player.add(Player.genPlayerRating("Chris", "Murray", "0", "SF"));
                break;

            case "Kings":
                player.add(Player.genPlayerRating("De'Aaron", "Fox", "5", "PG"));
                player.add(Player.genPlayerRating("Kevin", "Huerter", "9", "SG"));
                player.add(Player.genPlayerRating("Keegan", "Murray", "13", "SF"));
                player.add(Player.genPlayerRating("Domantas", "Sabonis", "10", "PF"));
                player.add(Player.genPlayerRating("Alex", "Len", "27", "C"));
                player.add(Player.genPlayerRating("Davion", "Mitchell", "15", "PG"));
                player.add(Player.genPlayerRating("Malik", "Monk", "0", "SG"));
                player.add(Player.genPlayerRating("Trey", "Lyles", "0", "PF"));
                player.add(Player.genPlayerRating("Trey", "Wade", "0", "SF"));
                player.add(Player.genPlayerRating("Jaden", "Ivey", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Hardy", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Wilson", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Wilson", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Wilson", "0", "SG"));
                player.add(Player.genPlayerRating("Jaden", "Wilson", "0", "SG"));
                break;

            case "Spurs":
                player.add(Player.genPlayerRating("Victor", "Wembanyama", "1", "C"));
                player.add(Player.genPlayerRating("Keldon", "Johnson", "3", "SF"));
                player.add(Player.genPlayerRating("Devin", "Vassell", "22", "SF"));
                player.add(Player.genPlayerRating("Zach", "Collins", "20", "C"));
                player.add(Player.genPlayerRating("Tre", "Jones", "12", "PG"));
                player.add(Player.genPlayerRating("Jeremy", "Sochan", "4", "PF"));
                player.add(Player.genPlayerRating("Derrick", "White", "9", "PG"));
                player.add(Player.genPlayerRating("Doug", "McDermott", "5", "SF"));
                player.add(Player.genPlayerRating("Malaki", "Branham", "2", "SG"));
                player.add(Player.genPlayerRating("Jeremy", "Lamb", "7", "SG"));
                player.add(Player.genPlayerRating("Jeremy", "Sochan", "4", "PF"));
                player.add(Player.genPlayerRating("Bryn", "Forbes", "11", "SG"));
                player.add(Player.genPlayerRating("Jakob", "Poeltl", "25", "C"));
                player.add(Player.genPlayerRating("Trevor", "Gidden", "0", "SF"));
                player.add(Player.genPlayerRating("Jock", "Landale", "0", "C"));
                break;

            case "Raptors":
                player.add(Player.genPlayerRating("Pascal", "Siakam", "43", "PF"));
                player.add(Player.genPlayerRating("Fred", "VanVleet", "23", "PG"));
                player.add(Player.genPlayerRating("OG", "Anunoby", "3", "SF"));
                player.add(Player.genPlayerRating("Scottie", "Barnes", "4", "PF"));
                player.add(Player.genPlayerRating("Gary", "Trent Jr.", "33", "SG"));
                player.add(Player.genPlayerRating("Chris", "Boucher", "25", "C"));
                player.add(Player.genPlayerRating("Precious", "Achiuwa", "0", "PF"));
                player.add(Player.genPlayerRating("Dalano", "Baines", "0", "SG"));
                player.add(Player.genPlayerRating("Malachi", "Flynn", "0", "PG"));
                player.add(Player.genPlayerRating("Caleb", "Houstan", "0", "SF"));
                player.add(Player.genPlayerRating("David", "Johnson", "0", "PF"));
                player.add(Player.genPlayerRating("Jakob", "Poeltl", "0", "C"));
                player.add(Player.genPlayerRating("Khem", "Birch", "0", "C"));
                player.add(Player.genPlayerRating("Precious", "Achiuwa", "0", "PF"));
                player.add(Player.genPlayerRating("Chris", "Boucher", "0", "C"));
                break;

            case "Wizards":
                player.add(Player.genPlayerRating("Bradley", "Beal", "3", "SG"));
                player.add(Player.genPlayerRating("Kyle", "Kuzma", "33", "SF"));
                player.add(Player.genPlayerRating("Kristaps", "Porzingis", "6", "PF"));
                player.add(Player.genPlayerRating("Monte", "Morris", "11", "PG"));
                player.add(Player.genPlayerRating("Kyle", "Guy", "8", "SG"));
                player.add(Player.genPlayerRating("Deni", "Avdija", "7", "SF"));
                player.add(Player.genPlayerRating("Corey", "Kispert", "24", "SF"));
                player.add(Player.genPlayerRating("Rui", "Hachimura", "28", "PF"));
                player.add(Player.genPlayerRating("Cassius", "Winston", "0", "PG"));
                player.add(Player.genPlayerRating("Jared", "Culver", "0", "SG"));
                player.add(Player.genPlayerRating("Lindell", "Wigginton", "0", "PG"));
                player.add(Player.genPlayerRating("Daniel", "Oturu", "0", "C"));
                player.add(Player.genPlayerRating("Chris", "Chiozza", "0", "PG"));
                player.add(Player.genPlayerRating("Evan", "Mobley", "0", "PF"));
                player.add(Player.genPlayerRating("Andre", "Drummond", "0", "C"));
                break;

            case "Jazz":
                player.add(Player.genPlayerRating("Lauri", "Markkanen", "24", "PF"));
                player.add(Player.genPlayerRating("Jordan", "Clarkson", "1", "SG"));
                player.add(Player.genPlayerRating("Collin", "Sexton", "2", "PG"));
                player.add(Player.genPlayerRating("Walker", "Kessler", "0", "C"));
                player.add(Player.genPlayerRating("Bojan", "Bogdanovic", "44", "SF"));
                player.add(Player.genPlayerRating("Jarace", "Walker", "5", "F"));
                player.add(Player.genPlayerRating("Bradley", "Beal", "0", "SG"));
                player.add(Player.genPlayerRating("Lindell", "Wigginton", "0", "PG"));
                player.add(Player.genPlayerRating("Trey", "Lyles", "0", "PF"));
                player.add(Player.genPlayerRating("Tristan", "Vukcevic", "0", "C"));
                player.add(Player.genPlayerRating("Royce", "O'Neale", "23", "SF"));
                player.add(Player.genPlayerRating("Chris", "Paul", "3", "PG"));
                player.add(Player.genPlayerRating("Anthony", "Edwards", "0", "SG"));
                player.add(Player.genPlayerRating("Dillon", "Brooks", "0", "SF"));
                player.add(Player.genPlayerRating("Walker", "Kessler", "0", "C"));
                break;

            case "Hawks":
                player.add(Player.genPlayerRating("Trae", "Young", "11", "PG"));
                player.add(Player.genPlayerRating("De'Andre", "Hunter", "12", "SF"));
                player.add(Player.genPlayerRating("Clint", "Capela", "15", "C"));
                player.add(Player.genPlayerRating("John", "Collins", "20", "PF"));
                player.add(Player.genPlayerRating("Bogdan", "Bogdanovic", "13", "SG"));
                player.add(Player.genPlayerRating("Dejounte", "Murray", "5", "PG"));
                player.add(Player.genPlayerRating("AJ", "Griffin", "8", "SF"));
                player.add(Player.genPlayerRating("Onyeka", "Okongwu", "2", "C"));
                player.add(Player.genPlayerRating("Jalen", "Johnson", "4", "SF"));
                player.add(Player.genPlayerRating("Tyrese", "Martin", "7", "PF"));
                player.add(Player.genPlayerRating("Sharife", "Cooper", "0", "PG"));
                player.add(Player.genPlayerRating("Garrison", "Mathews", "0", "SG"));
                player.add(Player.genPlayerRating("Cam", "Reddish", "0", "SF"));
                player.add(Player.genPlayerRating("Nat", "Mitchell", "0", "PF"));
                player.add(Player.genPlayerRating("Malcolm", "Hill", "0", "SG"));
                break;

            default:
                System.out.println("Unknown team");
                break;

        }
        return player;
    }

    public static List<Team> createTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Los Angeles", "Lakers", "Western", createPlayers("Lakers")));
        teams.add(new Team("Boston", "Celtics", "Eastern", createPlayers("Celtics")));
        teams.add(new Team("Oklahoma City", "Thunder", "Western", createPlayers("Thunder")));
        teams.add(new Team("Indiana", "Pacers", "Eastern", createPlayers("Pacers")));
        teams.add(new Team("Golden State", "Warriors", "Western", createPlayers("Warriors")));
        teams.add(new Team("Denver", "Nuggets", "Western", createPlayers("Nuggets")));
        teams.add(new Team("Chicago", "Bulls", "Eastern", createPlayers("Bulls")));
        teams.add(new Team("Memphis", "Grizzlies", "Western", createPlayers("Grizzlies")));
        teams.add(new Team("Brooklyn", "Nets", "Eastern", createPlayers("Nets")));
        teams.add(new Team("Charlotte", "Hornets", "Eastern", createPlayers("Hornets")));
        teams.add(new Team("Cleveland", "Cavaliers", "Eastern", createPlayers("Cavaliers")));
        teams.add(new Team("Detroit", "Pistons", "Eastern", createPlayers("Pistons")));
        teams.add(new Team("Dallas", "Mavericks", "Western", createPlayers("Mavericks")));
        teams.add(new Team("Houston", "Rockets", "Western", createPlayers("Rockets")));
        teams.add(new Team("Los Angeles", "Clippers", "Western", createPlayers("Clippers")));
        teams.add(new Team("Miami", "Heat", "Eastern", createPlayers("Heat")));
        teams.add(new Team("Milwaukee", "Bucks", "Eastern", createPlayers("Bucks")));
        teams.add(new Team("Minnesota", "Timberwolves", "Western", createPlayers("Timberwolves")));
        teams.add(new Team("New Orleans", "Pelicans", "Western", createPlayers("Pelicans")));
        teams.add(new Team("New York", "Knicks", "Eastern", createPlayers("Knicks")));
        teams.add(new Team("Orlando", "Magic", "Eastern", createPlayers("Magic")));
        teams.add(new Team("Philadelphia", "76ers", "Eastern", createPlayers("76ers")));
        teams.add(new Team("Phoenix", "Suns", "Western", createPlayers("Suns")));
        teams.add(new Team("Portland", "Blazers", "Western", createPlayers("Blazers")));
        teams.add(new Team("Sacramento", "Kings", "Western", createPlayers("Kings")));
        teams.add(new Team("San Antonio", "Spurs", "Western", createPlayers("Spurs")));
        teams.add(new Team("Toronto", "Raptors", "Eastern", createPlayers("Raptors")));
        teams.add(new Team("Washington", "Wizards", "Eastern", createPlayers("Wizards")));
        teams.add(new Team("Utah", "Jazz", "Western", createPlayers("Jazz")));
        teams.add(new Team("Atlanta", "Hawks", "Eastern", createPlayers("Hawks")));

        for (int i = 0; i < teams.size(); i++) {
            System.out.print(teams.get(i));
        }

        return teams;
    }
}
