package com.freshbin.pattern.adapter.example.adapter;

import com.freshbin.pattern.adapter.example.duck.Duck;
import com.freshbin.pattern.adapter.example.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		super.fly();
		super.fly();
	}
}
