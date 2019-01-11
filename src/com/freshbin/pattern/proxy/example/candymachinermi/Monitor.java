package com.freshbin.pattern.proxy.example.candymachinermi;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class Monitor {

	private ArrayList<CandyMachineRemote> candyMachinelst;

	public Monitor() {
		candyMachinelst = new ArrayList<CandyMachineRemote>();
	}

	public void addMachine(CandyMachineRemote mCandyMachine) {
		candyMachinelst.add(mCandyMachine);
	}

	public void report() {
		CandyMachineRemote mCandyMachine;
		for (int i = 0, len = candyMachinelst.size(); i < len; i++) {
			mCandyMachine = candyMachinelst.get(i);
			try {
				System.out.println("Machine Loc:" + mCandyMachine.getLocation());

				System.out.println("Machine Candy count:" + mCandyMachine.getCount());
				System.out.println("Machine State:" + mCandyMachine.getState().getstatename());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
