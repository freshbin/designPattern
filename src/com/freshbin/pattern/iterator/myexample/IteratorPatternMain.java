package com.freshbin.pattern.iterator.myexample;

import com.freshbin.pattern.iterator.myexample.iterator.ContainerInterface;
import com.freshbin.pattern.iterator.myexample.iterator.GloryOfKingGame;
import com.freshbin.pattern.iterator.myexample.iterator.LOLGame;

/**
 * 迭代器模式
 * 
 * @author freshbin
 * @date 2019-1-8 11:40:42
 */
public class IteratorPatternMain {
	public static void main(String[] args) {
		ContainerInterface lolIterator = new LOLGame();
		ContainerInterface gloryOfKingIterator = new GloryOfKingGame();
		
		ManagerIterator managerIterator = new ManagerIterator();
		managerIterator.addIterator(lolIterator.getIterator());
		managerIterator.addIterator(gloryOfKingIterator.getIterator());
		
		managerIterator.parallelDisplayIterator();
//		managerIterator.chuanxingDisplayIterator();
	}
}
