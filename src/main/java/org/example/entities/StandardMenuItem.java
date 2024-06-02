package org.example.entities;

public class StandardMenuItem extends MenuItem {
    // Default constructor
    public StandardMenuItem() {
        super();
    }

    // Parameterized constructor
    public StandardMenuItem(int itemNumber, String itemName, String description, double itemPrice, String category) {
        super(itemNumber, itemName, description, itemPrice, category);
    }

    @Override
    public double calculatePrice() {
        return getItemPrice();
    }

    @Override
    public String toString() {
        return "Standard " + super.toString();
    }
}

