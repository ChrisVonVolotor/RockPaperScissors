import java.util.Scanner;

public class Game{
    Scanner sc = new Scanner(System.in);
    Storage stats = new Storage(0,0,0,0,0,0,0);
    AI ai = new AI();
    public boolean battle(){
        System.out.println("Aidicus attacks, prepare yourself");
        boolean battleOn = true;
        String input;
        int x=0;
        input.substring(input.length() -(1+x));
        String aiPick;
        String fancyPlayerPick;
        String fancyAiPick;
        double draws = 0;
        double result;
        double playerScore=0;
        double aiScore=0;
        double sessionGames;
        for (sessionGames=0; sessionGames < 5; sessionGames++){
            do{
                System.out.println("Please choose your turn [R]ock, [P]aper or [S]cissors. or [Q]uit");
                input = sc.nextLine();
            }while (!(input.equalsIgnoreCase("R")||input.equalsIgnoreCase("P")||input.equalsIgnoreCase("S")||input.equalsIgnoreCase("Q")));


            if (input.equalsIgnoreCase("Q")){
                System.out.println("You bravely run away");
                break;
            }
            aiPick = ai.AIChoice();


            result = battkeComparisson(input.toUpperCase(), aiPick.toUpperCase());

            fancyPlayerPick = fancyName(input.toUpperCase());
            fancyAiPick = fancyName(aiPick.toUpperCase());

            if (result == 0){
                System.out.println("DRAW: Player and AI both picked " +fancyAiPick+".");
                draws++;
            }else if (result == 1){
                System.out.println("WIN: Player picked "+fancyPlayerPick+ " while AI picked " +fancyAiPick+".");
                battleOn = false;
                playerScore++;
            }else if (result == 2){
                System.out.println("LOSE: Player picked "+fancyPlayerPick+ " while AI picked " +fancyAiPick+".");
                battleOn = false;
                aiScore++;
            }

            System.out.println("The war has lasted "+ (sessionGames+1) + " years. You have won " + playerScore+" battles!");



        }

        stats.setAiWins(stats.getAiWins()+aiScore);
        stats.setHumanWins(stats.getHumanWins()+playerScore);
        stats.setTies(stats.getTies()+draws);
        stats.setTotalGames(stats.getTotalGames()+sessionGames);


        System.out.println("The war has Ended after"+ (sessionGames+1) + " years. You have won " + playerScore+ " battles! Aidicus has vanquished you " + aiScore + " times.");

        do{
            System.out.println("Do you want to play another game? [Y/N].");
            input = sc.nextLine();
        }while (!(input.equalsIgnoreCase("Y")||input.equalsIgnoreCase("N")));

        if (input.equalsIgnoreCase("Y")){
            return true;
        }else{
            stats.statsOut();
            return false;
        }


    }


    private int battkeComparisson(String pChoice, String aChoice){
       if (pChoice.equals(aChoice)){
           return 0;
       }else if ((pChoice.equals("R") && aChoice.equals("S"))||(pChoice.equals("S") && aChoice.equals("P")) || (pChoice.equals("P") && aChoice.equals("R"))){
           return 1;
       }
       else{
           return 2;
       }

    }

    private String fancyName(String choice){
        if (choice.equals("R")){
            stats.setRockChoice(stats.getRockChoice()+1);
            return "Rock";
        }else if (choice.equals("S")){
            stats.setScissorChoice(stats.getScissorChoice()+1);
            return "Scissors";

        }else {
            stats.setPaperChoice(stats.getPaperChoice()+1);
            return "Paper";
        }
    }
}
