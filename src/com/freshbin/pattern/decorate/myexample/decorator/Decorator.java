package com.freshbin.pattern.decorate.myexample.decorator;

import com.freshbin.pattern.decorate.myexample.component.GameComponent;

/**
 * 装饰者类
 * @author freshbin
 * @date 2019-1-3 17:35:09
 */
public abstract class Decorator extends GameComponent {
	protected GameComponent gameComponent;
	
	public void setGameComponent(GameComponent gameComponent) {
		this.gameComponent = gameComponent;
	}
	
	@Override
	public void playGame() {
		if(gameComponent != null) {
			gameComponent.playGame();
		}
	}
}
