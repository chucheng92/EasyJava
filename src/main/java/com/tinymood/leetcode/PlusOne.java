package com.tinymood.leetcode;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits = {9,8};
		int[] res = new int[digits.length+1];
		res = new PlusOne().plusOne2(digits);
		
		for (int a:res)
			System.out.println(a);
	}
	
	//My Solution
	public int[] plusOne(int[] digits) {
		if (digits==null || digits.length==0) return null;
		int[] res1 = new int[digits.length];
		int count=0;
		for (int i=digits.length-1; i>=0; i--) {
			if (i==digits.length-1) {
				if ((digits[i]+1)==10) {
					res1[i] = 0;
					count=1;
				}
				else {
					res1[i]=digits[i]+1;
					continue;
				}
			} else {
				if ((digits[i]+count)==10) {
					count=1;
					res1[i] = 0;
				}
				else {
					res1[i] = digits[i]+count;
					count = 0;
				}
			}
			
		}
		if (count==1) {
			int[] res2 = new int[res1.length+1];
			for (int i=0; i<res1.length; i++)
				res2[i+1] = res1[i];
			res2[0]=1;
			return res2;
		} else {
			return res1;
		}
	}
	//Simple Solution
	public int[] plusOne2(int[] digits) {

	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }

	        digits[i] = 0;
	    }

	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;

	    return newNumber;
	}
 }
