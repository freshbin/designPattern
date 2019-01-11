package com.freshbin.pattern.proxy.myexample.group;

import java.lang.reflect.Proxy;

/**
 * GroupService.java
 * 
 * @author freshbin
 * @date 2019年1月11日 下午8:01:38
 */
public class GroupService {
	public GroupService() {
		Group groupManager = getGroupManager(new GroupOwner());
		groupManager.putAllMembersToBlackHouse("群管理");
		groupManager.deleteGroup();
		
		System.out.println("===============");
		Group groupOwner = new GroupOwner();
		groupOwner.putAllMembersToBlackHouse("群主");
		groupOwner.deleteGroup();
	}
	
	private Group getGroupManager(Group group) {
		return (Group) Proxy.newProxyInstance(group.getClass().getClassLoader(), 
				group.getClass().getInterfaces(), new GroupManager(group));
	}
}
