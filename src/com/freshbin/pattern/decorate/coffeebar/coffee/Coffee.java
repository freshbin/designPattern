package com.freshbin.pattern.decorate.coffeebar.coffee;

import com.freshbin.pattern.decorate.coffeebar.Drink;

public class Coffee extends Drink {

	@Override
	public float cost() {
		return super.getPrice();
	}

}
