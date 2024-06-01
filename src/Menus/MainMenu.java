package Menus;

import Extras.Tutorial;
import Programs.Calculator;
import Programs.CharacterLength;
import Programs.SquareRootNumberFinder;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public MainMenu () throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList options = new ArrayList();

        //Options list
        options.add("1 - Calculator");
        options.add("2 - Character(s) Length");
        options.add("3 - Games menu");
        options.add("4 - Square root number finder");
        options.add("5 - Tutorial");
        options.add("6 - Exit the system");
        //Parameters
        double selection;
        boolean test = false;
        //The program
        while (test == false) {
            System.out.println(options);
            selection = scanner.nextDouble();
            if ( (int) selection == 1) {
                Thread.sleep(50);
                Calculator calculator = new Calculator();
                test = true;
            }else if ( (int) selection == 2) {
                Thread.sleep(50);
                CharacterLength characterLength = new CharacterLength();
                test = true;
            }else if ( (int) selection == 3) {
                Thread.sleep(50);
                GamesMenu gamesMenu = new GamesMenu();
                test = true;
            }else if ( (int) selection == 4) {
                Thread.sleep(50);
                SquareRootNumberFinder squareRootNumberFinder = new SquareRootNumberFinder();
                test = true;
            }else if ( (int) selection == 5) {
                Thread.sleep(50);
                Tutorial tutorial = new Tutorial();
                test = true;
            }else if ( (int) selection == 6) {
                ArrayList options2 = new ArrayList();
                options2.add("1 - Yes.");
                options2.add("2 - No");
                Thread.sleep(50);
                System.out.println("Are you sure you want to exit from the system?");
                Thread.sleep(50);
                selection = scanner.nextDouble();
                if ( (int) selection == 1) {
                    Thread.sleep(50);
                    System.out.println("Closing the system...");
                    Thread.sleep(500);
                    test = true;
                }
            }
        }
    }
}
