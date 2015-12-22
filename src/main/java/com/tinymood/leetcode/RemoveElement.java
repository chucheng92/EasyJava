package com.tinymood.leetcode;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums={1,2,3,4,5};
		System.out.println(new RemoveElement().removeElement(nums, 5));
	}
	
	public int removeElement(int[] nums, int val) {
		if(nums==null || nums.length==0) return 0;
		int i=0;
		for (int a:nums) {
			if (a!=val) {
				nums[i++]=a;
			}
 		}
		return i;
	}
}
