package org.example;

import org.example.entities.Customer;
import org.example.entities.Menu;
import org.example.entities.MenuItem;
import org.example.entities.Order;

public class Main {
    public static void main(String[] args) {
        // Create a menu
        Menu breakfastMenu = new Menu(1, "Breakfast Menu", "Breakfast", "Main Restaurant", "8:00 AM - 11:00 AM");

        // Add items to the menu
        breakfastMenu.addItem(new MenuItem(1, 1, "Pancakes", "Fluffy pancakes", 5.00, "standard"));
        breakfastMenu.addItem(new MenuItem(2, 1, "Omelette", "Cheese omelette", 7.00, "premium"));
        breakfastMenu.addItem(new MenuItem(3, 1, "Coffee", "Freshly brewed coffee", 3.00, "drinks"));

        // Create a customer
        Customer customer = new Customer(1, "John Doe", "VIP");

        // Create an order
        Order order = new Order(1, customer, breakfastMenu);
        order.addItem(breakfastMenu.getItems().get(0), 2); // 2 Pancakes
        order.addItem(breakfastMenu.getItems().get(1), 1); // 1 Omelette
        order.addItem(breakfastMenu.getItems().get(2), 3); // 3 Coffees

        // Generate invoice
        String invoice = order.generateInvoice();
        System.out.println(invoice);
    }
}
