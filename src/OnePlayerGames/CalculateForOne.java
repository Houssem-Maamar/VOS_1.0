package OnePlayerGames;

import Menus.CalculateGameMenu;
import Menus.GamesMenu;
import Menus.MainMenu;

import java.net.SocketOptions;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CalculateForOne {

    public CalculateForOne () throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList options = new ArrayList();
        //Parameters
        double answer, rounds = 0;
        boolean test = false;
        int score = 0, stages = 1;
        //The game
        //Selecting number of rounds

        while (test == false) {
            options.add("1 - Yes.");
            options.add("2 - No, I want to change the number of rounds");
            options.add("3 - I want to change the number of players on this game");
            options.add("4 - I want to go back to games menu");
            options.add("5 - I want to go back to main menu");

            System.out.println("How many rounds you want to play?");
            rounds = scanner.nextDouble();
            if ( (int) rounds == 1) {
                System.out.println("Are you sure you want to play only " + (int) rounds + " round?");
            } else {
                System.out.println("Are you sure you want to play " + (int) rounds + " rounds?");
            }
            System.out.println(options);
            answer = scanner.nextDouble();
            if ((int) answer == 1) {
                test = true;
            }
        }
        test = false;
        //Starting the game
        while (stages < rounds + 1) {
            Thread.sleep(150);
            int operator = random.nextInt(3);
            System.out.println("Stage " + stages + " of " + (int) rounds);
            Thread.sleep(150);
            switch (operator) {
                case 1:
                    int a1 = random.nextInt(9999);
                    int b1 = random.nextInt(9999);
                    double total1 = a1 + b1;
                    System.out.println(a1 + " + " + b1 + " = ?");
                    answer = scanner.nextDouble();
                    if ((int) answer == total1) {
                        System.out.println("Correct!");
                        score = score + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(a1 + " + " + b1 + " = " + total1);
                    break;
                case 2:
                    int a2 = random.nextInt(9999);
                    int b2 = random.nextInt(9999);
                    int total2 = a2 - b2;
                    System.out.println(a2 + " - " + b2 + " = ?");
                    answer = scanner.nextDouble();
                    if ((int) answer == total2) {
                        System.out.println("Correct!");
                        score = score + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(a2 + " - " + b2 + " = " + total2);
                    break;
                default:
                    int a3 = random.nextInt(999);
                    int b3 = random.nextInt(999);
                    int total3 = a3 * b3;
                    System.out.println(a3 + " X " + b3 + " = ?");
                    answer = scanner.nextDouble();
                    if ((int) answer == total3) {
                        System.out.println("Correct!");
                        score = score + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(a3 + " X " + b3 + " = " + total3);
                break;
            }
            stages = stages + 1;
        }
        Thread.sleep(100);
        System.out.println("Your total is score is "+score+" of "+(int) rounds+" rounds");
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
                Thread.sleep(100);
                CalculateForOne calculateForOne = new CalculateForOne();
                test = true;
            }else if ( (int) answer == 2) {
                Thread.sleep(100);
                CalculateGameMenu calculateGameMenu = new CalculateGameMenu();
                test = true;
            }else if ( (int) answer == 3) {
                Thread.sleep(100);
                GamesMenu gamesMenu = new GamesMenu();
                test = true;
            }else if ( (int) answer == 4) {
                Thread.sleep(100);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                System.out.println("Invalid option!");
            }
        }
    }
}
