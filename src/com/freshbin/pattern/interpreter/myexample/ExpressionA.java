package com.freshbin.pattern.interpreter.myexample;

public class ExpressionA implements ExpressionInterface {

	@Override
	public void interpret(Context context) {
		System.out.println("解释器A");
	}

}
