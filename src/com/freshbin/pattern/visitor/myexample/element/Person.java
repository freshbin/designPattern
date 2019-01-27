package com.freshbin.pattern.visitor.myexample.element;

import com.freshbin.pattern.visitor.myexample.visitor.StateInterface;

/**
 * Person抽象类
 * 
 * @author freshbin
 * @date 2019年1月27日 下午4:00:55
 */
public abstract class Person {
	private String type;
	
	public Person(String type) {
		this.type = type;
	}
	
	public abstract void accept(StateInterface stateInterface);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
