package com.freshbin.pattern.visitor.myexample.element;

import com.freshbin.pattern.visitor.myexample.visitor.StateInterface;

/**
 * 男人类
 * 
 * @author freshbin
 * @date 2019年1月27日 下午4:06:34
 */
public class Man extends Person {

	public Man() {
		super("男人");
	}

	@Override
	public void accept(StateInterface stateInterface) {
		stateInterface.visitPerson(this);
	}
	
}
