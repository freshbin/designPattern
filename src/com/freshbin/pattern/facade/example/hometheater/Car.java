package com.freshbin.pattern.facade.example.hometheater;

/**
 * 最小知识原则：
 * 能够调用自身对象 比如engine对象
 * 作为参数传进来的对象可以使用 比如下面方法的mKey
 * 此方法创建和实例化的对象 比如doors对象
 * 对象的组件
 * 不能使用方法的返回值对象
 * @author freshbin
 * @date 2019-1-6 10:39:34
 */
public class Car {
	/*Engine engine;

	public Car() {
		// 初始化发动机
	}

	public void start(Key mKey) {
		Doors doors = new Doors();
		boolean authorized = mKey.turns();
		if (authorized) {
			engine.start();
			doors.lock();
		}
	}*/

}