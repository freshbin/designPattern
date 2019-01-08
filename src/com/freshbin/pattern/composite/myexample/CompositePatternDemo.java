package com.freshbin.pattern.composite.myexample;

import java.util.Iterator;

/**
 * 组合模式
 * 
 * @author freshbin
 * @date 2019-1-8 19:28:15
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
		Family grandPa = new Family( "爷爷");
		Family father = new Family( "爸爸");
		Family father2 = new Family( "爸爸二");
		Family grandSon = new Family( "孙子");
		
		father.addFamily(grandSon);
		grandPa.addFamily(father2);
		grandPa.addFamily(father);
		
		display(grandPa);
		
		System.out.println("==============");
		
		grandPa.removeFamily(father2);
		display(grandPa);
		
		System.out.println("==============");
		display(father);
	}
	
	public static void display(Family family) {
		System.out.println(family.getIdentify());
		Iterator<Family> families = family.getIterator();
		while (families.hasNext()) {
			Family familyDis = families.next();
			System.out.println(familyDis.getIdentify());
		}
	}
}
