package com.freshbin.pattern.visitor.myexample.visitor;

import com.freshbin.pattern.visitor.myexample.element.Person;

/**
 * WinGame
 * 
 * @author freshbin
 * @date 2019年1月27日 下午4:13:15
 */
public class WinGame implements StateInterface {

	@Override
	public void visitPerson(Person person) {
		switch (person.getType()) {
		case "男人":
			System.out.println("打游戏时赢了:" + person.getType() + "会淡定!");
			break;
			
		case "女人":
			System.out.println("打游戏时赢了:" + person.getType() + "会欣喜!");
			break;

		default:
			break;
		}
	}
}
