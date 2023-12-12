package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

import static java.time.LocalTime.now;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu() {
        this.setLastUpdated();
        this.items = new ArrayList<MenuItem>();
    }
    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated() {
        this.lastUpdated = LocalDate.now();
    }
    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public boolean addMenuItem(MenuItem item) {
        if (items.contains(item)) {
            return false;
        }

        items.add(item);
        setLastUpdated();
        return true;
    }
    public void removeMenuItem(MenuItem item) {
        items.remove(item);
        setLastUpdated();
    }
    public void removeMenuItem(String description) {
        Predicate <MenuItem> filter = item->item.getDescription().equals(description);
        if (items.removeIf(filter)) {
            setLastUpdated();
        }
    }

    @Override
    public String toString() {
        return "Menu (Last Updated on " + lastUpdated + ")\n" +
                String.join("\n", items.stream().map(Object::toString).toArray(String[]::new));
    }
}
