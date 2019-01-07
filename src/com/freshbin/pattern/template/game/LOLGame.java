package com.freshbin.pattern.template.game;

/**
 * LOL游戏类
 * 
 * @author freshbin
 * @date 2019-1-7 19:58:37
 */
public class LOLGame extends Game{
	public void initialize() {
		System.out.println("LoLGame 进入游戏!");
	}
	
	public void startPlay() {
		System.out.println("各自分路愉快游戏!");
	}
	
	public void endPlay() {
		System.out.println("五人抱团推爆地方水晶获得胜利!");
	}
}
