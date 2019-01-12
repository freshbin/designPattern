package com.freshbin.pattern.proxy.myexample.rmi.server;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import com.freshbin.pattern.proxy.myexample.rmi.client.Commander;

/**
 * 前方指挥官类
 * 
 * @author freshbin
 * @date 2019年1月12日 上午10:10:57
 */
public class FrontCommander extends UnicastRemoteObject implements Commander {
	private Integer money;
	
	public FrontCommander() throws RemoteException {
		super();
		money = 100;
	}
	
	public Integer getMoney() {
		return money;
	}
	
	public String addTenMoney() {
		money += 10;
		String returnStr = "成功添加十万元军款!";
		return returnStr;
	}
	
	public static void main(String[] args) {
		try {
			Commander commander = new FrontCommander();
			LocateRegistry.createRegistry(6666);
			Naming.rebind("rmi://127.0.0.1:6666/RemoteCommander", commander);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		
		
	}
}
