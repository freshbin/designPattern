package com.freshbin.pattern.factory.myexample.producer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.freshbin.pattern.factory.myexample.gamefactory.GameFactory;
import com.freshbin.pattern.factory.myexample.gamefactory.MobileGame;
import com.freshbin.pattern.factory.myexample.gamefactory.PCGame;
import com.freshbin.pattern.factory.myexample.gametype.Game;

/**
 * 制造游戏工厂
 * 
 * @author freshbin
 * @date 2019-1-4 12:02:19
 */
public class GameFactoryProducer {

	private GameFactory gameFactory;
	private static Map<Integer, GameFactory> gameFactoryMap = new HashMap<>();

	static {
		gameFactoryMap.put(1, new PCGame());
		gameFactoryMap.put(2, new MobileGame());
	}

	public GameFactoryProducer(Integer chooseFactory) {
		do {
			if (!gameFactoryMap.containsKey(chooseFactory)) {
				break;
			}
			gameFactory = gameFactoryMap.get(chooseFactory);
			gameFactory.displayGameList();
			Integer chooseGame = chooseGameFactory(gameFactory);
			if(chooseGame == 0) {
				break;
			}
			gameFactory.chooseGame(chooseGame);
			System.out.println("===================================");
		} while (true);
	}

	public Integer chooseGameFactory(GameFactory gameFactory) {
		Integer chooseGame = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String chooseGameStr = br.readLine();
			chooseGame = Integer.valueOf(chooseGameStr);
		} catch (IOException e) {
			System.out.println("系统异常!请稍后再试!");
			e.printStackTrace();
		}

		return chooseGame;
	}

	public static void displayGameFactory() {
		if(gameFactoryMap == null || gameFactoryMap.size() <= 0) {
			return;
		}
		
		for(Map.Entry<Integer, GameFactory> gameFactory : gameFactoryMap.entrySet()) {
			System.out.println(gameFactory.getKey() + ":" + gameFactory.getValue().display());
		}
		System.out.println("请输入序号选择您想玩的游戏类型(输入0退出)：");
	}
}
