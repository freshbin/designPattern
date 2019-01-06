package com.freshbin.pattern.facade.myexample.hardware;

/**
 * CPU
 * 
 * @author freshbin
 * @date 2019-1-6 10:58:57
 */
public class CPU implements HardwareBase {

	@Override
	public void open() {
		System.out.println("打开CPU!");
	}

	@Override
	public void close() {
		System.out.println("关闭CPU!");
	}

}
