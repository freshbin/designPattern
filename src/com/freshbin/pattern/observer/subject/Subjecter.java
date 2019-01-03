package com.freshbin.pattern.observer.subject;

import java.util.Observable;

/**
 * 发布者
 * @author freshbin
 * @date 2019-1-3 11:51:12
 */
public class Subjecter extends Observable {
	public void groupAdminIsComing(Boolean flag) {
//		System.out.println("进入groupAdminIsComing");
		if(flag) {
			System.out.println("群管理来了，大家注意言辞!");
		} else {
			System.out.println("群管理走了，大家随便浪!");
		}
		this.setChanged();
		this.notifyObservers(flag);
		
//		System.out.println("退出groupAdminIsComing");
	}
}
