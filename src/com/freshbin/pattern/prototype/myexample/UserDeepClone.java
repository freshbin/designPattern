package com.freshbin.pattern.prototype.myexample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 原型类深拷贝
 * 
 * @author freshbin
 * @date 2019年1月20日 下午3:22:58
 */
public class UserDeepClone implements Serializable, Cloneable {
	private String name;
	
	private LinkedList<String> hobbys; 
	
	public UserDeepClone(String name) {
		this.name = name;
		hobbys = new LinkedList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected UserDeepClone clone() throws CloneNotSupportedException {
		UserDeepClone user = (UserDeepClone) super.clone();
		hobbys = (LinkedList<String>) this.hobbys.clone();
		return user;
	}
	
	public void addAddr(String hobby) {
		hobbys.add(hobby);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", hobbys=" + hobbys + "]";
	}
	
}
