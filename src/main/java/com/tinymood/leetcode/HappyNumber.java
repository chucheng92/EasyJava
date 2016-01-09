package com.tinymood.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(new HappyNumber().isHappy(2147483467));
	}
	
	public boolean isHappy(int n) {
		int remain=0, squareSum=0;
		Set<Integer> set = new HashSet<>();
		while (set.add(n)) { 
			squareSum = 0;
			while (n>0) {
				remain = n%10;
				squareSum += remain*remain;
				n/=10;
			}
			if (squareSum==1) return true;
			else
				n=squareSum;
		}
		return false;
	 }
}
