package com.tinymood.javase.sort;

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
		
		for (int i = 1; i < a.length; i++) {
			for (int j=i; j<a.length; j++) {
				if (a[j]<a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
				}
			}
		}
		
	}

}
