package com.tinymood.javase.sort;

/*
 * 冒泡排序
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 4, 10, 6, 5, 6, 11, 22 };
		// int[] a = {1,5,3,4,6,7};
		bubbleSort(a);
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}

	public static void bubbleSort(int[] a) {
		if (a==null || a.length<2)
			return;
		boolean flag;
		for (int i=0; i<a.length-1; i++) {
			flag = false;
			for (int j=0; j<a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if (flag == false)
				return;
		}
	}
}
