package com.freshbin.pattern.mediator.myexample;

import com.freshbin.pattern.mediator.myexample.chat.chatroom.ChatRoom;
import com.freshbin.pattern.mediator.myexample.chat.chatroom.LOLChatRoom;
import com.freshbin.pattern.mediator.myexample.chat.person.NormalUser;
import com.freshbin.pattern.mediator.myexample.chat.person.User;

/**
 * 中介者模式
 * 
 * @author freshbin
 * @date 2019年1月19日 下午8:03:34
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		ChatRoom chatRoom = new LOLChatRoom();
		User user01 = new NormalUser(chatRoom, "普通玩家一");
		user01.sendMsg("我后羿贼强!");
		
		User user02 = new NormalUser(chatRoom, "普通玩家二");
		user02.sendMsg("我喷队友贼快!");
	}
}
