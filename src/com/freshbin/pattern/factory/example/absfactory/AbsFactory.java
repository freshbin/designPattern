package com.freshbin.pattern.factory.example.absfactory;

import com.freshbin.pattern.factory.example.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype);
}
