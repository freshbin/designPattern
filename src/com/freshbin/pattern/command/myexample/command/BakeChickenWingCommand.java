package com.freshbin.pattern.command.myexample.command;

import com.freshbin.pattern.command.myexample.food.FoodManager;
import com.freshbin.pattern.command.myexample.receive.ReceiverBase;

/**
 * 烤鸡翅命令类
 * 
 * @author freshbin
 * @date 2019-1-5 11:42:29
 */
public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(ReceiverBase receiverBase) {
		super(receiverBase);
	}

	@Override
	public void executeCommand() {
		receiverBase.bakeChickenWing();
	}

	@Override
	public Integer getFoodStock() {
		FoodManager foodManager = FoodManager.getFoodManager();
		return foodManager.getChickenWing();
	}

	@Override
	public void setFoodStock() {
		FoodManager foodManager = FoodManager.getFoodManager();
		Integer foodStock = getFoodStock();
		foodManager.setChickenWing(--foodStock);
	}

	@Override
	public String display() {
		return "烤鸡翅";
	}
}
