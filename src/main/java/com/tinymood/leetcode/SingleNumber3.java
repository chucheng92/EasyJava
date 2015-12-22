package com.tinymood.leetcode;

//k=5 p=3
public class SingleNumber3 {
	
	public static void main(String[] args) {
		int nums[] = {2,2,2,2,2,3,3,3,3,3,1,1,1};
		int res = singleNumber(nums);
		System.out.println(res);
	}
	
	public static int singleNumber(int[] A) {
	     int x1 = 0;
	     int x2 = 0; 
	     int x3 = 0;
	     int mask = 0;

	     for (int i : A) {
	    	x3 ^= x2 & x1 & i;
	        x2 ^= x1 & i;
	        x1 ^= i;
	        mask = ~(x1 & ~x2 & x3);
	        x3 &= mask;
	        x2 &= mask;
	        x1 &= mask;
	     }
	     return x1;  
	}
}

