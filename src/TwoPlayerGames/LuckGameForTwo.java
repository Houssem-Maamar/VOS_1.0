package TwoPlayerGames;

import Menus.GamesMenu;
import Menus.LuckGameMenu;
import Menus.MainMenu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LuckGameForTwo {

    public LuckGameForTwo() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList options = new ArrayList();

        //Parameters
        double answer1,answer2, rounds = 0;
        int score1 = 0,score2 = 0, stages = 1;
        boolean test = false;

        //The game
        //Number of rounds
        while (test == false) {
            System.out.println("How many rounds you want to play?");
            rounds = scanner.nextDouble();
            if ((int) rounds == 1) {
                System.out.println("Are you sure you want to play only " + (int) rounds + " round?");
            } else {
                System.out.println("Are you sure you want to play " + (int) rounds + " rounds?");
            }
            //options 1
            options.add("1 - Yes.");
            options.add("2 - No, I want to change the number of rounds");
            options.add("3 - I want to change the number of players on this game");
            options.add("4 - I want to go back to games menu");
            options.add("5 - I want to go back to main menu");
            System.out.println(options);
            answer1 = scanner.nextDouble();
            if ((int) answer1 == 1) {
                test = true;
            }
        }
        test = false;
        //Starting the game
        while (test == false) {
            if (stages == (int) rounds + 1) {
                test = true;
            }
            System.out.println("Stage " + stages + " of " + (int) rounds);
            int number1 = random.nextInt(50);
            int number2 = random.nextInt(50);
            while (number1 >= 0 && number2 >= 0) {
                //Player 1 turn
                System.out.println("Player 1 turn: ");
                Thread.sleep(50);
                System.out.println("Guess the hidden number from 0 to 50: ");
                answer1 = scanner.nextDouble();
                if ( (int) answer1 == number1) {
                    System.out.println("You have guessed the hidden number!");
                    score1 = score1 + 1;
                }else {
                    System.out.println("Oops, you didn't guessed the hidden number");
                }
                System.out.println("The hidden number was " + number1);
                //Player 2 turn
                System.out.println("Player 2 turn: ");
                Thread.sleep(50);
                System.out.println("Guess the hidden number from 0 to 50: ");
                answer2 = scanner.nextDouble();
                if ( (int) answer2 == number2) {
                    System.out.println("You have guessed the hidden number!");
                    score2 = score2 + 1;
                }else {
                    System.out.println("Oops, you didn't guessed the hidden number");
                }
                System.out.println("The hidden number was " + number1);
            }
            stages = stages + 1;
            Thread.sleep(100);
        }
        //The score
        Thread.sleep(100);
        System.out.println("Player 1: Your total score is " + score1 + " of " + (int) rounds + " rounds.");
        System.out.println("Player 2: Your total score is " + score2 + " of " + (int) rounds + " rounds.");
        //Repeat?
        test = false;
        while (test == false) {
            Thread.sleep(100);
            options.clear();
            options.add("1 - Repeat the game");
            options.add("2 - Go back to number of players menu");
            options.add("3 - Go back to games menu");
            options.add("4 - Go back to main menu");

            System.out.println(options);
            answer1 = scanner.nextDouble();
            if ( (int) answer1 == 1) {
                Thread.sleep(100);
                LuckGameForTwo luckGameForTwo = new LuckGameForTwo();
                test = true;
            }else if ( (int) answer1 == 2) {
                Thread.sleep(50);
                LuckGameMenu luckGameMenu = new LuckGameMenu();
                test = true;
            }else if ( (int) answer1 == 3) {
                Thread.sleep(50);
                GamesMenu gamesMenu = new GamesMenu();
                test = true;
            }else if ( (int) answer1 == 4) {
                Thread.sleep(50);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                System.out.println("Invalid option!");
            }
        }
    }
}