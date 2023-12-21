package org.technology;

//A Class to test Implementation
public class Program {
    public static void main(String[] args) {

   //Creating a Computer Object
    Computer c = new Computer("Dell",8, 3.2);
    c.turnOn();
    c.turnOff();

   //Creating a LapTop Object
    Laptop l = new Laptop("HP",16,2.8,false);
     l.turnOn();
     l.charge();
     l.turnOff();

   // Creating a Smartphone object
   SmartPhone s = new SmartPhone("Apple", 4, 1.5,"123-456-7890");
    s.turnOn();
    s.call("987-678-1340");
    s.turnOff();

   //Printing the ID of the Smartphone object
        System.out.println("Smartphone ID: " + s.getId());

    }
}
