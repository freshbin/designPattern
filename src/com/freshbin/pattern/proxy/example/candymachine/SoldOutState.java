package com.freshbin.pattern.proxy.example.candymachine;

public class SoldOutState implements State {

	private transient CandyMachine mCandyMachine;

	public SoldOutState(CandyMachine mCandyMachine) {
		this.mCandyMachine = mCandyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert coin,the machine sold out!");

	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't return,you haven't inserted a coin yet!");

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned,but there are no candies!");

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***SoldOutState***");

	}

	@Override
	public String getstatename() {
		// TODO Auto-generated method stub
		return "SoldOutState";
	}
}
