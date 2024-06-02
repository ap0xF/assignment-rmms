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

    public Menu(int menuId, String name, String purpose, String venue, String sessionTime) {
        this.menuId = menuId;
        this.name = name;
        this.purpose = purpose;
        this.venue = venue;
        this.sessionTime = sessionTime;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    // Getters and Setters
}
