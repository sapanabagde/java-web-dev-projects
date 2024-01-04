package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("\n\n flavors Before sort");
        System.out.println("----------------");
        for (Flavor flavor : flavors) {
            //System.out.println(flavor.getName());
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();
         flavors.sort(comparator);

        System.out.println("\nflavors After sort");
        System.out.println("----------------");
        for (Flavor flavor : flavors) {
            //System.out.println(flavor.getName());
            System.out.println(flavor.getName());
        }
        System.out.println("\n Cones Before sort");
        System.out.println("----------------");
        for (Cone cone : cones) {
            //System.out.println(flavor.getName());
            System.out.println(cone.getName() + ":  $" + cone.getCost());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());
        System.out.println("\nCones After sort");
        System.out.println("----------------");
        for (Cone cone : cones) {
            //System.out.println(flavor.getName());
            System.out.println(cone.getName() + ":  $" + cone.getCost());
        }
    //    flavors.sort(new FlavorComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}