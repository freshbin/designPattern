package com.freshbin.pattern.prototype.myexample;

/**
 * 原型模式
 * 
 * @author freshbin
 * @date 2019年1月20日 下午3:23:07
 */
public class PrototypePatternDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("=========浅拷贝========");
		User user = new User("one");
		user.addAddr("打游戏");
		
		System.out.println(user);
		
		User user2 = user.clone();
		user.addAddr("看书");
		System.out.println("================");
		System.out.println(user);
		System.out.println(user2);
		
		System.out.println("======深拷贝========");
		UserDeepClone userDeepClone = new UserDeepClone("one");
		userDeepClone.addAddr("打游戏");
		
		System.out.println(userDeepClone);
		
		UserDeepClone user2DeepClone = userDeepClone.clone();
		userDeepClone.addAddr("看书");
		System.out.println("================");
		System.out.println(userDeepClone);
		System.out.println(user2DeepClone);
	}
}
