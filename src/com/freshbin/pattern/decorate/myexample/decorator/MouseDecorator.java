package com.freshbin.pattern.decorate.myexample.decorator;

/**
 * 鼠标装饰类
 * @author freshbin
 * @date 2019-1-3 17:48:15
 */
public class MouseDecorator extends Decorator {
	
	@Override
	public void playGame() {
		System.out.print("鼠标");
		super.playGame();
	}
}
