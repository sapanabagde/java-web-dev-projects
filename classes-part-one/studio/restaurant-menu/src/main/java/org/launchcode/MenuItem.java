package org.launchcode;

public class MenuItem {

    //fields
    private double price;            // the price of the menu item
    private String description;      // the description of the menu item
    private String category;         // the category of the menu item, such as appetizer, main course, or dessert
    private String isNew;             // boolean value that indicates whether the menu item is new or not

    //constructor

       public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }


    //getters and setters

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }
}
