package com.freshbin.pattern.command.myexample.receive;

import com.freshbin.pattern.command.myexample.food.FoodManager;

/**
 * 命令执行对象
 * 
 * @author freshbin
 * @date 2019-1-5 11:29:17
 */
public class BarbecuerTwo extends ReceiverBase {
	public void bakeMutton() {
		FoodManager foodManager = FoodManager.getFoodManager();
		Integer muttonOld = foodManager.getMutton();
		System.out.println("库存羊肉串数量：" + muttonOld);

		System.out.println("师傅乙开始烤羊肉串!");

		Integer muttonNew = --muttonOld;
		foodManager.setMutton(muttonNew);
		System.out.println("剩下的羊肉串数量：" + muttonNew);
	}

	public void bakeChickenWing() {
		FoodManager foodManager = FoodManager.getFoodManager();
		Integer chickenWingOld = foodManager.getChickenWing();
		System.out.println("库存鸡翅数量：" + chickenWingOld);

		System.out.println("师傅乙开始烤鸡翅!");

		Integer chickenWingNew = --chickenWingOld;
		foodManager.setChickenWing(chickenWingNew);
		System.out.println("剩下的鸡翅数量：" + chickenWingNew);
	}
}
