package com.tinymood.javase.sort;

/**
 * 冒泡排序
 * @author 哓哓
 *
 */

public class BubbleSort {
	public void bubbleSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		boolean flag;
		for (int i = 0; i < a.length-1; i++) {
			flag = false;
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if (false == flag) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 4, 4, 8, 9, 10, 11 };
		new BubbleSort().bubbleSort(a);
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}
}
