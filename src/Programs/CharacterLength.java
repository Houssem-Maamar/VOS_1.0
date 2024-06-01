package Programs;

import Menus.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterLength {

    public CharacterLength() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList options = new ArrayList();

        //Options list
        options.add("1 - Calculate another character(s) long.");
        options.add("2 - Go back to main menu");
        //Parameters
        double selection;
        boolean test = false;
        String input = null;

        //The program
        System.out.println("Enter character(s) to find the length of it. (Don't use space or the program will calculate only the number of character(s) on the first word before space): ");
        input = scanner.next();
        System.out.println("The character(s)"+input+" have "+input.length());
        while (test == false) {
            Thread.sleep(50);
            System.out.println(options);
            selection = scanner.nextDouble();
            if ( (int) selection == 1) {
                Thread.sleep(100);
                CharacterLength characterLength = new CharacterLength();
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
