package com.freshbin.pattern.decorate.coffeebar.decorator;

import com.freshbin.pattern.decorate.coffeebar.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {
		super(Obj);
		super.setDescription("Soy");
		super.setPrice(1.5f);
	}

}
