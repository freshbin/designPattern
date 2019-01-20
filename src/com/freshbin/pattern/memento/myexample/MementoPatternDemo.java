package com.freshbin.pattern.memento.myexample;

import com.freshbin.pattern.memento.myexample.carertaker.Caretaker;
import com.freshbin.pattern.memento.myexample.carertaker.ConcreteCaretakerA;
import com.freshbin.pattern.memento.myexample.originator.Originator;
import com.freshbin.pattern.memento.myexample.originator.OriginatorA;

/**
 * 备忘录模式
 * 
 * @author freshbin
 * @date 2019年1月20日 上午11:13:36
 */
public class MementoPatternDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Caretaker caretaker = new ConcreteCaretakerA();
		Originator originatorA = new OriginatorA("1", 1);
		// 存档
		caretaker.saveMementor(originatorA.getId(), originatorA.createMemento());
		// 升级
		originatorA.setLevel(2);
		System.out.println("当前等级：" + originatorA.getLevel());

		//读取存档
		originatorA = originatorA.restoreMemento(caretaker.getMementorMap().get(originatorA.getId()));
		System.out.println("读取存档后的等级：" + originatorA.getLevel());
		
		//再升级
		originatorA.setLevel(3);
		System.out.println("当前等级：" + originatorA.getLevel());
		//读取存档
		originatorA = originatorA.restoreMemento(caretaker.getMementorMap().get(originatorA.getId()));
		System.out.println("读取存档后的等级：" + originatorA.getLevel());
	}
}
