package org.example.entities;

public class PremiumMenuItem extends MenuItem {
    private double surchargePercentage;

    // Default constructor
    public PremiumMenuItem() {
        super();
        this.surchargePercentage = 20.0;
    }

    // Parameterized constructor
    public PremiumMenuItem(int itemNumber, String itemName, String description, double itemPrice, String category, double surchargePercentage) {
        super(itemNumber, itemName, description, itemPrice, category);
        this.surchargePercentage = surchargePercentage;
    }

    public double getSurchargePercentage() {
        return surchargePercentage;
    }

    public void setSurchargePercentage(double surchargePercentage) {
        this.surchargePercentage = surchargePercentage;
    }

    @Override
    public double calculatePrice() {
        return getItemPrice() * (1 + surchargePercentage / 100);
    }

    @Override
    public String toString() {
        return "Premium " + super.toString();
    }
}

