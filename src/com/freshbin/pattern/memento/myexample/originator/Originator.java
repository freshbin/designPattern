package com.freshbin.pattern.memento.myexample.originator;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.freshbin.pattern.memento.myexample.memento.Memento;

/**
 * 发起人接口
 * 
 * @author freshbin
 * @date 2019年1月20日 上午11:21:43
 */
public abstract class Originator implements Serializable, Cloneable{
	protected String id;
	protected Integer level;

	public Originator(String id, Integer level) {
		this.id = id;
		this.level = level;
	}

	public Memento createMemento() throws CloneNotSupportedException {
		return new MemetoInner(this);
	}

	public Originator restoreMemento(Memento memento) throws CloneNotSupportedException {
		Originator originator = ((MemetoInner) memento).restoreMemento();
		return (Originator)originator.clone();
	}
	
	private class MemetoInner implements Memento {
		private Originator originator;

		public MemetoInner(Originator originator) throws CloneNotSupportedException {
			this.originator = (Originator) originator.clone();
		}
		
		public Originator restoreMemento() {
			return originator;
		}
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
