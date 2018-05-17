public class RPS {
    public static void main(String[] args) {
        Game war = new Game();
        boolean gamePlaying = true;
        while (gamePlaying) {
            gamePlaying = (war.battle());
        }

        System.out.println("Farewell my worthy enemy.");

    }

}
