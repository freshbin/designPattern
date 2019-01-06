package com.freshbin.pattern.facade.myexample;

import com.freshbin.pattern.facade.myexample.device.ComputerA;
import com.freshbin.pattern.facade.myexample.device.DeviceBase;

/**
 * 外观模式
 * 
 * @author freshbin
 * @date 2019-1-6 10:51:54
 */
public class FacadeMain {
	public static void main(String[] args) {
		DeviceBase deviceBase = new ComputerA();
		deviceBase.open();

		System.out.println("======================");

		deviceBase.close();
	}
}
