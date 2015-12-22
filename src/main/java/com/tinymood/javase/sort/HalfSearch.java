package com.tinymood.javase.sort;

public class HalfSearch {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 4, 4, 8, 9, 10, 11 };

		int index = search(a, 0, a.length - 1, 4);
		System.out.println(index);
	}

	private static int search(int[] a, int low, int high, int x) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] > x) {
				high = mid - 1;
			} else if (a[mid] < x) {
				low = mid + 1;
			} else
				return mid;
		}
		return -1;
	}
}
