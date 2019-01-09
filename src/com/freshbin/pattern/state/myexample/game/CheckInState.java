package com.freshbin.pattern.state.myexample.game;

import com.freshbin.pattern.state.myexample.Room;

/**
 * 入住状态
 * 
 * @author freshbin
 * @date 2019年1月9日 下午7:59:33
 */
public class CheckInState implements RoomStateInterface {

	private Room room;
	
	public CheckInState(Room room) {
		this.room = room;
	}
	
	@Override
	public void reserveRoom() {
		System.out.println("该房间处于入住状态，请退房后再预定!");
	}

	@Override
	public void cancleReserveRoom() {
		System.out.println("该房间处于入住状态，请退房后并且预定后再取消!");
	}

	@Override
	public void checkInRoom() {
		System.out.println("该房间处于入住状态，请退房后并且预定后再入住!");
	}

	@Override
	public void checkOutRoom() {
		room.setRoomStateInterface(room.getFreeState());
		System.out.println("退房成功!");
	}

}
