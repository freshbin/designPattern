package com.freshbin.pattern.strategy.person;

import com.freshbin.pattern.strategy.play.KillAllEnemy;
import com.freshbin.pattern.strategy.work.WritePerfectCode;

public class Freshbin extends Person {
	public Freshbin() {
		playGame = new KillAllEnemy();
		work = new WritePerfectCode();
	}

	@Override
	public void display(String displayContext) {
		// TODO Auto-generated method stub
		System.out.println(displayContext);
	}
	
}
