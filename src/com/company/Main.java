package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // creating 4 menu items
        MenuItem itemOne = new MenuItem(14.99, "hamburger", "Entree");
        MenuItem itemTwo = new MenuItem(5.99, "taco", "Entree");
        MenuItem itemThree = new MenuItem(6.99, "Pretzels", "Appetizer");
        MenuItem itemFour = new MenuItem(4.99, "Ice cream", "Dessert");

        // setting two of the menu items isNew field to false
        itemTwo.setNew(false);
        itemThree.setNew(false);

        // creating our new empty menu
        Menu restaurantMenuOne = new Menu();

        // adding the four menu items to our menu
        restaurantMenuOne.addMenuItem(itemOne);
        restaurantMenuOne.addMenuItem(itemTwo);
        restaurantMenuOne.addMenuItem(itemThree);
        restaurantMenuOne.addMenuItem(itemFour);

        // testing out the printFullMenu() method
        restaurantMenuOne.printFullMenu();

        // verifying that the first element matches the first line from the previous line
        System.out.println(restaurantMenuOne.getMenuItem(0));

        // testing out the removal of a menuitem from the menu
        restaurantMenuOne.removeMenuItem(itemThree);

        // verifying that the remove menuitem worked by printing out the full menu again
        restaurantMenuOne.printFullMenu();

        // testing out the getNewMenuItems() method
        System.out.println("new menu items: " + restaurantMenuOne.getNewMenuItems());

        // testing out the .equals() method
        System.out.println(itemOne.equals(itemOne)); // should be true
        System.out.println(itemOne.equals(itemTwo)); // should be false

        // creating a new menu item with the exact values of itemTwo
        MenuItem itemFive = new MenuItem(5.99, "taco", "Entree");
        System.out.println(itemTwo.equals(itemFive)); // should be true
    }
}
