package com.freshbin.pattern.adapter.example.adapter;

import com.freshbin.pattern.adapter.example.duck.Duck;
import com.freshbin.pattern.adapter.example.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			turkey.fly();
		}
	}

}
