package com.freshbin.pattern.interpreter.myexample;

public class ExpressionB implements ExpressionInterface {

	@Override
	public void interpret(Context context) {
		System.out.println("解释器B");
	}

}
