package com.freshbin.pattern.state.example.state;

public interface State {
	public void insertCoin();

	public void returnCoin();

	public void turnCrank();

	public void dispense();

	public void printstate();
}
