package Extras;

import Menus.MainMenu;
import com.sun.tools.javac.Main;

public class Tutorial {

    public Tutorial() throws InterruptedException {

        System.out.println("To navigate through the menus you have:");
        Thread.sleep(50);
        System.out.println("1: Choose the number on the left of each option you want.");
        Thread.sleep(50);
        System.out.println("2: Any negative option is invalid.");
        Thread.sleep(50);
        System.out.println("3: Any option that is bigger than the number the possible options is invalid.");
        Thread.sleep(50);
        System.out.println("4: Any option that you will enter the system will read it as integer. For example your option is 5.7, the system will read it as 5");
        Thread.sleep(150);
        MainMenu mainMenu = new MainMenu();
    }
}
