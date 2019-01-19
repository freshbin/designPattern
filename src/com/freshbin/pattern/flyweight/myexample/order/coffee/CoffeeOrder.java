package com.freshbin.pattern.flyweight.myexample.order.coffee;

import com.freshbin.pattern.flyweight.myexample.order.Order;

/**
 * 咖啡类
 * 
 * @author freshbin
 * @date 2019年1月18日 下午5:04:32
 */
public class CoffeeOrder implements Order {

	private static Integer count = 0;
	
	private String type;

	public CoffeeOrder(String type) {
		CoffeeOrder.count++;
		this.type = type;
	}

	@Override
	public void sell() {
		System.out.println("卖出" + type + "咖啡");
	}

	public static Integer getCount() {
		return count;
	}

}
