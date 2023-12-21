package org.technology;

public class Computer extends AbstractEntity {
    //Three properties
    private String brand;
    private int memory;
    private double speed;


   //Constructor
   public Computer(String brand, int memory,double speed ){
       this.brand = brand;
       this.memory = memory;
       this.speed = speed;
   }

   //Methods
   public void turnOn() {
       System.out.println("The computer is turning on.");
   }

    public void turnOff() {
        System.out.println("The computer is turning off.");
    }

    //Getters and Setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
