package com.freshbin.pattern.proxy.myexample.group;

/**
 * GroupOwner
 * 
 * @author freshbin
 * @date 2019年1月11日 下午7:42:42
 */
public class GroupOwner implements Group {

	@Override
	public void putAllMembersToBlackHouse(String user) {
		System.out.println(user + "将所有群成员关到小黑屋里!");
	}

	@Override
	public void deleteGroup() {
		System.out.println("解散群!");
	}

}
