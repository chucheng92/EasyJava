package com.tinymood.leetcode;

// Remove Duplicates From Sorted Array
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(new RemoveDuplicates().removeDuplicates(nums));
	}
	public int removeDuplicates(int[] nums) {
		int i = 0;
		for (int n:nums) {
			if (i==0 || n>nums[i-1])
				nums[i++]=n;
		}
		return i;
	}
}