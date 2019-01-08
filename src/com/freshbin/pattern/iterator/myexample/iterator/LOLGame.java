package com.freshbin.pattern.iterator.myexample.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * LOLGame 
 * @author freshbin
 * @date 2019-1-8 11:46:07
 */
public class LOLGame implements ContainerInterface {

	private List<String> heros;
	
	public LOLGame() {
		heros = new ArrayList<>();
		heros.add("盖伦");
		heros.add("寒冰");
		heros.add("马尔扎哈");
		heros.add("蛮王");
		heros.add("剑圣");
		heros.add("赵信");
	}
	
	@Override
	public Iterator<String> getIterator() {
		//return new LOLIterator();
		return heros.iterator();
	}

	/*class LOLIterator implements Iterator {

		private Integer position = 0;
		
		@Override
		public boolean hasNext() {
			if(position < heros.size()) {
				return true;
			}
			
			return false;
		}

		@Override
		public Object next() {
			String name = heros.get(position);
			position++;
			return name;
		}
		
	}*/
}
