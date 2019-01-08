package com.freshbin.pattern.iterator.example;

import java.util.ArrayList;

public class CakeHouseMenu {
	private ArrayList<MenuItem> menuItems;

	public CakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
		addItem("MDL Cake Breakfast", "fried eggs&toast", false, 3.59f);
		addItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
		addItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);
	}

	private void addItem(String name, String description, boolean vegetable, float price) {
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		menuItems.add(menuItem);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	// 其他功能代码
}
