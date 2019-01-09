package com.freshbin.pattern.state.myexample.game;


/**
 *  房间状态接口
 * 
 * @author freshbin
 * @date 2019年1月9日 下午7:26:14
 */
public interface RoomStateInterface {
	/**
	 * 预定房间
	 */
	void reserveRoom();
	
	/**
	 * 取消预定房间
	 */
	void cancleReserveRoom();
	
	/**
	 * 入住
	 */
	void checkInRoom();
	
	/**
	 * 退房
	 */
	void checkOutRoom();
}
