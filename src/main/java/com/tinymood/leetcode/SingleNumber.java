package com.tinymood.leetcode;

/*
* SingleNumber通用解法分析
* Problem:
* Single Number 1
* Total Accepted: 88733 Total Submissions: 194507 Difficulty: Medium 
* Given an array of integers, every element appears twice except for one. Find that single one.
* Note:
* Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
* 要求：线性时间复杂度 空间复杂度为O(1)
*

*/

//===========Single Number1==============
// k=2 p=1
public class SingleNumber {
	public static void main(String[] args) {
		int nums[] = {2,1,4,5,2,4,1};
		int res = singleNumber(nums);
		System.out.println(res);
	}
	
	public static int singleNumber(int[] nums) {
		int res = 0;
		for (int i=0; i<nums.length; i++) {
			res ^= nums[i];
		}
		
		return res;
	}
}
