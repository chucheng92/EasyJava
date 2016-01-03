package com.tinymood.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,2};
		System.out.println(new ContainsDuplicate2().containsNearbyDuplicate(nums, 3));
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		// Set集合
		Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
        
        // HashMap法
//		if (nums.length<2) return false;
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i=0; i<nums.length; i++) {
//			if (map.containsKey(nums[i]) && i-map.get(nums[i])<=k) {
//				return true;
//			} else {
//				map.put(nums[i], i);
//			}
//		}
//		return false;
	}
}
