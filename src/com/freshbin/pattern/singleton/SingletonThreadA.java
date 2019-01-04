package com.freshbin.pattern.singleton;

/**
 * 多线程调用单例
 * @author freshbin
 * @date 2019-1-3 19:55:45
 */
public class SingletonThreadA extends Thread {
	
	@Override
	public void run() {
		System.out.println("======线程A===双重加锁==========");
		for(int i = 0; i < 10; i++) {
			Singleton singleton = Singleton.getSingleton("A");
		}
		
		System.out.println("=====线程A====饿汉式==========");
		
		for(int i = 0; i < 10; i++) {
			SingletonHunger singleton = SingletonHunger.getSingleton("A" + i);
			singleton.showMsg();
		}
	}
}
