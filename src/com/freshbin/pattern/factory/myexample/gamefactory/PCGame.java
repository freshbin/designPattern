package com.freshbin.pattern.factory.myexample.gamefactory;

import java.util.HashMap;
import java.util.Map;

import com.freshbin.pattern.factory.myexample.gametype.Game;
import com.freshbin.pattern.factory.myexample.gametype.GloryOfKing;
import com.freshbin.pattern.factory.myexample.gametype.LOLGame;

/**
 * PC游戏
 * 
 * @author freshbin
 * @date 2019-1-4 11:53:32
 */
public class PCGame implements GameFactory {
	private static Map<Integer, Game> gameMap = new HashMap<>();

	static {
		gameMap.put(1, new LOLGame());
		gameMap.put(2, new GloryOfKing());
	}

	@Override
	public void chooseGame(Integer chooseGame) {
		if (!gameMap.containsKey(chooseGame)) {
			return;
		}

		gameMap.get(chooseGame).playGame();
	}

	@Override
	public Map<Integer, Game> getGameMap() {
		return gameMap;
	}

	@Override
	public void displayGameList() {
		if(gameMap == null || gameMap.size() <= 0) {
			return;
		}
		
		for(Map.Entry<Integer, Game> map : gameMap.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue().display());
		}
		
		System.out.println("请输入序号选择您想玩的游戏(输入0退出)：");
	}

	@Override
	public String display() {
		return "PC game";
	}
}
