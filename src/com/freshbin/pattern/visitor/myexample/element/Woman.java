package com.freshbin.pattern.visitor.myexample.element;

import com.freshbin.pattern.visitor.myexample.visitor.StateInterface;

/**
 * 女人类
 * 
 * @author freshbin
 * @date 2019年1月27日 下午4:06:34
 */
public class Woman extends Person {

	public Woman() {
		super("女人");
	}

	@Override
	public void accept(StateInterface stateInterface) {
		stateInterface.visitPerson(this);
	}
	
}
