package com.tinymood.leetcode;

import java.util.Arrays;

public class FindMedianSortedArraysV2 {
	
	// 找第k小数
	private double findKth(int[] a, int i, int[] b, int j, int k) {
        if (a.length > b.length)
            return findKth(b, j, a, i, k);
 
        if (a.length == 0)
            return b[k - 1];
 
        if (k == 1)
            return Math.min(a[0], b[0]);
 
        int pa = Math.min(k / 2, a.length), pb = k - pa;
        if (a[pa - 1] < b[pb - 1])
            return findKth(Arrays.copyOfRange(a, pa, a.length), i + pa, b, j, k - pa);
        else if (a[pa - 1] > b[pb - 1])
            return findKth(a, i, Arrays.copyOfRange(b, pb, b.length), j + pb, k - pb);
        else
            return a[pa - 1];
 
    }
	
	//找中位数
    public double findMedianSortedArrays(int A[], int B[]) {
        int total = A.length + B.length;
        if (total % 2 == 1)
            return findKth(A, 0, B, 0, total / 2 + 1);
        else
            return (findKth(A, 0, B, 0, total / 2) + findKth(A, 0, B, 0, total / 2 + 1)) / 2;
 
    }
 
    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 5, 7 };
        int[] b = new int[] { 2, 4, 6, 8 };
        System.out.println(new FindMedianSortedArraysV2().findMedianSortedArrays(a, b));
 
    }
}

