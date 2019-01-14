package com.freshbin.pattern.chain.example;

public abstract class Approver {
	Approver successor;
	String Name;

	public Approver(String Name) {
		this.Name = Name;
	}

	public abstract void ProcessRequest(PurchaseRequest request);

	public void SetSuccessor(Approver successor) {
		// TODO Auto-generated method stub
		this.successor = successor;
	}
}
