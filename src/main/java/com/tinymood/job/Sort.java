package com.tinymood.job;

// 排序复习
public class Sort {
	
	public static void main(String[] args) {
		int[] a = {4, 5, 3, 2, 1, 6, 7, 8, 9, 10};
//		insertionSort(a);
//		bubbleSort(a);
//		shellSort(a);
//		selectionSort(a);
//		quickSort(a, 0, a.length - 1);
//		mergeSort(a, 0, a.length - 1);
		heapSort(a);
		output(a);
	}
	
	//1. 插入排序[稳定] 复杂度最好最坏平均
	// o(n) - o(n^2) -   o(n^2)
	public static void insertionSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		for (int i = 1; i < a.length; i++) {
			int temp = a[i]; // 暂存
			int j = i - 1;
			while (j >= 0 && temp < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp; //归位
		}
	}
	
	//2. 冒泡排序[稳定] 复杂度最好最坏平均
	// o(n) - o(n^2) - o(n^2)
	public static void bubbleSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		boolean flag;
		for (int i = 0; i < a.length - 1; i++) {
			flag = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if (flag == false) {
				return;
			}
		}
	}
	
	/**
	 * 3.希尔排序 复杂度最好最坏平均 [不稳定]
	 * O(n) - O(n^s,1<s<2) - O(n^1.3)
	 * @param a
	 */
	public static void shellSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		for (int d = a.length/2; d > 0; d/=2) {
			for (int i = d; i < a.length; i++) {
			// 内部直接插入
				int temp = a[i];
				int j = i - d;
				// j>=0置于&&前
				while (j >= 0 && temp < a[j]) {
					a[j+d] = a[j];
					j -= d;
				}
				a[j+d] = temp;
			}	
		}
	}
	
	/**
	 * 4.选择排序[不稳定] 复杂度最好最坏平均
	 * O(n^2) - O(n^2) - O(n^2)
	 * @param a
	 */
	private static void selectionSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}

		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			if (k != i) {
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
	}
	
	/**
	 * 5.快速排序 不稳定 复杂度最好最坏平均
	 * O(nlgn) - O(n^2) - O(nlgn)
	 * @param a
	 * @param low
	 * @param high
	 */
	// 固定基准
	public static void quickSort(int[] a, int low, int high) {		
		if (low < high) {
			int mid = partition(a, low, high);
			quickSort(a, low, mid - 1);
			quickSort(a, mid + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		//暂存
		int pivot = a[low];

		while (low < high) {
			while (low < high && a[high] >= pivot) {
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= pivot) {
				low++;
			}
			a[high] = a[low];
		}
		//归位
		a[low] = pivot;
		
		return low;
	}
	
	/**
	 * 6.归并排序[稳定]
	 * 复杂度：最好O(nlgn) - 最坏O(nlgn) - 平均O(nlgn)
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void mergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			//左边
			mergeSort(a, low, mid);
			//右边
			mergeSort(a, mid + 1, high);
			//有序序列归并
			merge(a, low, mid, high);
		}
	}

	private static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		// 左指针
		int i = low;
		// 右指针
		int j = mid + 1;
		// 临时数组指针
		int k = 0;

		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}

		//左边剩余
		while (i <= mid) {
			temp[k++] = a[i++];
		}

		//右边剩余
		while (j <= high) {
			temp[k++] = a[j++];
		}

		// 倒出
		for (int t = 0; t < temp.length; t++) {
			a[t + low] = temp[t]; 
		}
	}
	
	
	/**
	 * 堆排序[不稳定]
	 * 复杂度：O(nlogn) [平均 - 最好 - 最坏]
	 * @param a
	 */
	public static void heapSort(int[] a) {
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
	private static void buildMaxHeap(int[] a) {
		for (int i = a.length/2; i >= 0; i--) {
			adjustHeap(a, a.length, i);
		}
	}

	// 调整堆
	private static void adjustHeap(int[] a, int size, int parent) {
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
	
	/**
	 * 输出
	 * @param a
	 */
	private static void output(int[] a) {
		for (int val : a) {
			System.out.print(val + " ");
		}
	}
}