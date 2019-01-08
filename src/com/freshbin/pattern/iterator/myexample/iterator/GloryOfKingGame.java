package com.freshbin.pattern.iterator.myexample.iterator;

import java.util.Iterator;

import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

/**
 * GloryOfKingGame 
 * 
 * @author freshbin
 * @date 2019-1-8 11:46:07
 */
public class GloryOfKingGame implements ContainerInterface {

	private final static Integer MAX_ARRAY_SIZE = 10;
	private Integer index = 0;
	
	private String[] heros = new String[MAX_ARRAY_SIZE];
	
	public GloryOfKingGame() {
		addItems("亚瑟");
		addItems("后羿");
		addItems("鲁班");
		addItems("安琪拉");
		addItems("程咬金");
		addItems("项羽");
	}
	
	private void addItems(String name) {
		heros[index] = name;
		index++;
	}
	
	@Override
	public Iterator<String> getIterator() {
		return new GloryOfKingIterator();
	}
	
	class GloryOfKingIterator implements Iterator {

		private Integer position = 0;
		
		@Override
		public boolean hasNext() {
			if(position < index) {
				return true;
			}
			
			return false;
		}

		@Override
		public Object next() {
			String name = heros[position];
			position++;
			return name;
		}
		
	}

}
