package com.tinymood.leetcode;

import java.util.TreeSet;


public class ContainsDuplicate3 {
	public static void main(String[] args) {
		int[] nums = {1,5,12,100};
		System.out.println(new ContainsDuplicate3().containsNearbyAlmostDuplicate(nums, 3, 2));
	}
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums.length<2 || k==0)
            return false;

        final TreeSet<Integer> values = new TreeSet<>();
        for (int ind = 0; ind < nums.length; ind++) {
            Integer floor = values.floor(nums[ind] + t);
            Integer ceil = values.ceiling(nums[ind] - t);
            if ((floor != null && floor >= nums[ind]) || (ceil != null && ceil <= nums[ind])) {
                return true;
            }

            values.add(nums[ind]);
            if (ind >= k) {
                values.remove(nums[ind - k]);
            }
        }

        return false;
	}
}