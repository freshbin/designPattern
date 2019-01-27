package com.freshbin.pattern.visitor.myexample;

import com.freshbin.pattern.visitor.myexample.element.Man;
import com.freshbin.pattern.visitor.myexample.element.Person;
import com.freshbin.pattern.visitor.myexample.element.Woman;
import com.freshbin.pattern.visitor.myexample.visitor.LoseGame;
import com.freshbin.pattern.visitor.myexample.visitor.StateInterface;
import com.freshbin.pattern.visitor.myexample.visitor.WinGame;

/**
 * 访问者模式
 * 
 * @author freshbin
 * @date 2019年1月27日 下午4:18:27
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {
		Person man = new Man();
		Person woman = new Woman();
		
		StateInterface winGame = new WinGame();
		StateInterface loseGame = new LoseGame();
		
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.addElement(man);
		objectStructure.addElement(woman);
		
		objectStructure.display(winGame);
		
		System.out.println("=======================================");
		
		objectStructure.display(loseGame);
	}
}