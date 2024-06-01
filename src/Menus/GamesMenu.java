package Menus;

import Extras.GamesRule;

import java.util.ArrayList;
import java.util.Scanner;

public class GamesMenu {

    public GamesMenu () throws InterruptedException{

        Scanner scanner = new Scanner(System.in);
        ArrayList options = new ArrayList();

        //Options list
        options.add("1 - Calculate");
        options.add("2 - Luck game");
        options.add("3 - Games rule");
        options.add("4 - Go back to main menu");
        //Parameters
        double selection;
        boolean test = false;

        //The menu
        while (test == false) {
            System.out.println(options);
            selection = scanner.nextDouble();
            if ( (int) selection == 1) {
                Thread.sleep(150);
                CalculateGameMenu calculateGameMenu = new CalculateGameMenu();
                test = true;
            }else if ( (int) selection == 2) {
                Thread.sleep(150);
                LuckGameMenu luckGameMenu = new LuckGameMenu();
                test = true;
            }else if ( (int) selection == 3) {
                Thread.sleep(50);
                GamesRule gamesRule = new GamesRule();
                test = true;
            }else if ( (int) selection == 4) {
                Thread.sleep(50);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                Thread.sleep(50);
                System.out.println("Invalid option!");
                Thread.sleep(100);
            }
        }
    }
}
