package com.freshbin.pattern.strategy.container.mall;

import java.util.HashMap;
import java.util.Map;

import com.freshbin.pattern.strategy.discount.BigDiscount;
import com.freshbin.pattern.strategy.discount.DiscountStrategy;
import com.freshbin.pattern.strategy.discount.SmallDiscount;
import com.freshbin.pattern.strategy.discount.ThreeDiscount;

/**
 * 具体的打折策略方案
 * @author freshbin
 * @date 2019-1-2 16:43:57
 */
public class MallDiscountImpl extends ManagerMallStrategy {

	public static Map<Integer, DiscountStrategy> discountStrategyMap = new HashMap<>();
	
	static {
		discountStrategyMap.put(1, new BigDiscount());
		discountStrategyMap.put(2, new SmallDiscount());
		discountStrategyMap.put(3, new ThreeDiscount());
	}
	
	public MallDiscountImpl() {
		
	}
	
	@Override
	public double discount(Integer discountStrategyParam) {
		if(!discountStrategyMap.containsKey(discountStrategyParam)) {
			return 0;
		}
		return discountStrategyMap.get(discountStrategyParam).discount();
	}

}
