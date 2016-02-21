package com.tinymood.javase.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testQuickSort() {
		int[] a = {28, 16, 32, 12, 60, 2, 5, 72};
		new QuickSort().quickSort(a, 0, a.length-1);
		System.out.println("======快速排序测试======");
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}

}
