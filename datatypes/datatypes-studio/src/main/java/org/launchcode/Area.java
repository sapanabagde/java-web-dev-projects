package org.launchcode;
import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();
        double area = Circle.getArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
