package com.freshbin.pattern.facade.myexample.hardware;

/**
 * 硬盘
 * 
 * @author freshbin
 * @date 2019-1-6 10:58:57
 */
public class HardDisk implements HardwareBase {

	@Override
	public void open() {
		System.out.println("打开硬盘!");
	}

	@Override
	public void close() {
		System.out.println("关闭硬盘!");
	}

}
