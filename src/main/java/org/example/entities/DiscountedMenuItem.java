package org.example.entities;

public class DiscountedMenuItem extends MenuItem {
    private double discountPercentage;

    // Default constructor
    public DiscountedMenuItem() {
        super();
        this.discountPercentage = 5.0;
    }

    // Parameterized constructor
    public DiscountedMenuItem(int itemNumber, String itemName, String description, double itemPrice, String category, double discountPercentage) {
        super(itemNumber, itemName, description, itemPrice, category);
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice() {
        return getItemPrice() * (1 - discountPercentage / 100);
    }

    @Override
    public String toString() {
        return "Discounted " + super.toString();
    }
}

