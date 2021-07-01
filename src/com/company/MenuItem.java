package com.company;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew = true;

    // constructor
    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    // getter for .price
    public double getPrice() {
        return this.price;
    }

    // getter for .description
    public String getDescription() {
        return description;
    }

    // getter for .category
    public String getCategory() {
        return category;
    }

    // getter for .isNew --> notice the syntax is a little different I didn't use getIsNew() -> just isNew() makes sense as it can only return either true or false
    // studio 2 part 2
    public boolean isNew() {
        return isNew;
    }

    // setter for .price()
    public void setPrice(double price) {
        this.price = price;
    }

    // setter for .description
    public void setDescription(String description) {
        this.description = description;
    }

    // setter for isNew
    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    // studio 2 part 5
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && description.equals(menuItem.description) && Objects.equals(category, menuItem.category);
    }

    // studio 2 part 5
    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}
