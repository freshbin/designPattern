package com.freshbin.pattern.adapter.myexample.adapter;

import com.freshbin.pattern.adapter.myexample.adaptee.DotaGame;
import com.freshbin.pattern.adapter.myexample.target.LOLGameInterface;

/**
 * dota游戏适配器
 * 
 * @author freshbin
 * @date 2019-1-5 20:15:08
 */
public class DotaGameAdapter extends DotaGame implements LOLGameInterface {

	public DotaGameAdapter() {
	}

	public void winGame() {
		super.winGame();
	}
}
