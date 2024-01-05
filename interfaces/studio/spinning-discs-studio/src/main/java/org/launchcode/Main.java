package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD();
        DVD myDvd = new DVD("My Computer");

        myCD.spinDisc();
        myDvd.spinDisc();

        myCD.writeData("More data to add");
        System.out.println(myCD.readData());

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}