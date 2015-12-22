package com.tinymood.javase.sort;

public class SelectSort {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 4, 10, 6, 5, 6, 11, 22 };
		sort(a);
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
	}

	private static void sort(int[] a) {
		int i, j, k;

		for (i = 0; i < a.length; ++i) {
			k = i;
			for (j = i + 1; j < a.length; ++j) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			if (k != i) {
				int tmp = a[k];
				a[k] = a[i];
				a[i] = tmp;
			}
		}
	}
}