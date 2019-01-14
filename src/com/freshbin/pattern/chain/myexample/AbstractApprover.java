package com.freshbin.pattern.chain.myexample;

/**
 * 抽象责任链类
 * 
 * @author freshbin
 * @date 2019年1月14日 下午8:22:08
 */
public abstract class AbstractApprover {
	protected AbstractApprover abstractApprover;
	
	public abstract void processRequest(Integer num);
	
	public void setAbstractApprover(AbstractApprover abstractApprover) {
		this.abstractApprover = abstractApprover;
	}
}
