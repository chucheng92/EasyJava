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

		int i, j;
		for (i = 1; i < a.length; ++i) {
			int tmp = a[i];
			j = i - 1;
			while (j >= 0 && tmp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			if (j != i - 1) {
				a[j + 1] = tmp;
			}
		}
	}

}
