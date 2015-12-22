package com.tinymood.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SummaryRanges {
	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7};
		List<String> res = new SummaryRanges().summaryRanges(nums);
		
		ListIterator<String> itr = res.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<>();
		int i = 0;
		while (nums.length>0) {
			for (int j = i; j < nums.length; j++) {
				if (j == nums.length - 1) {
					res.add((i != j) ? (nums[i] + "->" + nums[j]) : ("" + nums[i]));
					return res;
				} else if (nums[j] != nums[j + 1] - 1) {
					res.add((i != j) ? (nums[i] + "->" + nums[j]) : ("" + nums[i]));
					i = j + 1;
					break;
				}
			}
		}
		return res;
	}
}
