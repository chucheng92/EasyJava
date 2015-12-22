package com.tinymood.leetcode;

//k=3 p=1
public class SingleNumber2 {
	
	public static void main(String[] args) {
		int nums[] = {2,2,2,1};
		int res = singleNumber(nums);
		System.out.println(res);
	}
	
	public static int singleNumber(int[] A) {
	     int x1 = 0;   
	     int x2 = 0; 
	     int mask = 0;

	     for (int i : A) {
	        x2 ^= x1 & i;
	        x1 ^= i;
	        mask = ~(x1 & x2);
	        x2 &= mask;
	        x1 &= mask;
	     }
	     return x1;  // p = 1, in binary form p = '01', then p1 = 1, so we should return x1; 
	                 // if p = 2, in binary form p = '10', then p2 = 1, so we should return x2.
	}
}
