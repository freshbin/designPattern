package com.freshbin.pattern.strategy.person;

import com.freshbin.pattern.strategy.play.PlayGame;
import com.freshbin.pattern.strategy.work.Work;

public abstract class Person {
	
	String displayContext;
	
	PlayGame playGame;
	
	Work work;
	
	public Person() {
		
	}
	
	public abstract void display(String displayContext);
	
	public void gameExperience() {
		playGame.gameExperience();
	}
	
	public void workContext() {
		work.workContext();
	}

	public void setPlayGame(PlayGame playGame) {
		this.playGame = playGame;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public void setDisplayContext(String displayContext) {
		this.displayContext = displayContext;
	}
	
}
