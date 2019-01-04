package com.freshbin.pattern.factory.example.absfactory;

public class PizzaStroe {
	public static void main(String[] args) {

		OrderPizza mOrderPizza;
		mOrderPizza = new OrderPizza(new LDFactory());

	}

}
