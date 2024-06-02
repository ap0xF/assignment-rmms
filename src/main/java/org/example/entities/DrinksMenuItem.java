package org.example.entities;

public class DrinksMenuItem extends MenuItem {
    // Default constructor
    public DrinksMenuItem() {
        super();
    }

    // Parameterized constructor
    public DrinksMenuItem(int itemNumber, String itemName, String description, double itemPrice, String category) {
        super(itemNumber, itemName, description, itemPrice, category);
    }

    @Override
    public double calculatePrice() {
        return getItemPrice();
    }

    @Override
    public String toString() {
        return "Drink " + super.toString();
    }
}
