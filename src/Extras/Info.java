package Extras;

import Menus.MainMenu;

public class Info {

    public Info() throws InterruptedException{

        System.out.println("System version: VirtualOS 1.0.");
        Thread.sleep(50);
        System.out.println("The idea and creation by: Houssem Maâmar.");
        Thread.sleep(50);
        System.out.println("Creation date: 05/05/2024.");
        Thread.sleep(50);
        System.out.println("Creation region: Bizerte, Tunisia.");
        Thread.sleep(150);
        MainMenu mainMenu = new MainMenu();
    }
}
