package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
     double length;
     double width;
     Scanner input;

     input = new Scanner(System.in);
     System.out.println("Enter the length: ");
       length = input.nextDouble();

        System.out.println("Enter the width: ");
        width = input.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}
