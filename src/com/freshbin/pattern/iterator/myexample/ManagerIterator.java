package com.freshbin.pattern.iterator.myexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 遍历迭代器
 * 
 * @author freshbin
 * @date 2019-1-8 12:04:42
 */
public class ManagerIterator {
	private List<Iterator> iterators;
	private Integer parallelFlag = 0;
	private Integer chuanxingFlag = 0;

	public ManagerIterator() {
		iterators = new ArrayList<>();
	}

	public void addIterator(Iterator iterator) {
		iterators.add(iterator);
	}

	public void parallelDisplayIterator() {
		System.out.println("并行方式");
		iterators.stream().parallel().forEach(iterator -> {
			System.out.println("==========开始================" + parallelFlag);
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			System.out.println("===========结束===============" + parallelFlag);
			parallelFlag++;
		});
	}

	public void chuanxingDisplayIterator() {
		System.out.println("串行方式");
		iterators.stream().forEach(iterator -> {
			System.out.println("==========开始===============" + chuanxingFlag);
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			System.out.println("==========开始===============" + chuanxingFlag);
			chuanxingFlag++;
		});
	}
}
