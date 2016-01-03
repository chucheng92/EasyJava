package com.tinymood.util;

import java.io.Serializable;

public class SortUtil implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @return
	 * @param a
	 */
	public static void insertionSort(int[] a) {
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
	
	public static void bubbleSort(int[] a) {
		if (a==null || a.length<2)
			return;
		boolean flag = false;
		for ()
	}
}
