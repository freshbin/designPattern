package com.freshbin.pattern.factory.example.simplefactory;

import com.freshbin.pattern.factory.example.pizza.CheesePizza;
import com.freshbin.pattern.factory.example.pizza.GreekPizza;
import com.freshbin.pattern.factory.example.pizza.PepperPizza;
import com.freshbin.pattern.factory.example.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
