package Extras;

import Menus.GamesMenu;
import Menus.MainMenu;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class GamesRule {

    public GamesRule () throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList options = new ArrayList();
        //Options list
        options.add("1 - Calculate game rule");
        options.add("2 - Luck game rule");
        options.add("3 - Go back to games menu");
        options.add("4 - Go back to main menu");
        //Parameters
        double selection;
        boolean test = false;

        //The program
        while (test == false) {
            System.out.println(options);
            selection = scanner.nextDouble();
            if ( (int) selection == 1) {
                Thread.sleep(50);
                CalculateGameRule calculateGameRule = new CalculateGameRule();
                test = true;
            }else if ( (int) selection == 2) {
                Thread.sleep(50);
                LuckGameRule luckGameRule = new LuckGameRule();
                test = true;
            }else if ( (int) selection == 3) {
                Thread.sleep(50);
                GamesMenu gamesMenu = new GamesMenu();
                test = true;
            }else if ( (int) selection == 4) {
                Thread.sleep(50);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                Thread.sleep(50);
                System.out.println("Invalid option");
                Thread.sleep(50);
            }
        }
    }
}
