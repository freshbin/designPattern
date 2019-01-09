package com.freshbin.pattern.state.myexample.game;

import com.freshbin.pattern.state.myexample.Room;

/**
 * 空闲状态
 * 
 * @author freshbin
 * @date 2019年1月9日 下午7:59:33
 */
public class FreeState implements RoomStateInterface {

	private Room room;
	
	public FreeState(Room room) {
		this.room = room;
	}
	
	@Override
	public void reserveRoom() {
		room.setRoomStateInterface(room.getReserveState());
		System.out.println("预定房间成功!");
	}

	@Override
	public void cancleReserveRoom() {
		System.out.println("该房间暂时空闲，请预定后再取消退订!");
	}

	@Override
	public void checkInRoom() {
		room.setRoomStateInterface(room.getCheckInState());
		System.out.println("入住成功!");
	}

	@Override
	public void checkOutRoom() {
		System.out.println("该房间暂时空闲，请预定并且入住后再退房!");		
	}

}
