package com.freshbin.pattern.factory.example.absfactory;

import com.freshbin.pattern.factory.example.pizza.LDCheesePizza;
import com.freshbin.pattern.factory.example.pizza.LDPepperPizza;
import com.freshbin.pattern.factory.example.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
