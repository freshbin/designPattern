package com.freshbin.pattern.factory.example.simplefactory;

public class PizzaStroe {
	public static void main(String[] args) {
		SimplePizzaFactory mSimplePizzaFactory;
		OrderPizza mOrderPizza;
		mOrderPizza = new OrderPizza(new SimplePizzaFactory());

	}

}
