package com.tinymood.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = {-4,-4,-3,7,8};
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res = threeSum(nums);
		System.out.println(res);
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		for (int i=0; i<nums.length-2;i++) {
			if (i>0 && nums[i]==nums[i-1]) continue;
			int low = i+1, high = nums.length-1, sum = 0-nums[i];
			while (low<high) {
				if (nums[low]+nums[high] == sum) {
					res.add(Arrays.asList(nums[i],nums[low],nums[high]));
					while (low<high && nums[low]==nums[low+1]) low++;
					while (low<high && nums[high]==nums[high-1]) high--;
					low++; high--;
				} else if (nums[low]+nums[high] < sum)
					low++;
				else high--;
			}
		}
		return res;
	}
}
