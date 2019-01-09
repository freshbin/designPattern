package com.freshbin.pattern.state.myexample.game;

import com.freshbin.pattern.state.myexample.Room;

/**
 * 预定状态
 * 
 * @author freshbin
 * @date 2019年1月9日 下午7:59:33
 */
public class ReserveState implements RoomStateInterface {

	private Room room;
	
	public ReserveState(Room room) {
		this.room = room;
	}
	
	@Override
	public void reserveRoom() {
		System.out.println("该房间处于预定状态，请取消预定后再预定!");
	}

	@Override
	public void cancleReserveRoom() {
		room.setRoomStateInterface(room.getFreeState());
		System.out.println("取消预定成功!");
	}

	@Override
	public void checkInRoom() {
		room.setRoomStateInterface(room.getCheckInState());
		System.out.println("入住成功!");
	}

	@Override
	public void checkOutRoom() {
		System.out.println("该房间处于预定状态，请入住后再退房!");
	}

}
