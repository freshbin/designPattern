package com.freshbin.pattern.flyweight.example.ms;

public class TreeManager {

	private int length = 10000000;
	int[] xArray = new int[length], yArray = new int[length], AgeArray = new int[length];

	private TreeFlyWeight mTreeFlyWeight;

	public TreeManager() {

		mTreeFlyWeight = new TreeFlyWeight();
		for (int i = 0; i < length; i++) {

			xArray[i] = (int) (Math.random() * length);
			yArray[i] = (int) (Math.random() * length);
			AgeArray[i] = (int) (Math.random() * length) % 5;

		}

	}

	public void displayTrees() {

		for (int i = 0; i < length; i++) {
			mTreeFlyWeight.display(xArray[i], yArray[i], AgeArray[i]);
		}
	}

}
