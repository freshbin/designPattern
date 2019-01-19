package com.freshbin.pattern.mediator.myexample.chat.chatroom;

import com.freshbin.pattern.mediator.myexample.chat.person.User;

/**
 * 聊天室接口
 * 
 * @author freshbin
 * @date 2019年1月19日 下午8:05:04
 */
public interface ChatRoom {
	public void showMsg(User user);
}
