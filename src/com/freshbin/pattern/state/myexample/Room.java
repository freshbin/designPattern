package com.freshbin.pattern.state.myexample;

import com.freshbin.pattern.state.myexample.game.CheckInState;
import com.freshbin.pattern.state.myexample.game.FreeState;
import com.freshbin.pattern.state.myexample.game.ReserveState;
import com.freshbin.pattern.state.myexample.game.RoomStateInterface;

/**
 * 房间管理类
 * 
 * @author freshbin
 * @date 2019年1月9日 下午8:03:23
 */
public class Room {
	private RoomStateInterface roomStateInterface;
	private FreeState freeState;
	private ReserveState reserveState;
	private CheckInState checkInState;
	
	public Room() {
		freeState = new FreeState(this);
		reserveState = new ReserveState(this);
		checkInState = new CheckInState(this);
		
		roomStateInterface = freeState;
	}

	/**
	 * 预定房间
	 */
	public void reserveRoom() {
		roomStateInterface.reserveRoom();
	}
	
	/**
	 * 取消预定房间
	 */
	public void cancleReserveRoom() {
		roomStateInterface.cancleReserveRoom();
	}

	/**
	 * 入住房间
	 */
	public void checkInRoom() {
		roomStateInterface.checkInRoom();
	}
	
	/**
	 * 退房
	 */
	public void checkOutRoom() {
		roomStateInterface.checkOutRoom();
	}
	
	public RoomStateInterface getRoomStateInterface() {
		return roomStateInterface;
	}

	public void setRoomStateInterface(RoomStateInterface roomStateInterface) {
		this.roomStateInterface = roomStateInterface;
	}

	public FreeState getFreeState() {
		return freeState;
	}

	public void setFreeState(FreeState freeState) {
		this.freeState = freeState;
	}

	public ReserveState getReserveState() {
		return reserveState;
	}

	public void setReserveState(ReserveState reserveState) {
		this.reserveState = reserveState;
	}

	public CheckInState getCheckInState() {
		return checkInState;
	}

	public void setCheckInState(CheckInState checkInState) {
		this.checkInState = checkInState;
	}
}
