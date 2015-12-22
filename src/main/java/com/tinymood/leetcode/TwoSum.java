package com.tinymood.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] res = new int[2];
		res = twoSum(nums, target);
		
		System.out.println(res[0]+" "+res[1]);

	}
	
	// ===============TimeOut======================
	// o(n^2)的复杂度
	/**
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		
		for (int i=0; i<nums.length; i++) {
			for (int j=nums.length-1; j>i; j--) {
				if (nums[i] + nums[j] == target) {
					res[0] = i+1;
					res[1] = j+1;
					return res;
				}
			}
		}
		
		res[0] = res[1] = -1;
		return res;
	}
	*/
	// HashMap的方法
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i= 0; i<nums.length; i++) {
			if (map.containsKey(target-nums[i])) {
				res[1] = i+1;
				res[0] = map.get(target-nums[i]);
				return res;
			}
			
			map.put(nums[i], i+1);
		}
		
		return res;
	}
}
