package com.tinymood.util;

import java.io.Serializable;

public class SortUtil implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 直接插入排序
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
	
	/**
	 * 冒泡排序
	 * @return
	 * @param a
	 */
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
	
	/**
	 * 选择排序
	 * @return
	 * @param a
	 */
	public static void selectSort(int[] a) {
		if (a==null || a.length<2)
			return;
	
		for (int i=0; i<a.length; i++) {
			int k = i;
			for (int j=i+1; j<a.length; j++) {
				if (a[j]<a[k]) {
					k=j;
				}
			}
			if (k!=i) {
				int temp=a[k];
				a[k]=a[i];
				a[i]=temp;
			}
		}
	}
}
