package com.freshbin.pattern.composite.myexample;

import java.util.Iterator;
import java.util.Stack;

/**
 * 迭代器
 * 
 * @author freshbin
 * @date 2019-1-8 19:47:39
 */
public class CompositeIterator implements Iterator {

	private Stack<Iterator> stack = new Stack<>();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}
		Iterator iterator = stack.peek();
		if(!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		if(hasNext()) {
			Iterator iterator = stack.peek();
			Family family = (Family)iterator.next();
			stack.push(family.getIterator());
			return family;
		}
		return null;
	}

}
