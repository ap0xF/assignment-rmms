package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private Menu menu;
    private List<OrderItem> items;

    public Order(int orderId, Customer customer, Menu menu) {
        this.orderId = orderId;
        this.customer = customer;
        this.menu = menu;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem, int quantity) {
        double price = menuItem.calculatePrice() * quantity;
        items.add(new OrderItem(orderId, menuItem, quantity, price));
    }

    public double calculateTotal() {
        double total = items.stream().mapToDouble(OrderItem::getCalculatedPrice).sum();
        double discount = customer.getDiscount();
        return total * (1 - discount);
    }

    public String generateInvoice() {
        double total = calculateTotal();
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice for Order ").append(orderId).append("\n");
        invoice.append("Customer: ").append(customer.getName()).append("\n");
        invoice.append("Items:\n");
        for (OrderItem item : items) {
            invoice.append(item.getMenuItem().getName()).append(" x").append(item.getQuantity())
                    .append(" - $").append(String.format("%.2f", item.getCalculatedPrice())).append("\n");
        }
        invoice.append("Total: $").append(String.format("%.2f", total)).append("\n");
        return invoice.toString();
    }

    // Getters and Setters
}
