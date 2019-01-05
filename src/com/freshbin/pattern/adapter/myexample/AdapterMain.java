package com.freshbin.pattern.adapter.myexample;

import com.freshbin.pattern.adapter.myexample.adaptee.GloryOfKingGame;
import com.freshbin.pattern.adapter.myexample.adapter.DotaGameAdapter;
import com.freshbin.pattern.adapter.myexample.adapter.GloryOfKingGameAdapter;
import com.freshbin.pattern.adapter.myexample.target.LOLGame;
import com.freshbin.pattern.adapter.myexample.target.LOLGameInterface;

/**
 * 适配器模式
 * 
 * @author freshbin
 * @date 2019-1-5 20:08:01
 */
public class AdapterMain {
	public static void main(String[] args) {
		GloryOfKingGame gofGame = new GloryOfKingGame();
		LOLGame game = new GloryOfKingGameAdapter(gofGame);
		game.winGame();

		LOLGameInterface game2 = new DotaGameAdapter();
		game2.winGame();
	}
}
