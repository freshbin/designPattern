package com.freshbin.pattern.factory.example.method;

import com.freshbin.pattern.factory.example.pizza.NYCheesePizza;
import com.freshbin.pattern.factory.example.pizza.NYPepperPizza;
import com.freshbin.pattern.factory.example.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
