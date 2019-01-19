package com.freshbin.pattern.flyweight.myexample.order.coffee;

import java.util.HashMap;
import java.util.Map;

import com.freshbin.pattern.flyweight.myexample.order.Order;

public class CoffeeOrderFactory {
	private static volatile CoffeeOrderFactory coffeeOrderFactory;

	private static Map<String, Order> coffeeMap = new HashMap<>();

	private CoffeeOrderFactory() {

	}

	public static CoffeeOrderFactory getCoffeeOrderFactory() {
		if (coffeeOrderFactory == null) {
			synchronized (CoffeeOrderFactory.class) {
				if (coffeeOrderFactory == null) {
					coffeeOrderFactory = new CoffeeOrderFactory();
				}
			}
		}

		return coffeeOrderFactory;
	}

	public static Order getOrder(String type) {
		if (!coffeeMap.containsKey(type)) {
			switch (type) {
			case "摩卡":
				coffeeMap.put(type, new CoffeeOrder(type));
				break;
			case "拿铁":
				coffeeMap.put(type, new CoffeeOrder(type));
				break;

			default:
				break;
			}
		}

		return coffeeMap.get(type);
	}

	public static Order getOrderNotFlyWeight(String type) {
		switch (type) {
		case "摩卡":
			coffeeMap.put(type, new CoffeeOrder(type));
			break;
		case "拿铁":
			coffeeMap.put(type, new CoffeeOrder(type));
			break;

		default:
			break;
		}

		return coffeeMap.get(type);
	}
}
