package com.freshbin.pattern.template.game;

/**
 * 游戏类
 * 
 * @author freshbin
 * @date 2019-1-7 19:58:37
 */
public class GloryOfKingGame extends Game{
	public void initialize() {
		System.out.println("GloryOfKingGame 进入游戏!");
	}
	
	public void startPlay() {
		System.out.println("路上的抢野，打野的抢兵，辅助负责送人头!");
	}
	
	public void endPlay() {
		System.out.println("五人躺泉水喷队友，乞求对面快点推!");
	}
}
