package com.freshbin.pattern.command.myexample.command;

import com.freshbin.pattern.command.myexample.receive.ReceiverBase;

/**
 * 命令抽象类
 * 
 * @author freshbin
 * @date 2019-1-5 11:24:33
 */
public abstract class Command {
	protected ReceiverBase receiverBase;

	public Command(ReceiverBase receiverBase) {
		this.receiverBase = receiverBase;
	}

	public abstract void executeCommand();

	public abstract Integer getFoodStock();

	public abstract void setFoodStock();

	public abstract String display();
}
