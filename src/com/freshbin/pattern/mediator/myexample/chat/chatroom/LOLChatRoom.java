package com.freshbin.pattern.mediator.myexample.chat.chatroom;

import com.freshbin.pattern.mediator.myexample.chat.person.User;

/**
 * LOL聊天室
 * 
 * @author freshbin
 * @date 2019年1月19日 下午8:12:09
 */
public class LOLChatRoom implements ChatRoom {

	@Override
	public void showMsg(User user) {
		System.out.println(user.getName() + ":" + user.getMessage());
	}

}
