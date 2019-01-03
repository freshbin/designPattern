package com.freshbin.pattern.decorate.myexample.decorator;

/**
 * 棍子装饰类
 * @author freshbin
 * @date 2019-1-3 17:37:43
 */
public class StickDecorator extends Decorator {
	
	@Override
	public void playGame() {
		System.out.print("棍子");
		super.playGame();
	}
}
