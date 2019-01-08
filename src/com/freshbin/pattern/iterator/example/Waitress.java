package com.freshbin.pattern.iterator.example;

import java.util.ArrayList;

public class Waitress {
	private CakeHouseMenu mCakeHouseMenu;
	private DinerMenu mDinerMenu;
	private ArrayList<MenuItem> cakeitems;
	private MenuItem[] dineritems;

	
	
	public Waitress() {
		mCakeHouseMenu = new CakeHouseMenu();
		cakeitems = mCakeHouseMenu.getMenuItems();

		mDinerMenu = new DinerMenu();
		dineritems = mDinerMenu.getMenuItems();
	}

	public void printMenu() {
		MenuItem menuItem;
		for (int i = 0, len = cakeitems.size(); i < len; i++) {
			menuItem = cakeitems.get(i);
			System.out.println(menuItem.getName() + "***"
					+menuItem.getPrice()+"***"+ menuItem.getDescription());

		}
		for (int i = 0, len = mDinerMenu.numberOfItems; i < len; i++) {
			menuItem = dineritems[i];
			System.out.println(menuItem.getName() + "***"
					+menuItem.getPrice()+"***"+ menuItem.getDescription());

		}

	}

	public void printBreakfastMenu() {

	}

	public void printLunchMenu() {

	}

	public void printVegetableMenu() {

	}
}
