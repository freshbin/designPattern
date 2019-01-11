package com.freshbin.pattern.proxy.example.candymachinermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.freshbin.pattern.proxy.example.candymachine.State;

public interface CandyMachineRemote extends Remote{
	public String  getLocation() throws RemoteException;
	public int getCount() throws RemoteException;
	public State getState() throws RemoteException;
}
