package org.technology;

public class Laptop extends Computer {
 // additional property
    private boolean hasBattery;

    //Constructor
    public Laptop(String brand, int memory,double speed, boolean hasBattery ) {
        //calling parent constructor
        super(brand, memory, speed);
        this.hasBattery = hasBattery;
    }

    //One Additional Method
    public void charge() {
      if(hasBattery) {
          System.out.println("The laptop is charging.");
      } else {
          System.out.println("The laptop does not have a battery.");
      }
    }

//Getters and Setters

    public boolean getHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
}
