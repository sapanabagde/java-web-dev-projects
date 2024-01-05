package org.launchcode;
import java.util.HashMap;

public abstract class BaseDisc {

    // Class Variable
    private String discData;
    private HashMap<String, String> discInfo;
    private boolean isInserted;
    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    // Constructor
    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.discData= "";
        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;

        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRPM = spinSpeed;

        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));

    }
    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);

    }
    // Methods
    //Getters & Setters
    public boolean isInserted() {
        return this.isInserted;
    }
    public int getStorageCapacity() {
        return this.storageCapacityInMB;
    }
    public int getSpinSpeed() {
        return this.spinSpeedInRPM;
    }

    // Methods
    protected void writeData(String data) {
        this.discData += data;
    }
    public String readData() {
        return this.discData;
    }
    public HashMap<String, String> getInfo() {
        return this.discInfo;
    }
    public void insert() {
        this.isInserted = true;
    }
}
