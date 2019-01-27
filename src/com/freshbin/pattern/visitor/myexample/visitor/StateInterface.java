package com.freshbin.pattern.visitor.myexample.visitor;

import com.freshbin.pattern.visitor.myexample.element.Person;

/**
 * 状态接口
 * 
 * @author freshbin
 * @date 2019年1月27日 下午4:08:16
 */
public interface StateInterface {
	public void visitPerson(Person person);
}
