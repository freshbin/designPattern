package com.freshbin.pattern.template.game;

/**
 * 游戏抽象类
 * 
 * @author freshbin
 * @date 2019-1-7 19:58:37
 */
public abstract class Game {
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
	
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
}
