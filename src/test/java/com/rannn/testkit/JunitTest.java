package com.rannn.testkit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	private static JunitTest finder;
	
	@BeforeClass
	public static void init() throws Exception {
		finder = new JunitTest();
		System.out.println("before class");
	}

	@Before
	public void Before() {
		System.out.println("before");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}