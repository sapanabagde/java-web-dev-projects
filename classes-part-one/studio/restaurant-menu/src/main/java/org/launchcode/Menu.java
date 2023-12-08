package org.launchcode;


public class Menu {
    public static void main(String[] args) {
        MenuItem menu = new MenuItem(13, "Chicken Sandwich", "main course",true);
        System.out.println(menu.getPrice());
        System.out.println(menu.getDescription());
        System.out.println(menu.getCategory());

    }
}
