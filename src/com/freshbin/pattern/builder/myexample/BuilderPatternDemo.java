package com.freshbin.pattern.builder.myexample;

import com.freshbin.pattern.builder.myexample.person.FatPersonBuilder;
import com.freshbin.pattern.builder.myexample.person.PersonBuilder;
import com.freshbin.pattern.builder.myexample.person.PersonDirector;
import com.freshbin.pattern.builder.myexample.person.ThinPersonBuilder;

/**
 * 建造者模式
 * 
 * @author freshbin
 * @date 2019年1月13日 上午10:53:06
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		int width = 480;
		int hight = 720;
		PersonBuilder thinPersonBuilder = new ThinPersonBuilder();
		PersonDirector personDirector = new PersonDirector(thinPersonBuilder, width, hight);

		PersonBuilder fatPersonBuilder = new FatPersonBuilder();
		personDirector = new PersonDirector(fatPersonBuilder, width, hight);
	}
}
