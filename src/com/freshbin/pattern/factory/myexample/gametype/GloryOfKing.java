package com.freshbin.pattern.factory.myexample.gametype;

/**
 * 王者荣耀
 * 
 * @author freshbin
 * @date 2019-1-4 12:06:03
 */
public class GloryOfKing implements Game {

	@Override
	public void playGame() {
		System.out.println("play glory of king!");
	}

	@Override
	public String display() {
		return "GloryOfKing";
	}

}
