package com.tinymood.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String[] args) {
		int[] nums = {0,2,1,-3};
		int target = 1;
		int min = threeSumClosest(nums,target);
		System.out.println(min);
	}
	
	public static int threeSumClosest(int nums[], int target) {
		int res = nums[0]+nums[1]+nums[nums.length-1];
		Arrays.sort(nums);
		for (int i=0; i<nums.length-2; i++) {
			int low = i+1, high = nums.length-1;
			while (low < high) {
				int sum = nums[i]+nums[low]+nums[high];
				if (sum > target) {
					high--;
				} else {
					low++;
				}
				
				if (Math.abs(sum-target) < Math.abs(res-target)) {
					res = sum;
				}
			}
		}
		return res;
	}
}