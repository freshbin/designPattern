package com.freshbin.pattern.adapter.myexample.adapter;

import com.freshbin.pattern.adapter.myexample.adaptee.GloryOfKingGame;
import com.freshbin.pattern.adapter.myexample.target.LOLGame;

/**
 * 王者荣耀游戏适配器
 * 
 * @author freshbin
 * @date 2019-1-5 20:15:08
 */
public class GloryOfKingGameAdapter extends LOLGame {
	private GloryOfKingGame gameAdaptee;

	public GloryOfKingGameAdapter(GloryOfKingGame gameAdaptee) {
		this.gameAdaptee = gameAdaptee;
	}

	public void winGame() {
		gameAdaptee.winGame();
	}
}
