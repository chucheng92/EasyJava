package com.rannn.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream is):用默认的编码读取数据
 * InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		// 创建对象
		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"));

		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
		// "osw.txt"), "GBK");

		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"osw.txt"), "UTF-8");
		// 读取数据
		// 一次读取一个字符
		int ch = 0;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}

		// 释放资源
		isr.close();
	}
}
