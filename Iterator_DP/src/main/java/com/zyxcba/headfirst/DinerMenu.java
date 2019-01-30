package com.zyxcba.headfirst;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(fAKIN)", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("soup of thd day ", "soup of the day,with a side of potato salad", true, 2.99);
        addItem("Hotdog", "A hot dog", true, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry ,menu is full! Can't add item to menu.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
