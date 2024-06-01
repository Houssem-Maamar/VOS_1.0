package Extras;

public class LuckGameRule {

    public LuckGameRule () throws InterruptedException {

        System.out.println("1: Enter how many rounds you want to play.");
        Thread.sleep(50);
        System.out.println("2: The system will generate a random number from 0 to 50.");
        Thread.sleep(50);
        System.out.println("3: Try to guess that hidden number.");
        Thread.sleep(50);
        System.out.println("4: If you're in two players mode, the system will generate a different numbers to each players.");
        Thread.sleep(50);
        System.out.println("5: Each of correct answers, you will gain a point to your score.");
        Thread.sleep(50);
        System.out.println("6: At the end of the game, the score(s) will appear.");
        Thread.sleep(50);
        System.out.println("7: The player with higher score will win the game.");
        Thread.sleep(50);
        System.out.println("8: If both of players have the same score, no one will win the game.");
        Thread.sleep(150);
        GamesRule gamesRule = new GamesRule();
    }
}
