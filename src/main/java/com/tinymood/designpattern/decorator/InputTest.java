package com.tinymood.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 自己的JavaIO装饰者测试
 */
public class InputTest {
	public static void main(String[] args) {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/resource/test.txt")));
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
