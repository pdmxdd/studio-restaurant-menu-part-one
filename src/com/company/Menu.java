package com.company;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    // an empty constructor, it just creates an empty list for the menuItems and uses the current time for lastUpdated
    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = new ArrayList<MenuItem>();
    }

    // a constructor that allows the user to create the menu with a pre-existing list of menuItems
    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = items;
    }

    // getter for .lastUpdated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // getter for .getMenuItems()
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // add a way to add AND remove menu items from the menu
    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
    }

    public void printFullMenu() {
        System.out.println("Full Menu:");
        int i = 1;
        for(MenuItem item : menuItems) {
            System.out.println(i + ". " + item);
            i++;
        }
    }

    public MenuItem getMenuItem(int menuIndex) {
        if(!(menuIndex < this.menuItems.size())) {
            return new MenuItem(4.04, "Item not found", "NA");
        }
        return this.menuItems.get(menuIndex);
    }

    public ArrayList<MenuItem> getNewMenuItems() {
        ArrayList<MenuItem> newItems = new ArrayList<>();
        for(MenuItem item : menuItems) {
            if(item.isNew()) {
                newItems.add(item);
            }
        }
        return newItems;
    }
}
