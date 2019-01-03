package com.freshbin.pattern.strategy.discount;

/**
 * 打折接口
 * @author freshbin
 * @date 2019-1-2 16:36:44
 */
public interface DiscountStrategy {
	public String describe();
	public double discount();
}
