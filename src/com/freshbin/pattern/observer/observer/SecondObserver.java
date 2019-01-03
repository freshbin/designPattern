package com.freshbin.pattern.observer.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 第二个观察者
 * @author freshbin
 * @date 2019-1-3 12:14:33
 */
public class SecondObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
//		System.out.println("进入观察者update");
		
		Boolean flag = (Boolean)arg;
		
		if(flag) {
			pretend();
		} else {
			normalState();
		}
		
//		System.out.println("退出观察者update");
	}
	
	public void pretend() {
		System.out.println("小明完全不在意群管理来没来，继续扯淡!");
	}
	
	public void normalState() {
		System.out.println("小明心灰意冷，不再说话!");
	}

}
