package com.freshbin.pattern.factory.myexample.gamefactory;

import java.util.HashMap;
import java.util.Map;

import com.freshbin.pattern.factory.myexample.gametype.EatChickenGame;
import com.freshbin.pattern.factory.myexample.gametype.Game;
import com.freshbin.pattern.factory.myexample.gametype.GloryOfKing;
import com.freshbin.pattern.factory.myexample.gametype.LOLGame;

/**
 * 移动端游戏
 * 
 * @author freshbin
 * @date 2019-1-4 15:13:09
 */
public class MobileGame implements GameFactory {
	private static Map<Integer, Game> gameMap = new HashMap<>();

	static {
		gameMap.put(1, new GloryOfKing());
		gameMap.put(2, new EatChickenGame());
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
		return "mobile game";
	}
}
