package com.freshbin.pattern.singleton;

/**
 * 单例模式主类
 * @author freshbin
 * @date 2019-1-3 19:51:45
 */
public class SingletonMain {
	public static void main(String[] args) {
		Thread aThread = new Thread(new SingletonThreadA());
		Thread bThread = new Thread(new SingletonThreadB());
		aThread.start();
		bThread.start();
	}
}
