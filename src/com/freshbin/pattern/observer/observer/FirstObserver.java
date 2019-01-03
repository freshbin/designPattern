package com.freshbin.pattern.observer.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 第一个观察者
 * @author freshbin
 * @date 2019-1-3 11:46:26
 */
public class FirstObserver implements Observer {

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
		System.out.println("freshbin撤回历史消息，并且不再说话!");
	}
	
	public void normalState() {
		System.out.println("freshbin话语滔滔不绝，如江河决堤!");
	}

}
