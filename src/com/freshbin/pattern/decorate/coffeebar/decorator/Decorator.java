package com.freshbin.pattern.decorate.coffeebar.decorator;

import com.freshbin.pattern.decorate.coffeebar.Drink;

public class Decorator extends Drink {
	private Drink Obj;

	public Decorator(Drink Obj) {
		this.Obj = Obj;
	}

	@Override
	public float cost() {
		return super.getPrice() + Obj.cost();
	}

	@Override
	public String getDescription() {
		return super.description + "-" + super.getPrice() + "&&" + Obj.getDescription();
	}

}
