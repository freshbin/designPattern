package com.freshbin.pattern.singleton;

/**
 * 单例模式 双重加锁
 * @author freshbin
 * @date 2019-1-3 19:43:01
 */
public class Singleton {
	private volatile static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton(String threadName) {
		if(singleton == null) {
			synchronized(Singleton.class) {
				if(singleton == null) {
					System.out.println("线程" + threadName + "调用单例");
					singleton = new Singleton();
				}
			}
		}
		
		return singleton;
	}
	
	/*public void showMsg(Integer i) {
		System.out.println("第" + i + "个线程调用单例打印信息!");
	}*/
}
