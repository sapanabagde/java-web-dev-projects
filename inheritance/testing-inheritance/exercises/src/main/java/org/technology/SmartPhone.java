package org.technology;

public class SmartPhone extends Computer{
  // Additional property
    private String phoneNumber;

    // A constructor
    public SmartPhone(String brand, int memory,double speed, String phoneNumber ) {
        super(brand, memory, speed);
        this.phoneNumber = phoneNumber;
    }

   //One additional Method
    public void call(String phoneNumber) {
        System.out.println("The smartphone is calling  " + phoneNumber + ".");
    }

    //Getter and Setter

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
