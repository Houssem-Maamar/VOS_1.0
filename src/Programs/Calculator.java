package Programs;

import Menus.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public Calculator () throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ArrayList options = new ArrayList();

        //Parameters
        double a,num1,num2,b,total,selection;
        boolean test = false;
        String sr1 = "",sr2 = "";
        //Options 1
        options.add("1 - Square root");
        options.add("2 - Not square root");
        //The program
        System.out.println("Enter your the first number: ");
        a = scanner.nextDouble();
        num1 = a;
        System.out.println("The first number is: ");
        System.out.println(options);
        Thread.sleep(50);
        selection = scanner.nextDouble();
        switch ( (int) selection) {
            case 1:
                a = Math.sqrt(a);
                sr1 = "√";
            break;
        }
        System.out.println("Enter the second number: ");
        b = scanner.nextDouble();
        num2 = b;
        System.out.println("The second number is: ");
        Thread.sleep(50);
        System.out.println(options);
        selection = scanner.nextDouble();
        switch ( (int) selection) {
            case 1:
                b = Math.sqrt(b);
                sr2 = "√";
            break;
        }
        //options 2
        options.clear();
        options.add("1 - ' + '");
        options.add("2 - ' - '");
        options.add("3 - ' X '");
        options.add("4 - ' / '");
        //Back to the program

        while (test == false) {
            System.out.println(options);
            selection = scanner.nextDouble();
            if ( (int) selection < 0) {
                System.out.println("The option can't be negative!");
            }else if ( (int) selection > 4) {
                System.out.println("The option can't be more than 4!");
            }else {
                test = true;
            }
        }
        test = false;
        switch ( (int) selection) {
            case 1:
                total = a + b;
                System.out.println(sr1 + num1+" + "+ sr2 + num2+" = "+total);
            break;
            case 2:
                total = a - b;
                System.out.println(sr1 + num1+" - "+ sr2 + num2+" = "+total);
            break;
            case 3:
                total = a * b;
                System.out.println(sr1 + num1+" X "+ sr2 + num2+" = "+total);
            break;
            case 4:
                if (num2 == 0.0) {
                    System.out.println("You can't divide by zero!");
                }else {
                    total = a / b;
                    System.out.println(sr1 + num1+" / "+ sr2 + num2+" = "+total);
                }
            break;
        }
        //Options 3
        options.clear();
        options.add("1 - Calculate again");
        options.add("2 - Go back to main menu");
        //The program 3rd time
        while (test == false) {
            System.out.println(options);
            selection = scanner.nextDouble();
            switch ( (int) selection) {
                case 1:
                    Calculator calculator = new Calculator();
                    test = true;
                break;
                case 2:
                    MainMenu mainMenu = new MainMenu();
                    test = true;
                break;
                default:
                    System.out.println("Invalid option!");
                break;
            }
        }
    }
}
