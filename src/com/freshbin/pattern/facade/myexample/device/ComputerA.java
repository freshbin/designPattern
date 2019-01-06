package com.freshbin.pattern.facade.myexample.device;

import com.freshbin.pattern.facade.myexample.hardware.CPU;
import com.freshbin.pattern.facade.myexample.hardware.HardDisk;
import com.freshbin.pattern.facade.myexample.hardware.Memory;

/**
 * 电脑
 * 
 * @author freshbin
 * @date 2019-1-6 11:02:37
 */
public class ComputerA implements DeviceBase {

	private CPU cpu;
	private Memory memory;
	private HardDisk hardDisk;

	public ComputerA() {
		cpu = new CPU();
		memory = new Memory();
		hardDisk = new HardDisk();
	}

	@Override
	public void open() {
		cpu.open();
		memory.open();
		hardDisk.open();

		System.out.println("电脑A已经开机完毕!");
	}

	@Override
	public void close() {
		hardDisk.close();
		memory.close();
		cpu.close();

		System.out.println("电脑A已经关机完毕!");
	}

}
