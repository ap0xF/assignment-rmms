package org.example.entities;

import java.util.Scanner;

public class RestaurantDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create menus
        Menu takeAwayMenu = new Menu(1, "Take Away Menu", "Take Away", "Downtown", "All Day");
        Menu dineInMenu = new Menu(2, "Dine-In Menu", "Dine-In", "Main Hall", "All Day");

        // Create menu items
        MenuItem[] standardItems = new MenuItem[10];
        MenuItem[] premiumItems = new MenuItem[10];
        MenuItem[] discountedItems = new MenuItem[10];
        MenuItem[] drinksItems = new MenuItem[10];

        // Populate items
        for (int i = 0; i < 10; i++) {
            standardItems[i] = new StandardMenuItem(i + 1, "Standard Item " + (i + 1), "Standard Description", 10.0 + i, "Standard");
            premiumItems[i] = new PremiumMenuItem(i + 11, "Premium Item " + (i + 1), "Premium Description", 20.0 + i, "Premium", 20.0);
            discountedItems[i] = new DiscountedMenuItem(i + 21, "Discounted Item " + (i + 1), "Discounted Description", 15.0 + i, "Discounted", 5.0);
            drinksItems[i] = new DrinksMenuItem(i + 31, "Drink Item " + (i + 1), "Drink Description", 5.0 + i, "Drink");
        }

        // Add items to menus
        for (int i = 0; i < 7; i++) {
            takeAwayMenu.addItem(standardItems[i]);
            takeAwayMenu.addItem(premiumItems[i]);
            takeAwayMenu.addItem(discountedItems[i]);
            takeAwayMenu.addItem(drinksItems[i]);
            dineInMenu.addItem(standardItems[i + 3]);
            dineInMenu.addItem(premiumItems[i + 3]);
            dineInMenu.addItem(discountedItems[i + 3]);
            dineInMenu.addItem(drinksItems[i + 3]);
        }

        // Display welcome message
        System.out.println("Welcome to the Restaurant Menu Management System (RMMS)");
        System.out.println("Developed by: [Your Name], [Your Partner's Name]");

        // Ask user if they want to place order
        System.out.print("Do you want to place an order? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            // Get customer details
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your status (Active/VIP/New): ");
            String status = scanner.nextLine();
            Customer customer = new Customer(name, status);

            // Display menus
            System.out.println("Select a menu:");
            System.out.println("1. Take Away Menu");
            System.out.println("2. Dine-In Menu");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            Menu selectedMenu = (menuChoice == 1) ? takeAwayMenu : dineInMenu;
            System.out.println("Selected Menu: " + selectedMenu.getName());
            System.out.println(selectedMenu);

            // Take order
            System.out.println("Enter the item numbers you want to order (comma separated): ");
            String[] itemNumbers = scanner.nextLine().split(",");
            double total = 0.0;

            for (String itemNumber : itemNumbers) {
                MenuItem item = selectedMenu.getItem(Integer.parseInt(itemNumber.trim()));
                if (item != null) {
                    total += item.calculatePrice();
                }
            }

            // Apply discount
            total *= (1 - customer.getDiscount());

            // Apply service charge for dine-in
            if (menuChoice == 2) {
                total *= 1.025;  // 2.5% service charge
            }

            // Display total amount
            System.out.println("Total amount due: $" + total);
        } else {
            System.out.println("Thank you for visiting the RMMS.");
        }

        scanner.close();
    }
}
