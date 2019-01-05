package com.freshbin.pattern.adapter.example;

import com.freshbin.pattern.adapter.example.adapter.TurkeyAdapter2;
import com.freshbin.pattern.adapter.example.duck.Duck;
import com.freshbin.pattern.adapter.example.duck.GreenHeadDuck;
import com.freshbin.pattern.adapter.example.turkey.WildTurkey;

public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck = new GreenHeadDuck();

		WildTurkey turkey = new WildTurkey();

		Duck duck2turkeyAdapter = new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();

	}
}
