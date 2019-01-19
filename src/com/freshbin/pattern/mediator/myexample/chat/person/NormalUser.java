package com.freshbin.pattern.mediator.myexample.chat.person;

import com.freshbin.pattern.mediator.myexample.chat.chatroom.ChatRoom;

/**
 * 普通用户
 * 
 * @author freshbin
 * @date 2019年1月19日 下午8:09:58
 */
public class NormalUser extends User {

	public NormalUser(ChatRoom chatRoom, String name) {
		super(chatRoom, name);
	}

}
