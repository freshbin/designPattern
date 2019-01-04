package com.freshbin.pattern.factory.example.absfactory;

import com.freshbin.pattern.factory.example.pizza.NYCheesePizza;
import com.freshbin.pattern.factory.example.pizza.NYPepperPizza;
import com.freshbin.pattern.factory.example.pizza.Pizza;

public class NYFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
