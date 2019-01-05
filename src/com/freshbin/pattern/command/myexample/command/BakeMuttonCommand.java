package com.freshbin.pattern.command.myexample.command;

import com.freshbin.pattern.command.myexample.food.FoodManager;
import com.freshbin.pattern.command.myexample.receive.ReceiverBase;

/**
 * 烤羊肉串命令类
 * 
 * @author freshbin
 * @date 2019-1-5 11:42:29
 */
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(ReceiverBase receiverBase) {
		super(receiverBase);
	}

	@Override
	public void executeCommand() {
		receiverBase.bakeMutton();
	}

	@Override
	public Integer getFoodStock() {
		FoodManager foodManager = FoodManager.getFoodManager();
		return foodManager.getMutton();
	}

	@Override
	public String display() {
		return "烤羊肉串";
	}

	@Override
	public void setFoodStock() {
		FoodManager foodManager = FoodManager.getFoodManager();
		Integer foodStock = getFoodStock();
		foodManager.setMutton(--foodStock);
	}
}
