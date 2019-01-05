package com.freshbin.pattern.command.myexample.invoker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.freshbin.pattern.command.myexample.command.Command;

/**
 * 服务员类
 * 
 * @author freshbin
 * @date 2019-1-5 11:53:01
 */
public class Waiter {
	private List<Command> commands = new ArrayList<>();
	private Map<Command, Integer> foodStockMap = new HashMap<>();

	public void setCommand(Command command) {
		if (!validFoodStock(command)) {
			return;
		}
		commands.add(command);
	}

	private Boolean validFoodStock(Command command) {
		Integer foodStock = 0;
		if (foodStockMap.containsKey(command)) {
			foodStock = foodStockMap.get(command);
		} else {
			foodStock = command.getFoodStock();
		}
		if (foodStock <= 0) {
			System.out.println("服务员反馈:" + command.display() + "没有了!");
			return false;
		}
		foodStockMap.put(command, --foodStock);
		return true;
	}

	public void cancleCommand(Command command) {
		commands.remove(command);
	}

	public void notifyCommand() {
		for (Command command : commands) {
			command.executeCommand();
		}
	}
}
