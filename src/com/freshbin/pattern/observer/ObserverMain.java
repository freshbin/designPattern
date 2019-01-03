package com.freshbin.pattern.observer;

import com.freshbin.pattern.observer.observer.FirstObserver;
import com.freshbin.pattern.observer.observer.SecondObserver;
import com.freshbin.pattern.observer.subject.Subjecter;

/**
 * 观察者模式
 * @author freshbin
 * @date 2019-1-3 10:12:48
 */
public class ObserverMain {
	public static void main(String[] args) {
		Subjecter subjecter = new Subjecter();
		subjecter.addObserver(new FirstObserver());
		subjecter.addObserver(new SecondObserver());
		
		subjecter.groupAdminIsComing(true);
		System.out.println("========================");
		subjecter.groupAdminIsComing(false);
	}
}
