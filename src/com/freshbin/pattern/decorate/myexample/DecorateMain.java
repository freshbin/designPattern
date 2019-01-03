package com.freshbin.pattern.decorate.myexample;

import com.freshbin.pattern.decorate.myexample.component.GameComponent;
import com.freshbin.pattern.decorate.myexample.component.LOLComponent;
import com.freshbin.pattern.decorate.myexample.component.NibaComponent;
import com.freshbin.pattern.decorate.myexample.component.WangzheComponent;
import com.freshbin.pattern.decorate.myexample.decorator.Decorator;
import com.freshbin.pattern.decorate.myexample.decorator.HandleDecorator;
import com.freshbin.pattern.decorate.myexample.decorator.KeyBoardDecorator;
import com.freshbin.pattern.decorate.myexample.decorator.MouseDecorator;
import com.freshbin.pattern.decorate.myexample.decorator.StickDecorator;

/**
 * 装饰者模式
 * @author freshbin
 * @date 2019-1-3 17:18:45
 */
public class DecorateMain {
	
	public static void main(String[] args) {
		
		System.out.print("freshbin用");
		GameComponent gameComponent = new LOLComponent();
		Decorator mouse = new MouseDecorator();
		Decorator keyBoard = new KeyBoardDecorator();
		
		mouse.setGameComponent(gameComponent);
		keyBoard.setGameComponent(mouse);
		keyBoard.playGame();
		
		System.out.println();
		System.out.println("=====================");
		
		System.out.print("小明用");
		Decorator stick = new StickDecorator();
		gameComponent = new NibaComponent();
		stick.setGameComponent(gameComponent);
		stick.playGame();
		
		System.out.println();
		System.out.println("=======================");
		
		System.out.print("后来，小明发现了新大陆，开始用");
		gameComponent = new WangzheComponent();
		Decorator handler = new HandleDecorator();
		handler.setGameComponent(gameComponent);
		handler.playGame();
		
		System.out.println();
		System.out.println("=======================");
		
		System.out.print("freshbin看着觉得很好玩，也跟着用");
		handler.playGame();
	}
	
}
