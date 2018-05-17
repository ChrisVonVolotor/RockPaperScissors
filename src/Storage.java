public class Storage {
    private double totalGames;
    private double aiWins;
    private double humanWins;
    private double ties;
    private double rockChoice;
    private double paperChoice;
    private double scissorChoice;

    public Storage(double games, double awins, double hwins, double draws, double rock, double scissor, double paper){
        totalGames = games;
        aiWins = awins;
        humanWins = hwins;
        ties = draws;
        rockChoice = rock;
        paperChoice = paper;
        scissorChoice = scissor;

    }

    public double getAiWins() {
        return aiWins;
    }

    public double getHumanWins() {
        return humanWins;
    }

    public double getPaperChoice() {
        return paperChoice;
    }

    public double getRockChoice() {
        return rockChoice;
    }

    public double getScissorChoice() {
        return scissorChoice;
    }

    public double getTies() {
        return ties;
    }

    public double getTotalGames() {
        return totalGames;
    }

    public void setAiWins(double aiWins) {
        this.aiWins = aiWins;
    }

    public void setHumanWins(double humanWins) {
        this.humanWins = humanWins;
    }

    public void setPaperChoice(double paperChoice) {
        this.paperChoice = paperChoice;
    }

    public void setRockChoice(double rockChoice) {
        this.rockChoice = rockChoice;
    }

    public void setScissorChoice(double scissorChoice) {
        this.scissorChoice = scissorChoice;
    }

    public void setTies(double ties) {
        this.ties = ties;
    }

    public void setTotalGames(double totalGames) {
        this.totalGames = totalGames;
    }

    public String statsOut() {
        String mostCommon;
        if (rockChoice >= scissorChoice && rockChoice >= paperChoice){
            mostCommon = "Rock is most played at " + rockChoice + "(" + ((rockChoice/totalGames)*100) + "%)";
        }
        if (scissorChoice >= rockChoice && scissorChoice >= paperChoice){
            mostCommon = "Scissors is most played at " + scissorChoice + "(" + ((scissorChoice/totalGames)*100) + "%)";
        }
        else{
            mostCommon = "Paper is most played at " + paperChoice + "(" + ((paperChoice/totalGames)*100) + "%)";
        }
        System.out.println();
        System.out.println("----STATS----");
        System.out.println("Games Played:" + totalGames);
        System.out.println("Games Won:" + humanWins + "(" + ((((humanWins/totalGames)*100))) + "%)");
        System.out.println("Games Lost:" + aiWins+ "(" + ((aiWins/totalGames)*100) + "%)");
        System.out.println("Games Drawn:" + ties+ "(" + ((ties/totalGames)*100) + "%)");
        System.out.println("Most Common Picked:" + mostCommon);
        System.out.println();
        return "wow. such stats, much info";
    }
}
