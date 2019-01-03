package com.freshbin.pattern.strategy.container.mall;

import com.freshbin.pattern.strategy.discount.DiscountStrategy;

/**
 * 管理商城的打折活动
 * @author freshbin
 * @date 2019-1-2 16:39:14
 */
public abstract class ManagerMallStrategy {
	
	DiscountStrategy discountStrategy;
	
	public ManagerMallStrategy() {

	}
	
	public abstract double discount(Integer discountStrategyParam);
}
