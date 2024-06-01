package Extras;

import Menus.GamesMenu;

public class CalculateGameRule {

    public CalculateGameRule () throws InterruptedException{

        System.out.println("1: Choose how many rounds you want to play on the game.");
        Thread.sleep(50);
        System.out.println("2: You have to calculate without using the calculator.");
        Thread.sleep(50);
        System.out.println("3: Each correct answer you will receive 1 point on your score.");
        Thread.sleep(50);
        System.out.println("4: At the end of the game. The score of player(s) will appear.");
        Thread.sleep(50);
        System.out.println("5: Always the player 1 start then the player 2 on each round(s)/stage(s).");
        Thread.sleep(50);
        System.out.println("6: The person with the highest score wins.");
        Thread.sleep(50);
        System.out.println("7: If both players have the same score no one wins.");
        Thread.sleep(50);
        System.out.println("Note: Division calculation is not available on the game.");
        Thread.sleep(150);
        GamesRule gamesRule = new GamesRule();
    }
}
