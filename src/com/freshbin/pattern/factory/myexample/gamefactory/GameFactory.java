package com.freshbin.pattern.factory.myexample.gamefactory;

import java.util.Map;

import com.freshbin.pattern.factory.myexample.gametype.Game;

/**
 * 工厂接口
 * @author freshbin
 * @date 2019-1-4 11:53:02
 */
public interface GameFactory {
	void chooseGame(Integer chooseGame);
	
	Map<Integer, Game> getGameMap();
	
	void displayGameList();
	
	String display();
	
}
