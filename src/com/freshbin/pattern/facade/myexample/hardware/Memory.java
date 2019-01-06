package com.freshbin.pattern.facade.myexample.hardware;

/**
 * 内存
 * 
 * @author freshbin
 * @date 2019-1-6 10:58:57
 */
public class Memory implements HardwareBase {

	@Override
	public void open() {
		System.out.println("打开内存!");
	}

	@Override
	public void close() {
		System.out.println("关闭内存!");
	}

}
