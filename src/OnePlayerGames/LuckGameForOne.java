package OnePlayerGames;

import Menus.GamesMenu;
import Menus.LuckGameMenu;
import Menus.MainMenu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LuckGameForOne {

    public LuckGameForOne() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList options = new ArrayList();

        //Parameters
        double answer,rounds = 0;
        int score = 0,stages = 1;
        boolean test = false;

        //The game
        //Number of rounds
        while (test == false) {
            System.out.println("How many rounds you want to play?");
            rounds = scanner.nextDouble();
            if ( (int) rounds == 1) {
                options.add("1 - Yes.");
                options.add("2 - No, I want to change the number of rounds");
                options.add("3 - I want to change the number of players on this game");
                options.add("4 - I want to go back to games menu");
                options.add("5 - I want to go back to main menu");
                System.out.println("Are you sure you want to play only "+(int) rounds+" round?");
            }else {
                System.out.println("Are you sure you want to play "+(int) rounds+" rounds?");
            }
            System.out.println(options);
            answer = scanner.nextDouble();
            if ( (int) answer == 1) {
                test = true;
            }
        }
        test = false;
        //Starting the game
        while (stages < (int) rounds + 1) {
            System.out.println("Stage "+stages+" of "+(int) rounds);
            int number = random.nextInt(50);
            while (number != 0) {
                System.out.println("Guess the hidden number from 0 to 50: ");
                answer = scanner.nextDouble();
                if ( (int) answer == number) {
                    System.out.println("You have guessed the hidden number!");
                    score = score + 1;
                }else {
                    System.out.println("Oops, you didn't guessed the hidden number");
                }
                System.out.println("The hidden number was "+number);
            }
            stages = stages + 1;
            Thread.sleep(100);
        }
        //The score
        Thread.sleep(100);
        System.out.println("Your total score is "+score+" of "+(int) rounds+" rounds.");
        //Repeat?
        while (test == false) {
            Thread.sleep(100);
            options.clear();
            options.add("1 - Repeat the game");
            options.add("2 - Go back to number of players menu");
            options.add("3 - Go back to games menu");
            options.add("4 - Go back to main menu");

            System.out.println(options);
            answer = scanner.nextDouble();
            if ( (int) answer == 1) {
                LuckGameForOne luckGameForOne = new LuckGameForOne();
            }else if ( (int) answer == 2) {
                Thread.sleep(50);
                LuckGameMenu luckGameMenu = new LuckGameMenu();
                test = true;
            }else if ( (int) answer == 3) {
                Thread.sleep(50);
                GamesMenu gamesMenu = new GamesMenu();
                test = true;
            }else if ( (int) answer == 4) {
                Thread.sleep(50);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                System.out.println("Invalid option!");
            }
        }
    }
}
