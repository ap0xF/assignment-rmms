package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int menuId;
    private String name;
    private String purpose;
    private String venue;
    private String sessionTime;
    private List<MenuItem> items;

    // Default constructor
    public Menu() {
        this.menuId = 0;
        this.name = "unknown";
        this.purpose = "unknown";
        this.venue = "unknown";
        this.sessionTime = "unknown";
        this.items = new ArrayList<>();
    }

    // Parameterized constructor
    public Menu(int menuId, String name, String purpose, String venue, String sessionTime) {
        this.menuId = menuId;
        this.name = name;
        this.purpose = purpose;
        this.venue = venue;
        this.sessionTime = sessionTime;
        this.items = new ArrayList<>();
    }

    // Getters and Setters
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    // Methods to add, remove and retrieve items
    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public MenuItem getItem(int itemNumber) {
        for (MenuItem item : items) {
            if (item.getItemNumber() == itemNumber) {
                return item;
            }
        }
        return null;
    }

    // toString method to display menu details
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu ID: ").append(menuId)
                .append("\nName: ").append(name)
                .append("\nPurpose: ").append(purpose)
                .append("\nVenue: ").append(venue)
                .append("\nSession Time: ").append(sessionTime)
                .append("\nItems:\n");
        for (MenuItem item : items) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}
