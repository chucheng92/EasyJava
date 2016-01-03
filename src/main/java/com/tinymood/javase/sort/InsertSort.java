package com.tinymood.javase.sort;

/*
 * 插入排序
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 4, 10, 6, 5, 6, 11, 22 };
		sort(a);
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}

	private static void sort(int[] a) {
		if (a==null || a.length<2)
			return;
		for (int i=1; i<a.length; i++) {
			// 暂存当前的值
			int temp = a[i];
			int j=i-1; 
			while (j>=0) {
				if (temp < a[j]) {
					// 后移
					a[j+1] = a[j];
					j--;
				} else {
					break;
				}
			}
			// 当前值归位
			a[j+1] = temp;
		}
	}

}
