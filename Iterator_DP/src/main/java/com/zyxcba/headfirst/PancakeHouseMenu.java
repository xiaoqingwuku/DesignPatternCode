package com.zyxcba.headfirst;

import java.awt.*;
import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancack Breakfast", "Pancakes with scrambled eggs", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs ,sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles,with your choice of blueberries", true, 2.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

}
