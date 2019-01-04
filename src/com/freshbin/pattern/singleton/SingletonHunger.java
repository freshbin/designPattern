package com.freshbin.pattern.singleton;

/**
 * 单例模式 饿汉式
 * @author freshbin
 * @date 2019-1-3 19:44:05
 */
public class SingletonHunger {
	private static SingletonHunger singleton = new SingletonHunger();
	private static String flag;
	
	private SingletonHunger() {
		
	}
	
	public static SingletonHunger getSingleton(String i) {
		flag = i;
		return singleton;
	}
	
	public void showMsg() {
		System.out.println("第" + flag + "个线程调用单例打印信息!");
	}
}
