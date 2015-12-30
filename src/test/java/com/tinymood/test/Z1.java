package com.tinymood.test;

/*
 * 观察执行次序
 */
// CBB
class C {
	C() {
        System.out.print("C");
    }
}

class A {
	C c = new C();

	A() {
		this("A");
		System.out.print("A");
	}

	A(String s) {
		System.out.print(s);
	}
}

public class Z1 extends A {
	Z1() {
		super("B");
		System.out.print("B");
	}

	public static void main(String[] args) {
		new Z1();
	}
}
