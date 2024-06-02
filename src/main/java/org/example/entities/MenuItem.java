package org.example.entities;

public abstract class MenuItem {
    private int itemNumber;
    private String itemName;
    private String description;
    private double itemPrice;
    private String category;  // New attribute for categorization

    // Default constructor
    public MenuItem() {
        this.itemNumber = 0;
        this.itemName = "unknown";
        this.description = "unknown";
        this.itemPrice = 0.0; // min default price to 0.0
        this.category = "unknown";
    }

    // Parameterized constructor
    public MenuItem(int itemNumber, String itemName, String description, double itemPrice, String category) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.description = description;
        this.itemPrice = itemPrice;
        this.category = category;
    }

    // Getters and Setters
    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // toString method
    @Override
    public String toString() {
        return "Item Number: " + itemNumber + ", Name: " + itemName + ", Description: " + description + ", Price: $" + itemPrice + ", Category: " + category;
    }

    // Abstract method to calculate price, to be implemented by subclasses
    public abstract double calculatePrice();
}
