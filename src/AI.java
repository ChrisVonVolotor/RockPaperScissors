import java.util.Random;

public class AI {
    public String AIChoice(){
        Random rn = new Random();
       int choiceNum = rn.nextInt(3);
        String[] choice = {"R","P","S"};


        return choice[choiceNum];
    }
}
