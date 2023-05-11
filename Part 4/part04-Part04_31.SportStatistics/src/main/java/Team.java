public class Team {
    private String teamName;
    private String oppTeamName;
    private int score;
    private int opponentScore;

    public Team(String teamName, String oppTeamName, int score, int opponentScore) {
        this.teamName = teamName;
        this.oppTeamName = oppTeamName;
        this.score = score;
        this.opponentScore = opponentScore;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getOppTeamName() {
        return oppTeamName;
    }

    public int getScore() {
        return score;
    }

    public int getOppTeamScore() {
        return opponentScore;
    }
}