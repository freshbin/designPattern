package com.freshbin.pattern.singleton;

/**
 * 多线程调用单例
 * @author freshbin
 * @date 2019-1-3 19:55:45
 */
public class SingletonThreadB extends Thread {
	
	@Override
	public void run() {
		System.out.println("======线程B===双重加锁==========");
		for(int i = 0; i < 10; i++) {
			Singleton singleton = Singleton.getSingleton("B");
		}
		
		System.out.println("=====线程B====饿汉式==========");
		
		for(int i = 0; i < 10; i++) {
			SingletonHunger singleton = SingletonHunger.getSingleton("B" + i);
			singleton.showMsg();
		}
	}
}
