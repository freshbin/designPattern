package com.freshbin.pattern.chain.myexample;

public class ApproverB extends AbstractApprover {

	@Override
	public void processRequest(Integer num) {
		if(num <= 0) {
			System.out.println("B处理");
		} else {
			abstractApprover.processRequest(num);
		}
	}
	
}
