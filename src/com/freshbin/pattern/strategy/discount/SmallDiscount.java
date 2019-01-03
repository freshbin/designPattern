package com.freshbin.pattern.strategy.discount;

/**
 * 小优惠活动
 * 
 * @author freshbin
 * @date 2019-1-2 16:36:21
 */
public class SmallDiscount implements DiscountStrategy {

	@Override
	public double discount() {

		return 0.9;
	}

	@Override
	public String describe() {
		return "这是打九折方案";
	}

}
