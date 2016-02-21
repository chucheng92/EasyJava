package com.tinymood.javase.sort;

/**
 * 缩小增量排序（希尔排序）- 不稳定
 * @author 哓哓
 *
 */
public class ShellSort {
	public void shellSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		for (int d = a.length/2; d > 0; d/=2) {
			// 从1B开始先和1A比较 然后2A与2B...然后再1C向前与同组的比较
			for (int i = d; i < a.length; i++) {
				// 内部直接插入
				int temp = a[i];
				int j = i - d;
				while (j >=0 && temp < a[j]) {
					a[j+d] = a[j];
					j -= d;
				}
				a[j+d] = temp;
			}
		}
	}
}
