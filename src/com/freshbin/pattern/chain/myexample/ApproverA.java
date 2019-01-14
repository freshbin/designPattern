package com.freshbin.pattern.chain.myexample;

public class ApproverA extends AbstractApprover {

	@Override
	public void processRequest(Integer num) {
		if(num > 0) {
			System.out.println("A处理");
		} else {
			abstractApprover.processRequest(num);
		}
	}
	
}
