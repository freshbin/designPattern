package com.freshbin.pattern.proxy.myexample.group;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * GroupOwner
 * 
 * @author freshbin
 * @date 2019年1月11日 下午7:42:42
 */
public class GroupManager implements InvocationHandler {

	private static final String putAllMembersToBlackHouse = "putAllMembersToBlackHouse";
	private static final String DELETE = "delete";
	
	Group group;

	public GroupManager(Group group) {
		this.group = group;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equals(putAllMembersToBlackHouse)) {
			return method.invoke(group, args);
		} else if (method.getName().startsWith(DELETE)){
			System.out.println("你没有该权限!请往群主收款账号打几百万先!");
			return new IllegalAccessException();
		}
		
		return null;
	}

}
