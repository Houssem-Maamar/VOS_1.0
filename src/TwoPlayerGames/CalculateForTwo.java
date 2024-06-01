package TwoPlayerGames;

import Menus.CalculateGameMenu;
import Menus.GamesMenu;
import Menus.MainMenu;
import OnePlayerGames.CalculateForOne;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CalculateForTwo {

    public CalculateForTwo () throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList options = new ArrayList();
        //Parameters
        double answer1,answer2, rounds = 0;
        boolean test = false;
        int score1 = 0,score2 = 0, stages = 1;
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
            answer1 = scanner.nextDouble();
            if ((int) answer1 == 1) {
                test = true;
            }
        }
        test = false;
        //Starting the game
        while (stages < rounds + 1) {
            Thread.sleep(150);
            int operator = random.nextInt(3);
            //Player 1
            System.out.println("Stage " + stages + " of " + (int) rounds);
            Thread.sleep(150);
            switch (operator) {
                case 1:
                    //Player 1
                    System.out.println("Player 1 turn: ");
                    Thread.sleep(50);
                    int a1 = random.nextInt(9999);
                    int b1 = random.nextInt(9999);
                    double total1 = a1 + b1;
                    System.out.println(a1 + " + " + b1 + " = ?");
                    answer1 = scanner.nextDouble();
                    if ((int) answer1 == total1) {
                        System.out.println("Correct!");
                        score1 = score1 + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(a1 + " + " + b1 + " = " + total1);
                    //Player 2
                    System.out.println("Player 2 turn:");
                    Thread.sleep(50);
                    int c1 = random.nextInt(9999);
                    int d1 = random.nextInt(9999);
                    double total1P2 = c1 + d1;
                    System.out.println(c1 + " + " + d1 + " = ?");
                    answer2 = scanner.nextDouble();
                    if ((int) answer2 == total1P2) {
                        System.out.println("Correct!");
                        score2 = score2 + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(c1 + " + " + d1 + " = " + total1P2);
                break;
                case 2:
                    //Player 1
                    System.out.println("Player 1 turn: ");
                    Thread.sleep(50);
                    int a2 = random.nextInt(9999);
                    int b2 = random.nextInt(9999);
                    int total2 = a2 - b2;
                    System.out.println(a2 + " - " + b2 + " = ?");
                    answer1 = scanner.nextDouble();
                    if ((int) answer1 == total2) {
                        System.out.println("Correct!");
                        score1 = score1 + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(a2 + " - " + b2 + " = " + total2);
                    //Player 2
                    System.out.println("Player 2 turn: ");
                    Thread.sleep(50);
                    int c2 = random.nextInt(9999);
                    int d2 = random.nextInt(9999);
                    int total2P2 = c2 - d2;
                    System.out.println(c2 + " - " + d2 + " = ?");
                    answer2 = scanner.nextDouble();
                    if ((int) answer2 == total2P2) {
                        System.out.println("Correct!");
                        score2 = score2 + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(c2 + " - " + d2 + " = " + total2);
                break;
                default:
                    //Player 1
                    System.out.println("Player 1 turn: ");
                    Thread.sleep(50);
                    int a3 = random.nextInt(999);
                    int b3 = random.nextInt(999);
                    int total3 = a3 * b3;
                    System.out.println(a3 + " X " + b3 + " = ?");
                    answer1 = scanner.nextDouble();
                    if ((int) answer1 == total3) {
                        System.out.println("Correct!");
                        score1 = score1 + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(a3 + " X " + b3 + " = " + total3);
                    //Player 2
                    System.out.println("Player 2 turn: ");
                    Thread.sleep(50);
                    int c3 = random.nextInt(999);
                    int d3 = random.nextInt(999);
                    int total3P2 = a3 * b3;
                    System.out.println(a3 + " X " + b3 + " = ?");
                    answer2 = scanner.nextDouble();
                    if ((int) answer2 == total3) {
                        System.out.println("Correct!");
                        score2 = score2 + 1;
                    }else {
                        System.out.println("Wrong.");
                    }
                    Thread.sleep(100);
                    System.out.println(c3 + " X " + d3 + " = " + total3P2);
                break;

            }
            stages = stages + 1;
            System.out.println("Stage " + stages + " of " + (int) rounds);
            Thread.sleep(150);
        }
        //The scores
        if (score1 > score2) {
            System.out.println("Player 1 wins");
        }else if (score2 > score1) {
            System.out.println("Player 2 wins");
        }else {
            System.out.println("No one wins, both players have the same score.");
        }
        Thread.sleep(50);
        System.out.println("Player 1 total is score is "+score1+" of "+(int) rounds+" rounds");
        System.out.println("Player 2 total is score is "+score2+" of "+(int) rounds+" rounds");
        //Repeat?
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
                CalculateForTwo calculateForTwo = new CalculateForTwo();
                test = true;
            }else if ( (int) answer1 == 2) {
                Thread.sleep(100);
                CalculateGameMenu calculateGameMenu = new CalculateGameMenu();
                test = true;
            }else if ( (int) answer1 == 3) {
                Thread.sleep(100);
                GamesMenu gamesMenu = new GamesMenu();
                test = true;
            }else if ( (int) answer1 == 4) {
                Thread.sleep(100);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                System.out.println("Invalid option!");
            }
        }
    }
}