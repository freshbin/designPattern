package com.freshbin.pattern.factory.myexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.freshbin.pattern.factory.myexample.producer.GameFactoryProducer;

/**
 * 工厂模式
 * 
 * @author freshbin
 * @date 2019-1-4 11:51:42
 */
public class FactoryMain {
	public static void main(String[] args) {
		do {
			System.out.println("=========游戏选择开始界面=============");
			GameFactoryProducer.displayGameFactory();
			Integer chooseFactory = chooseGameFactory();
			if (chooseFactory == 0) {
				break;
			}
			GameFactoryProducer gameFactoryProducer = new GameFactoryProducer(chooseFactory);
		} while (true);
		System.out.println("您走好，欢迎下次继续玩!");
	}

	private static Integer chooseGameFactory() {
		Integer choose = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String chooseStr = bf.readLine();
			choose = Integer.valueOf(chooseStr);
		} catch (IOException e) {
			System.out.println("系统系统，请稍后再试!");
			e.printStackTrace();
		}

		return choose;
	}
}
