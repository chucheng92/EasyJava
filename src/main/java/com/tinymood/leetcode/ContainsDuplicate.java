package com.tinymood.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(new ContainsDuplicate().containsDuplicate(nums));
	}
	
	public boolean containsDuplicate(int[] nums) {
		// Set集合
		if (nums.length<2) return false;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			if (map.containsKey(nums[i])) 
				return true;
			else 
				map.put(nums[i], i);
		}
		return false;
		
		// Set ��
//		Set<Integer> set = new HashSet<Integer>();
//        for(int i : nums)
//            if(!set.add(i))// if there is same
//                return true; 
//        return false;

	}
}
