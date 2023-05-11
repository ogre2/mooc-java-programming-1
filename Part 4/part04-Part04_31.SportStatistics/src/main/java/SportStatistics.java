import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        System.out.println("File: ");
        String file = scan.nextLine();

        teams = loadTeamsList(file);

        System.out.println("Team: ");
        String searchTeam = scan.nextLine();

        printTeamStats(searchTeam, teams);

        scan.close();
    }

    public static ArrayList<Team> loadTeamsList(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();

                String[] line = row.split(",");

                String name = line[0];
                String opponent = line[1];
                int score = Integer.valueOf(line[2]);
                int opponentScore = Integer.valueOf(line[3]);

                teams.add(new Team(name, opponent, score, opponentScore));
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teams;
    }

    public static void printTeamStats(String searchTeam, ArrayList<Team> teams) {
        int games = 0, wins = 0, losses = 0;

        for(Team t : teams) {
            if(searchTeam.equals(t.getTeamName())) {
                games++;

                if(t.getScore() > t.getOppTeamScore()) {
                    wins++;
                } else {
                    losses++;
                }
            }

            if(searchTeam.equals(t.getOppTeamName())) {
                games++;

                if(t.getOppTeamScore() > t.getScore()) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
