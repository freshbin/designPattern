package com.freshbin.pattern.strategy;

import com.freshbin.pattern.strategy.person.Freshbin;
import com.freshbin.pattern.strategy.person.Person;
import com.freshbin.pattern.strategy.person.RindMing;
import com.freshbin.pattern.strategy.play.KillAllEnemy;
import com.freshbin.pattern.strategy.work.WritePerfectCode;

public class FirstExample {
	public static void main(String[] args) {
		Person freshbin = new Freshbin();
		Person rindMing = new RindMing();
		
		freshbin.display("I'm freshbin!");
		freshbin.workContext();
		freshbin.gameExperience();
		
		System.out.println("===============");
		
		rindMing.display("我是瓜皮小明!");
		rindMing.workContext();
		rindMing.gameExperience();
		System.out.println("不行，我要改变，我要向小彬学习，奋发图强，每天五点半起床!good good study!");
		System.out.println("N月之后~~~~");
		rindMing.setPlayGame(new KillAllEnemy());
		rindMing.setWork(new WritePerfectCode());
		rindMing.display("我是大神小明，我改变了!");
		rindMing.workContext();
		rindMing.gameExperience();
	}
}
