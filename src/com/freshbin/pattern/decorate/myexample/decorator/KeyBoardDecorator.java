package com.freshbin.pattern.decorate.myexample.decorator;

/**
 * 键盘装饰类
 * @author freshbin
 * @date 2019-1-3 17:49:12
 */
public class KeyBoardDecorator extends Decorator {
	
	@Override
	public void playGame() {
		System.out.print("键盘");
		super.playGame();
	}
}
