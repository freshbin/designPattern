package com.freshbin.pattern.iterator.myexample.iterator;

import java.util.Iterator;

/**
 * 管理需要遍历的对象接口
 * 
 * @author freshbin
 * @date 2019-1-8 11:44:17
 */
public interface ContainerInterface {
	Iterator<String> getIterator();
}
