package Menus;

import OnePlayerGames.CalculateForOne;
import OnePlayerGames.LuckGameForOne;
import TwoPlayerGames.CalculateForTwo;
import TwoPlayerGames.LuckGameForTwo;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class LuckGameMenu {

    public LuckGameMenu() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList options = new ArrayList();
        //Options list
        options.add("1 - One player mode");
        options.add("2 - Two players mode ");
        options.add("3 - Go back to games menu");
        options.add("4 - Go back to main menu");
        //Parameters
        double selection;
        boolean test = false;

        //The menu
        System.out.println(options);
        selection = scanner.nextDouble();
        while (test == false) {
            if ( (int) selection == 1) {
                System.out.println("Starting the game for player, please wait...");
                Thread.sleep(1325);
                LuckGameForOne luckGameForOne = new LuckGameForOne();
                test = true;
            }else if ( (int) selection == 2) {
                System.out.println("Starting the game for two players, please wait...");
                Thread.sleep(2650);
                LuckGameForTwo luckGameForTwo = new LuckGameForTwo();
                test = true;
            }else if ( (int) selection == 3) {
                Thread.sleep(100);
                GamesMenu gamesMenu = new GamesMenu();
                test = true;
            }else if ( (int) selection == 4) {
                Thread.sleep(100);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                System.out.println("Invalid option!");
                Thread.sleep(100);
            }
        }
    }
}
