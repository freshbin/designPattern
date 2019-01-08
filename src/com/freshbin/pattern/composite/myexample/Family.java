package com.freshbin.pattern.composite.myexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 需要组合的对象
 * 
 * @author freshbin
 * @date 2019-1-8 19:47:15
 */
public class Family {
	private String identify;
	private List<Family> families;
	
	public Family(String identify) {
		this.identify = identify;
		families = new ArrayList<>();
	}
	
	public void addFamily(Family family) {
		families.add(family);
	}
	
	public void removeFamily(Family family) {
		families.remove(family);
	}
	
	public Iterator<Family> getIterator() {
		return new CompositeIterator(families.iterator());
	}
	
	public String getIdentify() {
		return this.identify;
	}
}
