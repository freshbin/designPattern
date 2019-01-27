package com.freshbin.pattern.visitor.myexample;

import java.util.LinkedList;

import com.freshbin.pattern.visitor.myexample.element.Person;
import com.freshbin.pattern.visitor.myexample.visitor.StateInterface;

public class ObjectStructure {
	private LinkedList<Person> element = new LinkedList<>();
	
	public void addElement(Person person) {
		element.add(person);
	}
	
	public void display(StateInterface stateInterface) {
		element.parallelStream().forEach((person) -> {
			person.accept(stateInterface);
		});
	}
}
