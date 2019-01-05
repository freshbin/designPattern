package com.freshbin.pattern.command.myexample;

import com.freshbin.pattern.command.myexample.command.BakeChickenWingCommand;
import com.freshbin.pattern.command.myexample.command.BakeMuttonCommand;
import com.freshbin.pattern.command.myexample.command.Command;
import com.freshbin.pattern.command.myexample.invoker.Waiter;
import com.freshbin.pattern.command.myexample.receive.BarbecuerOne;
import com.freshbin.pattern.command.myexample.receive.BarbecuerTwo;
import com.freshbin.pattern.command.myexample.receive.ReceiverBase;

/**
 * 命令模式
 * 
 * @author freshbin
 * @date 2019-1-5 11:23:27
 */
public class CommandMain {
	public static void main(String[] args) {
		System.out.println("===========点餐================");
		ReceiverBase receiverBaseOne = new BarbecuerOne();
		ReceiverBase receiverBaseTwo = new BarbecuerTwo();

		Command commandOne = new BakeChickenWingCommand(receiverBaseOne);
		Command commandTwo = new BakeMuttonCommand(receiverBaseTwo);

		Waiter waiterOne = new Waiter();
		for (int i = 0; i < 5; i++) {
			waiterOne.setCommand(commandOne);
		}
		waiterOne.setCommand(commandTwo);
		waiterOne.cancleCommand(commandOne);
		waiterOne.notifyCommand();
		System.out.println("================");

		System.out.println("===========点餐================");
		Waiter waiterTwo = new Waiter();
		for (int j = 0; j < 5; j++) {
			waiterTwo.setCommand(commandOne);
			waiterTwo.setCommand(commandTwo);
		}
		waiterTwo.notifyCommand();
		System.out.println("================");
	}
}
