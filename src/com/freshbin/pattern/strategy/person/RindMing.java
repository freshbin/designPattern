package com.freshbin.pattern.strategy.person;

import com.freshbin.pattern.strategy.play.SuperGhost;
import com.freshbin.pattern.strategy.work.MakeUglyBug;

public class RindMing extends Person {
	
	public RindMing() {
		playGame = new SuperGhost();
		work = new MakeUglyBug();
	}

	@Override
	public void display(String displayContext) {
		// TODO Auto-generated method stub
		System.out.println(displayContext);
	}
	
}
