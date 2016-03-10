package com.tinymood.sort;

/**
 * 堆排序
 * @author 哓哓
 *
 */
public class HeapSort {
	public void heapSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		
		buildMaxHeap(a);
		
		for (int i = a.length - 1; i >= 0; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			
			adjustHeap(a, i, 0);
		}
	}

	// 建堆
	private void buildMaxHeap(int[] a) {
		int mid = a.length / 2;
		for (int i = mid; i >= 0; i--) {
			adjustHeap(a, a.length, i);
		}
	}
	
	// 递归调整堆
	private void adjustHeap(int[] a, int size, int parent) {
		int left = 2 * parent + 1;
		int right = 2 * parent + 2;
		int largest = parent;
		
		if (left < size && a[left] > a[largest]) {
			largest = left;
		}
		
		if (right < size && a[right] > a[largest]) {
			largest = right;
		}
		
		if (parent != largest) {
			int temp = a[parent];
			a[parent] = a[largest];
			a[largest] = temp;
			adjustHeap(a, size, largest);
		}
	}
}
