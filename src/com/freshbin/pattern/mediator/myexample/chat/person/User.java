package com.freshbin.pattern.mediator.myexample.chat.person;

import com.freshbin.pattern.mediator.myexample.chat.chatroom.ChatRoom;

/**
 * 用户抽象类
 * 
 * @author freshbin
 * @date 2019年1月19日 下午8:07:07
 */
public abstract class User {
	private String name;
	private String message;

	protected ChatRoom chatRoom;
	
	public User(ChatRoom chatRoom, String name) {
		this.name = name;
		this.chatRoom = chatRoom;
	}
	
	public void sendMsg(String msg) {
		this.setMessage(msg);
		chatRoom.showMsg(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
