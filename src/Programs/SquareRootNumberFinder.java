package Programs;

import Menus.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareRootNumberFinder {

    public SquareRootNumberFinder () throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList options = new ArrayList();

        //Options list
        options.add("1 - Repeat again");
        options.add("2 - Go back to main menu");
        //Parameters
        double number,selection;
        boolean test = false;
        //The program
        System.out.println("Enter a number(s):");
        number = scanner.nextDouble();
        System.out.println("√"+number+" = "+Math.sqrt(number));
        Thread.sleep(50);
        while (test == false) {
            System.out.println(options);
            selection = scanner.nextDouble();
            if ( (int) selection == 1) {
                Thread.sleep(50);
                SquareRootNumberFinder squareRootNumberFinder = new SquareRootNumberFinder();
                test = true;
            }else if ( (int) selection == 2) {
                Thread.sleep(50);
                MainMenu mainMenu = new MainMenu();
                test = true;
            }else {
                Thread.sleep(50);
                System.out.println("Invalid option!");
                Thread.sleep(50);
            }
        }
    }
}
