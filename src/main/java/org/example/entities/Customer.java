package org.example.entities;

public class Customer {
    private String name;
    private double discount;
    private String status;

    // Default constructor
    public Customer() {
        this.name = "unknown";
        this.discount = 0.0;
        this.status = "unknown";
    }

    // Parameterized constructor
    public Customer(String name, String status) {
        this.name = name;
        this.status = status;
        setDiscount();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        setDiscount();
    }

    // Set discount based on status
    private void setDiscount() {
        switch (status.toLowerCase()) {
            case "active":
                this.discount = 0.10;
                break;
            case "vip":
                this.discount = 0.15;
                break;
            default:
                this.discount = 0.0;
                break;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Status: " + status + ", Discount: " + (discount * 100) + "%";
    }
}

