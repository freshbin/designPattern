package com.freshbin.pattern.visitor.myexample.visitor;

import com.freshbin.pattern.visitor.myexample.element.Person;

/**
 * LoseGame
 * 
 * @author freshbin
 * @date 2019年1月27日 下午4:13:15
 */
public class LoseGame implements StateInterface {

	@Override
	public void visitPerson(Person person) {
		switch (person.getType()) {
		case "男人":
			System.out.println("打游戏时输了:" + person.getType() + "会淡定!");
			break;
			
		case "女人":
			System.out.println("打游戏时输了:" + person.getType() + "会伤心!");
			break;

		default:
			break;
		}
	}
}
