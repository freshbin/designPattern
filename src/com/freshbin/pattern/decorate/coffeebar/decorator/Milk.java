package com.freshbin.pattern.decorate.coffeebar.decorator;

import com.freshbin.pattern.decorate.coffeebar.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {
		super(Obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}
