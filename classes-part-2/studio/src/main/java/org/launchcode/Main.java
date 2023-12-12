package org.launchcode;

import static java.time.LocalTime.now;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Menu ourMenu = new Menu();
        MenuItem item1 = new MenuItem(1.99, "Coffee", "Drink", false);
        MenuItem item2 = new MenuItem(7.99, "Grilled Vegetable Sandwich", "Entree", true);
        MenuItem item3 = new MenuItem(6.99, "Tiramisu", "Dessert", true);
        MenuItem dupItem = new MenuItem(6.99, "Tiramisu", "Dessert", true);

        ourMenu.addMenuItem(item1);
        ourMenu.addMenuItem(item2);
        ourMenu.addMenuItem(item3);
        if (!ourMenu.addMenuItem(dupItem)) {
            System.out.println("Item " + dupItem + " is already on the menu.");
        }


        System.out.println("Menu\n----");
        System.out.println(ourMenu);
        System.out.println("\nItem\n----");
        System.out.println(item1);

        ourMenu.removeMenuItem("Coffee");
        System.out.println("Menu\n----");
        System.out.println(ourMenu);

    }
}
