package com.freshbin.pattern.decorate.myexample.decorator;

/**
 * 手柄装饰类
 * @author freshbin
 * @date 2019-1-3 17:45:18
 */
public class HandleDecorator extends Decorator {
	
	@Override
	public void playGame() {
		System.out.print("手柄");
		super.playGame();
	}
}
