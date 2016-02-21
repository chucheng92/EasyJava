package com.tinymood.javase.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	@Test 
	public void testBubbleSort() {
		int[] a = { 2, 3, 1, 4, 4, 8, 7, 20, 11 };
		new BubbleSort().bubbleSort(a);
		System.out.println("======冒泡排序测试======");
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
