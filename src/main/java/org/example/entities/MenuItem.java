package org.example.entities;

public class MenuItem {
    private int itemId;
    private int menuId;
    private String name;
    private String description;
    private double basePrice;
    private String type;

    public MenuItem(int itemId, int menuId, String name, String description, double basePrice, String type) {
        this.itemId = itemId;
        this.menuId = menuId;
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.type = type;
    }

    public double calculatePrice() {
        switch (type) {
            case "premium":
                return basePrice * 1.20;
            case "discount":
                return basePrice * 0.95;
            case "drinks":
                return basePrice;
            default:
                return basePrice;
        }
    }

    // Getters and Setters
}

