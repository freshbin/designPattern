package com.freshbin.pattern.decorate.myiodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) {
		int c;
		try {
			InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
