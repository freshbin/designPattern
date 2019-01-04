package com.freshbin.pattern.factory.myexample.gametype;

/**
 * LOL游戏
 * @author freshbin
 * @date 2019-1-4 12:05:02
 */
public class LOLGame implements Game {

	@Override
	public void playGame() {
		System.out.println("play LOL!");
	}

	@Override
	public String display() {
		return "LOL";
	}
}
