package com.freshbin.pattern.factory.myexample.gametype;

/**
 * 吃鸡游戏
 * @author freshbin
 * @date 2019-1-4 12:05:02
 */
public class EatChickenGame implements Game {

	@Override
	public void playGame() {
		System.out.println("play eatChicken!");
	}

	@Override
	public String display() {
		return "eatChicken";
	}
}
