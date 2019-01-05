package com.freshbin.pattern.command.myexample.food;

import com.freshbin.pattern.command.myexample.receive.ReceiverBase;

/**
 * 食物管理类
 * 
 * @author freshbin
 * @date 2019-1-5 12:06:48
 */
public class FoodManager {
	private Integer mutton = 3;
	private Integer chickenWing = 3;

	private volatile static FoodManager foodManager = null;

	private FoodManager() {

	}

	public static FoodManager getFoodManager() {
		if (foodManager == null) {
			synchronized (ReceiverBase.class) {
				if (foodManager == null) {
					foodManager = new FoodManager();
				}
			}
		}

		return foodManager;
	}

	public Integer getMutton() {
		return mutton;
	}

	public void setMutton(Integer mutton) {
		this.mutton = mutton;
	}

	public Integer getChickenWing() {
		return chickenWing;
	}

	public void setChickenWing(Integer chickenWing) {
		this.chickenWing = chickenWing;
	}

}
