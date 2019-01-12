package com.freshbin.pattern.proxy.myexample.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 本地指挥官接口
 * 
 * @author freshbin
 * @date 2019年1月12日 上午10:18:58
 */
public interface Commander extends Remote {
	Integer getMoney() throws RemoteException;
	String addTenMoney() throws RemoteException;
}
