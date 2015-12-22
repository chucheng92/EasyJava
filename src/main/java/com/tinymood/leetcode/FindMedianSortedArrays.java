package com.tinymood.leetcode;

// Median
public class FindMedianSortedArrays {
	// O(n+m)
	public static void main(String[] args) {
		int A[] = {1,3,5,7};
		int B[] = {2,4,6,8};
		System.out.println(new FindMedianSortedArrays().findMedianSortedArrays(A, B));
	}
	
	//O(log(n + m))
	private double findKthSortedArrays(int[] a, int astart, int aend, int[] b, int bstart, int bend, int k) {
		int m = aend-astart, n = bend-bstart;
		if (m > n)
			return findKthSortedArrays(b, bstart, bend, a, astart, aend, k);
		if (m==0)
			return b[bstart+k-1];
		if (k==1)
			return Math.min(a[astart], b[bstart]);
		
		int pa = Math.min(k / 2, m), pb = k - pa;  
		if (a[astart + pa - 1] > b[bstart + pb - 1])  
			return findKthSortedArrays(a, astart, aend, b, bstart + pb, bend, k - pb);  
		else if (a[astart + pa - 1] < b[bstart + pb - 1])  
			return findKthSortedArrays(a, astart + pa, aend, b, bstart, bend, k - pa);
		else  
			return a[astart + pa - 1];  
		
	}
	public double findMedianSortedArrays(int A[], int B[]) {
		int m = A.length;
		int n = B.length;
		if ((n + m) % 2 == 1)  
			return findKthSortedArrays(A, 0, m, B, 0, n, (n + m) / 2 + 1);  
		else  
			return (findKthSortedArrays(A, 0, m, B, 0, n, (n + m) / 2) + findKthSortedArrays(A, 0, m, B, 0, n, (n + m) / 2+1)) / 2.0;		
	}
}
