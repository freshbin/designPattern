package com.freshbin.pattern.state.myexample;

import java.util.ArrayList;
import java.util.List;

/**
 * 状态模式
 * 
 * @author freshbin
 * @date 2019-1-9 20:39:58
 */
public class StatePatternDemo {
	public static void main(String[] args) {
		System.out.println("流程：预定->入住->退订->退房");
		Room room0 = new Room();
		room0.reserveRoom();
		room0.checkInRoom();
		room0.cancleReserveRoom();
		room0.checkOutRoom();
		
		System.out.println("===================");
		
		System.out.println("流程：入住->预定->退订->退房->预定-退订");
		room0.checkInRoom();
		room0.reserveRoom();
		room0.cancleReserveRoom();
		room0.checkOutRoom();
		room0.reserveRoom();
		room0.cancleReserveRoom();
	}
}
