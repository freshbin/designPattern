package com.freshbin.pattern.strategy.discount;

/**
 * 大优惠活动
 * 
 * @author freshbin
 * @date 2019-1-2 16:36:21
 */
public class BigDiscount implements DiscountStrategy {

	@Override
	public double discount() {
		return 0.1;
	}

	@Override
	public String describe() {
		return "这是打一折卖血方案";
	}

}
