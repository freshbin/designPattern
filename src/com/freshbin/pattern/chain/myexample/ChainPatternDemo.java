package com.freshbin.pattern.chain.myexample;

/**
 * 责任链模式
 * 
 * @author freshbin
 * @date 2019年1月14日 下午8:21:38
 */
public class ChainPatternDemo {
	public static void main(String[] args) {
		AbstractApprover approverA = new ApproverA();
		AbstractApprover approverB = new ApproverB();
		
		approverA.setAbstractApprover(approverB);
		
		approverA.processRequest(1);
		approverA.processRequest(-1);
		
		System.out.println("================");
		
		approverB.setAbstractApprover(approverA);
		approverB.processRequest(1);
		approverB.processRequest(-1);
	}
}
