package com.rannn.other;

public class AddOperatorTest {
	public static void main(String[] args) {
		//1. +=和+
		// =========================
		byte a = 127;
		byte b = 127;
		byte c = (byte) (a + b);
		System.out.println(c);
//		b = a + b; error
		b += a;
		System.out.println(b);
		// ============================
		
		// 2.
		float d = 3 * 0.1f;
		float e = 0.3f;
		System.out.println(3*0.1 == 0.3);
		System.out.println(d == e);
		
		// 3.查看内存
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
	}
}
