package org.example.entities;

public class Customer {
    private int customerId;
    private String name;
    private String status;

    public Customer(int customerId, String name, String status) {
        this.customerId = customerId;
        this.name = name;
        this.status = status;
    }

    public double getDiscount() {
        switch (status) {
            case "active":
                return 0.10;
            case "VIP":
                return 0.15;
            default:
                return 0.0;
        }
    }

    // Getters and Setters
}
