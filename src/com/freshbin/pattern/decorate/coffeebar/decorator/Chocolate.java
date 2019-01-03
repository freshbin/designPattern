package com.freshbin.pattern.decorate.coffeebar.decorator;

import com.freshbin.pattern.decorate.coffeebar.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {
		super(Obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
