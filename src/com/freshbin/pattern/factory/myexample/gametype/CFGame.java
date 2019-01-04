package com.freshbin.pattern.factory.myexample.gametype;

/**
 * cf游戏
 * @author freshbin
 * @date 2019-1-4 15:16:13
 */
public class CFGame implements Game {

	@Override
	public void playGame() {
		System.out.println("play cf!");
	}

	@Override
	public String display() {
		return "CF";
	}
}
