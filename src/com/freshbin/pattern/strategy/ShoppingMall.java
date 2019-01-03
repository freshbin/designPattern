package com.freshbin.pattern.strategy;

import java.util.Map;
import java.util.Scanner;

import com.freshbin.pattern.strategy.container.mall.MallDiscountImpl;
import com.freshbin.pattern.strategy.container.mall.ManagerMallStrategy;
import com.freshbin.pattern.strategy.discount.BigDiscount;
import com.freshbin.pattern.strategy.discount.DiscountStrategy;
import com.freshbin.pattern.strategy.discount.SmallDiscount;

/**
 * 商城主类
 * 
 * @author freshbin
 * @date 2019-1-2 16:41:35
 */
public class ShoppingMall {
	
	private static double price = 50;
	
	public static void main(String[] args) {
		/*System.out.println("老板跑路啦，全场一折大甩卖!");
		ManagerMallStrategy mallStrategy = new MallDiscountImpl();
		System.out.println("原价"+ price + "的商品，现在只要: " + (price * mallStrategy.discount(1)));
		
		System.out.println("==========");
		
		System.out.println("新老板来了，价格打九折!");
		ManagerMallStrategy mallStrategyTwo = new MallDiscountImpl();
		System.out.println("原价"+ price + "的商品，现在只要: " + (price * mallStrategyTwo.discount(2)));
		
		System.out.println("==================================================");*/
		
		System.out.println("欢迎光临!");
		
		System.out.println("目前有以下" + MallDiscountImpl.discountStrategyMap.size() + "种打折方案!");
		int i = 1;
		for(Map.Entry<Integer, DiscountStrategy> entry : MallDiscountImpl.discountStrategyMap.entrySet()) {
			System.out.println("第" + i + "种方案:" + entry.getValue().describe());
			i++;
		}
		
		System.out.println("请输入您的选择(输入0则退出):");
		Scanner in = new Scanner(System.in);
		int choose = in.nextInt();
		
		while(choose != 0) {
			ManagerMallStrategy mallStrategyThree = new MallDiscountImpl();
			double discount = mallStrategyThree.discount(choose);
			System.out.println("您选择该优惠后的价格：" + price*discount);
			
			System.out.println("===================================================");
			
			System.out.println("请继续您的选择(输入0则退出)：");
			int j = 1;
			for(Map.Entry<Integer, DiscountStrategy> entry : MallDiscountImpl.discountStrategyMap.entrySet()) {
				System.out.println("第" + j + "种方案:" + entry.getValue().describe());
				j++;
			}
			
			choose = in.nextInt();
		}
		
		System.out.println("您慢走，欢迎下次惠顾啊!");
	}
}
