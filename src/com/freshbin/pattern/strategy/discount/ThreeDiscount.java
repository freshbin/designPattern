package com.freshbin.pattern.strategy.discount;

/**
 * 打三折活动
 * 
 * @author freshbin
 * @date 2019-1-2 16:36:21
 */
public class ThreeDiscount implements DiscountStrategy {

	@Override
	public double discount() {
		return 0.3;
	}

	@Override
	public String describe() {
		return "这是打三折方案";
	}

}
