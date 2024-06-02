package org.example.entities;

public class OrderItem {
    private int orderId;
    private MenuItem menuItem;
    private int quantity;
    private double calculatedPrice;

    public OrderItem(int orderId, MenuItem menuItem, int quantity, double calculatedPrice) {
        this.orderId = orderId;
        this.menuItem = menuItem;
        this.quantity = quantity;
        this.calculatedPrice = calculatedPrice;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCalculatedPrice() {
        return calculatedPrice;
    }

    // Getters and Setters
}

