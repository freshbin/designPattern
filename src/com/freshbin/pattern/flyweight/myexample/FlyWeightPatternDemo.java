package com.freshbin.pattern.flyweight.myexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.freshbin.pattern.bridge.example.bridge.newTvControl;
import com.freshbin.pattern.flyweight.myexample.order.Order;
import com.freshbin.pattern.flyweight.myexample.order.coffee.CoffeeOrder;
import com.freshbin.pattern.flyweight.myexample.order.coffee.CoffeeOrderFactory;

/**
 * 享元模式
 * 
 * @author freshbin
 * @date 2019年1月15日 下午8:55:15
 */
public class FlyWeightPatternDemo {
	public static List<Order> orders = new ArrayList<>(100);
	public static List<Order> ordersNotFlyWeight = new ArrayList<>(100);
	public static Map<Integer, String> coffeeTypeMap;
	
	static {
		coffeeTypeMap = new HashMap<>(100);
		coffeeTypeMap.put(0, "摩卡");
		coffeeTypeMap.put(1, "拿铁");
	}
	
	public static void main(String[] args) {
		/*System.out.println("===============蝇量模式===========");
		for(int i = 0; i < 100; i++) {
			Integer type = i % 2;
			countSellNum(coffeeTypeMap.get(type));
		}
		
		System.out.println("卖出的咖啡数：" + orders.size());
		
		System.out.println("=================");
		System.out.println("新增的coffee对象：" + CoffeeOrder.getCount());*/
		
		System.out.println("===============非蝇量模式===========");
		for(int i = 0; i < 100; i++) {
			Integer type = i % 2;
			countSellNumNotFlyWeight(coffeeTypeMap.get(type));
		}
		
		System.out.println("卖出的咖啡数：" + ordersNotFlyWeight.size());
		
		System.out.println("=================");
		System.out.println("新增的coffee对象：" + CoffeeOrder.getCount());
	}
	
	public static void countSellNum(String type) {
		orders.add(CoffeeOrderFactory.getCoffeeOrderFactory().getOrder(type));
	}
	
	public static void countSellNumNotFlyWeight(String type) {
		ordersNotFlyWeight.add(CoffeeOrderFactory.getCoffeeOrderFactory().getOrderNotFlyWeight(type));
	}
}
