package com.tinymood.leetcode;

public class MoveZero {
	public static void main(String[] args) {
		int[] nums={0,1,0,3,12};
		new MoveZero().moveZero(nums);
		for (int a:nums)
			System.out.println(a);
	}
	
	public void moveZero(int[] nums) {
		if (nums==null || nums.length==1) return;
		int i = 0;
		for (int a:nums) {
			if (a!=0) {
				nums[i++]=a;
			}
		}
		for (int j=i;j<nums.length;j++)
			nums[j]=0;
	}
}
