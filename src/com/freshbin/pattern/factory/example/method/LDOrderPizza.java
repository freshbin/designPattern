package com.freshbin.pattern.factory.example.method;

import com.freshbin.pattern.factory.example.pizza.LDCheesePizza;
import com.freshbin.pattern.factory.example.pizza.LDPepperPizza;
import com.freshbin.pattern.factory.example.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
