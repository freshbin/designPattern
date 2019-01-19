package com.freshbin.pattern.interpreter.myexample;

/**
 * 解释器模式
 * 
 * @author freshbin
 * @date 2019年1月19日 下午3:29:01
 */
public class InterpreterPatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		ExpressionInterface expressionA = new ExpressionA();
		ExpressionInterface expressionB = new ExpressionB();
		expressionA.interpret(context);
		expressionB.interpret(context);
	}
}
