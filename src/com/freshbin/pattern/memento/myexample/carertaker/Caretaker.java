package com.freshbin.pattern.memento.myexample.carertaker;

import java.util.HashMap;
import java.util.Map;

import com.freshbin.pattern.memento.myexample.memento.Memento;

/**
 * 管理者接口
 * 
 * @author freshbin
 * @date 2019年1月20日 上午11:23:02
 */
public abstract class Caretaker {
	public Map<String, Memento> mementorMap;
	
	public Caretaker() {
		this.mementorMap = new HashMap<>(16);
	}
	
	public void saveMementor(String id, Memento mementor) {
		mementorMap.put(id, mementor);
	}
	
	public Memento retrieveMemento(String id) {
		return mementorMap.get(id);
	}

	public Map<String, Memento> getMementorMap() {
		return mementorMap;
	}
	
}
