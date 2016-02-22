package com.tinymood.encoding;

import java.io.UnsupportedEncodingException;

public class EncodingDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "慕课ABC";
		byte[] bytes1 = s.getBytes();
		for (byte b : bytes1) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		
		byte[] bytes2 = s.getBytes("utf-16be");
		String str2 = new String(bytes2, "utf-16be");
		System.out.println(str2);
	}
}
