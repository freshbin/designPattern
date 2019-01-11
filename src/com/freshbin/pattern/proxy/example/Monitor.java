package com.freshbin.pattern.proxy.example;

import java.rmi.RemoteException;
import java.util.ArrayList;

import com.freshbin.pattern.proxy.example.candymachine.CandyMachine;

public class Monitor {
	private ArrayList<CandyMachine> candyMachinelst;

	public Monitor() {
		candyMachinelst = new ArrayList<CandyMachine>();
	}

	public void addMachine(CandyMachine mCandyMachine) {
		candyMachinelst.add(mCandyMachine);
	}

	public void report() throws RemoteException {
		CandyMachine mCandyMachine;
		for (int i = 0, len = candyMachinelst.size(); i < len; i++) {
			mCandyMachine = candyMachinelst.get(i);
			System.out.println("Machine Loc:" + mCandyMachine.getLocation());
			System.out.println("Machine Candy count:" + mCandyMachine.getCount());
			System.out.println("Machine State:" + mCandyMachine.getState().getstatename());

		}

	}

}
